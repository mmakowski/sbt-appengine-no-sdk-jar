package sample

import javax.servlet.http.{ HttpServlet, HttpServletRequest, HttpServletResponse }
import com.google.appengine.api.users.UserServiceFactory

class UserServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit =
    resp.sendRedirect(UserServiceFactory.getUserService.createLoginURL("http://www.google.com", null, "https://www.google.com/accounts/o8/id", null))
}
