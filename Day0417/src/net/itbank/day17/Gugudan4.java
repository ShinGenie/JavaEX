package net.itbank.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream; // 스트림
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter; // 문자단위로 기록

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Gugudan4  extends Thread {

	public static void main(String[] args) throws Exception {

		String path = "C:\\dev\\gugudan.txt";
		File file = new File(path);
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr); // readLine();
		FileWriter fw = new FileWriter(file);
		BufferedReader br1 = new BufferedReader(fr);

		File sound = new File("C:\\dev\\sungsikyung1.mp3");
		//	System.out.println(sound.isFile());
		AudioFileFormat ais =AudioSystem.getAudioFileFormat(sound);
//		Clip cp = AudioSystem.getClip();// 다시 알려주시기로
//		try {
//			ais.open();
//			ais.start();
//			Thread.sleep(ais.getMicrosecondLength()/1000);
//		}catch(Exception e) {System.out.println(e); }
	}
}//class end

