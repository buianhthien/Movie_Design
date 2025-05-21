package edu.poly.movieproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/collection")
public class CollectionFilmController {
    @GetMapping("/index")
    public String showCollectionFilm(Model model) {
        model.addAttribute("view", "user/collection-film");
        return "layouts/layout";
    }
}
