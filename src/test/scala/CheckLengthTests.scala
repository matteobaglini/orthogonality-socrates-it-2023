import Checks._

class CheckLengthTests extends munit.FunSuite {

  test("password with more than 8 chars") {
    val result = checkLength("asdasdasd")
    assert(result)
  }

  test("password with less than 9 chars") {
    val result = checkLength("asdasd")
    assert(!result)
  }
}
