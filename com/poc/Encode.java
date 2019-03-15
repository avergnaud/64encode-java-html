package com.poc;

import java.io.*;
import java.util.*;

public class Encode {
	public static void main(String... args) throws IOException {
		File file = new File("dot.png");
		try(FileInputStream fileInputStreamReader = new FileInputStream(file);) {
			byte[] bytes = new byte[(int)file.length()];
	                fileInputStreamReader.read(bytes);
			String encodedfile = new String(Base64.getEncoder().encode(bytes), "UTF-8");
			System.out.println(encodedfile);
		}
	}
}
