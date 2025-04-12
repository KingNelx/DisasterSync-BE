package disastersync_BE.implementation;

import disastersync_BE.entity.Report;
import disastersync_BE.entity.Users;
import disastersync_BE.repository.ReportRepo;
import disastersync_BE.repository.UserRepo;
import disastersync_BE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class UserImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ReportRepo reportRepo;

    @Override
    public ResponseEntity <String> submitReport (@RequestBody Users users) {
        Report report = new Report();
    }
}
