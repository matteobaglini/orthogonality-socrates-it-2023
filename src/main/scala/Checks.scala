object Checks {
  type Password = String
  type ErrorMsg = String

  type Check = Password => Boolean
  type CheckE = Password => Either[ErrorMsg, Password]

  def checkLength: CheckE = {
    password => Either.cond(password.length > 8,
                  password,
                  "requires more than 8 chars")
  }

  def checkUpperCase: CheckE = {
    password => Either.cond(password.matches("^.*[A-Z].*$"),
                  password,
                  "requires at least one upper case letter")
  }

  def checkNumber: Check = {
    password => password.matches("^.*[0-9].*$")
  }
}