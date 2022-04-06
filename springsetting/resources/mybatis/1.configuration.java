//mybitas폴더에 configuration xml로 파일 만들어서 붙여 넣기

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">

<configuration>
    <typeAliases>
    </typeAliases>

    <mappers>
        <mapper resource="mybatis/mappers/phonebook.xml" />  //사용 경로 추가해주기 
    </mappers>
</configuration>

