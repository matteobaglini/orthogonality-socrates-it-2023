
class PasswordValidatorTests extends munit.FunSuite {

  test("password with more than 8 chars") {
    val result = PasswordValidator()
      .validate("asdasdasd")
    assert(result)
  }

  test("password with less than 9 chars") {
    val result = PasswordValidator()
      .validate("asdasd")
    assert(!result)
  }
}
