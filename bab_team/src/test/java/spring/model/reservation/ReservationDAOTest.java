package spring.model.reservation;

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

import spring.model.reservation.ReservationDAO;
import spring.model.reservation.ReservationDTO;



public class ReservationDAOTest extends ReservationDAO {

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
	public void testTotal() {
		ReservationDAO dao = (ReservationDAO)beans.getBean("ReservationDAO");
		assertEquals(4, dao.total("memID", ""));
	}

	@Test //@Ignore
	public void testList() {
		ReservationDAO dao = (ReservationDAO) beans.getBean("ReservationDAO");
		Map map = new HashMap();
		map.put("col", "memID");
		map.put("word", "user1");
		map.put("sno", 1);
		map.put("eno", 5);
		List<ReservationDTO> list = (List<ReservationDTO>)dao.list(map);
		assertEquals(2, list.size());
	}
	@Test @Ignore
	public void testReadDetail() {
		ReservationDAO dao = (ReservationDAO)beans.getBean("ReservationDAO");
		List<ReservationDTO> readDetail = (List<ReservationDTO>)dao.readDetail(3);
		ReservationDTO dto = readDetail.get(3);
		assertEquals("돈부리", dto.getOrderdto().getOrderFood());
	}
	
	@Test @Ignore
	public void testRead() {
		ReservationDAO dao = (ReservationDAO)beans.getBean("ReservationDAO");
		ReservationDTO dto = dao.read(3);
		assertEquals("admin", dto.getMemID());
	}

	@Test @Ignore
	public void testDelete() {
		ReservationDAO dao = (ReservationDAO) beans.getBean("ReservationDAO");
		assertEquals(1, dao.delete(4));
	}

	@Test @Ignore
	public void testUpdate() {
		ReservationDAO dao = (ReservationDAO)beans.getBean("ReservationDAO");
		ReservationDTO dto = dao.read(4);
		assertEquals("user1", dto.getMemID());
	}

	@Test @Ignore
	public void testCreate() {
		ReservationDAO dao = (ReservationDAO)beans.getBean("Bab_reservationDAO");
		ReservationDTO dto = new ReservationDTO();
		dto.setRestNum(1);
		dto.setMemID("user1");
		dto.setResName("김재영");
		dto.setResPhone("199");
		dto.setResEmail("alpha@mail.com");
		dto.setResTerm("14:00~16:00");
		dto.setSeatNum("D12, D22");
		assertEquals(1, dao.create(dto));
	}

}
