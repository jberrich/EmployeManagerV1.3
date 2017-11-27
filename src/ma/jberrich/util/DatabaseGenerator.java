package ma.jberrich.util;

import java.io.File;

import javax.xml.bind.JAXB;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;

public class DatabaseGenerator {

	private static final String DATABASE_XML = "conf/database.xml";

	public Configuration getConfiguration() {
		Configuration configuration = null;
		configuration = JAXB.unmarshal(new File(DATABASE_XML), Configuration.class);

		configuration.getJdbc().withUser("root").withPassword("root");
		return configuration;
	}

	public static void main(String[] args) {
		DatabaseGenerator generator = new DatabaseGenerator();

		Configuration configuration = generator.getConfiguration();

		try {
			GenerationTool.generate(configuration);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
