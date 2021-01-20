public class Main {

    public static void main (String[] abs){
    BonusMilesService service =new BonusMilesService();
    int price = 10000;
    int bonus = service.calculate(price);
    System.out.println(bonus);
}


}
