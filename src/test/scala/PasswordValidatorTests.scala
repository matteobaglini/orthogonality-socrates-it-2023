import Checks._

class PasswordValidatorTests extends munit.FunSuite {

  def validCheck:Check = _ => true
  def invalidCheck:Check = _ => false

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


  val checks = List(
    checkLength,
    checkUpperCase,
    checkNumber)

  val passwordValidator = PasswordValidator(checks)

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
