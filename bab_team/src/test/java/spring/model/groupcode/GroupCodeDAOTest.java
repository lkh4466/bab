package spring.model.groupcode;

import static org.junit.Assert.*;

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

import spring.model.food.GroupCodeDAO;
import spring.model.food.GroupCodeDTO;
import spring.model.reservation.PeopleDAO;
import spring.model.reservation.PeopleDTO;

public class GroupCodeDAOTest extends GroupCodeDAO {

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
	public void testSetMybatis() {
		fail("Not yet implemented");
	}

	@Test //@Ignore
	public void testRead() {
		GroupCodeDAO groupCodeDAO = (GroupCodeDAO)beans.getBean("GroupCodeDAO");
		GroupCodeDTO groupCodeDTO = groupCodeDAO.read("C02");
		assertEquals("C02", groupCodeDTO.getGrpCode());
		assertEquals("��源�", groupCodeDTO.getGroupName());
		assertEquals("C0", groupCodeDTO.getUpperCode());
		
	}
	@Test @Ignore
	public void testDelete() {
		GroupCodeDAO groupCodeDAO = (GroupCodeDAO)beans.getBean("GroupCodeDAO");
		assertEquals(1, groupCodeDAO.delete("C03"));
	}

	@Test @Ignore
	public void testUpdate() {
		GroupCodeDAO groupCodeDAO = (GroupCodeDAO)beans.getBean("GroupCodeDAO");
		GroupCodeDTO groupCodeDTO = groupCodeDAO.read("C02");
		groupCodeDTO.setGroupName("��源�");
		groupCodeDTO.setUpperCode("C0");
		assertEquals(1, groupCodeDAO.update(groupCodeDTO));
	}

	@Test @Ignore
	public void testCreate() {
		GroupCodeDAO groupCodeDAO = (GroupCodeDAO)beans.getBean("GroupCodeDAO");
		GroupCodeDTO groupCodeDTO = new GroupCodeDTO();
		groupCodeDTO.setGrpCode("C03");
		groupCodeDTO.setGroupName("��源�");
		groupCodeDTO.setUpperCode("C0");
		assertEquals(1, groupCodeDAO.create(groupCodeDTO));
	}

}
