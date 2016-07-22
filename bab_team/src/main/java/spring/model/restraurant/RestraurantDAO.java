package spring.model.restraurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RestraurantDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public SqlSessionTemplate getMybatis() {
		return mybatis;
	}

	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}

	
	public List<RestraurantDTO> readTotalSeat(Map map){
		   
		   return mybatis.selectList("restraurant.readTotalSeat",map);
		 }
	
	public List<RestraurantDTO> readTotalImg(Map map){
		   
		   return mybatis.selectList("restraurant.readTotalImg",map);
		 }
	/**
	 * 전체 레코드 갯수 가져옴
	 * @param col
	 * @param word
	 * @return int total
	 */
	 public int total(String col, String word){
		 Map map = new HashMap();
		 map.put("col", col);
		 map.put("word",word);
		 
		 
		 return mybatis.selectOne("restraurant.total",map);
	 }
	
	
	/**
	   * 글을 삭제합니다.
	   * @param 삭제할 글 번호
	   * @return 삭제된 레코드 갯수
	   */
	  public int delete(int restnum){
	    
	    
	    return mybatis.delete("restraurant.delete",restnum);
	  }
 
	/**
	   * 메모를 수정합니다.
	   * @param vo 수정할 데이터가 있는 객체
	   * @return 저장된 레코드 갯수
	   */
	  public int update(RestraurantDTO restraurantDTO){
	    
	    
	    return mybatis.update("restraurant.update",restraurantDTO);
	  }
	
	 
	  /**
	   * 조회
	   * @param bbsno 조회할 글 번호
	   * @return
	   */
	  public RestraurantDTO read(int restnum){
	   
	    
	    return mybatis.selectOne("restraurant.read",restnum);
	  }
	 
	 
	 /**
	  * 목록  
	  * @return List 목록
	  */
	 public List<RestraurantDTO> list(Map map){
	   
	   return mybatis.selectList("restraurant.list",map);
	 }
	 
	 public int create(RestraurantDTO restraurantDTO){
		
		return mybatis.insert("restraurant.create",restraurantDTO);
	}
  


	}


