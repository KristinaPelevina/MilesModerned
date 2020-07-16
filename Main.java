public class Main {
    public static void main(String[] args) {

        BonusMilesService bonusMilesService = new BonusMilesService();

        long bonus = bonusMilesService.calculate(10_000);

        System.out.println(bonus);

    }
}


