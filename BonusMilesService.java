public class BonusMilesService {
        public long calculate(int cost) {

            int milescount = 20;

            int bonus = cost / milescount;

            return bonus;
        }
    }