package spring.model.food;

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

public class FoodDAOTest {
	
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
		FoodDAO foodDAO = (FoodDAO) beans.getBean("foodDAO");
		FoodDTO foodDTO = new FoodDTO();
		foodDTO.setFoodName("불고기");
		foodDTO.setRecipe("불+고기");
		foodDTO.setCalorie(333);
		foodDTO.setRecipePrice(6000);
		foodDTO.setGrpCode("A12");
		assertTrue(foodDAO.create(foodDTO));
	}

	@Test //@Ignore
	public void testRead() {
		FoodDAO foodDAO = (FoodDAO) beans.getBean("foodDAO");
		FoodDTO foodDTO = foodDAO.read(1);
		assertEquals(333, foodDTO.getCalorie());
		assertEquals("김치찌개", foodDTO.getFoodName());
	}

	@Test @Ignore
	public void testUpdate() {
		FoodDAO foodDAO = (FoodDAO) beans.getBean("foodDAO");
		FoodDTO foodDTO = new FoodDTO();
		
		foodDTO.setRecipe("고기+불");
		foodDTO.setCalorie(444);
		foodDTO.setFoodName("고기불");
		foodDTO.setRecipePrice(6660);
		foodDTO.setFoodNum(13);
		
		assertTrue(foodDAO.update(foodDTO));
	}

	@Test @Ignore
	public void testList() {
		FoodDAO foodDAO = (FoodDAO) beans.getBean("foodDAO");
		
		Map map = new HashMap();
		map.put("col", "foodName");
		map.put("word", "찌개");
		map.put("sno", 1);
		map.put("eno", 15);
		
		List<FoodDTO> list = foodDAO.list(map);
		
		assertEquals(3, list.size());
	}

	@Test @Ignore
	public void testTotal() {
		FoodDAO foodDAO = (FoodDAO) beans.getBean("foodDAO");
		Map map = new HashMap();
		map.put("col", "foodName");
		map.put("word", "찌개");
		
		assertEquals(3, foodDAO.total(map));
		
	}
 
	@Test @Ignore
	public void testDelete() {
		FoodDAO foodDAO = (FoodDAO) beans.getBean("foodDAO");
		assertTrue(foodDAO.delete("13"));
	}

	@Test @Ignore
	public void testBdelete() {
		fail("Not yet implemented");
	}

}
