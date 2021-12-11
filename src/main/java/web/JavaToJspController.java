package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaToJspController {

    @GetMapping("/jsp/java")
    public String jspToJava(){
        return "d";
    }

    public void practiceJsp(){
        String practiceCode="<% int num=10; %>";
        String next = "num의 값은 <%= num %>";
    }

    @GetMapping
    public String jspToJavaToModel(Model model){
        User user=new User();
        user.setUserName("Beomchu");
        model.addAttribute("username",user.getUserName()); //addAttribute는 함수 전달만함
        return "e";
    }

    public void practiceJspToModel{
        String ptCode="${username}";

    }
}
