package run;

import entity.Staff;

import java.util.*;
import java.util.stream.Collectors;

public class Lamda {
    public static void main(String[] args) {
//        List<Integer> listNumbers = Arrays.asList(4, 3, 6, 2, 8, 1, 9, 10, 2, 1);
//        double number = listNumbers
//                .stream()
//                .filter(evenNumber -> evenNumber % 2 == 0)
//                .peek(evenNumber -> System.out.println("Even number: " + evenNumber))
//                .map(Math::sqrt)
//                .mapToDouble(doubleNumber -> doubleNumber)
//                .average().getAsDouble();
//        System.out.println("number = " + number);

        Staff staff1 = new Staff("Duc Phuong", 9999);
        Staff staff2 = new Staff("Minh Phuong", 8888);
        Staff staff3 = new Staff("Nam", 7777);
        Staff staff4 = new Staff("Thuy", 6666);
        Staff staff5 = new Staff("Anh", 5555);

        List<Staff> listStaffs = Arrays.asList(staff1, staff2, staff3, staff4, staff5);

        //print list before sorting
        listStaffs.forEach(staff -> {
            System.out.print("name = " + staff.getName());
            System.out.println(" --- salary = " + staff.getSalary());
        });

        //Sort by name
        listStaffs.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        //Sort by salary
        listStaffs.sort((s1, s2) -> (int) (s1.getSalary() - s2.getSalary()));

        //print list after sorting
        listStaffs.forEach(staff -> {
            System.out.print("name = " + staff.getName());
            System.out.println(" --- salary = " + staff.getSalary());
        });

        List<String> listNameUpperCase = listStaffs.stream()
                .filter(staff -> staff.getName().length() > 6)
                .map(staff -> staff.getName().toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());

        listNameUpperCase.forEach(name -> System.out.println("name = " + name));

        Map<String, Staff> map = new HashMap<>();

        map.put("ST01", staff1);
        map.put("ST02", staff2);
        map.put("ST03", staff3);
        map.put("ST04", staff4);
        map.put("ST05", staff5);

        map.forEach((key, value) -> System.out.println("key = " + key + " - value: " + value));

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(G7Countries);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4, 10, 9, 3);
        numbers.stream()
                .map(i -> i * i)
                .distinct() //Loại bỏ các phần từ trùng lặp
                .collect(Collectors.toList()).forEach(System.out::println);

        //Reduce tính thuế 10%
        double incomeTax = listStaffs.stream()
                .map(staff -> staff.getSalary())
                .reduce(0.0, (subTotal, salary) -> subTotal + salary * 0.1, Double::sum);
        System.out.println(incomeTax);

        //Tìm nhân viên có lương cao nhất
        Staff result = listStaffs.stream()
                .reduce(listStaffs.get(0), (max, staff) -> {
                    System.out.println("max = " + max.getSalary());
                    System.out.println("staff = " + staff.getSalary());
                    if (staff.getSalary() > max.getSalary()) {
                        return staff;
                    }
                    return max;
                });
        System.out.println(result.getSalary());

        //Tìm nhân viên có lương thấp nhất
        Staff staffMaxSalary = listStaffs.stream().
                reduce(listStaffs.get(0), (min, staff) -> staff.getSalary() < min.getSalary() ? staff : min);

        if (listStaffs.stream().allMatch(staff -> staff.getSalary() > 777)) {//Tất cả nhân viên lương > 777

        }
        if (listStaffs.stream().allMatch(staff -> staff.getSalary() > 777)) {//Ít nhất 1 nhân viên lương > 777

        }
        if (listStaffs.stream().noneMatch(staff -> staff.getSalary() > 777)) {//Không có nhân viên nào lương > 777

        }

    }
}
