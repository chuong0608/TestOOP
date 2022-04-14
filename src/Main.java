
public class Main {
    public static void main(String[] args) {
        QuanLySinhVien qL=new QuanLySinhVien();
        SinhVien sinhVien1=new SinhVien(1,"Huy",20,8);
        SinhVien sinhVien2=new SinhVien(2,"Hưng",24,6);
        SinhVien sinhVien3=new SinhVien(3,"Sơn",27,9);
        SinhVien sinhVien4=new SinhVien(4,"Thiên",20,5);
        qL.them(sinhVien1);
        qL.them(sinhVien2);
        qL.them(sinhVien3);
        qL.them(sinhVien4);
        qL.print();
        SinhVien sinhVien5=new SinhVien(1,"Anh",20,8);
        qL.sua("Huy",sinhVien5);
        qL.print();
        System.out.println(qL.timKiem(sinhVien3.getTen()));
    }


}
