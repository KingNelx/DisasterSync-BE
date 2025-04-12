package disastersync_BE.repository;

import disastersync_BE.entity.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends MongoRepository <Report, String> {
}
