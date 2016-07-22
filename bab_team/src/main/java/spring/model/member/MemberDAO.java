package spring.model.member;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	

	public boolean create(MemberDTO dto) {
		boolean flag = false;

		int cnt = sqlSessionTemplate.insert("member.create", dto);
		if (cnt > 0)
			flag = true;

		return flag;
	}

	public MemberDTO read(String string) {

		return (MemberDTO) sqlSessionTemplate.selectOne("member.read", string);

	}

	public boolean update(MemberDTO dto) {
		boolean flag = false;

		int cnt = sqlSessionTemplate.update("member.update", dto);
		if (cnt > 0)
			flag = true;

		return flag;
	}

	public List<MemberDTO> list(Map map) {

		return sqlSessionTemplate.selectList("member.list", map);
	}

	public int total(Map map) {
		return sqlSessionTemplate.selectOne("member.total", map);
	}

	public boolean delete(String string) {
		boolean flag = false;
		int cnt = sqlSessionTemplate.delete("member.delete", string);
		if (cnt > 0)
			flag = true;

		return flag;
	}
}