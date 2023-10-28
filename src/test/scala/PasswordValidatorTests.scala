import Checks._

class PasswordValidatorTests extends munit.FunSuite {

  def validCheck: Check = password => Right(password)
  def invalidCheck: Check = _ => Left("invalid")

  test("all checks are valid") {
    val result = PasswordValidator(List(validCheck, validCheck, validCheck))
      .validate("anything")
    val expected = Right("anything")
    assertEquals(result, expected)
  }

  test("at least one check invalid") {
    val result = PasswordValidator(List(validCheck, validCheck, invalidCheck))
      .validate("anything")
    val expected = Left("invalid")
    assertEquals(result, expected)
  }
}
