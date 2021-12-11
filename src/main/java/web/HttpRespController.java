package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HttpRespController {

    @GetMapping("/txt")
    public String txt(){
        return "a.txt"; // 프레임워크사용 ( 틀이 이미 정해져잇음 ) - 일반 정적파일들은 resource - static이 디폴트 경로
    }

//    @GetMapping("/mus") // 머스태치 mvc 라이브러리 추가가
//    public String mus(){
//        return "b.mustache";
//    }
    // /mus 찾아가면 다운로드 창이나옴. was(톰캣)작동 안하고 정적파일 리턴

    @GetMapping("/mus") // 머스태치 mvc 라이브러리 추가가
    public String mus(){
        return "b"; // 머스태치 템플릿 엔진 라이브러리 등록 완료= templates 폴더안에 .mustache를 놔두면
        //확장자명 없이 파일명만 적으면 자동으로 찾아감
    }

    //톰캣 라이브러리 설치
    @GetMapping("/jsp")
    public String jsp(){
        return "c"; // 인텔리제이는 jsp를 지원하지않는다 (무료버전)
        //jsp엔진사용 : src/main/webapp폴더가 디폴드경로, application.yml에 경로 지정
        //prefix : 경로
        //suffix : 확장자
        //자동으로 찾아가주는게 ViewResolver가 도와줘서그럼 MessageConverter랑 비슷함
    }

}


