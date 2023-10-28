import Checks._
import cats.data.Validated._

class CheckNumberTests extends munit.FunSuite {

  test("password with a number") {
    val result = checkNumber("a1")
    val expected = Valid("a1")
    assertEquals(result, expected)
  }

  test("password missing a number") {
    val result = checkNumber("a")
    val expected = Invalid(List("requires at least one number"))
    assertEquals(result, expected)
  }
}
