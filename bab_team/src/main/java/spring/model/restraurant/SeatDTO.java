package spring.model.restraurant;

public class SeatDTO {
	int 	seatsNum      ;
    int 	seat_width    ;
    int 	seat_height   ;
    int 	seat_floor    ;
    String 	seat_info  ;
    int 	restNum       ;
    
	public int getSeatsNum() {
		return seatsNum;
	}
	public void setSeatsNum(int seatsNum) {
		this.seatsNum = seatsNum;
	}
	public int getSeat_width() {
		return seat_width;
	}
	public void setSeat_width(int seat_width) {
		this.seat_width = seat_width;
	}
	public int getSeat_height() {
		return seat_height;
	}
	public void setSeat_height(int seat_height) {
		this.seat_height = seat_height;
	}
	public int getSeat_floor() {
		return seat_floor;
	}
	public void setSeat_floor(int seat_floor) {
		this.seat_floor = seat_floor;
	}
	public String getSeat_info() {
		return seat_info;
	}
	public void setSeat_info(String seat_info) {
		this.seat_info = seat_info;
	}
	public int getRestNum() {
		return restNum;
	}
	public void setRestNum(int restNum) {
		this.restNum = restNum;
	}
    
    
}
