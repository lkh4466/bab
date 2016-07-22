package spring.model.restraurant;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeatDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public SeatDTO read (int resNum) {
		return (SeatDTO)mybatis.selectOne("seat.read", resNum);
	}
	
	public int delete(int resNum) {
		return mybatis.delete("seat.delete", resNum); 
	}
	public int update(SeatDTO seatDTO) {
		return mybatis.update("seat.update", seatDTO); 
	}
	public int create(SeatDTO seatDTO) {
		return (int) mybatis.insert("seat.create", seatDTO); 
	}
}
