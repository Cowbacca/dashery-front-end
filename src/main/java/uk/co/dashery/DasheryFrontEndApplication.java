package uk.co.dashery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DasheryFrontEndApplication {

    @RequestMapping("/")
    String home() {
        return "index";
    }

    @RequestMapping("/results")
    String results() {
        return "results";
    }


    public static void main(String[] args) {
        SpringApplication.run(DasheryFrontEndApplication.class, args);
    }
}
