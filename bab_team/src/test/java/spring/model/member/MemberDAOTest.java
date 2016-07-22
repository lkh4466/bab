package spring.model.member;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MemberDAOTest {
	
	private static BeanFactory beans;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Resource resource = new ClassPathResource("kys.xml");
		 
		beans = new XmlBeanFactory(resource);		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test @Ignore
	public void testRcount() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testCreate() {
		MemberDAO memberDAO = (MemberDAO) beans.getBean("memberDAO");
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemID("test1");
		memberDTO.setPasswd("test");
		memberDTO.setPoint(10);
		memberDTO.setEmail("test");
		memberDTO.setName("test");
		memberDTO.setGrade("O");
		assertTrue(memberDAO.create(memberDTO));
	}

	@Test @Ignore
	public void testRead() {
		MemberDAO memberDAO = (MemberDAO) beans.getBean("memberDAO");
		MemberDTO memberDTO = memberDAO.read("user1");
		assertEquals("user1", memberDTO.getMemID());
		assertEquals("user1@naver.com", memberDTO.getEmail());
	}

	@Test @Ignore
	public void testUpdate() {
		MemberDAO memberDAO = (MemberDAO) beans.getBean("memberDAO");
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemID("test1");
		memberDTO.setEmail("update");
		memberDTO.setPasswd("update");
		memberDTO.setGrade("G");
		
		assertTrue(memberDAO.update(memberDTO));
	}

	@Test @Ignore
	public void testList() {
		MemberDAO memberDAO = (MemberDAO) beans.getBean("memberDAO");
		
		Map map = new HashMap();
		map.put("col", "memID");
		map.put("word", "admin");
		map.put("sno", 1);
		map.put("eno", 4);
		
		List<MemberDTO> list = memberDAO.list(map);
		
		assertEquals(1, list.size());
	}

	@Test //@Ignore
	public void testTotal() {
		MemberDAO memberDAO = (MemberDAO) beans.getBean("memberDAO");
		Map map = new HashMap();
		map.put("col", "memID");
		map.put("word", "admin");
		
		assertEquals(1, memberDAO.total(map));
		
	}
 
	@Test @Ignore
	public void testDelete() {
		MemberDAO memberDAO = (MemberDAO) beans.getBean("memberDAO");
		assertTrue(memberDAO.delete("test1"));
	}

	@Test @Ignore
	public void testBdelete() {
		fail("Not yet implemented");
	}

}
