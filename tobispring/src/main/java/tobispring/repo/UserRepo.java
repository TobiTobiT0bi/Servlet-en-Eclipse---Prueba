package tobispring.repo;
//UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import tobispring.model.*;

public interface UserRepo extends JpaRepository<User, Long> {

}
