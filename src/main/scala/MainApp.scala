package com.ecommerce.analytics

import org.apache.spark.sql.SparkSession
import com.typesafe.config.ConfigFactory

object MainApp {
  def main(args: Array[String]): Unit = {
    // Charger la configuration
    val config = ConfigFactory.load()
    //val appName = config.getString("app.spark.appName")
    //val master = config.getString("app.spark.master")
    val appName = "EcommerceAnalytics"
    val master = "local[*]"

    // Initialiser SparkSession
    val spark = SparkSession.builder()
      .appName(appName)
      .master(master)
      .getOrCreate()

    println(s" Spark app [$appName] started with master [$master]")

    //spark.stop()
  }
}
