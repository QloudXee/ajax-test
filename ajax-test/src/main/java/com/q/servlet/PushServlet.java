package com.q.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class PushServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PushServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		/*JSONArray list = new JSONArray();
		list.add(1);
		list.add(4);
		list.add(15);
		list.add(13);
		
		JSONObject json = new JSONObject();
		json.put("data", list);
		
		out.write(json.toJSONString());*/
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		String str=JSON.toJSON(list).toString();
		out.write(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
