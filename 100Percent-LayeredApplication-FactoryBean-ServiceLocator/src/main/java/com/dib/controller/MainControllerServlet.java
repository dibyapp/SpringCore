package com.dib.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dib.config.AppConfig;
import com.dib.service.CricBuzzScoreService;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;
	public void init() {
		ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int mid=0;
		CricBuzzScoreService service=null;
		String score=null;
		RequestDispatcher rd= null;
		
		service= ctx.getBean("cbService", CricBuzzScoreService.class);
		mid=Integer.parseInt(req.getParameter("mid"));
		score=service.findScore(mid);
		req.setAttribute("score", score);
		rd=req.getRequestDispatcher("show_score.jsp");
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
	
}
