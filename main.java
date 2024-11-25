public class main {
    public static void main(String[] args) {
        BmiService bmiObjact = new BmiService ();
        int bmi = (int) bmiObjact.calculate(98, 1.87 );
        System.out.println(bmi);
    }
}
