import Checks.Check

case class PasswordValidator() {
  def validate(password: String): Boolean = {
    val checks = List[Check](
      checkLength,
      checkUpperCase,
      checkNumber)

    checks
      .map(check => check(password))
      .reduce((acc, cur) => acc && cur)
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
