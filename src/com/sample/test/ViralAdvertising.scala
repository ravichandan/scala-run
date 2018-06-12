package com.sample.test

object ViralAdvertising {

  // Complete the viralAdvertising function below.
  def viralAdvertising(n: Int): Int = {
    var sum = 0;
    var init = 5;
    for (i <- 0 until n) {
      var floor = init / 2;
      sum += floor;
      init = (floor * 3);
    }
    sum
  }

  def main(args: Array[String]) {

    val result = viralAdvertising(3);

    println(result);
  }
}
