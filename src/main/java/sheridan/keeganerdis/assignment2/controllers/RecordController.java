package sheridan.keeganerdis.assignment2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class RecordController {

    @GetMapping("/")
    public String showForm(Model model) {

        long generatedId = ThreadLocalRandom.current().nextLong(100_000_000L, 1_000_000_000L);
        model.addAttribute("generatedId", generatedId);
        return "index";
    }



}