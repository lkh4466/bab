package spring.model.msg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MsgDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<MsgDTO> list(Map map) {

		return sqlSessionTemplate.selectList("msg.list", map);
	}
	
	 public int total(Map map){
		 
		 return sqlSessionTemplate.selectOne("msg.total", map);
	 }
	
	public boolean delete(int msgNum){
		boolean flag = false;
		
		int cnt = sqlSessionTemplate.delete("msg.delete", msgNum);
		if(cnt > 0){
			flag = true;
		}

		return flag;
	}
	
	public boolean deleteCheck(MsgDTO msgDTO){
		boolean flag = false;
		
		int cnt = sqlSessionTemplate.update("msg.deleteCheck", msgDTO);
		if(cnt > 0){
			flag = true;
		}
		
		return flag;
	}
	
	public boolean readCheck(int msgNum){
		boolean flag = false;
		
		int cnt = sqlSessionTemplate.update("msg.readCheck", msgNum);
		if(cnt > 0){
			flag = true;
		}
		
		return flag;
	}
	
	public MsgDTO read(int msgNum){
		return (MsgDTO) sqlSessionTemplate.selectOne("msg.read", msgNum);
	}
	
	public boolean create(MsgDTO msgDTO){
		boolean flag = false;
		
		int cnt = sqlSessionTemplate.insert("msg.create", msgDTO);
		if(cnt > 0){
			flag = true;
		}
		
		return flag;
	}

}
