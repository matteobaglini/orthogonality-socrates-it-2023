import Checks._

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
}
