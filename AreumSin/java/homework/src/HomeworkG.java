public class HomeworkG {
    public static void main(String[] args) {
        int dice = (int)(Math.random() *6 +1);

        if(dice % 2 == 1) {
            System.out.println("손모가지를 내놔라." + dice);
        }
    }
}
