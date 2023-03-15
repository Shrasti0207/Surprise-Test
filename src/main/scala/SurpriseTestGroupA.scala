// find the specific character in a string and replace it with another character
object SurpriseTestGroupA extends App{
  val replacements = new TestGroupA()
  replacements.replace1("shrasti","s","m")
}

class TestGroupA(){
  def replace1(inputstring: String , oldchar: String , newChar: String): Unit = {
    println(inputstring.replace("s","m"))
  }
}



