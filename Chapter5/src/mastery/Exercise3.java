package mastery;

public class Exercise3 {
    public static void main(String[] args) {
        double money = 2500;
        int years = 0;
        while (money < 5000) {
            years += 1;
            money = money*1.075;
        }
        System.out.println("It will take "+years+" years of investment");
    }
}
