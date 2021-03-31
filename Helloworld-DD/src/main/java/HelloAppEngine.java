import java.io.IOException;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    
    Random numb = new Random();
    int min = 1;
    int max = 20;
    int randomNum = numb.nextInt((max - min) + 1) + min;
    			
    response.getWriter().print("Hello App Engine!\r\n");
    response.getWriter().print("Random number is: " + randomNum + "\r\n");

  }
}