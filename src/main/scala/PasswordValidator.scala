case class PasswordValidator() {
  def validate(password: String): Boolean = {
    val check1: String => Boolean = checkLength
    val check2: String => Boolean = checkUpperCase
    val check3: String => Boolean = checkNumber
    
    check1(password) && check2(password) && check3(password)
  }

  private def checkLength(password: String) = {
    password.length > 8
  }

  private def checkUpperCase(password: String) = {
    password.matches("^.*[A-Z].*$")
  }

  private def checkNumber(password: String) = {
    password.matches("^.*[0-9].*$")
  }
}
