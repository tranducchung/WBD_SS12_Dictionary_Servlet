import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet-Dictionary",urlPatterns ="/Dictionary")
public class ServletDictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("Apple","Qua Tao");
        dictionary.put("Banana", "Qua Chuoi");
        dictionary.put("Lemon","Qua Chanh");
        dictionary.put("Orange", "Qua cam");

        String word = request.getParameter("word");
        String result = dictionary.get(word);
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        if(result!= null){
            writer.println("English : " + word + "<br>");
            writer.println("Vietnamese : " + result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
