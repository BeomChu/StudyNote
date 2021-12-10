package solid.ISP;

//badcase
public interface Book {
    //학생
    void 공부();
    void 베게();
    //백수
    void 라면받침();
    void 무기();
    //카페(차리고싶었따..)
    void 장식();
}
class 학생 implements Book{

    @Override
    public void 공부() {}
    @Override
    public void 베게() {}

    @Override
    public void 라면받침() {} //공부할걸로 그러면 안됨
    @Override
    public void 무기() {}

    @Override
    public void 장식() {} //공부할걸로 그러면 안됨

}
//...
