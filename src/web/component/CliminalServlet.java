package web.component;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CliminalServlet
 */
@WebServlet({ "/CliminalServlet", "/climinal" })
public class CliminalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CliminalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


}
