package magpie.routes

import akka.actor.Actor
import magpie.Services
import spray.routing._

class RoutesActor extends Actor with AdminRoutes {
  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(adminRoutes)
}
