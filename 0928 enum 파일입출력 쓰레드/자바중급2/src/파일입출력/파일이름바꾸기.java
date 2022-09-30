package 파일입출력;

import java.io.File;

public class 파일이름바꾸기 {
	public static void main(String[] args) {
		//디렉터리 경로 가져오기
			//운영체제에서 파일이나 디렉터리나 결국은 파일이다.
		File dir = new File("C:\\temp");	//파일들이 속해있는 디렉터리
		
		//파일가져오기
		File[] fileList = dir.listFiles();	//디렉터리 하위의 모든파일
 		if(fileList != null && fileList.length>0) {
			System.out.println("총 "+ fileList.length+"개의 파일과 디렉터리가 발견되었습니다.");
		}
		//파일의 새이름 설정하기
		String preFix = "수정_";	//원래 파일명 앞에다가 이거 붙일거임
		
		//원래 파일을 새이름으로 바꾸기
		for(File file : fileList) {
//			String[] originFullName = file.getName().split("\\.");
//			String oriFileName = originFullName[0];
//			String newFileName = preFix+oriFileName;
			File newFile = new File(dir+"\\"+preFix+file.getName());
			System.out.println(newFile);
			file.renameTo(newFile);
		}
		System.out.println("파일이름 바꾸기 끝남");
		
	}
}
