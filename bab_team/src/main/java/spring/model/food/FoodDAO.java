package spring.model.food;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	

	public boolean create(FoodDTO dto) {
		boolean flag = false;

		int cnt = sqlSessionTemplate.insert("food.create", dto);
		if (cnt > 0)
			flag = true;

		return flag;
	}

	public FoodDTO read(int i) {

		return (FoodDTO) sqlSessionTemplate.selectOne("food.read", i);

	}

	public boolean update(FoodDTO dto) {
		boolean flag = false;

		int cnt = sqlSessionTemplate.update("food.update", dto);
		if (cnt > 0)
			flag = true;

		return flag;
	}

	public List<FoodDTO> list(Map map) {

		return sqlSessionTemplate.selectList("food.list", map);
	}

	public int total(Map map) {
		return sqlSessionTemplate.selectOne("food.total", map);
	}

	public boolean delete(String string) {
		boolean flag = false;
		int cnt = sqlSessionTemplate.delete("food.delete", string);
		if (cnt > 0)
			flag = true;

		return flag;
	}
}