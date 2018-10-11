// User モデルは適当に作った
class User(name: String, password: String) {
  override def toString() = name
}
// なぜ実装とインターフェースに分けるの？？

// なぜラッピングするの？？？
// 包囲trait？？？
trait UserRepositoryComponent {
  val userRepository: UserRepository
  class UserRepository {
    def authenticate(user: User): User = {
      println("authenticate user:" +  user)
      user
    }
    def create(user: User) = println("creating user:" + user)
    def delete(user: User) = println("deleting user:" + user)
  }
}

// 自分型アノテーション？？？？
trait UserServiceComponent { this: UserRepositoryComponent =>
  val UserService: UserService

  class UserService {
    def authenticate(username: String, password: String): User =
      userRepository.authenticate(new User(username, password))

    def create(username: String, password: String) = 
      userRepository.create(new User(username, password))

    def delete(user: User) =
      userRepository.delete(user)
  }
}

// 抽象メンバー？？？
object ComponentRegistry extends
  UserServiceComponent with
  UserRepositoryComponent
{
  val userRepository = new UserRepository
  val UserService = new UserService
}