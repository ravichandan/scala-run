package com.sample.test

object ThreeDSurfaceArea {

  def main(args: Array[String]): Unit = {

    var arr = Array(Array(1, 3, 4), Array(2, 2, 3), Array(1, 2, 4));
    println(surfaceArea(arr));
  }

  def surfaceArea(A: Array[Array[Int]]): Int = {
    var count = 0;

    for (i <- 0 until A.length) {
      for (j <- 0 until A(i).length) {
        if (A(i)(j) != 0) {
          count += 2;
        }
        if (i == 0) {
          count += A(i)(j);
        }
        else if (A(i)(j) > A(i - 1)(j)) {
          count += A(i)(j) - A(i - 1)(j);
        }
        if (i == A.length - 1) {
          count += A(i)(j);
        } else if (A(i)(j) > A(i + 1)(j)) {
          count += A(i)(j) - A(i + 1)(j);
        }

        if (j == 0) {
          count += A(i)(j);
        }
        else if (A(i)(j) > A(i)(j - 1)) {
          count += A(i)(j) - A(i)(j - 1);
        }
        if (j == A(i).length - 1) {
          count += A(i)(j);
        }
        else if (A(i)(j) > A(i)(j + 1)) {
          count += A(i)(j) - A(i)(j + 1);
        }

      }
    }

    count

  }
}