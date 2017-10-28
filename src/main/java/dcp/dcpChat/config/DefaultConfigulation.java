package dcp.dcpChat.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DefaultConfigulation {
    /**
     * {@link SqlSessionTemplate}(マスターデータ)
     *
     * @return {@link SqlSessionTemplate}
     * @throws Exception {@link SqlSessionTemplate}の生成失敗
     */
    @Bean
    public SqlSessionTemplate masterSqlSessionTemplate() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis/mybatis_config.xml"));
        sqlSessionFactory.setDataSource(masterDataSource());
        return new SqlSessionTemplate(sqlSessionFactory.getObject());
    }

    /**
     * {@link SqlSessionTemplate}(ユーザーデータ)
     *
     * @return {@link SqlSessionTemplate}
     * @throws Exception {@link SqlSessionTemplate}の生成失敗
     */
    @Bean
    public SqlSessionTemplate userSqlSessionTemplate() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis/mybatis_config.xml"));
        sqlSessionFactory.setDataSource(userDataSource());
        return new SqlSessionTemplate(sqlSessionFactory.getObject());
    }

    /**
     * DB接続設定
     *
     * @return {@link DataSource}
     */
    @Bean
    @Primary
    protected DataSource datasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // 接続先情報を設定
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("pw");
        dataSource.setUrl("jdbc:mysql://localhost:33060?useSSL=false");
        return dataSource;
    }

    /**
     * DB接続設定(ユーザーデータ)
     *
     * @return {@link DataSource}
     */
    @Bean
    protected DataSource userDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // 接続先情報を設定
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("pw");
        dataSource.setUrl("jdbc:mysql://localhost:33060/dcpchat_db?useSSL=false");
        return dataSource;
    }

    /**
     * DB接続設定(マスターデータ)
     *
     * @return {@link DataSource}
     */
    @Bean
    protected DataSource masterDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // 接続先情報を設定
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("pw");
        dataSource.setUrl("jdbc:mysql://localhost:33060/dcpchat_db?useSSL=false");
        return dataSource;
    }
}
