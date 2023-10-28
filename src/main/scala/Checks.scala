object Checks {
  type Check = String => Boolean

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