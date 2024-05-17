

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servler was loaded");
	}


    public FirstServlet() {
        super();
        System.out.println("servlet is instanciated");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method Instanciated");
	}

	
	public void destroy() {
		System.out.println("In destroy method");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Actual code is executed here...");
	}

}
