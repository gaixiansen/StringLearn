package com.github.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("程序猿真的一点都不累！！！");
		fw.write(97);
		fw.close();
	}

}
