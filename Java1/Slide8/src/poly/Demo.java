

package poly;


public class Demo {

   
    public static void main(String[] args) {
      XHelper helper = new XHelper();
    
//      int kq =   helper.sum(2,4,5,6,4,5);
//        System.out.println(kq);

        System.out.println("Tổng 2 số là: "+helper.sum(1,2,3,4));
        
        int b[] = {1,2,5,6,7,8};
        
        System.out.println("Tông các phần tử mảng là: "+helper.sum(b));
        
        
        //Gọi static
        //C1: Tạo đối tượng => gọi như bình thường
        XHelper helper1 = new XHelper();
        System.out.println("C1: "+helper1.tinhTong(1,2,3,4));
        
        //C2: Không cần tạo dối tượng => gọi TenLop.TenPhuongThucStatic();
        System.out.println("C2: "+XHelper.tinhTong(1,3,4));
        
        //Dùng thuộc tính static: TenLop.tenThuocTinhStatic
        XHelper.so = 10;
    }
    
}
