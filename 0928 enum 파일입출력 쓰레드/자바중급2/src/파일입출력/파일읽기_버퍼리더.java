package 파일입출력;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 파일읽기_버퍼리더 {

	public static void main(String[] args) {
		BufferedReader bfr = null;
		try {
			bfr = new BufferedReader(new FileReader("C:\\temp\\애국가2절.txt"));
			String str;
			while(  (str=bfr.readLine()) != null ) {	//파일에서 다음문장 읽을게 있으면
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("여기는 무조건 실행됨");
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
