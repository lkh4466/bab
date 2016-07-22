package spring.model.restraurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.model.restraurant.ImgDTO;

@Component
public class ImgDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
   /**
    * 1. create
    * 
    * @param dto
    * @return
    */
   public int create(ImgDTO imgDTO) {
      
      return mybatis.insert("img.create", imgDTO);
   }

   /**
    * 2. update
    * 
    * @param dto
    * @return
    */
   public int update(ImgDTO imgDTO) {
       
      return mybatis.update("img.update", imgDTO);
   }

   /**
    * 3.updatefile
    * 
    * @param dto
    * @return
    */
   public int updateFile(String fname, String imgnum) {
	   Map map = new HashMap();
	   map.put("fname", fname);
	   map.put("imgnum", imgnum);
	   
      

      return mybatis.update("img.updateFile", map);
   }



 
   /**
    * 6.read
    * 
    * @param dto
    * @return
    */
   
   public ImgDTO read(int imgno) {
     

      return mybatis.selectOne("img.read", imgno);
   }
   

  
  
   public int delete(int imgno) {
      
      return mybatis.delete("img.delete", imgno);
   
   }
}
   
  
  