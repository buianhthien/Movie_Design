package edu.poly.movieproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/history")
public class HistoryController {
    @GetMapping("/index")
    public String showHistory(Model model) {
        model.addAttribute("view", "user/history");
        return "layouts/layout";
    }

}
