package sheridan.keeganerdis.assignment2.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sheridan.keeganerdis.assignment2.beans.PasswordRecord;

import java.util.List;

@Repository
public interface PasswordRepository extends CrudRepository<PasswordRecord, Long> {
    List<PasswordRecord> findByTitleContaining(String title);
}
