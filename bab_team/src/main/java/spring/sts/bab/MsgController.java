package spring.sts.bab;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.model.msg.MsgDAO;
import spring.model.msg.MsgDTO;
import spring.utility.bab.Paging;

@Controller
public class MsgController {
	@Autowired
	private MsgDAO dao;
	
	@RequestMapping(value="/msg/createMsg", method=RequestMethod.GET)
	public String create(){
		
		return "/msg/createMsg";
	}
	@RequestMapping(value="/msg/createMsg",  method=RequestMethod.POST)
 	public String create(MsgDTO msgDTO, HttpServletRequest request) {

 		if(dao.create(msgDTO)==true){
 			return "redirect:/img/list";
 			
 		}else{
 			return "/error/error";
 		}
 		
 	}
	
	@RequestMapping("/msg/read")
	public String read(HttpServletRequest request, Model model){
		
		int msgNum = Integer.parseInt(request.getParameter("msgNum"));
		
		MsgDTO msgDTO = dao.read(msgNum);
		
		model.addAttribute("msgDTO", msgDTO);
		
		return "/msg/read";
	}
	
	@RequestMapping("/msg/recvMsg")
	public String recvMsg(HttpServletRequest request, Model model){
		
		String col = "recvDeleteF";
		String id = "user2";//request.getParameter("id");
		
		if(id == null){
			id = (String) request.getSession().getAttribute("id");
		}
		
		int nowPage = 1;
		int recordPerPage = 11;
		if(request.getParameter("nowPage") != null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}
		
		int sno = ((nowPage - 1) * recordPerPage);
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("col", col);
		map.put("id", id);
		map.put("sno", sno);
		map.put("eno", eno);
		
		int total = dao.total(map);
		
		String paging = new Paging().paging3(total, nowPage, recordPerPage, col, id);
		
		List<MsgDTO> list = dao.list(map);
		
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		model.addAttribute("col", col);
		model.addAttribute("id", id);
		model.addAttribute("nowPage", nowPage);
		   
		return "/msg/recvMsg";
	}
	
	@RequestMapping("/msg/sendMsg")
	public String sendMsg(HttpServletRequest request, Model model){
		
		String col = "sendDeleteT";
		String id = "user2";//request.getParameter("id");
		
		if(id == null){
			id = (String) request.getSession().getAttribute("id");
		}
		
		int nowPage = 1;
		int recordPerPage = 11;
		if(request.getParameter("nowPage") != null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}
		
		int sno = ((nowPage - 1) * recordPerPage);
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("col", col);
		map.put("id", id);
		map.put("sno", sno);
		map.put("eno", eno);
		
		int total = dao.total(map);
		
		String paging = new Paging().paging3(total, nowPage, recordPerPage, col, id);
		
		List<MsgDTO> list = dao.list(map);
		
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		model.addAttribute("col", col);
		model.addAttribute("id", id);
		model.addAttribute("nowPage", nowPage);
		
		return "/msg/sendMsg";
	}
	
	@RequestMapping("/msg/delRecvMsg")
	public String delRecvMsg(HttpServletRequest request, Model model){
		
		String col = "recvDeleteT";
		String id = "user2";//request.getParameter("id");
		
		if(id == null){
			id = (String) request.getSession().getAttribute("id");
		}
		
		int nowPage = 1;
		int recordPerPage = 11;
		if(request.getParameter("nowPage") != null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}
		
		int sno = ((nowPage - 1) * recordPerPage);
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("col", col);
		map.put("id", id);
		map.put("sno", sno);
		map.put("eno", eno);
		
		int total = dao.total(map);
		
		String paging = new Paging().paging3(total, nowPage, recordPerPage, col, id);
		
		List<MsgDTO> list = dao.list(map);
		
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		model.addAttribute("col", col);
		model.addAttribute("id", id);
		model.addAttribute("nowPage", nowPage);
		
		return "/msg/delRecvMsg";
	}
	
	@RequestMapping("/msg/delSendMsg")
	public String delSendMsg(HttpServletRequest request, Model model){
		
		String col = "sendDeleteF";
		String id = "user2";//request.getParameter("id");
		
		if(id == null){
			id = (String) request.getSession().getAttribute("id");
		}
		
		int nowPage = 1;
		int recordPerPage = 11;
		if(request.getParameter("nowPage") != null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}
		
		int sno = ((nowPage - 1) * recordPerPage);
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("col", col);
		map.put("id", id);
		map.put("sno", sno);
		map.put("eno", eno);
		
		int total = dao.total(map);
		
		String paging = new Paging().paging3(total, nowPage, recordPerPage, col, id);
		
		List<MsgDTO> list = dao.list(map);
		
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		model.addAttribute("col", col);
		model.addAttribute("id", id);
		model.addAttribute("nowPage", nowPage);
		
		return "/msg/delSendMsg";
	}
}
