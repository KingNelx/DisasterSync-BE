package disastersync_BE.service;

import disastersync_BE.entity.Users;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

@Service

public interface UserService {
    ResponseEntity <String> submitReport(Users user);
}
