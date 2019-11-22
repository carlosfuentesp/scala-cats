trait User {
  def username: String
  def lastname: String
}

trait Tweeter {
  this: User =>
  def tweet(tweetText: String) = println(s"$username $lastname: $tweetText")
  def retweet(retweet: String) = println(s"RT_ $username $lastname $retweet")
}

class VerifiedTweeter(val username_ : String, val lastname_ : String = "Last") extends Tweeter with User {  // We mixin User because Tweeter required it
  def username = s"real $username_"
  def lastname = s"lastname $lastname_"
}

val realBeyoncé = new VerifiedTweeter("Beyoncé")
realBeyoncé.tweet("Just spilled my glass of lemonade")
realBeyoncé.retweet("Hola")