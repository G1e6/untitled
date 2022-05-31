public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(500, true);
        System.out.println(bonus);
    }
}
