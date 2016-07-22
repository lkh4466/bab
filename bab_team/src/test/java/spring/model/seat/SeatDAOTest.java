package spring.model.seat;

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

import spring.model.reservation.ReservationDAO;
import spring.model.reservation.ReservationDTO;
import spring.model.restraurant.SeatDAO;
import spring.model.restraurant.SeatDTO;

public class SeatDAOTest extends SeatDAO {

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
		SeatDAO seatDAO = (SeatDAO)beans.getBean("SeatDAO");
		SeatDTO seatDTO = seatDAO.read(2);
		assertEquals(2, seatDTO.getRestNum());
		
	}

	@Test @Ignore
	public void testDelete() {
		SeatDAO seatDAO = (SeatDAO)beans.getBean("SeatDAO");
		assertEquals(1, seatDAO.delete(4));
	}

	@Test @Ignore
	public void testUpdate() {
		SeatDAO seatDAO = (SeatDAO)beans.getBean("SeatDAO");
		SeatDTO seatDTO = seatDAO.read(3);
		seatDTO.setSeat_width(11);
		seatDTO.setSeat_height(11);
		seatDTO.setSeat_floor(2);
		seatDTO.setSeat_info("유효좌석");
		seatDTO.setRestNum(3);
		assertEquals(1, seatDAO.update(seatDTO));
	}

	@Test @Ignore
	public void testCreate() {
		SeatDAO seatDAO = (SeatDAO)beans.getBean("SeatDAO");
		SeatDTO seatDTO = new SeatDTO();
		seatDTO.setSeat_width(12);
		seatDTO.setSeat_height(10);
		seatDTO.setSeat_floor(3);
		seatDTO.setSeat_info("유효좌석");
		seatDTO.setRestNum(3);
		assertEquals(1, seatDAO.create(seatDTO));
	}

}
