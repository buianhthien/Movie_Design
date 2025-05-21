package edu.poly.movieproject.Controller.Account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/account")
public class SettingAccountController {
    @GetMapping("/setting")
    public String settingAccount(Model model) {
        model.addAttribute("view", "accounts/setting-account");
        return "Layouts/layout";
    }

}
