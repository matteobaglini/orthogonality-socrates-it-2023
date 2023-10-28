import Checks._
import cats.data.Validated
import cats.implicits._

case class PasswordValidator(checks: List[Check]) {
  def validate(password: String): Validated[List[ErrorMsg], Password] = {
    checks
      .traverse(check => check(password))
      .map(_ => password)
  }
}
