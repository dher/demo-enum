
public class Test {

    public static void main(String[] arg){
        // get one
        System.out.println(ContohEnum.APPLE);
        System.out.println();

        // get all/list
        for (ContohEnum enumA : ContohEnum.values()){
            System.out.println(enumA);
        }
        System.out.println();

        System.out.println(ContohEnum.APPLE.getBarang());
        System.out.println();

        for (ContohEnum enumA : ContohEnum.values()){
            System.out.println(enumA.getBarang());
        }
    }

}
