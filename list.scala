val listexam = List(1,2,3)
val listexam2 = List(3,4,5)
val listexam3 = listexam ::: listexam2;   // 합치기
println(listexam, listexam2, listexam3);

val list_cons = 999 :: listexam2;
println(list_cons)

list_cons.foreach(num => println(num));

