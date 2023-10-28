import Checks.Check

case class PasswordValidator() {
  def validate(password: String): Boolean = {
    val checks = List(
      checkLength,
      checkUpperCase,
      checkNumber)

    checks
      .map(check => check(password))
      .reduce((acc, cur) => acc && cur)
  }

  private def checkLength: Check = {
    password => password.length > 8
  }

  private def checkUpperCase: Check = {
    password => password.matches("^.*[A-Z].*$")
  }

  private def checkNumber: Check = {
    password => password.matches("^.*[0-9].*$")
  }
}
