public class Main {
    public static void main(String[] args) {
        int Top_up_amount = 1_500;
        int balans = 100;
        int bonus;
        int every =100;
        if (Top_up_amount >= 1_000) {
            bonus = (Top_up_amount + balans) / every;
        } else {
            bonus = 0;
        }
        int total_balance = Top_up_amount + balans + bonus;
        System.out.println(total_balance);
    }
}
