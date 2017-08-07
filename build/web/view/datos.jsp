<%-- 
    Document   : datos.jsp
    Created on : 25-jul-2017, 19:43:52
    Author     : UPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados</h1><br>
        <%
        HttpSession s=request.getSession();
        //rescatar valores desde las variables de sesion
        String ape=s.getAttribute("sape").toString();
        double monto=Double.parseDouble(s.getAttribute("smonto").toString());
        String fecha=s.getAttribute("sfecha").toString();
        //Visualizar valores
          out.println("<font color='red'>");
                out.println("Apellidos : "+ape+"<br>");
                out.println("Monto : "+monto+"<br>");
                out.println("Fecha : "+fecha+"<br>");
                out.println("</font>");
                //borrar las variables de sesion
                s.removeAttribute("sape");
                s.removeAttribute("smonto");
                s.removeAttribute("sfecha");
        %>
    </body>
</html>
