import java.math.BigInteger
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import scala.io.Source
object test01 {
  def main(args: Array[String]): Unit = {
      val msg="hello world"
      val msg2:String ="hello again world"

    println(args(0))
    println(args(1))
    println(args(2))

    }
    def printArg(args:Array[String]):Unit={
      var i=0
      while (i<args.length){
        println(args(i))
        i +=1
      }

  }
}
