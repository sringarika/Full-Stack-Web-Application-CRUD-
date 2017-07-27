package fullstack.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"fullstack.backend.DTO"})
@EnableTransactionManagement
public class HibernateConfig {
    private final static String DATABASE_URL = "jdbc:mysql://127.0.0.1/fullstackDB";
    private final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
    private final static String DATABASE_USERNAME = "sringarika";
    private final static String DATABASE_PASSWORD = "root";
    
    @Bean
    public DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(DATABASE_DRIVER);
        ds.setUrl(DATABASE_URL);
        ds.setUsername(DATABASE_USERNAME);
        ds.setPassword(DATABASE_PASSWORD);
        return ds;
    }
    @Bean
    public SessionFactory getSessionFactory(DataSource ds) {
        LocalSessionFactoryBuilder ls = new LocalSessionFactoryBuilder(ds);
        ls.addProperties(getHibernateProperties());
        ls.scanPackages("fullstack.backend.DTO");
        return ls.buildSessionFactory();
    }
    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", DATABASE_DIALECT);
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "false");
        return properties;
    }
    @Bean
    public HibernateTransactionManager getTransactionManager(SessionFactory sf) {
        HibernateTransactionManager ht = new HibernateTransactionManager(sf);
        
        return ht;
    }

}
