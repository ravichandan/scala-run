package com.sample.test

object HappyLadybugs {

  def happyLadybugs(b: String): String = {

    val chars: Array[Char] = b.toCharArray();

    if (b == null || b.length == 0) {
      return "NO";
    }
    if (b.length == 1) {
      if (b.charAt(0) == '_') {
        return "YES";
      } else {
        return "NO"
      }
    }
    val mapCount: Array[Int] = new Array[Int](26);
    var underscore = false;
    var prevChar: Char = '\0';
    var prevPrevChar: Char = '\0';
    var flag = false;
    var allSet = true;
    for (c <- chars) {
      if (c == '_') {
        underscore = true;
      }
      else {
        if (prevChar == '\0') {

          flag = true;
        }
        else if (prevChar == c) {
          flag = false;
        }
        else {
          if (prevPrevChar != prevChar) {
            allSet = false;
          }
          flag = true;
        }
        mapCount(c - 65) += 1;
      }
      prevPrevChar = prevChar;
      prevChar = c;
    }

    if (allSet && !flag) {
      return "YES";
    }

    for (i <- mapCount) {
      if (i == 1) {
        return "NO";
      }
    }

    if (underscore) {
      return "YES"
    }
    else {
      return "NO"
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    //val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    //val g = stdin.readLine.trim.toInt

    //    for (gItr <- 1 to g) {
    //      val n = stdin.readLine.trim.toInt
    //
    //      val b = stdin.readLine

    println(happyLadybugs("RBY_YBR"));
    println(happyLadybugs("X_Y__X"));
    println(happyLadybugs("__"));
    println(happyLadybugs("B_RRBR"));
    println(happyLadybugs("A_A"));
    println(happyLadybugs("ABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZ"));
    println(happyLadybugs("AAS"));


    //printWriter.println(result)
    //    }

    //printWriter.close()

  }
}
