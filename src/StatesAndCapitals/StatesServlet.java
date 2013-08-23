/** States and Capitals
* 	Steve Schmidt 2012
* 	This servlet lets the user enter a state and will return that state's capital.
*/

package StatesAndCapitals;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StatesAndCapitals.dto.StateCapital;

/**
 * Servlet implementation class StatesServlet
 */
@WebServlet("/StatesServlet")
public class StatesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * The Request object takes the state information and creates a State object
	 * The State object is passed to the LookupService to verify the state
	 * The State object is then passed to the Result page through the dispatcher
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stateId;
		
		stateId = request.getParameter("stateId");
		
		LookupService lookup = new LookupService();
		boolean result = lookup.authenticate(stateId);
		
		if( result ) {
			StateCapital capital = lookup.getStateDetails(stateId);
			request.setAttribute("capital", capital);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Result.jsp");
			dispatcher.forward(request, response);
			return;
		}else {
			response.sendRedirect("HomePage.jsp");
			return;
		}
	}

}
