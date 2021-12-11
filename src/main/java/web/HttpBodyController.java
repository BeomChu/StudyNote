package web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpBodyController {

    @PostMapping("/body1")
    public String xwwwformurlencoded(String userName){
        // log.info(username)으로 확인 넘어오는 key가 userName인 value값 확인 가능
        return "key=value 전송옴";
    }

    @PostMapping("/body2")
    public String plaintext(@RequestBody String data){ // 평문
        //text/plain 형식을 받아오려면 RequestBody 어노테이션이 필요
        return "text/plain 전송옴";
    }

    @PostMapping("/body3")
    public String applicationjson(@RequestBody String data){
        //youtube.com/watch?v=olaeVwjx3J8 // 에서 json에 대해서 공부가 가능하다고 공유 받음
        //text/plain과 같은 방식으로 jsondata 또한 RequestBody 어노테이션 필요
        return "json 전송옴";
    }

    @PostMapping("/body4")
    public String applicationjson(@RequestBody User user){
        //youtube.com/watch?v=olaeVwjx3J8 // 에서 json에 대해서 공부가 가능하다고 공유 받음
        //text/plain과 같은 방식으로 jsondata 또한 RequestBody 어노테이션 필요
        //User Object에서 User.getUserName을위해 테스트 해보는 매핑
        return "json 전송옴";
    }
}
class User{
    private String userName;

    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }

}

