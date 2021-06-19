package SparkPack

import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._



object SparkObj {

case class schema(txnno:String, txndate:String, custno:String, amount:String,category:String, product:String, city:String, state:String, spendby:String)

def main(args:Array[String]):Unit={




 val url = "https://randomuser.me/api/0.8/?results=10"
  val result = scala.io.Source.fromURL(url).mkString
  println(result)
			
 
 
 
 
}
}
