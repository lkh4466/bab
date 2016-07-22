package spring.model.reservation;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class PeopleDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public int total(String col, String word) {
		Map map = new HashMap();
		map.put("col", col);
		map.put("word", word);
		return mybatis.selectOne("people.total", map); 
	}
	
	public List<PeopleDTO> list(Map map) {
		return mybatis.selectList("people.list", map); 
	}
	
	public PeopleDTO read (String resNum) {
		return (PeopleDTO)mybatis.selectOne("people.read", resNum);
	}
	
	public int delete(String resNum) {
		return mybatis.delete("people.delete", resNum); 
	}
	public int update(PeopleDTO peopleDTO) {
		return mybatis.update("people.update", peopleDTO); 
	}
	public int create(PeopleDTO peopleDTO) {
		return (int) mybatis.insert("people.create", peopleDTO); 
	}
}
