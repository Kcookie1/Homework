public class RacingContestExample {
    public static void main(String[] args) {
        // Thread가 스레드라고 불리는 녀석이다.
        // 실제로 이 스레드라는라는 녀석들은 운영체제에 따라 구조가 다르다.
        // 자바는 스레드를 추상화 시켜뒀다.
        // 운영체제를 신경쓰지 않고도 개발 할 수 있게 잘 추상화되어 있어서 하부까지 신경 쓸 필요가 없다.
        // 다만 스레드가 어떻게 동작하는지에 대한 동작 원리를 이해할 필요는 있다.

        // 원리들이 다른 언어들이랑도 연결이 된다.

        // new Thread(스레드화시킬 클래스를 객체화하여 만들어줌)
        // 그리고 new Thread로 구동되려면
        // new Thread 내부에서 객체화할 클래스가 반드시 Runnable이라는 interface를 implements 해줘야한다.

        Thread t1 = new Thread(new Horse("적토마"));
        Thread t2 = new Thread(new Horse("질풍마"));
        Thread t3 = new Thread(new Horse("통통마"));

        // 만들어진 스레드 객체는 start() 메서드에 의해서 구동 됨.
        // start()를 하는 순간 run()이 구동된다.
        t1.start();
        t2.start();
        t3.start();

        // t1.start()가 끝이나고 -> t2.start()가 실행되야하는데 끝나지도 않았는데 실행이 된다.
        // t1, t2,t3는 거의 동시에 구동이 된다.
        // 실제로 스레드는 cpu가 여러개 있으면 그 여러개의 cpu에서 모두 함께 구동된다.
        // 학교에서 학습하는 컴퓨터 구조론에 따르면 "cpu는 한순간에 오직 한개다."
        // ??? 지금 여러개가 같이 돌고 있지 않나요?
        // -> cpu가 하나라고 했지 여러개라고 하지않았습니다.

        // 실제 쓰레드는 cpu가 1개 있던 시절에 만들어졌다.
        // ??? 어차피 cpu는 한 순간에 하나 밖에 돌리지 못하는데 여기에 쓰레드 개념을 도입하는 의미가 있나요?
        // -> ctrl + alt + delete 키를 누르세요

        // 프로세스 -> 각자 자리를 나춰서 메모리에 올라가는 것.
        // 객체는 메모리에 올라가면 객체
        // 프로그램 자체가 다 올라간걸 프로세스라고 한다.
        // 프로세스 내에는 짜잘한 쓰레드가 존재할 수 있다.

        // 프로세스와 쓰래드를 구별하는 방법
        // 프로세스: 프로그램 전체 (main을 포함)
        // 스레드: 프로그램 일부 (main이 포함되지 않음)
        // 그리고 둘의 공통점은 모두 cpu상에서 구동되기 위해 메모리에 올라가 있다 (적재)는 것임.
        // 즉 포괄적인 범위에서는 둘 다 객체에 해당함.

    }
}