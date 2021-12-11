package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRedirectionController {

    @GetMapping("/home")
    public String home(){
        //1만줄 가정
        return "home";
        //status cod 200번대
    }

    @GetMapping("/away")
    public String away(){
        //다른코드
        return "redirect:/home"; //리다이렉션이 된다. (@Controller)

        //status code 300번대 >> home 200번대
    }
}
