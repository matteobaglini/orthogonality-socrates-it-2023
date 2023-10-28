case class PasswordValidator() {
  def validate(password: String): Boolean = {
    checkLength(password) && checkUpperCase(password) && password.matches("^.*[0-9].*$")
  }

  private def checkLength(password: String) = {
    password.length > 8
  }

  private def checkUpperCase(password: String) = {
    password.matches("^.*[A-Z].*$")
  }
}
