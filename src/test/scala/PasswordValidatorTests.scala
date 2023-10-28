
class PasswordValidatorTests extends munit.FunSuite {

  test("password with more than 8 chars") {
    val result = PasswordValidator()
      .validate("asdasdasd")
    assert(result)
  }
}
