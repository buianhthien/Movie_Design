package edu.poly.movieproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/ordered-film")
public class OrderedFilmController {
    @GetMapping("/index")
    public String showOrderedFilm(Model model) {
        model.addAttribute("view", "user/ordered-film");
        return "layouts/layout";
    }

}
