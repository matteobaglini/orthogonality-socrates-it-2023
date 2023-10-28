import Checks._

case class PasswordValidator(checks: List[CheckE]) {
  def validate(password: String): Either[ErrorMsg, Password] = {
    checks
      .map(check => check(password))
      .reduce((acc, cur) => acc.flatMap(_ => cur))
  }
}
