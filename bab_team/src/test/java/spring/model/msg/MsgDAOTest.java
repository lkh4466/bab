package spring.model.msg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
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

public class MsgDAOTest {
	
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
	public void testList() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		Map map = new HashMap();
		map.put("col", "recvDeleteF");
		map.put("id", "user2");
		map.put("eno", 5);
		map.put("sno", 1);
		
		assertEquals(2, msgDAO.list(map).size());
	}

	@Test @Ignore
	public void testTotal() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		Map map = new HashMap();
		map.put("col", "sendDeleteT");
		map.put("id", "user1");
		
		assertEquals(1, msgDAO.total(map));
	}

	@Test @Ignore
	public void testDelete() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		assertTrue(msgDAO.delete(1));
	}

	@Test @Ignore
	public void testDeleteCheck() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		MsgDTO dto = msgDAO.read(2);
		dto.setSendDelete("T");
		
		assertTrue(msgDAO.deleteCheck(dto));
	}

	@Test @Ignore
	public void testReadCheck() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		assertTrue(msgDAO.readCheck(1));
	}

	@Test @Ignore
	public void testRead() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		assertEquals("user1", msgDAO.read(1).getSendID());
	}

	@Test @Ignore
	public void testCreate() {
		MsgDAO msgDAO = (MsgDAO) beans.getBean("msgDAO");
		
		MsgDTO msgDTO = new MsgDTO();
		msgDTO.setMsgContent("하이");
		msgDTO.setSendID("user1");
		msgDTO.setRecvID("user2");
		msgDTO.setMsgTitle("제목");
		
		assertTrue(msgDAO.create(msgDTO));
	}

}
