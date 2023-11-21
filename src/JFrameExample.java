import javax.swing.*;

//프레임 생성 예제
public class JFrameExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();       //JFrame 객체 생성
        jFrame.setBounds(300,600, 300,300); //JFrame의 크기, 위치 지정
        jFrame.setTitle("Frame Example");   //JFrame의 타이틀 이름 지정
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //닫기 버튼 눌렸을 때 할 이벤트 처리(EXIT_ON_CLOSE은 닫기 버튼 눌렀을 때 프로그램 종료)
        jFrame.setVisible(true);    //JFrame이 보일지 안보일지 설정하는 함수(true = 보임, false = 암보임)
    }
}
