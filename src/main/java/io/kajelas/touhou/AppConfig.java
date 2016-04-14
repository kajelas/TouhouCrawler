package io.kajelas.touhou;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableScheduling
@EnableWebMvc
@EnableAsync
@ComponentScan(basePackages = {"io.kajelas.touhou"})
@MapperScan("io.kajelas.touhou.dao")
public class AppConfig {
	@Bean
	public DataSource dataSource() {
		final HikariDataSource ds = new HikariDataSource();
		ds.setMaximumPoolSize(100);
		ds.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
		ds.addDataSourceProperty("url", "jdbc:mysql://localhost:3306/data");
		ds.addDataSourceProperty("user", "root");
		ds.addDataSourceProperty("password", "123456");
		ds.addDataSourceProperty("cachePrepStmts", true);
		ds.addDataSourceProperty("prepStmtCacheSize", 250);
		ds.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
		ds.addDataSourceProperty("useServerPrepStmts", true);
		return ds;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
}
