public class JavaQuiz7 {
    public static void main(String[] args) {

        int dice = (int)(Math.random()*6+1);
        System.out.println("주사위를 굴립니다.");
        System.out.println("주사위의 값은 " +dice+ " 입니다.");

        if (dice % 2 == 0){
            System.out.println("당첨입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
