public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 3_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

//int amount = 3500;
//int bonusMiles = amount / 20;

//System.out.println("Бонусные мили: " + bonusMiles);

