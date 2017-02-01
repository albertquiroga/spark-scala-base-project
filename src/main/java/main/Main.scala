package main

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by ubuntu on 2/1/17.
  */
object Main {

  final val appName = "yourAppName"
  final val LocalThreads = 4

  def main(args:Array[String]):Unit = {
    /* Ted Malaska's dynamic local/cluster running mode chooser */
    val conf:SparkConf =
      if(args.length > 0 && args(0).equals("local")) {
        new SparkConf()
          .set("spark.broadcast.compress", "false")
          .set("spark.shuffle.compress", "false")
          .set("spark.shuffle.spill.compress", "false")
          .set("spark.streaming.backpressure.enabled", "true")
          .setMaster("local[" + LocalThreads.toString + "]")
          .setAppName(appName)
      } else {
        new SparkConf()
          .set("spark.streaming.backpressure.enabled", "true")
          .setAppName(appName)
      }

    val sc:SparkContext = new SparkContext(conf)

    new MainJob(sc).execute()

  }

}
