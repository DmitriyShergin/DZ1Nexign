public class HomeTask1 {
    public static void main(String[] args) {
        String name = "Dima";
        long start_money = 1000000L;
        byte years = 10;
        float rate = 5.5F;
        double finish_money;

        finish_money = start_money + (start_money * rate / 100) * years;
        System.out.println("Hello, " + name + ". Your final balance: " + finish_money + " rubles");
    }
}
