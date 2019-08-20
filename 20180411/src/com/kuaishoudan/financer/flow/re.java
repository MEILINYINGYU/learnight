package com.kuaishoudan.financer.flow;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class re {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try{
	            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+"/0617.txt"),true));
	            writer.write("\n"+"wefwfw44");
	            writer.flush();
	            writer.close();
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	}

}
