<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script> 
	$(document).ready(function(){
		$("#button").click(function(){
			$.ajax({
				  type: "GET",
				  dataType: "json",
				  url: "PushServlet",
				  success: function(msg){
					  for(var i = 0; i < msg.length; i++){
						  $("#h").append("<p>"+msg[i]+"</p>");
					  }
				  }
			});
		})
	})
</script>
</head>
<body>
	<button id="button">点这里</button>
	<h4 id="h"></h4>
</body>
</html>