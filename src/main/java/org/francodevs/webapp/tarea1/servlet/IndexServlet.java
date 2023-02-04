package org.francodevs.webapp.tarea1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // Params
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("   <head>");
        out.println("       <meta charset=\"UTF-8\">");
        out.println("       <title></title>");
        out.println("   </head>");
        out.println("<body>");
        out.println("   <h1>Tarea 1: Servlet y envío de parámetros</h1>");
        if(nombre != null && apellido != null) {
            out.println("       <h2>Hola mi nombre es " + nombre + " y mi apellido " + apellido + "</h2>");
        } else {
            out.println("       <h2>Ni nombre ni apellido pueden ser null</h2>");
        }

        DateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaActual = df.format(new Date());
        out.println("   <h3>La fecha actual es: "+ fechaActual +"</h3>");
        out.println("</body>");
        out.println("</html>");

        out.close();

    }
}
