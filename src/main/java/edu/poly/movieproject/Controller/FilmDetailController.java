package edu.poly.movieproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film-detail")
public class FilmDetailController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("view", "user/film-detail");
        return "Layouts/layout";
    }

}
