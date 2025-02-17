package sheridan.keeganerdis.assignment2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sheridan.keeganerdis.assignment2.beans.PasswordRecord;
import sheridan.keeganerdis.assignment2.beans.PasswordRecordService;
import sheridan.keeganerdis.assignment2.database.PasswordRepository;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class RecordController {


    @Autowired
    private PasswordRepository passwordRepository;


    @GetMapping("/")
    public String showHomePage(Model model) {

        long generatedId = ThreadLocalRandom.current().nextLong(100_000_000L, 1_000_000_000L);
        model.addAttribute("generatedId", generatedId);
        System.out.println("Generated ID: " + generatedId);
        return "/index";

    }

    @PostMapping("/save-password")
    public String savePasswordRecord(
            @RequestParam String title,
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String url,
            @RequestParam String email,
            @RequestParam String notes,
            Model model) {

        PasswordRecord passwordRecord = new PasswordRecord(title, username, password, url, email, notes);
        passwordRepository.save(passwordRecord);


        model.addAttribute("successMessage", "Password record added successfully!");

        return "redirect:/index";
    }

    @GetMapping("/view-records")
    public String viewPasswordRecords(Model model) {
        Iterable<PasswordRecord> passwordRecords = passwordRepository.findAll();
        model.addAttribute("passwordRecords", passwordRecords);
        return "passwordRecords";
    }


}