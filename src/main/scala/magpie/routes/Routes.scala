package magpie.routes

import magpie.Services
import spray.routing.HttpService


trait AdminRoutes extends HttpService {

  val adminRoutes = path("/") {
    get {
      getFromResourceDirectory(Services.config.getString("webdir"))
      complete("")
    }
  } ~ path("/admin") {
    get {
      complete("")
    }
  } ~ path("/server") {
    post {
      complete("")
    }
  }
}