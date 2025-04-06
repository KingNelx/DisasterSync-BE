package disastersync_BE.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "users")
public class Users {

    private @Getter @Setter String id;


}
