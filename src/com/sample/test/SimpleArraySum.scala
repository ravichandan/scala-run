/*def simpleArraySum(ar){
    sum:int = 0;
    for (i in ar){
        sum+=i;
    }
}*/
object SimpleArraySum {
  def main(args: Array[String]) {
    print("Hello world");
    val scan = scala.io.StdIn;
    val a0Toa2: Array[String] = scan.readLine().split(" ");
    val b0Tob2: Array[String] = scan.readLine().split(" ");
    val aAndb=solve(a0Toa2(0).trim().toInt, a0Toa2(1).trim.toInt, a0Toa2(2).trim.toInt, b0Tob2(0).trim.toInt,b0Tob2(1).trim.toInt,b0Tob2(2).trim.toInt);
    println(aAndb.mkString(" "))
  }
  def solve(a0: Int, a1: Int, a2: Int, b0: Int, b1: Int, b2: Int): Array[Int] = {
    /*
     * Write your code here.
     */
    var a=0; var b=0;
    if(a0 < b0) b +=1; else if (a0>b0) a+=1;
    if(a1 < b1) b +=1; else if (a1>b1) a+=1;
    if(a2 < b2) b +=1; else if (a2>b2) a+=1;
    return Array(a,b);
  }
}