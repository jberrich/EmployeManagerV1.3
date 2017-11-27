package ma.jberrich.dao;

import static ma.jberrich.database.Tables.DEPT;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import ma.jberrich.model.Service;

public class ServiceDAO implements IServiceDAO {

	private Service initService(Record record) {
		Service service = new Service();
		service.setId(record.getValue(DEPT.DEPTNO));
		service.setNom(record.getValue(DEPT.DNAME));
		service.setLocal(record.getValue(DEPT.LOC));
		return service;
	}

	@Override
	public Service getService(String nom) {
		Service service = null;
		try {
			DSLContext create = DatabaseContext.getInstance().getContext();
			Result<Record> result = create.select()
											.from(DEPT)
											.where(DEPT.DNAME.eq(nom))
												.fetch();
			for (Record record : result) {
				service = initService(record);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return service;
	}

	@Override
	public Service getServiceByID(int id) {
		Service service = null;
		try {
			DSLContext create = DatabaseContext.getInstance().getContext();
			Result<Record> result = create.select()
											.from(DEPT)
											.where(DEPT.DEPTNO.eq(id))
												.fetch();
			for (Record record : result) {
				service = initService(record);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return service;
	}

	@Override
	public List<Service> getListeServices() {
		List<Service> services = new ArrayList<>();
		try {
			DSLContext create = DatabaseContext.getInstance().getContext();
			Result<Record> result = create.select().from(DEPT).fetch();
			for (Record record : result) {
				services.add(initService(record));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return services;
	}

}
