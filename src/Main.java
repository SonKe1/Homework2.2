public class Main {
    public static void main(String[] args) {
        int score = 100;
        int total = 1800;
        int result = score + total;
        int bonus = 0;
        if (total > 1000) {
            bonus = total / 100;
            System.out.println("Начисленно бонусов " + bonus);
        } else {
            System.out.println("Для получения бонуса неооходимо пополнить баланс");
        }
        System.out.println("Итоговый счёт " + (result + bonus));



    }
}
