package com.ow.appmg.controller.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ow.appmg.dao.UserMapperDao;
import com.ow.appmg.entity.User;

@Controller
@RequestMapping("/login")
public class CheckLoginController {
	@Resource
	private UserMapperDao dao;
	public void setDao(UserMapperDao dao) {
		this.dao = dao;
	}
	@RequestMapping("/login")
	public String login(
		User user,Model model,
		HttpSession session){
		//�����֤��
		String scode = (String) 
			session.getAttribute("scode");
		System.out.println("user"+user.getUsername());
		System.out.println("�û�����:"+user.getCode());
		System.out.println("Session:"+scode);
		//�����ִ�Сд
//		if(!user.getCode().toUpperCase().equals(scode.toUpperCase())){
//			//��֤�����
//			model.addAttribute("code_error", "��֤�����");
//			return "login";
//		}
//		//����˺ź�����
//		User info = 
//			dao.findByUsernameAndPwd(user);
//		if(info != null){//�м�¼ֱ�������ݿ��в�ѯ
//			session.setAttribute(
//				"user", info.getUsername());
//			return "index";//����index.jsp
//		}else{//�޼�¼,����
//			model.addAttribute(
//				"error", "�û��������벻��ȷ");
//			return "login";//����login.jsp
//		}
		return "index";
	}
}


