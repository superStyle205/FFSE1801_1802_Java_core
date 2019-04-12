package ThuTienDien;


public class ChuHo {
    private String name;
    private String address;
    private BienLai bienLai;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public BienLai getBienLai() {
        return bienLai;
    }

    public ChuHo(String name, String address, BienLai bienLai) {
        this.name = name;
        this.address = address;
        this.bienLai = bienLai;
    }

}
