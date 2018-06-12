

object TimeConversion {

  /*
   * Complete the timeConversion function below.
   */
  def timeConversion(s: String): String = {
    /*
     * Write your code here.
     */
    var hr=s.substring(0,2);
    var min=s.substring(3,5);
    var sec=s.substring(6,8);
    var am=s.substring(8);
    if(am.equalsIgnoreCase("AM")){
      if(hr.equalsIgnoreCase("12"))
        hr="00";
    }else if (am.equalsIgnoreCase("PM")){
      if(!hr.equalsIgnoreCase("12"))
        hr=""+(hr.toInt+12);
    }
    hr+":"+min+":"+sec;
  }

  def main(args: Array[String]) {

    val scan = scala.io.StdIn;


    val s = scan.readLine;

    val result = timeConversion(s);

    println(result);

  }
}
