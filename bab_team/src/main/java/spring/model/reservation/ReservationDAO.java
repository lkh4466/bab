package spring.model.reservation;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class ReservationDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public int total(String col, String word) {
		Map map = new HashMap();
		map.put("col", col);
		map.put("word", word);
		return mybatis.selectOne("reservation.total", map); 
	}
	
	public List<ReservationDTO> list(Map map) {
		return mybatis.selectList("reservation.list", map); 
	}
	
	public List<ReservationDTO> readDetail (int resNum) {
		return mybatis.selectList("reservation.readDetail", resNum);
	}
	
	public ReservationDTO read (int resNum) {
		return (ReservationDTO)mybatis.selectOne("reservation.read", resNum);
	}
	
	public int delete(int resNum) {
		return (int)mybatis.insert("reservation.delete", resNum); 
	}
	
	public int update(ReservationDTO dto) {
		return (int)mybatis.update("reservation.update", dto); 
	}
	
	public int create(ReservationDTO dto) {
		return (int)mybatis.insert("reservation.create", dto); 
	}
}
