import Checks._
import cats.data.Validated._

class CheckLengthTests extends munit.FunSuite {

  test("password with more than 8 chars") {
    val result = checkLength("asdasdasd")
    val expected = Valid("asdasdasd")
    assertEquals(result, expected)
  }

  test("password with less than 9 chars") {
    val result = checkLength("asdasd")
    val expected = Invalid(List("requires more than 8 chars"))
    assertEquals(result, expected)
  }
}
