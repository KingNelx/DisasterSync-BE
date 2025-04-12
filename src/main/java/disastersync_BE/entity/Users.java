package disastersync_BE.entity;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    private @Getter @Setter String id;

    private @Getter @Setter String firstName;

    @DBRef
    public List <Report> reports;
}
