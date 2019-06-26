package net.itbank.Day0409;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jcalculater {

	private JFrame frame;
	private ActionListener btnClickListener; // 클릭했을 때

	/**결과 값 변수 */
	private BigDecimal resultValue; // 소수점

	/**현재 입력된 값을 저장해 놓는 변수*/
	private BigDecimal memoryValue;

	/**기존 표기된 내용을 지우고 새로 입력할지 여부 */
	private Boolean isNewValue;

	/**현재 선택된 연산 버튼*/
	private JButton selectedOperBtn;


	private static final String divideErrorText = "0으로 나눌 수 없습니다";


	private Font buttonFont;
	private Container container;
	private JTextField txt;
	private JLabel mLabel;
	private JButton plusBtn;
	private JButton minusBtn;
	private JButton multBtn;
	private JButton divBtn;
	private JButton enterBtn;

	//================================
	//
	// Start Point
	//
	//================================

	public void create(){

		this.init();
		this.createUI();
//		this.setEventListener();

	}

	//================================
	//
	// Private Method
	//
	//================================

	/**초기화 */
	private void init(){

		this.buttonFont = new Font("Arial",1,16);
		this.resultValue = new BigDecimal(0);
		this.selectedOperBtn = null;
		this.isNewValue = true;

		// 버튼 클릭 리스너
		this.btnClickListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String txtValue = txt.getText();

				JButton b = (JButton)e.getSource();
				String _name = b.getText();
				switch(_name){

				case "M+":
					if(txtValue.equals(divideErrorText)) return;
					mLabel.setVisible(true);
					memoryValue = memoryValue.add(new BigDecimal(Float.valueOf(txtValue)));
					isNewValue = true;
					break;

				case "M-":
					if(txtValue.equals(divideErrorText)) return;
					mLabel.setVisible(true);
					memoryValue = memoryValue.subtract(new BigDecimal(Float.valueOf(txtValue)));
					isNewValue = true;
					break;

				case "MR":
					Float f = memoryValue.floatValue();
					Integer i = memoryValue.intValue();
					if(f.equals(Float.valueOf(i))) txt.setText(String.valueOf(i));
					else txt.setText(String.valueOf(f));
					isNewValue = true;
					break;

				case "/":
				case "*":
				case "+":
				case "-":
					inputOperate(b);
					break;
				case "√":
					calculateSquareRoot();
					break;
				case "C":
					inputEscape();
					break;
				default:
					pressNumberPad(_name);
					break;
				}

			}

		};

	}
	
	/**UI 생성 */
	private void createUI() {
		frame = new JFrame("JButton Test");
		
		container = new Container();
		frame.getContentPane().add(container);
		
		this.mLabel =new JLabel();
		this.mLabel.setText("M");
		this.mLabel.setBounds(5,12,20,20);
		this.mLabel.setVisible(false);
		container.add(this.mLabel);
		
		//result text field
		txt = new JTextField();
		txt.setBorder(null);
		txt.setText("0");
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setBounds(25, 0, 215, 40);
		txt.setFocusable(false);
		txt.setEditable(false);
		container.add(txt);
		
		//functions for memory
		int _scaleNum = 60;
		
		createButton("MC",0,40,_scaleNum,40);
		createButton("MR",_scaleNum+6,40,_scaleNum,40);
		createButton("M+",_scaleNum*2+12,40,_scaleNum,40);
		createButton("M-",_scaleNum*3+18,40,_scaleNum,40);
		
		//number
		ArrayList<Character> types = new ArrayList<Character>();
		types.add('7'); types.add('7'); types.add('7');
		types.add('4'); types.add('5'); types.add('6');
		types.add('1'); types.add('2'); types.add('3');
		types.add('0'); types.add('.'); types.add('C');
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				String _name = String.valueOf(types.remove(0));
				createButton(_name, 9 +j*_scaleNum, 130 + (i*_scaleNum), _scaleNum,_scaleNum);
			}
		}
		
		//operator
		divBtn = createButton("/",0,80,_scaleNum,43);
		multBtn = createButton("*",_scaleNum+6,80,_scaleNum,43);
		minusBtn = createButton("-",_scaleNum*2+12,80,_scaleNum,43);
		plusBtn = createButton("+",_scaleNum*3+18,80,_scaleNum,43);
		enterBtn = createButton("=",_scaleNum*3+18,246,_scaleNum,124);
		createButton("←",_scaleNum*3+18,123+6,_scaleNum,55);
		createButton("√",_scaleNum*3+18,178+10,_scaleNum,55);
		
		frame.pack();
		frame.setSize(274,408);
		frame.setVisible(true);
		
	}
	
	/**버튼생성*/
	
	
	private JButton createButton(String name, int x, int y, int width, int height) {
		
		JButton btn = new JButton(name);
		btn.setName(name);
		btn.setBounds(x,y,width,height);
		btn.setFocusable(false);
		btn.setFont(this.buttonFont);
		btn.addActionListener(this.btnClickListener);
		this.container.add(btn);
		
		return btn;
	}
	
	/** 이벤트 리스너 설정 */
	private void setEventListener() {
		this.frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				Integer code = Integer.valueOf(e.getKeyChar());
				
				if(code>=48 && code <= 57) pressNumberPad(String.valueOf(e.getKeyChar()));
				else if(code == 43) inputOperate(plusBtn);
				else if(code == 45) inputOperate(minusBtn);
				else if(code == 42) inputOperate(multBtn);
				else if(code == 47) inputOperate(divBtn);
//				else if(code == 10) input();// enter(=return)
				else if(code == 27) inputEscape();// enter(=return)
//				else if(code == 8) inputBackspace();// enter(=return)
				
			}

			@Override
			public void keyPressed(KeyEvent e) { }

			@Override
			public void keyReleased(KeyEvent e) { }
			
		});
	}

	
	/**키패드 입력*/
	private void pressNumberPad(String numStr) {
		String txtValue = txt.getText();
		
		if(isNewValue == true) {
			if(selectedOperBtn != null) {
				selectedOperBtn.setForeground(Color.red);
				txt.setText("");
				isNewValue = false;
			}
		}
		
		txtValue = txt.getText();
		if(txtValue.equals("0")) {
			txt.setText("");
			txtValue = "";
		}
		txt.setText(txtValue + numStr);
		
		//적용 후 새로운 value
		if(txt.getText().contentEquals(".")) {
			txt.setText("0.");
		}
	
	}

	/** 연산자 입력 */
	
	
	private void inputOperate(JButton b) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	private void inputEscape() {
		// TODO Auto-generated method stub
		
	}

	private void calculateSquareRoot() {
		// TODO Auto-generated method stub
		
	}

}//class end
























