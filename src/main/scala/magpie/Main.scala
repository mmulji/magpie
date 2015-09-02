package magpie

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import magpie.routes.RoutesActor
import spray.can.Http
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration._


object Main extends App {

  // we need an ActorSystem to host our application in
  implicit val system = ActorSystem("magpie-admin")
  implicit val timeout = Timeout(5.seconds)

  // the service actor replies to incoming HttpRequests
  val routesActor = system.actorOf(Props[RoutesActor])

  IO(Http) ? Http.Bind(routesActor,
    interface = Services.config.getString("interface"),
    port = Services.config.getInt("port"))

}