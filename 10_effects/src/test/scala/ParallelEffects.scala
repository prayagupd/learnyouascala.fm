
import org.scalatest.FunSpec

class ParallelEffects extends FunSpec {

  it("par effects") {

    import cats.effect.IO
    import cats.implicits._

    final case class Item(name: String, price: Double)

    val ioA = IO(println(s"Running task1 - ${Thread.currentThread().getName}")).flatMap(_ => IO(Item("item1", 100)))
    val ioB = IO(println(s"Running task2 - ${Thread.currentThread().getName}")).flatMap(_ => IO(Item("item2", 200)))
    val ioC = IO(println(s"Running task3 - ${Thread.currentThread().getName}")).flatMap(_ => IO(Item("item3", 300)))

    import scala.concurrent.ExecutionContext
    import cats.effect.ContextShift
    implicit val ctxShift: ContextShift[IO] = IO.contextShift(ExecutionContext.global)

    val program = (ioA, ioB, ioC).parMapN { (i1, i2, i3) => i1.price + i2.price + i3.price }

    val res = program.unsafeRunSync()

    println(res)
  }
}
