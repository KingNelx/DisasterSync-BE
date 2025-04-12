package disastersync_BE.repository;

import disastersync_BE.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository <Users, String> {
}
