package spring.model.reservation;

public class ReservationDTO {
	private int resNum;              
    private int restNum;             
    private String memID;               
    private String resName;             
    private String resPhone;            
    private String resEmail;            
    private String resTerm;             
    private String seatNum;
    private OrderDTO orderdto;
    private PeopleDTO peopledto;
    
	public OrderDTO getOrderdto() {
		return orderdto;
	}
	public void setOrderdto(OrderDTO orderdto) {
		this.orderdto = orderdto;
	}
	public PeopleDTO getPeopledto() {
		return peopledto;
	}
	public void setPeopledto(PeopleDTO peopledto) {
		this.peopledto = peopledto;
	}
	public int getResNum() {
		return resNum;
	}
	public void setResNum(int resNum) {
		this.resNum = resNum;
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
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResPhone() {
		return resPhone;
	}
	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}
	public String getResEmail() {
		return resEmail;
	}
	public void setResEmail(String resEmail) {
		this.resEmail = resEmail;
	}
	public String getResTerm() {
		return resTerm;
	}
	public void setResTerm(String resTerm) {
		this.resTerm = resTerm;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
    
	
}
