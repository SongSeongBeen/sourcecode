$.ajax({
	      url : "${pageContext.request.contextPath}/api/gb/add",      
	      type : "post",
	      contentType : "application/json",
	      data : {name: ”홍길동"},
	
	      dataType : "json",
	      success : function(result){
	         /*성공시 처리해야될 코드 작성*/
	      },
	      error : function(XHR, status, error) {
	         console.error(status + " : " + error);
	      }
});
