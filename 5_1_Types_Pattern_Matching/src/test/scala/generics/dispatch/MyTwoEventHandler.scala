package generics.dispatch

/**
  * Created by prayagupd
  * on 1/26/17.
  */

class MyTwoEventsHandler extends TwoEventsHandler[Event1, Event2] {
  override def consumeA(event: Event1): Unit = println(s"Some consumed an E1 with value $event")
  override def consumeB(event: Event2): Unit = println(s"Some consumed an E2 with value $event")
}

object MyTwoEventsHandler extends EventDispatcher[Event1, Event2, MyTwoEventsHandler]

class YourTwoEventsHandler extends TwoEventsHandler[Event1, Event3] {
  override def consumeA(event: Event1): Unit = println(s"Another consumed an E1 with value $event")
  override def consumeB(event: Event3): Unit = println(s"Another consumed an E3 with value $event")
}

object YourTwoEventsHandler extends EventDispatcher[Event1, Event3, YourTwoEventsHandler]