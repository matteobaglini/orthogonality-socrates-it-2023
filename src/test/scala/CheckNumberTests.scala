import Checks._

class CheckNumberTests extends munit.FunSuite {

  test("password with a number") {
    val result = checkNumber("a1")
    val expected = Right("a1")
    assertEquals(result, expected)
  }

  test("password missing a number") {
    val result = checkNumber("a")
    val expected = Left("requires at least one number")
    assertEquals(result, expected)
  }
}
