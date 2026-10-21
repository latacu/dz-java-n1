class Student (
    var name : String = "",
    var groups : String = "",
    var cours: Int = 1,
    var  ball: List<Int>
) {

    fun getball(): Double {
    if (ball.isEmpty()) return 0.0
        val  sum  =  ball.sum()
        return sum.toDouble() / ball.size
    }
}

fun exstudents(students: List<Student>): List<Student> {
    return students.filter { student -> student.getball() >= 3 }
}

fun main() {
   val student1 = Student("Гриша", "12" , 1 , listOf(2, 4 ,5))
   val student2 = Student("Вася", "7" , 2 , listOf(1, 2 ,3))
   val student3 = Student("Аня", "9" , 3 , listOf(5, 2 ,2))

    println(" ${student1.name}  группа ${student1.groups}  на ${student1.cours}  его былл ${student1.getball()}")
    println(" ${student2.name}  группа ${student2.groups}  на ${student2.cours} его былл ${student2.getball()}")
    println(" ${student3.name}  группа ${student3.groups}  на ${student3.cours} его былл ${student3.getball()}")

    val  student = listOf(student1, student2, student3)

   val  okonchball  = exstudents(student)
    println("==============================")
    for (s in okonchball) {
        println("${s.name} - балл: ${s.getball()}")
    }
}