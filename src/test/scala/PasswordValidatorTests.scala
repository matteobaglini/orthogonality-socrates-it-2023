
class PasswordValidatorTests extends munit.FunSuite {

  val passwordValidator = PasswordValidator()

  test("password with more than 8 chars") {
    val result = passwordValidator
      .validate("1asdasdasD")
    assert(result)
  }

  test("password with less than 9 chars") {
    val result = passwordValidator
      .validate("asdasd")
    assert(!result)
  }

  test("password with upper case letter") {
    val result = passwordValidator
      .validate("asd7aSdasd")
    assert(result)
  }

  test("password missing upper case letter") {
    val result = passwordValidator
      .validate("asdasdasd")
    assert(!result)
  }

  test("password with a number") {
    val result = passwordValidator
      .validate("asdaSdasd9")
    assert(result)
  }

  test("password missing a number") {
    val result = passwordValidator
      .validate("asdaSdasd")
    assert(!result)
  }
}
