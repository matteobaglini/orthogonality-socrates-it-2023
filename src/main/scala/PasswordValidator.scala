case class PasswordValidator() {
  def validate(password: String): Boolean = {
    password.length > 8
  }
}
