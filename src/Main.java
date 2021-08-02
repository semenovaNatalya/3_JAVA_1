public class Main {
    public static void main(String[] args) {
        int ticket_price;
        int bonus_limit;
        int mile;
        ticket_price = 5000;
        bonus_limit = 20;
        mile = ticket_price / bonus_limit;
        if (ticket_price >= 20) {

            System.out.println("Ваш бонус составляет");
            System.out.println(mile);

        } else {
            System.out.println("Бонусы Вам не начислены");
        }

    }
}
