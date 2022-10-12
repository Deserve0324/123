package com.des;

import com.UserBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet01", value = "/LoginServlet01")
public class LoginServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String us=request.getParameter("name");
        String pass = request.getParameter("password");

        List<UserBean> userList = (List<UserBean>) getServletContext().getAttribute("users");
        UserBean user=null;
        System.out.println(userList);
        for(UserBean u1:userList){
            if(u1.getLoginid().equals(us)) {
                user=u1;
                System.out.println("成功:"+user);
                System.out.println("----------");
            }
        }
        if(user==null) {
            response.getWriter().write("账号未注册！");
            System.out.println("------error-----");
        }
        else if(user.getPsd2().equals(pass)){
            System.out.println("---sucessful!---");
            getServletContext().setAttribute("now",user);
            response.sendRedirect("/111/welcome.jsp");
        }
        else
        {
            response.sendRedirect("/111/Logfail.html");
            System.out.println("---fail!---");
        }
        System.out.println(user.getLoginid());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
