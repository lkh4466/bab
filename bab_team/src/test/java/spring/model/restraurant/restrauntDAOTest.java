package spring.model.restraurant;

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

public class restrauntDAOTest {
	private static BeanFactory beans;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Resource resource = new ClassPathResource("kwj.xml");

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
	public void testTotal() {
		RestraurantDAO restrauntDAO = (RestraurantDAO)beans.getBean("restraurantDAO");
		assertEquals(11,restrauntDAO.total("wname", ""));
	}

	

	@Test @Ignore
	public void testAddAnsnum() {
		fail("Not yet implemented");
	}

	

	@Test @Ignore
	public void testDelete() {
		RestraurantDAO restrauntDAO =(RestraurantDAO) beans.getBean("restraurantDAO");
		assertEquals(1,restrauntDAO.delete(4));
	}

	@Test @Ignore
	public void testUpdate() {
		RestraurantDAO restrauntDAO = (RestraurantDAO) beans.getBean("restraurantDAO");
		RestraurantDTO restrauntDTO = new RestraurantDTO();
		restrauntDTO.setRestNum(4);
		restrauntDTO.setRestName("2조천하");
		restrauntDTO.setRestAddr("양천구");
		restrauntDTO.setRestPhone("1234");
		restrauntDTO.setFoodKind("양식");
		restrauntDTO.setPriceRange(10000);
		restrauntDTO.setRestTime("10:00-12:00");
		assertEquals(1, restrauntDAO.update(restrauntDTO));
		
	}

	@Test @Ignore
	public void testCheckPasswd() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testRead() {
		RestraurantDAO restrauntDAO = (RestraurantDAO) beans.getBean("restraurantDAO");
		RestraurantDTO restrauntDTO = restrauntDAO.read(1);
		assertEquals("2조 분식",restrauntDTO.getRestName());
		
		
		
		
		
	}

	@Test @Ignore
	public void testIncreaseViewcnt() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testList() {
		RestraurantDAO restrauntDAO = (RestraurantDAO) beans.getBean("restraurantDAO");
		Map map = new HashMap();
		map.put("col","wname");
		map.put("word","test");
		map.put("sno","1");
		map.put("eno","5");
		List<RestraurantDTO> list = restrauntDAO.list(map);
		assertEquals(1, list.size());
	}

	@Test @Ignore
	public void testCreate() {
		RestraurantDAO restrauntDAO = (RestraurantDAO) beans.getBean("restraurantDAO");
		RestraurantDTO restrauntDTO = new RestraurantDTO();
		
		restrauntDTO.setMemID("user1");
		restrauntDTO.setRestName("2조천하");
		restrauntDTO.setRestPhone("123456");
		restrauntDTO.setRestAddr("종로구");
		restrauntDTO.setRestTime("9시-10시");
		restrauntDTO.setFoodKind("한식");
		restrauntDTO.setPriceRange(100000);
		
		assertEquals(1,restrauntDAO.create(restrauntDTO));
	}

}
