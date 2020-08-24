package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jainam
 */
public class SaveInfo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String name =  request.getParameter("name");
        String id = request.getParameter("id");
        System.out.println(name);
         
        
        String lname = request.getParameter("lname");
        
          System.out.println(lname);
        int no = Integer.valueOf(id);
        System.out.println(no);
   //    out.println(name + no + lname);
       Connection con = null;
     PreparedStatement st = null;
     out.println("hi");
        try
        {
            con= Connections.getConnection();
            st = con.prepareStatement("insert into persons values(?,?,?)");
            st.setString(1,name);
            st.setInt(2,no);
            st.setString(3,lname);
            int i =  st.executeUpdate();
          if(i>0)
          {
              out.println("your record is successfully save");
          }
          else
          {
              out.println("sorry");
          }
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
      
        
 
     //   }  
   // }
    }
  
    }

   


