/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uptc.electiva2.servlet;

import edu.uptc.electiva2.management.ManagementProdu;
import edu.uptc.electiva2.persistence.Product;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sala.2
 */
@WebServlet(name = "ServletCarga", urlPatterns = {"/ServletCarga"})
public class ServletCarga extends HttpServlet {

    public ServletCarga(){
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        ManagementProdu mng= new ManagementProdu();
        ArrayList<Product> productos=mng.getProducts();
        
        if(productos != null){
            for (int i=0 ; i<=productos.size(); i++){   
                   out.print("<tr>");
                   out.print("<td>"+i+1+"</td>");
                   out.print("<td>"+productos.get(i).getName()+"</td>");
                   out.print("<td>"+productos.get(i).getCosto()+"</td>");
                   out.print("<td><img src='"+productos.get(i).getUrl()+"'></td>");
                   out.print("</tr>");
            }
                
        
        }else{
            out.print("<h4>No hay Productos para mostrar</h4>");
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
