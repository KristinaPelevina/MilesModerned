public class Main {
    public static void main(String[] args) {

        BonusMilesService bonusMilesService = new BonusMilesService();

        long bonus = bonusMilesService.calculate(10_000);

        System.out.println(bonus);

//        int cost = 10_000;
//        int rubles = 20;
//        int miles = 1;
//
//        int bonus = cost / rubles * miles /100;
//        System.out.println(bonus);
    }
}


