import Checks._

class CheckUpperCaseTests extends munit.FunSuite {

  test("password with upper case letter") {
    val result = checkUpperCase("asd7aSdasd")
    assert(result)
  }

  test("password missing upper case letter") {
    val result = checkUpperCase("asdasdasd")
    assert(!result)
  }
}
