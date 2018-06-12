package com.sample.test

import scala.util.control.Breaks._;

object TheGridSearch {

  def gridSearch(G: Array[String], P: Array[String]): String = {
    var flag = false;
    breakable {
      for (i <- 0 until (G.length - P.length + 1)) {

        val line = G(i);
        var idx = -2;

        while (idx != -1) {
          if (idx < 0) {
            idx = line.indexOf(P(0));
          } else {
            idx = line.indexOf(P(0), idx + 1);
          }

          if (idx > -1) {
            var lineMath = false;
            for (j <- 1 until P.length) {
              if (G(i + j).indexOf(P(j), idx) != idx) {
                lineMath = true;
              }
            }
            if (!lineMath) {
              flag = true;
              break;
            }
          }
        }
      }

    }
    if (flag) {
      println("YES");
      "YES"
    }
    else {
      println("NO");
      "NO"
    }

  }

  def main(args: Array[String]): Unit = {

    var G: Array[String] = Array(
      "7283455864",
      "6731158619",
      "8988242643",
      "3830589324",
      "2229505813",
      "5633845374",
      "6473530293",
      "7053106601",
      "0834282956",
      "4607924137");

    var G1: Array[String] = Array(
      "111",
      "111",
      "110");

    var P: Array[String] = Array("9505", "3845", "3530");
    var P1: Array[String] = Array("11",
      "11",
      "10");

    print(gridSearch(G1, P1));

  }
}
