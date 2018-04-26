
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
