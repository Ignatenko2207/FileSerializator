package info.sjd;

import info.sjd.service.FileSerializator;

public class AppRunner {

	
	public static void main(String[] args) {

		String fromPath = "D:\\test\\cats.jpg";
		String toPath = "D:\\test\\catsCopy.jpg";
		
		FileSerializator.copyFile(fromPath, toPath);
		System.out.println("File copied!");
		
		String fromPath2 = "D:\\test\\tempFile.txt";
		String toPath2 = "D:\\test\\tempFileCopy.txt";
		
		FileSerializator.copyTextFile(fromPath2, toPath2);
		System.out.println("File copied!");
		
	}

}
