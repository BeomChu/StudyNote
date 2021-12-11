package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {

    @GetMapping("/chicken")
    public String chickenQuery(String type){
        return type+"배달갑니다.(쿼리스트링)";   // /chicken?type=양념 >> 양념 가져옴
    }

    @GetMapping("chicekn/{type}")
    public String chickenPath(@PathVariable String type){   //chicken/양념 >> 양념 가져옴
        return type+"배달갑니다.(주소변수매핑)"; // 가독성이 뛰어나서 스트링부트에서 주로 사용함
    }
}
