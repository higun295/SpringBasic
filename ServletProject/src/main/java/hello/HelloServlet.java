package hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        System.out.println("===> HelloServlet 생성");
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---> Service() 호출");
	}

}
