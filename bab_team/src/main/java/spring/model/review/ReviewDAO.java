package spring.model.review;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	

	public boolean create(ReviewDTO dto) {
		boolean flag = false;

		int cnt = sqlSessionTemplate.insert("review.create", dto);
		if (cnt > 0)
			flag = true;

		return flag;
	}

	public ReviewDTO read(int i) {

		return (ReviewDTO) sqlSessionTemplate.selectOne("review.read", i);

	}

	public boolean update(ReviewDTO dto) {
		boolean flag = false;

		int cnt = sqlSessionTemplate.update("review.update", dto);
		if (cnt > 0)
			flag = true;

		return flag;
	}

	public List<ReviewDTO> list(Map map) {

		return sqlSessionTemplate.selectList("review.list", map);
	}

	public int total(Map map) {
		return (Integer) sqlSessionTemplate.selectOne("review.total", map);
	}

	public boolean delete(String string) {
		boolean flag = false;
		int cnt = sqlSessionTemplate.delete("review.delete", string);
		if (cnt > 0)
			flag = true;

		return flag;
	}
}