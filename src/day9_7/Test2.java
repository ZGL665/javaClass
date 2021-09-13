package day9_7;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bwf.util.DBhelp;

public class Test2 {

	public static void main(String[] args) throws SQLException {

       Connection conn=DBhelp.getConn();
       
       DatabaseMetaData md=conn.getMetaData();
       
       System.out.println(md.getDatabaseProductName());
       System.out.println(md.getDatabaseProductVersion());
       System.out.println(md.getDefaultTransactionIsolation());
       System.out.println(md.getDriverMajorVersion());
       System.out.println();
       
       ResultSet rs=md.getTables(null, null, null, null);
       
       rs=md.getCatalogs();
       
    		   while(rs.next()) {
    			   
    			   System.out.println(rs.getObject(1));
    			   
    		   }
      
	}

}
