
public class Main {
    public static void main(String[] args) {
        QuanLySinhVien qL=new QuanLySinhVien();
        SinhVien sinhVien1=new SinhVien(1,"Huy",20,8);
        SinhVien sinhVien2=new SinhVien(2,"Hưng",24,6);
        SinhVien sinhVien3=new SinhVien(3,"Sơn",27,9);
        SinhVien sinhVien4=new SinhVien(4,"Thiên",20,5);
        qL.Them(sinhVien1);
        qL.Them(sinhVien2);
        qL.Them(sinhVien3);
        qL.Them(sinhVien4);
        qL.Print();
        SinhVien sinhVien5=new SinhVien(1,"Anh",20,8);
        qL.Sua("Huy",sinhVien5);
        qL.Print();
        System.out.println(qL.TimKiem(sinhVien3.getTen()));
    }


}
