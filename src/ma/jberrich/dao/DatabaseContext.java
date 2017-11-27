package ma.jberrich.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.aeonbits.owner.ConfigFactory;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class DatabaseContext {

	private static DatabaseContext database;
	
	private Connection connection = null;
	private DSLContext context =null;
	
	private DatabaseContext() throws SQLException {
		Configuration configuration = ConfigFactory.create(Configuration.class);
		try {
			Class.forName(configuration.getDriver());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		this.connection = DriverManager.getConnection(configuration.getUrl(), configuration.getUsername(), configuration.getPassword());
    	this.context = DSL.using(connection, SQLDialect.MYSQL);
	}

	public static DatabaseContext getInstance() throws SQLException {
		if(database == null) {
			database = new DatabaseContext();
			return database;
		}else {
			return database;
		}
	}

	public DSLContext getContext() {
		return this.context;
	}
	
}
