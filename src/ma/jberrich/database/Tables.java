/**
 * This class is generated by jOOQ
 */
package ma.jberrich.database;


import javax.annotation.Generated;

import ma.jberrich.database.tables.Dept;
import ma.jberrich.database.tables.Emp;


/**
 * Convenience access to all tables in employesdb
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table employesdb.dept
	 */
	public static final Dept DEPT = ma.jberrich.database.tables.Dept.DEPT;

	/**
	 * The table employesdb.emp
	 */
	public static final Emp EMP = ma.jberrich.database.tables.Emp.EMP;
}
