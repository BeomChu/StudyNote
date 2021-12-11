package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResponseJsonController {

    @GetMapping("/resp/json")
    public String respJson(){
        //{\"username\":\"cos\"
        //josnviewer를 설치하여 이뿌게 볼수있음 ^^
        return "문자열";
    }

    @GetMapping("/resp/json/object")
    public String respJsonObject(){
        //User user=new User();
        //user.setUserName("홍길동");
        //String data="{\"username\":\""+user.getUserName()+\"" <<<<<<<<<미친짓
        return "data";
    }

    @GetMapping("/resp/json/javaobject")
    public String respJsonJavaObject(){
        //User user=new User();
        //user.setUserName("홍길동");

        return "user";
        //Spring에 있는 MessageConverter가 자동으로 JavaObject를 Json(구 xml)으로 변경해서 통신을  통해 응답해준다.
        //RestController일때만 MessageConverter가 작동한다.
    }


}
