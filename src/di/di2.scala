trait UsesUserRepository {
  val userRepository: UserRepository
}

trait UserRepository {
}

trait MixInUserRepository extends UsesUserRepository {
  val userRepository = UserRepositoryImpl
}

object UserRepositoryImpl extends UserRepository {
}

trait UserService extends UsesUserRepository {

}

object UserService extends UserService with MixInUserRepository
