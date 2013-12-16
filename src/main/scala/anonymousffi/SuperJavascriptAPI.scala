package anonymousffi

import scala.scalajs.js

// note: the "Params" class doesn't exist in Javascript 
class Params extends js.Object {
  var id : js.String = _
  var desc : js.String = _
  var bool : js.Boolean = _
}

object SuperJavascriptAPI extends js.GlobalScope {
  def doSomething (msg : String, params : Params) : js.String = ???
}


