package com.springmaven.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
@EnableJpaRepositories("com.springmaven.repository")
@ComponentScan(basePackages = { "com.springmaven" })
public class AppContext {

	@Autowired
	private Environment environment;

	/************* Start Spring JPA config details **************/
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		lcemfb.setJpaVendorAdapter(getJpaVendorAdapter());
		lcemfb.setDataSource(dataSource());
		lcemfb.setPersistenceUnitName("myJpaPersistenceUnit");
		lcemfb.setPackagesToScan("com.springmaven");
		lcemfb.setJpaProperties(hibernateProperties());
		return lcemfb;
	}

	@Bean
	public JpaVendorAdapter getJpaVendorAdapter() {
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		return adapter;
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager txManager() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(
				getEntityManagerFactoryBean().getObject());
		return jpaTransactionManager;
	}

	/************* End Spring JPA config details **************/
	@Bean
	public DataSource dataSource() {
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost\\BHAVNAWKS722;databaseName=Employees;portNumber=1433";
		String user = "sa";
		String pass = "Bhavna@123";
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(pass);
		return dataSource;
	}

	private Properties hibernateProperties() {

		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "none");
		return properties;
	}

}