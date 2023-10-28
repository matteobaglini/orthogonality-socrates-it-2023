import Checks._

case class PasswordValidator(checks: List[Check]) {
  def validate(password: String): Boolean = {
    checks
      .map(check => check(password))
      .reduce((acc, cur) => acc && cur)
  }
}
