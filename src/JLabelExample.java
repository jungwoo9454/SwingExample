import javax.swing.*;
//라벨 생성 예제
public class JLabelExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();       //JFrame 객체 생성
        jFrame.setSize(380,180);
        jFrame.setLocation(600,400);
        jFrame.setTitle("로그인");
        jFrame.setLayout(null);

        JLabel label = new JLabel("아이디 : ");
        label.setSize(80,30);
        label.setLocation(30,30);
        label.setHorizontalAlignment(JLabel.CENTER);

        jFrame.add(label);

        JTextField textField = new JTextField();
        textField.setSize(130,30);
        textField.setLocation(110,30);

        jFrame.add(textField);

        jFrame.setVisible(true);
    }
}
