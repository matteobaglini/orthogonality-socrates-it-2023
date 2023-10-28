object Checks {
  private type Password = String
  
  type Check = Password => Boolean

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