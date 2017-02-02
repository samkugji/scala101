import scala.io.StdIn

object AplusB {
    def main(args: Array[String]): Unit = {
        val rawInput = StdIn.readLine();
        val innum = StdIn.readInt();
        val nums = rawInput.split(" ");
        nums.foreach(println);
        println(innum);
        // println(args(0).toInt + args(1).toInt);

        val scanner = new java.util.Scanner(System.in);
        println("Where do you live?");

        val input = scanner.nextLine();
        println(s"I see that you live in $input");
    }

}
