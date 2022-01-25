//POM.xml DB데이터 통신
/////////////////////////Oracle 관련 pom.xml : 라이브러리 추가 -->/////////////////////////////
<!-- Oracle JDBC -->
<dependency>
	<groupId>com.oracle.database.jdbc</groupId>
	<artifactId>ojdbc6</artifactId>
	<version>11.2.0.4</version>
</dependency>

//////////////////////// Java Data Access Layer pom.xml : 라이브러리 추가 -->///////////////////////	

<!-- spring jdbc -->
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-jdbc</artifactId>
<version>${org.springframework-version}</version>
</dependency>

//<!-- Mybatis 설정 pom.xml : 라이브러리 추가 -->

<!-- MyBatis -->
<dependency>
<groupId>org.mybatis</groupId>
<artifactId>mybatis</artifactId>
<version>3.2.2</version>
</dependency>

<dependency>
<groupId>org.mybatis</groupId>
<artifactId>mybatis-spring</artifactId>
<version>1.2.0</version>
</dependency>

///////////////////////////////////////////////////////////////

