public class Main {
    public static void main(String[] args) {
        int score = 250;
        int total = 1100;
        int bonus = total / 100;
        int result = score + total + bonus;
        int otherResult = score + total;
        if (total >= 1000) {
            System.out.println("Итоговый счёт " + result);
        } else {
            System.out.println("Итоговый счёт " + otherResult);
        }


    }
}
