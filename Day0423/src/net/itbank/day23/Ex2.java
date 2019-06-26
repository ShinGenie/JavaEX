package net.itbank.day23;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Ex2 extends JFrame {

 /**
  * 로그인 화면을 구성해보자.
  */
 public static void main(String[] args) {
  
  LoginFrame frame = new LoginFrame();
  frame.setSize(230,110);
  frame.setTitle("로그인 창이라네 ㅎㅎ"); // 로그인창 제목 변경 가능

  //전체 창 사이즈 가져오는거네
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  System.out.println(screenSize.width+","+screenSize.height);
  
  //컴퓨터 화면 크기가 다르지만 모든 컴퓨터의 화면에 -- 창을 중앙에 위치시킬 수 있다.
  int xPos = screenSize.width/2 - frame.getSize().width/2 ;
  int yPos = screenSize.height/2 - frame.getSize().height/2 ;
  
  frame.setLocation(xPos,yPos);
  
  frame.setVisible(true);
//  frame.setResizable(false); // 크기 조정 불가하도록 설정
  
  frame.addWindowListener(new WindowAdapter(){
   public void windowClosing (WindowEvent  e) {
    System.exit(1);
   }
  });
 }

}
@SuppressWarnings("serial")
class LoginFrame extends Frame{
 Label lMessage;
 TextField tfid,tfpw;
 Checkbox cbidsave;
 Label lSave;
 Button blogin;
 
 public LoginFrame(){
  //화면 구성
  super("Login 화면");
  
  makeScreen();
 }
 
 public void makeScreen(){
  
  //North - 윗쪽 문구한 줄
  setLayout(new BorderLayout());
  lMessage = new Label("로그인 하세요");
  this.add(BorderLayout.NORTH, lMessage);
  
  Panel panel1 = new Panel();
  panel1.setLayout(new BorderLayout());
  this.add(panel1);
  
  //내부 왼쪽 TextField 2개
  Panel panel11 = new Panel();
  panel11.setLayout(new GridLayout(2,1));
  panel1.add(BorderLayout.WEST,panel11);
  
  Panel panel11up = new Panel();
  tfid = new TextField("ID",20);
  panel11up.add(tfid);
  panel11.add(panel11up);
  
  Panel panel11down = new Panel();
  tfpw = new TextField("PW",20);
  panel11down.add(tfpw);
  panel11.add(panel11down);
  
  
  //내부 오른쪽 check + button
  Panel panel12 = new Panel();
  panel12.setLayout(new GridLayout(2,1));
  panel1.add(BorderLayout.CENTER,panel12);

  Panel panel12up = new Panel();
  Checkbox cb1 = new Checkbox("ID저장");
  panel12up.add(cb1);
  panel12.add(panel12up);
  
  Panel panel12down = new Panel();
  Button blogin = new Button("로그인");
  panel12down.add(blogin);
  panel12.add(panel12down);
  
  
  
 }
 
}












