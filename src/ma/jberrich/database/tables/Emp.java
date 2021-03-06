/**
 * This class is generated by jOOQ
 */
package ma.jberrich.database.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import ma.jberrich.database.Employesdb;
import ma.jberrich.database.Keys;
import ma.jberrich.database.tables.records.EmpRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Emp extends TableImpl<EmpRecord> {

	private static final long serialVersionUID = 820157121;

	/**
	 * The reference instance of <code>employesdb.emp</code>
	 */
	public static final Emp EMP = new Emp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EmpRecord> getRecordType() {
		return EmpRecord.class;
	}

	/**
	 * The column <code>employesdb.emp.EMPNO</code>.
	 */
	public final TableField<EmpRecord, Integer> EMPNO = createField("EMPNO", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>employesdb.emp.ENAME</code>.
	 */
	public final TableField<EmpRecord, String> ENAME = createField("ENAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>employesdb.emp.JOB</code>.
	 */
	public final TableField<EmpRecord, String> JOB = createField("JOB", org.jooq.impl.SQLDataType.VARCHAR.length(9), this, "");

	/**
	 * The column <code>employesdb.emp.AGE</code>.
	 */
	public final TableField<EmpRecord, Integer> AGE = createField("AGE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>employesdb.emp.SAL</code>.
	 */
	public final TableField<EmpRecord, BigDecimal> SAL = createField("SAL", org.jooq.impl.SQLDataType.DECIMAL.precision(7, 2), this, "");

	/**
	 * The column <code>employesdb.emp.DEPTNO</code>.
	 */
	public final TableField<EmpRecord, Integer> DEPTNO = createField("DEPTNO", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>employesdb.emp</code> table reference
	 */
	public Emp() {
		this("emp", null);
	}

	/**
	 * Create an aliased <code>employesdb.emp</code> table reference
	 */
	public Emp(String alias) {
		this(alias, EMP);
	}

	private Emp(String alias, Table<EmpRecord> aliased) {
		this(alias, aliased, null);
	}

	private Emp(String alias, Table<EmpRecord> aliased, Field<?>[] parameters) {
		super(alias, Employesdb.EMPLOYESDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<EmpRecord, Integer> getIdentity() {
		return Keys.IDENTITY_EMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<EmpRecord> getPrimaryKey() {
		return Keys.KEY_EMP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<EmpRecord>> getKeys() {
		return Arrays.<UniqueKey<EmpRecord>>asList(Keys.KEY_EMP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<EmpRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<EmpRecord, ?>>asList(Keys.EMP_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Emp as(String alias) {
		return new Emp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Emp rename(String name) {
		return new Emp(name, null);
	}
}
