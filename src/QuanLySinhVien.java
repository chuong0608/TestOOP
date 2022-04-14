public class QuanLySinhVien extends SinhVien implements QuanLy<SinhVien> {
    private SinhVien [] danhSach=new SinhVien[4];
    private int size=0;

    @Override
    public void Them(SinhVien sinhVien) {
        danhSach[size]=sinhVien;
        size++;
    }

    @Override
    public void Sua(String name, SinhVien sinhVien) {
        danhSach[TimKiem(name)]=sinhVien;

    }

    @Override
    public int TimKiem(String name) {
        for (int i = 0; i < size; i++) {
            if(name.equals(  danhSach[i].getTen())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void Print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("----------------");
    }
}
