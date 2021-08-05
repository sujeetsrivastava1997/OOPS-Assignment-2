package oops

class Person(val name : String, val age : Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if(this.name == that.name)
      this.age - that.age
    else
      this.name.length - that.name.length
  }
}

object Person extends App {
  val person1= new Person("Test1", 25)
  val person2= new Person("Test", 25)
  val person3 = new Person("Test", 25)
  val person4 = new Person("Test", 25)

  def compareObject(personOne: Person, personTwo: Person): Unit = {
    if (personOne.compare(personTwo) > 0)
      println(true)
    else
      println(false)
  }
  compareObject(person1,person2)
  compareObject(person3, person4)


}