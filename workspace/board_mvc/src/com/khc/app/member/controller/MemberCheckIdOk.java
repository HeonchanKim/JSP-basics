package com.khc.app.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.khc.app.action.Action;
import com.khc.app.action.ActionForward;
import com.khc.app.member.dao.MemberDAO;

public class MemberCheckIdOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String memberId = req.getParameter("memberId");
		MemberDAO dao = new MemberDAO();
		JSONObject obj = new JSONObject();
		PrintWriter out = resp.getWriter();
		
		if(dao.checkId(memberId)) {
			obj.put("status", "not-ok");
		}else {
			obj.put("status", "ok");			
		}
		
		out.println(obj.toJSONString());
		out.close();
		
		return null;
	}
}
