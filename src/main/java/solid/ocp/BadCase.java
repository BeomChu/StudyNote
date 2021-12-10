package solid.ocp;

//badCase
public class BadCase{
    //숙련된 대리운전 기사는 손님의 차가 어떤것이라도 운전할 줄 알아야한다.
    void drive(){
        System.out.println("시동걸고, 기어넣고, 부릉부릉");
    }

}
class 손님1{
    void drive(){
        System.out.println("저번주에 뽑은 나의 신차");
        System.out.println("시동걸고, 예열5분, 만족만족, 부릉부릉");
    }
}

class 손님2{
    void drive(){
        System.out.println("나는야 난폭운전 하는남자");
        System.out.println("법규따위 법규머겅, 부르르릉부릉부릉우왕");
    }
}
class 손님3{
    void drive(){
        System.out.println("나는야 외제차 오너");
        System.out.println("내앞에 끼어드는 차는 못참지, 추월추월, 방향지시등 ㄴㄴ");
    }
}
