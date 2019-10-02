import org.apache.spark.{SparkConf, SparkContext}

object SparkWordCount {

  def main(args:Array[String]):Unit={

    val sc =new SparkContext()
    val input=args(0)
    val output=args(1)

    val data=sc.textFile(input)
    val wordcount=data.filter(it=>it!="").map(word=> (word,1)).reduceByKey(_+_)

    wordcount.saveAsTextFile(output)
  }
}
