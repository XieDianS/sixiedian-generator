## 写一个模板项目的代码生成器 CLI

### 1 准备一个 template 项目

写一个简单的Spring boot模板项目——链接一个 MySQL 数据库的一个表，实现增删改查。

相关 Spring JPA、 Spring boot Web、 Lombok、MySQL Diver 依赖:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webmvc</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webmvc-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### 2 模板项目的 generator CLI 工具

分析模板项目需要动态修改的参数，写一个 CLI 工具。
用户在终端依次输入参数，生成项目，输出到 output 目录下

#### 分析代码生成器如何生成

排除 target、 .vscode 目录等非源代码目录

需要动态修改的文件

1. pom.xml： 项目信息——名称、作者、描述
2. application.yml: MySQL端口号、数据库名称、用户名、密码
<<<<<<< HEAD
<<<<<<< HEAD
3. data.sql、shema.sql: 数据库名称、表格名称

其他目录文件， 原样复制
=======
3. data.sql、shema.sql: 数据库名称、表格名称
>>>>>>> 31c43cbaa0aac45a37fcd895f36188d8ed8e30c9
=======
3. data.sql、shema.sql: 数据库名称、表格名称
>>>>>>> 31c43cbaa0aac45a37fcd895f36188d8ed8e30c9
