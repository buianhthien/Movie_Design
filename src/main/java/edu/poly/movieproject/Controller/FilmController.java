package edu.poly.movieproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.movieproject.Model.Film;



@Controller
@RequestMapping("/film")
public class FilmController {
    @GetMapping("/list")
    public String list() {
        Film film = new Film();
        return "film/list";
    }

}
