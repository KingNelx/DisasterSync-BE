package disastersync_BE.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Report {

    @Id
    private @Getter @Setter String id;

    private @Getter @Setter String report;
}
