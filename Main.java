public class Main {
    public static void main(String[] args) {
        int topUpAmount = 1500;
        int balans = 100;
        int bonus;
        int every =100;
        if (topUpAmount > 1_000) {
            bonus = (topUpAmount + balans) / every;
        } else {
            bonus = 0;
        }
        int totalBalance = topUpAmount + balans + bonus;
        System.out.println(totalBalance);
    }
}
