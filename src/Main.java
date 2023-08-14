public class Main {
    public static void main(String[] args) {
        int start = 200;
        int add = 2200;
        int sum = start + add;
        int bonus;
        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int balance = sum + bonus;

        System.out.println("Итоговый счет:" + balance);
    }
}