package tk.manojsid.web.model;

//import tk.manojsid.web.model.Override;
//import com.telusko.web.model.String;

public class Alien 
{
	private int aid;
	private String aname;
	private String atech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getatech() {
		return atech;
	}
	public void setatech(String atech) {
		this.atech = atech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", atech=" + atech + "]";
	}
	
	
}
