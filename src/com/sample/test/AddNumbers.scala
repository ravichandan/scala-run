package com.sample.test

object AddNumbers {


  def main(args: Array[String]): Unit = {

    println("Hello");
    val ar: Array[Array[Int]] = Array(Array(11,2,4),Array(4,5,6),Array(10,8,-12));

//    var a1:Array[Int];
   // var a2:Int;
    var sum1=0; var sum2=0;
    for(i <- 0 to ar.length-1){

      for( j <- 0 to ar(i).length-1){
        //println(j);
        if(i==j){
          sum1 += ar(i)(j)
        }
        if(i+j == ar.length-1){
          sum2 += ar(i)(j);
        }

      }
    }
    println(Math.abs(sum1-sum2))
  }
}
