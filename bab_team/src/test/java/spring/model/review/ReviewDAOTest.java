package spring.model.review;

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

public class ReviewDAOTest {
	
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

	@Test //@Ignore
	public void testCreate() {
		ReviewDAO reviewDAO = (ReviewDAO) beans.getBean("reviewDAO");
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setRestNum(1);
		reviewDTO.setTitle("test 등록");
		reviewDTO.setContent("test 내용");
		reviewDTO.setRankScore(3);
		assertTrue(reviewDAO.create(reviewDTO));
	}

	@Test @Ignore
	public void testRead() {
		ReviewDAO reviewDAO = (ReviewDAO) beans.getBean("reviewDAO");
		ReviewDTO reviewDTO = reviewDAO.read(7);
		assertEquals(1, reviewDTO.getRestNum());
		assertEquals("test 등록", reviewDTO.getTitle());
	}

	@Test @Ignore
	public void testUpdate() {
		ReviewDAO reviewDAO = (ReviewDAO) beans.getBean("reviewDAO");
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setRestNum(2);
		reviewDTO.setTitle("수정 Test");
		reviewDTO.setContent("수정 Test");
		reviewDTO.setRankScore(2);
		reviewDTO.setRevNum(7);
		
		assertTrue(reviewDAO.update(reviewDTO));
	}

	@Test @Ignore
	public void testList() {
		ReviewDAO reviewDAO = (ReviewDAO) beans.getBean("reviewDAO");
		
		Map map = new HashMap();
		map.put("col", "title");
		map.put("word", "Test");
		map.put("sno", 1);
		map.put("eno", 8);
		
		List<ReviewDTO> list = reviewDAO.list(map);
		
		assertEquals(1, list.size());
	}

	@Test @Ignore
	public void testTotal() {
		ReviewDAO reviewDAO = (ReviewDAO) beans.getBean("reviewDAO");
		Map map = new HashMap();
		map.put("col", "title");
		map.put("word", "Test");
		
		assertEquals(1, reviewDAO.total(map));
		
	}
 
	@Test @Ignore
	public void testDelete() {
		ReviewDAO reviewDAO = (ReviewDAO) beans.getBean("reviewDAO");
		assertTrue(reviewDAO.delete("7"));
	}

}
