/**
 * This class is generated by jOOQ
 */
package ma.jberrich.database;


import javax.annotation.Generated;

import ma.jberrich.database.tables.Dept;
import ma.jberrich.database.tables.Emp;
import ma.jberrich.database.tables.records.DeptRecord;
import ma.jberrich.database.tables.records.EmpRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>employesdb</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<EmpRecord, Integer> IDENTITY_EMP = Identities0.IDENTITY_EMP;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<DeptRecord> KEY_DEPT_PRIMARY = UniqueKeys0.KEY_DEPT_PRIMARY;
	public static final UniqueKey<EmpRecord> KEY_EMP_PRIMARY = UniqueKeys0.KEY_EMP_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<EmpRecord, DeptRecord> EMP_IBFK_1 = ForeignKeys0.EMP_IBFK_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<EmpRecord, Integer> IDENTITY_EMP = createIdentity(Emp.EMP, Emp.EMP.EMPNO);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<DeptRecord> KEY_DEPT_PRIMARY = createUniqueKey(Dept.DEPT, Dept.DEPT.DEPTNO);
		public static final UniqueKey<EmpRecord> KEY_EMP_PRIMARY = createUniqueKey(Emp.EMP, Emp.EMP.EMPNO);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<EmpRecord, DeptRecord> EMP_IBFK_1 = createForeignKey(ma.jberrich.database.Keys.KEY_DEPT_PRIMARY, Emp.EMP, Emp.EMP.DEPTNO);
	}
}
