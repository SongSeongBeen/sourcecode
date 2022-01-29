 Insert 후,  새로들어 간 row의 Primary Key를 받아야 하는 경우  


<insert id="insert" parameterType="GuestbookVo">
	<selectKey keyProperty="no" resultType=“int" order="BEFORE">	
		select seq_guestbook_no.nextval from dual
	</selectKey>
	<![CDATA[	
		insert
            	into guestbook
         	values ( #{no }, #{name }, #{password }, #{content }, SYSDATE )
    	]]>
</insert>
