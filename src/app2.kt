import com.shubham.Person

fun main(args: Array<String>){

    var personObj = Person("Shubham DON")

    personObj.name1 = "Shubham Dhage"
    println("My name is ${personObj.name1}")

    personObj.printNameFunc()
}
