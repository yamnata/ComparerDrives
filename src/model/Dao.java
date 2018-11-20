package model;

import java.sql.Connection;
import javax.naming.NamingException;
public interface Dao {
	/*ouvre une connection vers le sgbd*/
	public Connection getConnection() throws NamingException;

}

