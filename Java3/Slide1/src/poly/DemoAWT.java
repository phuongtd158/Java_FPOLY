

package poly;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DemoAWT extends Frame{
    Button btnRed, btnYellow;
    Label lbResult;
    public DemoAWT(){
        setTitle("Demo AWT"); //set tiêu đề cho form
        setSize(300, 100); //set kích thước cho form
        setLocationRelativeTo(null);
        setLayout(new FlowLayout()); //set chế độ trình bày màn hình FlowLayout
        //FlowLayout: là chế độ trình bày màn hình: các component sắp xếp tự động
        //từ trái qua phải, từ trên xuống dưới
        
        
        //Tạo đối tượng
        btnRed = new Button("Red");
        btnYellow = new Button("Yellow");
        lbResult = new Label("Result");
        
        //Thêm điều khiển vào form
        add(btnRed);
        add(btnYellow);
        add(lbResult);
        
        //Gắn sự kiện cho các nút lệnh
        btnRed.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
                lbResult.setText("Red");
               
            }
            
        });
        
        btnYellow.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.yellow);
                lbResult.setText("Yellow");
            }
            
        });
        
       
    }
    
}
