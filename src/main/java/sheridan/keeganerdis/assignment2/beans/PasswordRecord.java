package sheridan.keeganerdis.assignment2.beans;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "password_record")
public class PasswordRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String username;
    private String password;
    private String url;
    private String email;
    private String notes;


    public PasswordRecord(String title, String username, String password, String url, String email, String notes) {
        this.title = title;
        this.username = username;
        this.password = password;
        this.url = url;
        this.email = email;
        this.notes = notes;
    }

}
