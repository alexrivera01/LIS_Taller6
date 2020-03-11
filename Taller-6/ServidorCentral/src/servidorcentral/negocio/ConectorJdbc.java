/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorcentral.negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alexander
 */
public class ConectorJdbc {
    private Connection cn;
    private ResultSet rs;
    private Statement st;
    //MODIFICAR BASE
    private final String URL = "jdbc:hsqldb:file:C:\\Users\\Universidad\\Desktop\\Taller-6\\Taller-6\\ServidorCentral\\bd\\servidorcentral;hsqldb.lock_file=false";
 
    private final String USER = "sa";
    private final String PASSWORD = "123";
    
    public void conectarse() throws ClassNotFoundException, SQLException {
        Class.forName("org.hsqldb.jdbcDriver");
        cn = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public void crearConsulta(String sql) throws SQLException {
        st = cn.createStatement();
        rs = st.executeQuery(sql);
    }
    public void actualizar(String sql) throws SQLException {
        st = cn.createStatement();
        st.executeUpdate(sql);
    }
    public void desconectarse() throws SQLException {
        if ( rs != null){
            rs.close();
        }
        st.close();
        cn.close();
    }
    public ResultSet getResultado() {
        return rs;
    }
    
}
