object Main {
  def main(args: Array[String]): Unit = {
    val validator = PasswordValidator(Checks.strongPassword)
    println(validator.validate("asdf"))
    println(validator.validate("1asdASDasd6"))
  }
}