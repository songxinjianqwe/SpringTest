package collections;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class JDBCUtils {
	private  Properties prop ;
	private  DataSource dataSource ;
	public  Properties getProp() {
		return prop;
	}

	public  void setProp(Properties prop) {
		this.prop = prop;
	}
	public  DataSource getDataSource(){
		try {
			if(dataSource == null){
				dataSource = BasicDataSourceFactory.createDataSource(prop);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("≥ı ºªØ ß∞‹");
		}
		return dataSource;
	}
}
