package google;

public class Server {
	String name = "구글서버";
	int maxVolume = 1000000000;	//10억
	int presentVolumn;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxVolume() {
		return maxVolume;
	}
	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}
	public int getPresentVolumn() {
		return presentVolumn;
	}
	public void setPresentVolumn(int presentVolumn) {
		this.presentVolumn = presentVolumn;
	}
	
	
}
