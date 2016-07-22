package spring.model.reservation;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class OrderDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public int total(String col, String word) {
		Map map = new HashMap();
		map.put("col", col);
		map.put("word", word);
		return mybatis.selectOne("order.total", map); 
	}
	
	public List<OrderDTO> list(Map map) {
		return mybatis.selectList("order.list", map); 
	}
	
	public OrderDTO read (int resNum) {
		return (OrderDTO)mybatis.selectOne("order.read", resNum);
	}
	
	public int delete(int resNum) {
		return (int)mybatis.delete("order.delete", resNum); 
	}
	public int update(OrderDTO orderDTO) {
		return (int)mybatis.update("order.update", orderDTO); 
	}
	public int create(OrderDTO orderDTO) {
		return (int)mybatis.insert("order.create", orderDTO); 
	}
}
