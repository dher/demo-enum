# demo-enum

class enum:
```java
public enum ContohEnum {
    HONDA("motor honda"),
    YAMAHA("motor yamaha"),
    APPLE("laptop mac");

    private String barang;

    public String getBarang() {
        return barang;
    }

    ContohEnum(String barang) {
        this.barang = barang;
    }
}
```

contoh penggunaan:
```java
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
```
