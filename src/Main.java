public class Main {
    public static void main(String[] args) {
        int initialbalance = 300;
        int payment = 1500;
        int bonusrubles = 100;
        int bonus;


        if (payment >= 1000) {
            bonus = payment / bonusrubles;
        } else {
            bonus = 0;
        }

        int finalbalance = initialbalance + payment + bonus;

        System.out.println("итоговый счет " +finalbalance);
        System.out.println("количество бонусных рублей " +bonus);
    }
}