public class Main {
    public static void main(String[] args) {
        int score = 250;
        int total = 1100;
        int bonus = total / 100;
        int result = score + total;
        System.out.println("Итоговый счёт " + result);
        if (total >1000) {
            System.out.println("Начисленно бонусов " + bonus);
        } else {
            System.out.println("Для получения бонуса неооходимо пополнить баланс");
        }



    }
}
