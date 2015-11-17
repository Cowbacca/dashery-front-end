package uk.co.dashery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class ResultsController {

    @RequestMapping("/results")
    String results(@RequestParam(defaultValue = "") String search, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Clothing[] clothing = restTemplate.getForObject("https://dashery-clothing-query-staging.herokuapp.com/clothing?search=" + search, Clothing[].class);
        model.addAttribute("clothing", clothing);
        return "results";
    }
}
