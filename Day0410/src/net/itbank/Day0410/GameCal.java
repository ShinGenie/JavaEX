package net.itbank.Day0410;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

class CalTokenizer { //그냥참고
   public double cal(String str) {
       StringTokenizer t = new StringTokenizer(str, "+-*/", true);
       String na = null;
       double ret = 0;
       while (t.hasMoreTokens()==true) {
           String x1 = t.nextToken();
           na = x1;
       }
       ret=Double.parseDouble(na)*Double.parseDouble(na);
       return ret;
   }  
}// class END
  
public class GameCal extends JFrame  implements ActionListener{  //윈도우리스너 기술X
	CalTokenizer c = new CalTokenizer(); 
  int check=-1,soch=0;
   
  JTextField jfsum,jf;
  String[] str = {"←","√","mc","x2","+","7","8","9","-","4","5","6","*","1","2","3","/","0",".","="};
  JButton[] b = new JButton[20];
  JButton clear;
//  Font jfsum = new Font("arian", Font.BOLD, 40);//폰트 설정
  Font jffont = new Font("arian", Font.BOLD, 40);//폰트 설정
  Font bfont = new Font("arian", Font.BOLD, 20);//폰트 설정
   
  public GameCal()  {
     setTitle("계산기");  //이름
     setSize(500, 500); //크기
     setLayout(new BorderLayout());
     getContentPane().setBackground(Color.PINK);//뒷배경 판넬
    
      //------------메뉴바 만들기------------------
      JMenuBar mb= new JMenuBar();
      JMenu menu1 = new JMenu("보기(v)");
      menu1.setMnemonic('v'); //단축키 사용 alt+v
      JMenuItem item1 = new JMenuItem("Open");
      item1.setMnemonic('o'); //단축키 사용 alt+o
      menu1.add(item1);
       
      JMenu menu2 = new JMenu("도움말(H)");
      menu2.setMnemonic('H');
      JMenuItem item2 = new JMenuItem("Help");
      item2.setMnemonic('h');
      menu2.add(item2);
          
      mb.add(menu1);
      mb.add(menu2);
      setJMenuBar(mb); //꼭필수
       
      //------------버튼 달기---------------------
      //첫번째 패널 만들기
      Panel tp = new Panel();//textField 판넬,첫번쨰 판넬
      tp.setLayout(new GridLayout(2,1));
      jfsum = new JTextField(getWidth());
//      jfsum.setFont(jffont);
      jf = new JTextField(getWidth());
      jf.setFont(jffont);
      jfsum.setHorizontalAlignment(JTextField.RIGHT);
      jf.setHorizontalAlignment(JTextField.RIGHT);
      jf.setEditable(false); // 창안에 글 쓸수 없음 코드
      tp.add(jfsum);
      tp.add(jf);
       
      //두번째 패널 만들기(버튼)
      Panel bp = new Panel();
      bp.setLayout(new GridLayout(5,4));
      for(int i=0;i<20;i++)  {
          b[i]=new JButton(str[i]);     //<===============중요
          b[i].addActionListener(this); //<===============중요
          b[i].setFont(bfont);
          bp.add(b[i]);
      }
           
      add(BorderLayout.NORTH,tp);  //TextField panel을 Frame에 붙이기
      add(BorderLayout.CENTER,bp); //버튼 panel을 Frame에 붙이기
       
      //-------------프레임 위치-------------------
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2)); //중앙에 배치
      setResizable(false);//크기 고정
    	//윈도우종료처리메소드 꼭 기술하는것이 좋습니다
  		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }//end
   
  public void ch(String a){  
      if(check == 0)   {
          jfsum.setText(jfsum.getText()+a);
          jf.setText(""+a);
          check=-1;
      }else {
          jf.setText(jf.getText()+a);
          jfsum.setText(jfsum.getText()+a);
      }
  }//end
    
  
  @Override
  public void actionPerformed(ActionEvent e) {
      String mun="";//text받아오는역할
       
      switch(e.getActionCommand()){ //getActionCommand() 버튼의 텍스트로 비교
      case "0":
          ch("0");
          break;
      case "1":
          ch("1");
          break;
      case "2":
          ch("2");
          break;
      case "3":
          ch("3");
          break;
      case "4":
          ch("4");
          break;
      case "5":
          ch("5");
          break;
      case "6":
          ch("6");
          break;
      case "7":
          ch("7");
          break;
      case "8":
          ch("8");
          break;
      case "9":
          ch("9");
          break;
       
      //숫자만 두번째 텍스트까지 유지
      case "←":
          mun = jfsum.getText();
          mun= mun.substring(0, mun.length()-1);
          jfsum.setText(mun);
          jf.setText("");
          break;
          
      case "x2":
          mun = jfsum.getText();
           //연산자제거하는 기술  StringTokenizer 
           StringTokenizer t0 = new StringTokenizer(mun, "+/*-", true);// "+-*"구분값
//          jfsum.setText(Double.parseDouble(mun)*Double.parseDouble(num)+"");
          break;
           
           
      case "√":
          mun = jfsum.getText();
          StringTokenizer t1 = new StringTokenizer(mun, "+/*-", true);// "+-*"구분값
          String na1 = null;
          double re1 = 0;
           
          while (t1.hasMoreTokens()==true)          {
              String x1 = t1.nextToken();
              na1 = x1;
          }
          System.out.println(na1);
          jfsum.setText(Math.sqrt(Double.parseDouble(na1))+"");
          break;

      case "mc":
          jf.setText("");
          jfsum.setText("");
          soch=0; //소수초기화
          break; 
      case "+":
          jf.setText("");
          jfsum.setText(jfsum.getText()+"+");
          break;
      case "-":
          jf.setText("");
          jfsum.setText(jfsum.getText()+"-");
          break;
      case "*":
          jf.setText("");
          jfsum.setText(jfsum.getText()+"*");
          break;
      case "/":
          jf.setText("");
          jfsum.setText(jfsum.getText()+"/");
          break;
      case ".":
          soch=1;//소수계산
          String str = jf.getText();
          jf.setText(str+".");
          jfsum.setText(jfsum.getText()+".");
          break;
           
      case "=":
          //double result =Double.parseDouble(jfsum.getText());
          //여러분각자처리
          check = 0; // =을 쓰고 나서는 초기화
          break;
      }
  }//end
  
  public static void main(String[] args) {
      GameCal gc = new GameCal();
      gc.setVisible(true);
  }//main end
}//class end