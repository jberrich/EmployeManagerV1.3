package ma.jberrich.dao;

import static ma.jberrich.database.Tables.EMP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import ma.jberrich.model.Employe;

public class EmployeDAO implements IEmployeDAO {

	private IServiceDAO sdao = new ServiceDAO();

	@Override
	public void enregistrerEmploye(Employe emp) {
		try {
			DSLContext create = DatabaseContext.getInstance().getContext();
			create.insertInto(EMP)
					.set(EMP.ENAME, emp.getNom())
					.set(EMP.JOB, emp.getFonction())
					.set(EMP.AGE, emp.getAge())
					.set(EMP.SAL, new BigDecimal(emp.getSalaire()))
					.set(EMP.DEPTNO, emp.getService().getId())
					.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Employe initEmploye(Record record) {
		Employe employe = new Employe();
		employe.setId(record.getValue(EMP.EMPNO));
		employe.setNom(record.getValue(EMP.ENAME));
		employe.setFonction(record.getValue(EMP.JOB));
		employe.setAge(record.getValue(EMP.AGE));
		employe.setSalaire(record.getValue(EMP.SAL).intValue());
		employe.setService(sdao.getServiceByID(record.getValue(EMP.DEPTNO)));
		return employe;
	}

	@Override
	public List<Employe> getListeEmployes() {
		List<Employe> employes = new ArrayList<>();
		try {
			DSLContext create = DatabaseContext.getInstance().getContext();
			Result<Record> result = create.select().from(EMP).fetch();
			for (Record record : result) {
				employes.add(initEmploye(record));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employes;
	}

}
