case class PasswordValidator() {
  def validate(password: String): Boolean = {
    checkLength(password) && checkUpperCase(password) && checkNumber(password)
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
