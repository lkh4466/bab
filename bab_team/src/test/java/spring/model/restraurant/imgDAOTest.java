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

public class imgDAOTest {
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
	public void testDelete() {
		ImgDAO imgDAO  =(ImgDAO) beans.getBean("imageDAO");
		assertEquals(1,imgDAO.delete(1));
	}

	@Test @Ignore
	public void testUpdate() {
		ImgDAO imgDAO = (ImgDAO) beans.getBean("imageDAO");
		ImgDTO imgDTO = new ImgDTO();
		imgDTO.setRestNum(1);
		
		assertEquals(1, imgDAO.update(imgDTO));
		
	}

	

	@Test @Ignore
	public void testRead() {
		ImgDAO imgDAO = (ImgDAO) beans.getBean("imageDAO");
		ImgDTO imgDTO = imgDAO.read(1);
		assertEquals("돈가스",imgDTO.getImgName());
		
		
		
		
	}



	@Test //@Ignore
	public void testCreate() {
		ImgDAO imgDAO = (ImgDAO) beans.getBean("imageDAO");
		ImgDTO imgDTO = new ImgDTO();
		
		imgDTO.setImgNum(1);
		imgDTO.setRestNum(1);
		imgDTO.setImgName("돈가스");
		imgDTO.setFileName("aa.jpg");
		
	
		
		assertEquals(1,imgDAO.create(imgDTO));
	}

}
