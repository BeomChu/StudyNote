package solid.LSP;

import solid.ocp.GoodCase;

//badcase
public class BadCase {
    void drive() {
        System.out.println("나는야 10년차 대리운전기사");
        System.out.println("오늘도 나의방식대로 운전하지");
        System.out.println("시동걸고,기어넣고,부릉부릉");
    }

}
class 손님1 extends BadCase {
    @Override
    void drive() {
        super.drive(); // 대리기사의 방식대로 운전한다.
    }
}

class 손님2 extends BadCase{
    @Override
    void drive() {
        super.drive();
        System.out.println("이 손님은 단골손님, 무리해서라도 빠르게 모셔다드리자.");
    }
}
class 손님3 extends BadCase{
    @Override
    void drive() {
        super.drive();
        System.out.println("이 손님은 만취한 것 같으니 목적지에 도착해서 대리비를 한번 더 받아야겠다.");
    }
}
