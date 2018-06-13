package com.sample.test

object TheBomberManGame {

  // Complete the bomberMan function below.
  def bomberMan(n: Int, grid: Array[String]): Array[String] = {


    val grid2: Array[Array[Int]] = grid.map(line => line.map(c => if (c == 'O') 2 else 0).toArray);
    for (i <- 0 until grid2.length) {
      for (j <- 0 until grid2(i).length) {
        print(grid2(i)(j));
      }
      println();
    }

    println();
    println();
    //    for (c <- 0 until itr) {
    for (_ <- 0 until n % 4) {
      for (i <- 0 until grid2.length) {
        for (j <- 0 until grid2(i).length) {
          if (grid2(i)(j) == 0) {
            grid2(i)(j) = 3;
          } else {
            if (grid2(i)(j) == 1) {
              if (i > 0 && grid2(i - 1)(j) != 1) {
                grid2(i - 1)(j) = 0;
              }
              if (j > 0 && grid2(i)(j - 1) != 1) {
                grid2(i)(j - 1) = 0;
              }
              if (i < grid2.length - 1 && grid2(i + 1)(j) != 1) {
                grid2(i + 1)(j) = 1;
              }
              if (j < grid2(i).length - 1 && grid2(i)(j + 1) != 1) {
                grid2(i)(j + 1) = 1;
              }
            }
            grid2(i)(j) -= 1;
          }
          print(grid2(i)(j));
        }
        println();
      }
      println("--------------");
    }
    val chars: Array[String] = grid2.map(arr => new String(arr.map(i => if (i == 0) '.' else 'O')));



    return chars;
  }

  def main(args: Array[String]): Unit = {

    val grid: Array[String] = Array(".......",
      "...O...",
      "....O..",
      ".......",
      "OO.....",
      "OO.....")

    //    for (i <- 0 until 0) {
    //    print((1 / 3));
    //    }
    val grid2: Array[String] = Array(
      "...",
      ".O.",
      "...")
    bomberMan(3, grid).map(ele => println(ele));
    //    bomberMan(3, grid2).map(ele => println(ele));
  }
}
