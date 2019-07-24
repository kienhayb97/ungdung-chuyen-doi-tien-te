package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/calculate")
    public String greeting(@RequestParam double usd, Model model, @RequestParam double rate){
        model.addAttribute("usd", usd);
        model.addAttribute("rate",rate);
        double vnd=usd*rate;
        model.addAttribute("vnd",vnd);
        return "convert";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
}