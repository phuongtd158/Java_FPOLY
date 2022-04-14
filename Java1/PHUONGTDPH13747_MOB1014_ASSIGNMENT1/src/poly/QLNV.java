/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLNV {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void khoiTao() {
        list.add(new NhanVien("NV01", "Tran Duc Phuong", 50000000));
        list.add(new NhanVien("NV02", "Tran Duc Anh", 8000000));
        list.add(new NhanVien("NV03", "Nguyen Minh Phuong", 20000000));
        list.add(new NhanVien("NV04", "Luong Hoai Nam", 10000000));
        list.add(new NhanVien("NV05", "Le Duc Manh", 12000000));

    }

    public void listNhanVien() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại nhân viên: (1. Trưởng phòng 2.Hành chính 3.Tiếp thị)");
            int loai = Integer.parseInt(sc.nextLine());
            if (loai == 1) {
                NhanVien nv = new TruongPhong();
                nv.nhap();
                list.add(nv);
            } else if (loai == 2) {
                NhanVien nv = new NhanVien();
                nv.nhap();
                list.add(nv);
            } else {
                NhanVien nv = new TiepThi();
                nv.nhap();
                list.add(nv);
            }
            System.out.println("Bạn có muốn nhập thêm nhân viên không(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    public void nhapDSNV() {
        while (true) {
            NhanVien nv = new NhanVien() {
                @Override
                public double getThuNhap() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            nv.nhap();
            list.add(nv);
            System.out.println("Bạn có muốn nhập thêm nhân viên không(Y/N)");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatDSNV() {
        for (NhanVien x : list) {
            x.xuat();
        }
    }

    public void timNv() {
        System.out.println("Mời bạn nhập họ tên nhân viên muốn tìm: ");
        String tenNv = sc.nextLine();
        boolean check = false;
        for (NhanVien x : list) {
            if (x.getTenNv().equalsIgnoreCase(tenNv)) {

                System.out.println("Nhân viên cần tìm là: ");
                x.xuat();
                check = true;
                break;
            }

        }
        if (check == false) {
            System.out.printf("Không tồn tại nhân viên có tên %s", tenNv);
        }
    }

    public void xoaNv() {

        System.out.println("Mời bạn nhập mã nhân viên muốn xóa: ");
        String maNv = sc.nextLine();

        for (NhanVien x : list) {
            if (x.getMaNv().equalsIgnoreCase(maNv)) {
                list.remove(x);
                System.out.printf("Xóa thành công nhân viên có mã %s. Danh sách sau khi xóa là: \n", maNv);
                xuatDSNV();
                break;
            }
        }

    }

    public void capNhatNv() {
        boolean nv = false;
        System.out.println("Mời bạn nhập họ tên nhân viên muốn cập nhật: ");
        String tenNv = sc.nextLine();
        for (NhanVien x : list) {
            if (x.getTenNv().equalsIgnoreCase(tenNv)) {
                nv = true;
                System.out.printf("Đã tìm thấy nhân viên có tên %s. Mời bạn nhập thông tin mới: \n", tenNv);
                x.nhap();
                System.out.println("Cập nhật thành công. Thông tin nhân viên sau khi cập nhật là: ");
                x.xuat();
                break;
            }
        }
        if (nv == false) {
            System.out.println("Không tìm được nhân viên có mã như trên");
        }

    }

    public void timTheoKhoangLuong() {
        double min, max;
        System.out.println("Mời bạn nhập khoảng lương thấp nhất: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập khoảng lương cao nhất: ");
        max = Double.parseDouble(sc.nextLine());
        System.out.printf("Danh sách nhân viên có lương từ %.1f đến %.1f là:\n", min, max);
        boolean check = false;
        for (NhanVien x : list) {
            if (x.getThuNhap() >= min && x.getThuNhap() <= max) {
                x.xuat();
                check = true;

            }

        }
        if (check == false) {
            System.out.println("Không tồn tại nhân viên");
        }
    }

    public void sapTheoTen() {
        Comparator<NhanVien> compa = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTenNv().compareToIgnoreCase(o2.getTenNv());
            }
        };
        Collections.sort(list, compa);
        System.out.println("Danh sách nhân viên sau khi sắp là: ");
        xuatDSNV();
    }

    public void sapTheoThuNhap() {
        Comparator<NhanVien> compa = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                Double d1 = o1.getThuNhap();
                Double d2 = o2.getThuNhap();
                return d1.compareTo(d2);
            }
        };
        Collections.sort(list, compa);
        System.out.println("Danh sách nhân viên sau khi sắp là: ");
        xuatDSNV();
    }

    public void topNv() {
        Comparator<NhanVien> compa = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                Double d1 = o1.getThuNhap();
                Double d2 = o2.getThuNhap();
                return d2.compareTo(d1);
            }
        };
        Collections.sort(list, compa);
        for (int i = 0; i < 5; i++) {
            list.get(i).xuat();
        }
    }
}
