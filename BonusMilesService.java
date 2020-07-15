public class BonusMilesService {
        public long calculate(int cost) {

            int rubles = 20;
            int miles = 1;

            int bonus = cost / rubles * miles / 100;

            return bonus;
        }
    }