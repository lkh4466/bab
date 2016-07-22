package spring.model.reservation;

public class PeopleDTO {
	 private String personCode ;       
     private int general    ;       
     private int disabled   ;       
     private int child      ;       
     private int resNum     ;
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public int getGeneral() {
		return general;
	}
	public void setGeneral(int general) {
		this.general = general;
	}
	public int getDisabled() {
		return disabled;
	}
	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public int getResNum() {
		return resNum;
	}
	public void setResNum(int resNum) {
		this.resNum = resNum;
	}
     
	       
}
