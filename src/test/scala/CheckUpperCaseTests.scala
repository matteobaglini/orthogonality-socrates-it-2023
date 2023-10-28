import Checks._

class CheckUpperCaseTests extends munit.FunSuite {

  test("password with upper case letter") {
    val result = checkUpperCase("aSd")
    val expected = Right("aSd")
    assertEquals(result, expected)
  }

  test("password missing upper case letter") {
    val result = checkUpperCase("asd")
    val expected = Left("requires at least one upper case letter")
    assertEquals(result, expected)
  }
}
