package com.store.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import com.store.dao.*;
import com.store.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
While you are developing your DAO layer, you can configure maven to build a jar file
and use this class to perform tests, before moving on to implementing the REST layer.
*/

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        /** TODO:
			You use the provided .sql scripts to create and populate tables.
			Then, you can add calls to your CRUD operations from within this method.

		**/
        /*jdbcTemplate.execute("SHOW TABLES");
        jdbcTemplate.execute("DROP TABLE IF EXISTS products, customers, orders");
        jdbcTemplate.execute("SHOW TABLES");
        jdbcTemplate.execute("CREATE TABLE customers(id SERIAL, fname VARCHAR(255), lname VARCHAR(255), username VARCHAR(255),email VARCHAR(255), UNIQUE(id, username));")
        jdbcTemplate.execute("CREATE TABLE products(itemId SERIAL, name VARCHAR(255), msrp DECIMAL(6,2), salePrice DECIMAL(8,2), \n" +
                "\tupc INT, shortDescription VARCHAR(255), brandName VARCHAR(255), \n" +
                "\tsize VARCHAR(255), color VARCHAR(255), gender VARCHAR(255), UNIQUE(itemId));");
        jdbcTemplate.execute("SHOW TABLES");

        jdbcTemplate.execute("INSERT INTO customers (fname, lname, username,email) VALUES (\"Dr. P\", \"Brown\", \"prbrown\", \"philippa.brown\")");
        jdbcTemplate.execute("SELECT * FROM customers");
        jdbcTemplate.execute("DROP PROCEDURE IF EXISTS insertProducts");
        jdbcTemplate.execute("DELIMITER // CREATE PROCEDURE insertProducts (IN numProducts INT)");
        jdbcTemplate.execute("BEGIN");*/

        jdbcTemplate.execute("SOURCE C:\\Users\\abhik\\WebApp2\\store\\src\\scripts\\createDBTables.sql");
        jdbcTemplate.execute("SOURCE C:\\Users\\abhik\\WebApp2\\store\\src\\scripts\\populateDBTables.sql");


    }
}
