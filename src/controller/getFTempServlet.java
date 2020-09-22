package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getCentsServlet
 */
@WebServlet("/getFTempServlet")
public class getFTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userTemp = request.getParameter("userTemp");
		TempConverter userTempCels = new TempConverter (Double.parseDouble(userTemp), 0);
		request.setAttribute("userTempSwitch", userTempCels);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
