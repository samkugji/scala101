import scala.io.StdIn
import scala.util.control._

object Main {
    
    var student = Map[String, String]();
    var students = List[Map[String, String]]();

    def inputGrade() {
        println("Please, Input -> [name] [kor] [mat] [eng]");
        
        val rawInput = StdIn.readLine();
        val splitInput = rawInput.split(" ");
        
        var name = splitInput(0);
        var kor = splitInput(1);
        var mat = splitInput(2);
        var eng = splitInput(3);
        var tot = (kor.toInt + mat.toInt + eng.toInt).toString;
        var avg = ((kor.toInt + mat.toInt + eng.toInt)/3.0).toString;

        student = Map("name"->name, "kor"->kor, "mat"->mat, "eng"->eng, "tot"->tot, "avg"->avg);
        students = student :: students;
    }
    
    def deleteGrade(){
        println("Please, write name you want delete")
    }

    def showGrade(){
        println("Here is Grade Table");
        students.foreach(println);
    }

    def showMenu() {
        val loop = new Breaks;

        loop.breakable {
            do{
                println("Input menu number: Input(1), Show(2), Delete(3), Exit(0)")
                val menuInput = StdIn.readInt();
    
                if (menuInput==0) loop.break;
                else if(menuInput==1) inputGrade();
                else if (menuInput==2) showGrade();
                else if (menuInput==3) deleteGrade();
            }
            while(true);
        }
    }
    
    def main(args: Array[String]) {
        showMenu();
    }
}
