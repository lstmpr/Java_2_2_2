public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float imt = service.calculate(178,85);
        //height в см
        System.out.println(imt);

    }
}
