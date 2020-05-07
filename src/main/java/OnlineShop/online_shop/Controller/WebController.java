package OnlineShop.online_shop.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import OnlineShop.online_shop.SpringContextBridge;
import OnlineShop.online_shop.IRepository.UserRepository;
import OnlineShop.online_shop.tables.User;

@Controller
public class WebController {
   // @Value("${spring.application.name}")
   // String appName;

    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("userCredentials", new UserCredentials());
        return "home";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model) {
        UserRepository userRepository = SpringContextBridge.services().getUserRepository();
        user = userRepository.save(user);
        model.addAttribute("userCredentials", new UserCredentials());
        return "home";
    }

    @PostMapping("/login")
    public String userSubmit(@ModelAttribute UserCredentials userCredentials) {
        UserRepository userRepository = SpringContextBridge.services().getUserRepository();
        List<User> users = (List<User>) userRepository.findAll();
        for (User user : users) {
            if (user.getUsername().equals(userCredentials.getUsername())
                    && user.getPassword().equals(userCredentials.getPassword())) {
                return "loggedIn";
            }
        }

        return "loginFailed";
    }
}