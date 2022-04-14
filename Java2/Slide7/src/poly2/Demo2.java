
package poly2;
public class Demo2 {

    public static void main(String[] args) {
//        Nguyên thủy =  > Đối tượng:
//        Boxing / Đóng hộp / AutoBoxing
//        Đối tượng =  > Nguyên thủy:
//        UnBoxing / Mở hộp / AutoUnBoxing
        
        Integer obj = new Integer(1); //Boxing

        Double obj2 = Double.valueOf(1); //Boxing

        int i = obj.intValue(); //Unboxing
    }
}
