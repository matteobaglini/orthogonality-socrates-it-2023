import Checks._
import cats.data.Validated._

class CheckUpperCaseTests extends munit.FunSuite {

  test("password with upper case letter") {
    val result = checkUpperCase("aSd")
    val expected = Valid("aSd")
    assertEquals(result, expected)
  }

  test("password missing upper case letter") {
    val result = checkUpperCase("asd")
    val expected = Invalid(List("requires at least one upper case letter"))
    assertEquals(result, expected)
  }
}
