package spring.model.people;

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

import spring.model.reservation.OrderDAO;
import spring.model.reservation.OrderDTO;
import spring.model.reservation.PeopleDAO;
import spring.model.reservation.PeopleDTO;

public class PeopleDAOTest {

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
		PeopleDAO peopleDAO = (PeopleDAO)beans.getBean("PeopleDAO");
		PeopleDTO peopleDTO = peopleDAO.read("d");
		assertEquals("d", peopleDTO.getPersonCode());
		
	}

	@Test @Ignore
	public void testDelete() {
		PeopleDAO peopleDAO = (PeopleDAO)beans.getBean("PeopleDAO");
		assertEquals(1, peopleDAO.delete("e"));
	}

	@Test @Ignore
	public void testUpdate() {
		PeopleDAO peopleDAO = (PeopleDAO)beans.getBean("PeopleDAO");
		PeopleDTO peopleDTO = peopleDAO.read("e");
		peopleDTO.setGeneral(1);
		peopleDTO.setDisabled(3);
		peopleDTO.setChild(2);
		peopleDTO.setResNum(1);
		assertEquals(1, peopleDAO.update(peopleDTO));
	}

	@Test @Ignore
	public void testCreate() {
		PeopleDAO peopleDAO = (PeopleDAO)beans.getBean("PeopleDAO");
		PeopleDTO peopleDTO = new PeopleDTO();
		peopleDTO.setPersonCode("e");
		peopleDTO.setGeneral(1);
		peopleDTO.setDisabled(1);
		peopleDTO.setChild(1);
		peopleDTO.setResNum(3);
		assertEquals(1, peopleDAO.create(peopleDTO));
	}

}
