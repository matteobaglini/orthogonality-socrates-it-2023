import cats.data.Validated

object Checks {
  type Password = String
  type ErrorMsg = String
  type Check = Password => Validated[List[ErrorMsg], Password]

  def checkLength: Check = {
    password =>
      Validated.fromEither(
        Either.cond(password.length > 8,
          password,
          List("requires more than 8 chars")))
  }

  def checkUpperCase: Check = {
    password =>
      Validated.fromEither(
        Either.cond(password.matches("^.*[A-Z].*$"),
          password,
          List("requires at least one upper case letter")))
  }

  def checkNumber: Check = {
    password =>
      Validated.fromEither(
        Either.cond(password.matches("^.*[0-9].*$"),
          password,
          List("requires at least one number")))
  }
}