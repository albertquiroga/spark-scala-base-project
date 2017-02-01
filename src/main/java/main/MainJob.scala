package main

import org.apache.spark.SparkContext

/**
  * Created by ubuntu on 2/1/17.
  */
class MainJob(sc:SparkContext) extends Serializable {

  def execute():Unit = {
    //your code here
    println("Hello, world!")
  }

}
