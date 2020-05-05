public class Main {
    public static void main(String[] args) {
        int initialbalance = 200;
        int limit = 1000;
        int transfer = 1100;
        int balance = 0;
        int bonus;
        if (transfer >= limit) {
            bonus = transfer / 100;
            balance = initialbalance + transfer + bonus;
        } else {
            bonus = 0;
            balance = initialbalance + transfer;
        }
        System.out.println(bonus);
        System.out.println(balance);
    }

}
