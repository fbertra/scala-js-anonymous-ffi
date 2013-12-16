scala-js-anonymous-ffi
=====================

This project demonstrates a possible solution in scala-js to map a javascript function that uses an anonymous object as parameter.

The example assumes the existence of an Javascript lib that includes the following function

   function doSomething (msg, params)

where "msg" is a String and "params" is an anonymous object with two optional atributes:
- id: String,
- desc: String

Examples of javascript call:

   var msg = doSomething ("hello world", {"id" : "scala-js"}) ;
   
   var msg = doSomething ("hello world", {"id" : "scala-js"}, "desc": "a scala to JS compiler") ; 

The "Params" class in "SuperJavascriptAPI.scala" is the Scala representation of the anonymous object expected by "doSomething".  
As "Params" extends js.Object and the class "Params" doesn't exist in the Javascript lib, we need to provide a implementation 
of the "Params" function: this is done in "src/main/resources/anonymous.js"


