package net.itbank.com;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.jws.Oneway;
import javax.swing.ImageIcon;

public class PerClient extends Thread{
	static List<ObjectOutputStream> list=
			Collections.synchronizedList(new ArrayList<ObjectOutputStream>());
	
	Socket socket; 
	PrintWriter pw;
	ObjectOutputStream oo;
	String name=null;
	
	public PerClient(Socket socket) {
		this.socket=socket;
		try{
			oo=new ObjectOutputStream(socket.getOutputStream());
			list.add(oo);
		}catch(Exception e){
			e.getStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		try{
			ObjectInputStream oi=new ObjectInputStream(socket.getInputStream());
			name=oi.readUTF();
			while(true){
				String str=((String)oi.readObject());
				SendAll("[" + name + "]"+"\n"+str);
				if(str==null)break;
			}
			
		}catch(Exception e){
			e.getStackTrace();
		}finally{
			list.remove(oo);
			SendAll(name+"´ÔÀÌ ³ª°¡¼Ì½À´Ï´Ù.");
			try{
				socket.close();
			}catch(Exception e){
				e.getStackTrace();
			}
		}
	} 
	
	public void SendAll(Object str){
		for(ObjectOutputStream writer:list){
			try{
				writer.writeObject(((String)str).trim()+"\n");
				writer.flush();
			}catch(Exception e){
				e.getStackTrace();
			}
		}
	}
}