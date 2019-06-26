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

  ///// ���� �޴� //////////////////////////////////////////////////////////
  // 1. �޴��� ���� ------------------
  mb = new MenuBar();
  // �޴��� �����ӿ� ����
  setMenuBar(mb);

  // 2. �޴� ���� �� ����..
  file = new Menu("�� ��");
  mb.add(file);

  // 3. �޴� ������ ���� �� ����.
  miOpen = new MenuItem("�� ��");
  
  
  // �޴������� ������ �ٸ� ����...����Ű~~~
  MenuShortcut ms = new MenuShortcut('S');
  miSave = new MenuItem("�� ��",ms);
  // true.... shiftŰ�� ���� ������~~~  
  miExit = new MenuItem("�� ��",new MenuShortcut('X', true));

  file.add(miOpen);
  file.add(miSave);
  
  // �޴� �����ۿ� �и��� �ֱ�
  file.addSeparator();
  file.add(miExit);
   
  // �޴� �����ۿ� ������ ����.
  MyHandler my = new MyHandler();
  miOpen.addActionListener(my);
  miSave.addActionListener(my);
  miExit.addActionListener(my);
//////////////////////////////////////////////////////////////////////////////////////
///////////////// ////////���� �޴� ///////////////////////////////////////////////////

 color = new Menu("�� ��");
 mb.add(color);

 yellow = new MenuItem("�� ��");
 gray = new MenuItem("ȸ ��");

 color.add(yellow);
 color.add(gray);

 // �޴� �����ۿ� �и��� �ֱ�
 color.addSeparator();

 sub_color = new Menu("���ڻ�");

 color.add(sub_color);

 lb = new Label("�ȳ��ϼ���~!!", Label.CENTER);

 add(lb,"South");

 // ���� �޴� ���� ������ ���� ...
 yellow.addActionListener(my);
 gray.addActionListener(my);
 sub_color.addActionListener(my);
 
 sub_color.add("�� ��");
 sub_color.add("�� ��");


///////////////////////////////////////////////////////////////////////////////////////////


 } // ������ --------------------------

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
    // ���� ��ȭ���� ���� .....
    // 1. FileDialog ��ü �����ؼ� 
    // 2. �������Բ� (setVisible(true));

    
    //���� �����Ӱ� ���� ��ü�� �����ϱ� ���ؼ�...
    FileDialog fd = new FileDialog(Menu_bar.this, "���� ����");
    fd.setVisible(true);
    
    // ���� ������ ���ϸ��� Ÿ��Ʋ�� ������....

    String dir =  fd.getDirectory();
    String filename = fd.getFile();

    setTitle(dir+filename);

    // fr.setTitle(str);
    // fr.setVisible(true);
    // fr.setSize(300,300);

   }
   else if(obj == miSave)
   {
     
    FileDialog fd1 = new FileDialog(Menu_bar.this, "���� ����", FileDialog.SAVE);  //FileDialog.SAVE == 1, LOAD == 2
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

   // ���ڻ� ��
   if(res.equals("�� ��"))
   {
    fntCr = Color.red;
    
    lb.setForeground(fntCr);
   }
   else if(res.equals("�� ��"))
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
