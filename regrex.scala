import scala.util.matching.Regex

object Demo {
    def main(args: Array[String]) {
        val pattern1 = new Regex("ab|[ae]\\d+");
        val pattern2 = new Regex("^[aA]\\w+");
        val pattern3 = new Regex("[a-zA-Z0-9]+z$");
        
        val str = "ablaw is able1z and inzni cool able222 xaz";

        println((pattern1 findAllIn str).mkString(","));
        println((pattern2 findAllIn str).mkString(","));
        println((pattern3 findAllIn str).mkString(","));

    }
}
