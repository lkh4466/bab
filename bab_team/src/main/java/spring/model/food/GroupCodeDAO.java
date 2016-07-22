package spring.model.food;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroupCodeDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public GroupCodeDTO read (String resNum) {
		return (GroupCodeDTO)mybatis.selectOne("groupCode.read", resNum);
	}
	
	public int delete(String resNum) {
		return mybatis.delete("groupCode.delete", resNum); 
	}
	public int update(GroupCodeDTO groupCodeDTO) {
		return mybatis.update("groupCode.update", groupCodeDTO); 
	}
	public int create(GroupCodeDTO groupCodeDTO) {
		return (int) mybatis.insert("groupCode.create", groupCodeDTO); 
	}
}
