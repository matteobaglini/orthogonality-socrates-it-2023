import Checks._

class CheckNumberTests extends munit.FunSuite {


  test("password with a number") {
    val result = checkNumber("asdaSdasd9")
    assert(result)
  }

  test("password missing a number") {
    val result = checkNumber("asdaSdasd")
    assert(!result)
  }
}
