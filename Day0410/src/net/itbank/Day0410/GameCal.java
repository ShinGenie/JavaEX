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

class CalTokenizer { //�׳�����
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
  
public class GameCal extends JFrame  implements ActionListener{  //�����츮���� ���X
	CalTokenizer c = new CalTokenizer(); 
  int check=-1,soch=0;
   
  JTextField jfsum,jf;
  String[] str = {"��","��","mc","x2","+","7","8","9","-","4","5","6","*","1","2","3","/","0",".","="};
  JButton[] b = new JButton[20];
  JButton clear;
//  Font jfsum = new Font("arian", Font.BOLD, 40);//��Ʈ ����
  Font jffont = new Font("arian", Font.BOLD, 40);//��Ʈ ����
  Font bfont = new Font("arian", Font.BOLD, 20);//��Ʈ ����
   
  public GameCal()  {
     setTitle("����");  //�̸�
     setSize(500, 500); //ũ��
     setLayout(new BorderLayout());
     getContentPane().setBackground(Color.PINK);//�޹�� �ǳ�
    
      //------------�޴��� �����------------------
      JMenuBar mb= new JMenuBar();
      JMenu menu1 = new JMenu("����(v)");
      menu1.setMnemonic('v'); //����Ű ��� alt+v
      JMenuItem item1 = new JMenuItem("Open");
      item1.setMnemonic('o'); //����Ű ��� alt+o
      menu1.add(item1);
       
      JMenu menu2 = new JMenu("����(H)");
      menu2.setMnemonic('H');
      JMenuItem item2 = new JMenuItem("Help");
      item2.setMnemonic('h');
      menu2.add(item2);
          
      mb.add(menu1);
      mb.add(menu2);
      setJMenuBar(mb); //���ʼ�
       
      //------------��ư �ޱ�---------------------
      //ù��° �г� �����
      Panel tp = new Panel();//textField �ǳ�,ù���� �ǳ�
      tp.setLayout(new GridLayout(2,1));
      jfsum = new JTextField(getWidth());
//      jfsum.setFont(jffont);
      jf = new JTextField(getWidth());
      jf.setFont(jffont);
      jfsum.setHorizontalAlignment(JTextField.RIGHT);
      jf.setHorizontalAlignment(JTextField.RIGHT);
      jf.setEditable(false); // â�ȿ� �� ���� ���� �ڵ�
      tp.add(jfsum);
      tp.add(jf);
       
      //�ι�° �г� �����(��ư)
      Panel bp = new Panel();
      bp.setLayout(new GridLayout(5,4));
      for(int i=0;i<20;i++)  {
          b[i]=new JButton(str[i]);     //<===============�߿�
          b[i].addActionListener(this); //<===============�߿�
          b[i].setFont(bfont);
          bp.add(b[i]);
      }
           
      add(BorderLayout.NORTH,tp);  //TextField panel�� Frame�� ���̱�
      add(BorderLayout.CENTER,bp); //��ư panel�� Frame�� ���̱�
       
      //-------------������ ��ġ-------------------
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2)); //�߾ӿ� ��ġ
      setResizable(false);//ũ�� ����
    	//����������ó���޼ҵ� �� ����ϴ°��� �����ϴ�
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
      String mun="";//text�޾ƿ��¿���
       
      switch(e.getActionCommand()){ //getActionCommand() ��ư�� �ؽ�Ʈ�� ��
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
       
      //���ڸ� �ι�° �ؽ�Ʈ���� ����
      case "��":
          mun = jfsum.getText();
          mun= mun.substring(0, mun.length()-1);
          jfsum.setText(mun);
          jf.setText("");
          break;
          
      case "x2":
          mun = jfsum.getText();
           //�����������ϴ� ���  StringTokenizer 
           StringTokenizer t0 = new StringTokenizer(mun, "+/*-", true);// "+-*"���а�
//          jfsum.setText(Double.parseDouble(mun)*Double.parseDouble(num)+"");
          break;
           
           
      case "��":
          mun = jfsum.getText();
          StringTokenizer t1 = new StringTokenizer(mun, "+/*-", true);// "+-*"���а�
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
          soch=0; //�Ҽ��ʱ�ȭ
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
          soch=1;//�Ҽ����
          String str = jf.getText();
          jf.setText(str+".");
          jfsum.setText(jfsum.getText()+".");
          break;
           
      case "=":
          //double result =Double.parseDouble(jfsum.getText());
          //�����а���ó��
          check = 0; // =�� ���� ������ �ʱ�ȭ
          break;
      }
  }//end
  
  public static void main(String[] args) {
      GameCal gc = new GameCal();
      gc.setVisible(true);
  }//main end
}//class end