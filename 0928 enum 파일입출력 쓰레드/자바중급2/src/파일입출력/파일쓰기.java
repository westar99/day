package 파일입출력;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 파일쓰기 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\temp\\포켓몬.txt");
			//어떤 내용을 쓸지
			fw.write("피카츄 라이츄 파이리 꼬부기\n");
			fw.write("버터풀 야도란 뭐뭐뭐 또가스");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("파일쓰기완료");
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
