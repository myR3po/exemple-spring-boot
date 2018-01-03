import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@Grab(group='mysql', module='mysql-connector-java', version='5.1.41')
class DataSourceConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/sirhpaie?useSSL=false");
		dataSource.setUsername("sirh-paie");
		dataSource.setPassword("sirh-paie");
		return dataSource;
	}
}