package com.test2;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest11_Path {

	public static void main(String[] args) {
		Path path= Paths.get("c:\\Test\\IOTest5.java");
		System.out.println("getFileName==="+ path.getFileName());
		System.out.println("getParent==="+ path.getParent());
		System.out.println("isAbsoluet"+ path.isAbsolute());
	//uri반환 
		URI uri = path.toUri();
		
		System.out.println("uri====="+ uri);
		//절대경로를 사용하는 path반환
		Path xxx= Paths.get("IOTest.java");
		Path xxx2= xxx.toAbsolutePath();
		System.out.println("AbsolutePath======"+xxx2);
		//supath:하위경로를 만들어 일부를 가져옴
		
		Path yyy= Paths.get("c:\\Temp\\aaa\\aaa2\\IOTest.java");
		Path yyy2= yyy.subpath(0,1);
		System.out.println("subPath======"+yyy);
		
		//경로의 결합
		Path p1= Paths.get("c:\\Temp\\aaa");
		Path p2= Paths.get("test.txt");
		Path p3= p1.resolve(p2);
		System.out.println("resolve====="+ p3);
		

	}

}
