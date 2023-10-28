object Checks {
  private type Password = String
  private type ErrorMsg = String

  type Check = Password => Boolean
  type CheckE = Password => Either[ErrorMsg, Password]

  def checkLength: Check = {
    password => password.length > 8
  }

  def checkUpperCase: Check = {
    password => password.matches("^.*[A-Z].*$")
  }

  def checkNumber: Check = {
    password => password.matches("^.*[0-9].*$")
  }
}