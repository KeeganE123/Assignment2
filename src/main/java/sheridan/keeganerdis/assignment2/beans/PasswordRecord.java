package sheridan.keeganerdis.assignment2.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "password_record")
public class PasswordRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long id;

    private String title;
    private String username;
    private String password;
    private String url;
    private String email;
    private String notes;


}
