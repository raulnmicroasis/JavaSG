package com.skynet.javafx.utilities.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource createDataSource() throws Exception {
        ComboPooledDataSource ds = new ComboPooledDataSource();


        ds.setJdbcUrl("jdbc:ucanaccess://C:/WASOIL/wasoil.mdb;memory=false");
        ds.setDriverClass("net.ucanaccess.jdbc.UcanaccessDriver");

        return ds;

    }

}
