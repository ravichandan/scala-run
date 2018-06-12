package com.sample.test

import scala.util.control.Breaks._;

object GradingStudents {

  def main(args: Array[String]): Unit = {
    gradingStudents(Array(73,67,38,33));
  }
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    /*
     * Write your code here.
     */

    for( i <- 0 until ( grades.length)) {
      //println(grades(i));
      breakable{
        if(grades(i)<38)
          break;
        val diff=grades(i)%5;
        if(diff >2){
          grades(i)=grades(i)+(5-diff);
        }
      }
      println(grades(i));

    }

    grades

  }
}
