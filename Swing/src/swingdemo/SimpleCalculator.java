package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener{
	// Khai bao 4 button
    private JButton btnCong;
    private JButton btnTru;
    private JButton btnNhan;
    private JButton btnChia;

    // Khai bao 3 textfield chua 2 so
    private JTextField tfNum1;
    private JTextField tfNum2;

    // Khai bao1 textfield hien thi ket qua
    private JTextField tfResult;

    // Khai bao container
    private Container cont;

    // Khai bao cac panel de gom nhom cac component
    private JPanel panel1, panel2;

    // Ham khoi tao
    public SimpleCalculator(String title) {
        super(title);

        cont = this.getContentPane();

        // Tao cac thanh phan tren giao dien khoi tao
        JLabel lbNum1 = new JLabel("Enter Number 1: ");
        tfNum1 = new JTextField();
        JLabel lbNum2 = new JLabel("Enter Number 2: ");
        tfNum2 = new JTextField();
        JLabel lbResult = new JLabel("Result: ");
        tfResult = new JTextField();

        // Vo hieu qua nhap cua tfResult
        tfResult.setEditable(false);

        // Dat cac component vao cac panel thich hop
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2)); // Layout gom 3 hang 2 cot
        panel1.add(lbNum1);
        panel1.add(tfNum1);
        panel1.add(lbNum2);
        panel1.add(tfNum2);
        panel1.add(lbResult);
        panel1.add(tfResult);

        // Tao 4 nut cho 4 phep toan
        btnCong = new JButton("+");
        btnTru = new JButton("-");
        btnNhan = new JButton("*");
        btnChia = new JButton("/");

        // Panel2 chua 5 4 phep toan
        panel2 = new JPanel();
        panel2.add(btnCong);
        panel2.add(btnTru);
        panel2.add(btnNhan);
        panel2.add(btnChia);

        // Dat panel 1 vao vung chinh giua cua container
        cont.add(panel1);

        // Dat panel 2 vao vung ben duoi
        cont.add(panel2, "South");

        // Gan Listen cho cac button tuong ung
        btnCong.addActionListener(this);
        btnTru.addActionListener(this);
        btnNhan.addActionListener(this);
        btnChia.addActionListener(this);

        // Thiet lap kich thuoc va hien thi
        this.pack();
        this.setVisible(true);
    }
 // Ham thuc hien phep nhan
    public void nhan() {
        // Lay tu du lieu
        double num1 = Double.parseDouble(tfNum1.getText());
        double num2 = Double.parseDouble(tfNum2.getText());

        // Tinh toan
        double result = num1 * num2;

        // Hien thi ket qua
        tfResult.setText(String.valueOf(result));
    }

 // Ham thuc hien phep chia
    public void chia() {
        // Lay tu du lieu
        double num1 = Double.parseDouble(tfNum1.getText());
        double num2 = Double.parseDouble(tfNum2.getText());

        // Tinh toan
        double result = num1 / num2;

        // Hien thi ket qua
        tfResult.setText(String.valueOf(result));
    }
    //add them phim mac dinh
    @Override
    public void actionPerformed(ActionEvent e) {
        // Khi click btnCong, btnTru, btnNhan, btnChia
        if (e.getActionCommand() == "+") {
            cong();
        } else if (e.getActionCommand() == "-") {
            tru();
        } else if (e.getActionCommand() == "*") {
            nhan();
        } else if (e.getActionCommand() == "/") {
            chia();
        }
    }

    

    

    
    public static void main(String[] args) {
        // Khai bao doi tuong
        SimpleCalculator slculator = new SimpleCalculator("Simple Calculator");
    }
}
