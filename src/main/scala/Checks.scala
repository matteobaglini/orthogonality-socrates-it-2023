object Checks {
  type Password = String
  type ErrorMsg = String
  type Check = Password => Either[ErrorMsg, Password]

  def checkLength: Check = {
    password => Either.cond(password.length > 8,
                  password,
                  "requires more than 8 chars")
  }

  def checkUpperCase: Check = {
    password => Either.cond(password.matches("^.*[A-Z].*$"),
                  password,
                  "requires at least one upper case letter")
  }

  def checkNumber: Check = {
    password =>
      Either.cond(password.matches("^.*[0-9].*$"),
        password,
        "requires at least one number")
  }
}