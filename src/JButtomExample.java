import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//https://yooniron.tistory.com/13
public class JButtomExample {
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

        JButton button = new JButton("완료");
        button.setBounds(70,80,150,50);
        button.setHorizontalAlignment(JButton.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if(command.equals("완료"))
                    JOptionPane.showMessageDialog(jFrame, "입력이 완료 되었습니다.");
            }
        });

        jFrame.add(button);

        jFrame.setVisible(true);
    }
}
