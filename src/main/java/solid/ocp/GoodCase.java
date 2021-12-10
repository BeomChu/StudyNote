package solid.ocp;

//GoodCase
public class GoodCase {
    void drive() {
        System.out.println("나는야 10년차 대리운전기사");
        System.out.println("어떤차든 나의 방식대로 운전하지");
        System.out.println("시동걸고,기어넣고,부릉부릉");
    }

}
class 손님4 extends GoodCase{
    @Override
    void drive() {
        super.drive();
    }
}

class 손님5 extends GoodCase{
    @Override
    void drive() {
        super.drive();
    }
}

//...
