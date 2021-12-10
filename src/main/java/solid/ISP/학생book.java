package solid.ISP;

public interface 학생book {
    void 공부();
    void 배개();

}
interface 백수book {
    void 라면받침();
    void 무기();
    }
interface 카페book{
    void 장식();
    void 마음의양식();
}
class 학생ver implements 학생book{

    @Override
    public void 공부() {
        System.out.println("공부한다");
    }

    @Override
    public void 배개() {
        System.out.println("베고자는사람도 있더라");
    }
}
class 카페ver implements 카페book{
    @Override
    public void 장식() {}

    @Override
    public void 마음의양식() {}
}