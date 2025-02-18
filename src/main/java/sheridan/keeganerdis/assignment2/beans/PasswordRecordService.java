package sheridan.keeganerdis.assignment2.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sheridan.keeganerdis.assignment2.database.PasswordRepository;



@Service
public class PasswordRecordService {

    @Autowired
    private PasswordRepository passwordRepository;

    private static final Logger logger = LoggerFactory.getLogger(PasswordRecordService.class);

    @Transactional
    public void savePasswordRecord(PasswordRecord passwordRecord) {
        logger.info("Saving password record: {}", passwordRecord);
        passwordRepository.save(passwordRecord);
    }
}