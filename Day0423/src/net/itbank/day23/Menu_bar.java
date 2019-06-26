package net.itbank.day23;

import java.awt.*;
import java.awt.event.*;

public class  Menu_bar extends Frame
{
 MenuBar mb;
 Menu file, color,sub_color;
 MenuItem miOpen, miSave, miExit, yellow, gray;
 Label lb;
 Color col;

 public Menu_bar()
 {
  super("::Menu_bar::");

  ///// 파일 메뉴 //////////////////////////////////////////////////////////
  // 1. 메뉴바 생성 ------------------
  mb = new MenuBar();
  // 메뉴바 프레임에 부착
  setMenuBar(mb);

  // 2. 메뉴 생성 및 부착..
  file = new Menu("파 일");
  mb.add(file);

  // 3. 메뉴 아이템 생성 및 부착.
  miOpen = new MenuItem("열 기");
  
  
  // 메뉴아이템 생성자 다른 버젼...단축키~~~
  MenuShortcut ms = new MenuShortcut('S');
  miSave = new MenuItem("저 장",ms);
  // true.... shift키를 같이 누를때~~~  
  miExit = new MenuItem("종 료",new MenuShortcut('X', true));

  file.add(miOpen);
  file.add(miSave);
  
  // 메뉴 아이템에 분리선 주기
  file.addSeparator();
  file.add(miExit);
   
  // 메뉴 아이템에 리스너 부착.
  MyHandler my = new MyHandler();
  miOpen.addActionListener(my);
  miSave.addActionListener(my);
  miExit.addActionListener(my);
//////////////////////////////////////////////////////////////////////////////////////
///////////////// ////////색상 메뉴 ///////////////////////////////////////////////////

 color = new Menu("색 상");
 mb.add(color);

 yellow = new MenuItem("노 랑");
 gray = new MenuItem("회 색");

 color.add(yellow);
 color.add(gray);

 // 메뉴 아이템에 분리선 주기
 color.addSeparator();

 sub_color = new Menu("글자색");

 color.add(sub_color);

 lb = new Label("안녕하세요~!!", Label.CENTER);

 add(lb,"South");

 // 색상 메뉴 관련 리스너 부착 ...
 yellow.addActionListener(my);
 gray.addActionListener(my);
 sub_color.addActionListener(my);
 
 sub_color.add("레 드");
 sub_color.add("블 루");


///////////////////////////////////////////////////////////////////////////////////////////


 } // 생성자 --------------------------

 class MyHandler implements ActionListener
 {
  Color bgCr = Color.white;
  Color fntCr = Color.black;

  public void actionPerformed(ActionEvent e)
  {
   
   Object obj = e.getSource(); 
   String res = e.getActionCommand();
   
   if(obj == miOpen)
   {
    // 파일 대화상자 열기 .....
    // 1. FileDialog 객체 생성해서 
    // 2. 보여지게끔 (setVisible(true));

    
    //위에 프레임과 같은 객체를 생성하기 위해서...
    FileDialog fd = new FileDialog(Menu_bar.this, "파일 열기");
    fd.setVisible(true);
    
    // 내가 선택한 파일명을 타이틀에 나오게....

    String dir =  fd.getDirectory();
    String filename = fd.getFile();

    setTitle(dir+filename);

    // fr.setTitle(str);
    // fr.setVisible(true);
    // fr.setSize(300,300);

   }
   else if(obj == miSave)
   {
     
    FileDialog fd1 = new FileDialog(Menu_bar.this, "파일 열기", FileDialog.SAVE);  //FileDialog.SAVE == 1, LOAD == 2
    fd1.setVisible(true);
    
    String str = fd1.getFile();
    System.out.println(str);
   }
   else if(obj == miExit)
   {
    System.exit(0);
   }
   else if(obj == yellow)
   {
    bgCr = Color.yellow;
    lb.setBackground(bgCr);
    setBackground(bgCr);
   }
   else if(obj == gray)
   {
    bgCr = Color.gray;
    setBackground(bgCr);
    lb.setBackground(bgCr);
   }

   // 글자색 비교
   if(res.equals("레 드"))
   {
    fntCr = Color.red;
    
    lb.setForeground(fntCr);
   }
   else if(res.equals("블 루"))
   {
    fntCr = Color.blue;
    lb.setForeground(fntCr);
   }
  }
 } /////////////////////////////////////////////////////////////////
 
 public static void main(String[] args) 
 {
  Menu_bar mt = new Menu_bar();
  mt.setSize(300,305);
  mt.setVisible(true);
 }
}
