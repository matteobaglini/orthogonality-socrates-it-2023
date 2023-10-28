import Checks.Check

case class PasswordValidator() {
  def validate(password: String): Boolean = {
    val check1: Check = checkLength
    val check2: Check = checkUpperCase
    val check3: Check = checkNumber

    val checks = List(check1, check2, check3)

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
