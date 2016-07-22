package spring.model.order;

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
import spring.model.reservation.ReservationDAO;
import spring.model.reservation.ReservationDTO;

public class OrderDAOTest extends OrderDAO {

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

	@Test @Ignore
	public void testRead() {
		OrderDAO orderDAO = (OrderDAO)beans.getBean("OrderDAO");
		OrderDTO orderDTO = orderDAO.read(6);
		assertEquals("돈부리", orderDTO.getOrderFood());
	}

	@Test @Ignore
	public void testDelete() {
		OrderDAO orderDAO = (OrderDAO)beans.getBean("OrderDAO");
		assertEquals(1, orderDAO.delete(7));
	}

	@Test @Ignore
	public void testUpdate() {
		OrderDAO orderDAO = (OrderDAO)beans.getBean("OrderDAO");
		OrderDTO orderDTO = orderDAO.read(7);
		orderDTO.setOrderFood("피카츄 튀김");
		orderDTO.setOrderNumber(2);
		orderDTO.setResNum(1);
		assertEquals(1, orderDAO.update(orderDTO));
		
	}

	@Test @Ignore
	public void testCreate() {
		OrderDAO orderDAO = (OrderDAO)beans.getBean("OrderDAO");
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderFood("오뎅");
		orderDTO.setOrderNumber(1);
		orderDTO.setResNum(1);
		assertEquals(1, orderDAO.create(orderDTO));
	}

}
