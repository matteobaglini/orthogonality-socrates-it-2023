
class PasswordValidatorTests extends munit.FunSuite {

  test("password with more than 8 chars") {
    val result = PasswordValidator()
      .validate("asdasdasD")
    assert(result)
  }

  test("password with less than 9 chars") {
    val result = PasswordValidator()
      .validate("asdasd")
    assert(!result)
  }

  test("password with upper case letter") {
    val result = PasswordValidator()
      .validate("asdaSdasd")
    assert(result)
  }

  test("password missing upper case letter") {
    val result = PasswordValidator()
      .validate("asdasdasd")
    assert(!result)
  }

  test("password with a number") {
    val result = PasswordValidator()
      .validate("asdaSdasd9")
    assert(result)
  }

  test("password missing a number") {
    val result = PasswordValidator()
      .validate("asdaSdasd")
    assert(!result)
  }
}
