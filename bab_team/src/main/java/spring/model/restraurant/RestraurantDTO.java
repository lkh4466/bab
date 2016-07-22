package spring.model.restraurant;

import java.util.List;

public class RestraurantDTO {
		private int 	restNum;   
	    private String	memID;  
	    private String	restName;  
	    private String	restAddr; 
	    private String	restPhone; 
	    private String	foodKind;
	    private int 	priceRange;
	    private String	restTime;
	    private List	imgdtolist; //1:n
	    private List	seatdtolist;
	    
		public List getSeatdtolist() {
			return seatdtolist;
		}
		public void setSeatdtolist(List seatdtolist) {
			this.seatdtolist = seatdtolist;
		}
		public List getImgdtolist() {
			return imgdtolist;
		}
		public void setImgdtolist(List imgdtolist) {
			this.imgdtolist = imgdtolist;
		}
		public int getRestNum() {
			return restNum;
		}
		public void setRestNum(int restNum) {
			this.restNum = restNum;
		}
		public String getMemID() {
			return memID;
		}
		public void setMemID(String memID) {
			this.memID = memID;
		}
		public String getRestName() {
			return restName;
		}
		public void setRestName(String restName) {
			this.restName = restName;
		}
		public String getRestAddr() {
			return restAddr;
		}
		public void setRestAddr(String restAddr) {
			this.restAddr = restAddr;
		}
		public String getRestPhone() {
			return restPhone;
		}
		public void setRestPhone(String restPhone) {
			this.restPhone = restPhone;
		}
		public String getFoodKind() {
			return foodKind;
		}
		public void setFoodKind(String foodKind) {
			this.foodKind = foodKind;
		}
		public int getPriceRange() {
			return priceRange;
		}
		public void setPriceRange(int priceRange) {
			this.priceRange = priceRange;
		}
		public String getRestTime() {
			return restTime;
		}
		public void setRestTime(String restTime) {
			this.restTime = restTime;
		} 
	

}

