package solid.DIP;

interface 기분좋아 {
    void 기분좋은표현();
}

class 멍멍이 implements 기분좋아{
    @Override
    public void 기분좋은표현() {
        System.out.println("꼬리살랑살랑");
    }
}

class 고양이 implements 기분좋아{
    @Override
    public void 기분좋은표현() {
        System.out.println("그르릉그르릉");
    }
}

class 교감하기 {
    private 기분좋아 기분좋아;

    public void 누가좋아(final 기분좋아 기분좋은동물) {
        this.기분좋아 = 기분좋은동물;
        // 멍멍이, 고양이
    }

    public void 어떻게좋아() {
        기분좋아.기분좋은표현();
        // "꼬리살랑살랑"
        // "그르릉그르릉"
    }


}



