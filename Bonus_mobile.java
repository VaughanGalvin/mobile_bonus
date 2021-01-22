public class Bonus_mobile {
    public static void main(String[] args) {
        int balance_amount = 1000;
        int topup_amount = 1600;
        int bonus_sum = topup_amount / 100;
        int topup_limit = 1000;
        int total_balance = balance_amount + topup_amount + bonus_sum;

        if (topup_amount > topup_limit) {
            System.out.print(total_balance);
        }
    }
}