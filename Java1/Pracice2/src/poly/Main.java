/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLNV qlnv = new QLNV();
        Scanner sc = new Scanner(System.in);
        qlnv.khoiTao();
        while (true) {
            System.out.println("1.Khởi tạo (Thêm 5 phần tử vào list)");
            System.out.println("2.Nhập 1 đối tượng hoặc danh sách đối tượng");
            System.out.println("3. Xuất danh sách đối tượng (xuất cả tuổi). Tuổi =2021- namsinh");
            System.out.println("4. Xuất danh sách các NhanVien có luong>500");
            System.out.println("5. Xuất danh sách các NhanVien theo khoảng lương nhập từ bàn phím");
            System.out.println("6. Tìm NhanVien theo mã nhập từ bàn phím");
            System.out.println("7. Xuất các NhanVien có tuổi từ 18 đến 30");
            System.out.println("8. Đếm số NhanVien có tuổi >18");
            System.out.println("9. Sắp danh sách các NhanVien theo tenNV giảm dần");
            System.out.println("10. Sắp danh sách các NhanVien theo lương giảm dần");
            System.out.println("11. Sắp danh sách các NhanVien theo tuổi tăng dần");
            System.out.println("12. Tìm theo MaNV");
            System.out.println("13. Tìm theo TenNV");
            System.out.println("14. Xuất Danh sách Nhân Viên theo Trạng Thái");
            System.out.println("15. Xóa đối tượng theo MaNV");
            System.out.println("16. Xuất Danh sách NhanVien có tuổi chẵn");
            System.out.println("17. Xuất Danh sách Nhân Viên có tuổi lẻ");
            System.out.println("18. Xuất danh sách Nhân viên có tên bắt đầu với từ hoặc chữ cái (do\n"
                    + "người dùng nhập)");
            System.out.println("CHon chuc nang: ");

            int chon;
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:

                    break;
                case 14:

                    break;
                case 15:

                    break;
                case 16:

                    break;
                case 17:

                    break;
                case 18:

                    break;

                default:
                    throw new AssertionError();
            }
        }
    }

}
