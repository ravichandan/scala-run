package com.sample.test

object TheBomberManGame {

  // Complete the bomberMan function below.
  def bomberMan(n: Int, grid: Array[String]): Array[String] = {


    val chars: Array[Array[Char]] = grid.map(s => s.toCharArray);
    if (n < 2) return grid;

    val grid2 : Array[Array[Int]] =grid.map(line => line.replace('O','2').map(c=> if(c=='O') 2 else 0).toArray);
    //    for (c <- 0 until itr) {

    for (i <- 0 until grid2.length) {
      for (j <- 0 until grid2(i).length) {

        //          print(i + " " + j);
        if (chars(i)(j) == 'O') {
          if (i > 0 && chars(i - 1)(j) != 'O') {
            chars(i - 1)(j) = 'X';
          }
          if (i < chars.length - 1 && chars(i + 1)(j) != 'O') {
            chars(i + 1)(j) = 'X';
          }

          if (j > 0 && chars(i)(j - 1) != 'O') {
            chars(i)(j - 1) = 'X';
          }
          if (j < chars(i).length - 1 && chars(i)(j + 1) != 'O') {
            chars(i)(j + 1) = 'X';
          }

        }

      }
    }
    for (i <- 0 until chars.length) {
      for (j <- 0 until chars(i).length) {
        if (chars(i)(j) == '.') {
          chars(i)(j) = 'O';
        }
        else {
          chars(i)(j) = '.';
        }
      }
    }

    //    }

    val result = chars.map(arr => new String(arr));

    return result;
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
    //    bomberMan(6, grid).map(ele => println(ele));
    bomberMan(3, grid2).map(ele => println(ele));
  }
}
