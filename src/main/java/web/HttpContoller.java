package web;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpContoller {

    //http://locallhost:8080/get
    @GetMapping("/get")
    public String get(){  //CRUD READ , DATABASE SELECT
        return "get요청됨";
    }

    //http://locallhost:8080/post
    @PostMapping("/post")
    public String post(){   //CRUD  CREATE , DATABASE CREATE
        return "post요청됨";
    }
    // post, put 실습을 위해 postMan 실행

    //http://locallhost:8080/put
    @PutMapping("/put")
    public String put(){    //CRUD UPDATE , DATABASE UPDATE
        return "put요청됨";
    }

    //http://locallhost:8080/delete
    @DeleteMapping("/delete")
    public String delete(){    //CRUD DELETE , DATABASE DELETE
        return "delete요청됨";
    }
}
