import Checks._
import cats.data.Validated._

class PasswordValidatorTests extends munit.FunSuite {

  def validCheck: Check = password => Valid(password)
  def invalidCheck: Check = _ => Invalid(List("invalid"))

  test("all checks are valid") {
    val result = PasswordValidator(List(validCheck, validCheck, validCheck))
      .validate("anything")
    val expected = Valid("anything")
    assertEquals(result, expected)
  }

  test("at least one check invalid") {
    val result = PasswordValidator(List(validCheck, validCheck, invalidCheck))
      .validate("anything")
    val expected = Invalid(List("invalid"))
    assertEquals(result, expected)
  }

  test("all checks are invalid") {
    val result = PasswordValidator(List(invalidCheck, invalidCheck, invalidCheck))
      .validate("anything")
    val expected = Invalid(List("invalid", "invalid", "invalid"))
    assertEquals(result, expected)
  }
}
