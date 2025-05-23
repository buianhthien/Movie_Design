package edu.poly.movieproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("list-film")
public class ListFilmController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("view", "user/list-film");
        return "Layouts/layout";
    }
}
