package com.des;

import com.UserBean;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("IIII");
        try {
            UserBean userBean = new UserBean();

            String us = request.getParameter("username");
            userBean.setLoginid(us);

            String pass = request.getParameter("psd2");
            userBean.setPsd2(pass);

            String phoneno1 = request.getParameter("phoneno");
            userBean.setPhoneno(phoneno1);

            String userName = request.getParameter("nickname");
            userBean.setUserName(userName);

            String sex = request.getParameter("usersex");
            userBean.setSex(sex);

            String email = request.getParameter("email");
            userBean.setEmail(email);

            String sign = request.getParameter("sign");
            userBean.setSign(sign);
            System.out.println("注册完成" + userBean.toString());
            List<UserBean> userList = (List<UserBean>) getServletContext().getAttribute("users");
            int o=0;
            for(UserBean userResign:userList){
                if(userResign.getLoginid().equals(us)){
                    o=1;
                }
            }
            if(o==0){
                userList.add(userBean);

                getServletContext().setAttribute("user", userList);
                response.sendRedirect("/111/SuResign.html");
            }
            else {
                response.sendRedirect("/111/Refail.html");
                response.getWriter().write("账号已注册");
                System.out.println("55555");
            }
            System.out.println("11111");
            System.out.println(userList);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

