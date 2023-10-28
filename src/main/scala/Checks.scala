object Checks {
  type Password = String
  type ErrorMsg = String

  type Check = Password => Boolean
  type CheckE = Password => Either[ErrorMsg, Password]

  def checkLength: CheckE = {
    password => Either.cond(password.length > 8, password, "requires more than 8 chars")
  }

  def checkUpperCase: Check = {
    password => password.matches("^.*[A-Z].*$")
  }

  def checkNumber: Check = {
    password => password.matches("^.*[0-9].*$")
  }
}