<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%
    session.setAttribute("user", null);
    session.invalidate();
    response.sendRedirect("index.html");
%>
