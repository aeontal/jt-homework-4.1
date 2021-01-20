public class BonusMilesService {
    public int calculate(int cost){
    int bonusmult=20;
    int bonus_miles = cost / bonusmult;
        return bonus_miles;
    }

}
