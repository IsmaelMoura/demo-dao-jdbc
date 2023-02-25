# Demo DAO JDBC
This repository contains a demo of how to use DAO with JDBC conecting MySQL Database

## About project

### IDE
- IntelliJ IDEA Community Edition 2022.1.4

### JDK
- OpenJDK Runtime Environment Zulu17.38+21-CA (build 17.0.5+8-LTS)

### MySQL Connector
- Version: 8.0.32

## How to test

### Install MySQL
You will need MySQL Workbeench to visualize all database information.
- Link to download: https://dev.mysql.com/downloads/installer/

### Download MySQL Connector for Java
To connect MySQL database with Java, we need MySQL Connector and JDBC API.

- Link to download MySQL Connector: https://dev.mysql.com/downloads/connector/j/

After download, put the connector in the external project libraries.

### Run SQL Script
In MySQL Workbeench, execute SQL script to create database, tables and insert data.

- [SQL Script](database.sql)

### Run [DeparmentTests](./src/application/DepartmentTests.java) and [SellerTest](./src/application/SellerTest.java)
Now you can run this classes to se all methods tests to do a simple CRUD in MySQL with Java.
