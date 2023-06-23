package test.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
         throws ServletException, IOException {
      resp.setContentType("text/html; charset=UTF-8");
      
      PrintWriter out = resp.getWriter();
      
      out.append("Served at: ").append(req.getContextPath());
      out.println("<p>Redriect 된다!!!</p>");
      
      // 주소가 같은 forward일때는 request 바인된다. 없어진다
      req.setAttribute("name", "홍길동"); //투헬로우로 넘어가면서 홍길동이 널값으로 변경.
      // 주소가 달라 질때는 request가 아닌 session에 바인딩 해야 한다.
      HttpSession session = req.getSession();
      session.setAttribute("name_session", "홍길동2");
      
      // session(브라우저)가 달라져도 데이터가 남있다.
      ServletContext application = req.getServletContext();
      application.setAttribute("name_app", "홍길동3");
         
      //resp.sendRedirect("toHello");
      
      // forward
      RequestDispatcher view = req.getRequestDispatcher("toHello");
      view.forward(req, resp); //여기서 투헬로우꺼 갖고온다는 뜻.
      
      out.close();   
   }
}