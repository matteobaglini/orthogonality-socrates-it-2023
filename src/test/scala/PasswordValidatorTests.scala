import Checks._

class PasswordValidatorTests extends munit.FunSuite {

  def validCheck: Check = _ => true
  def invalidCheck: Check = _ => false

  test("all checks are valid") {
    val result = PasswordValidator(List(validCheck, validCheck, validCheck))
      .validate("anything")
    assert(result)
  }

  test("at least one check invalid") {
    val result = PasswordValidator(List(validCheck, validCheck, invalidCheck))
      .validate("anything")
    assert(!result)
  }
}
