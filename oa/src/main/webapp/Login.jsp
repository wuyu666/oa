<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台登录</title>
</head>
<script type="text/javascript"  src="js/jquery.min.js"></script>  
<script type="text/javascript">
$(function(){
  $('#btn').click(function(){  
    if($("#tname").val()=="请输入用户名" || $("#tname").val()==""||$("#password").val()=="请输入密码"|| $("#password").val()==""){  
        $("#info").html("用户名不能为空！");  
       return false;  
       
       
   }else{  alert("进了第er个")
      $.ajax({  
           type:"post",  
           url:"${pageContext.request.contextPath }/login/queryLogin",  
           data:{username:$("#tname").val(),password:$("#password").val()}, 
           
           dataType:"text",  
           beforeSend:function(){  
               $("#btn").val("正在提交，请稍等..."); 
           },   
           
           success:function(data){  
        	   alert("进了看看")
               //判断输入是否成功，成功则跳转     
               if("用户名可用!"==data){  
            	   alert("进了跳转")
                   window.location.href="index.jsp";     
               }else{  
                     $("#info").html(data);//html是显示在ID为info的地方
                  $("#btn").val("登录");  
                     
               }                           
          }     
       });  
   }  
    alert("进了第三个")
   })  
})
        
 
</script>
<body>
      <form  method="post">
           <div id="tn">
	           <label>用户名：</label><input name="username" type="text" id="tname" onFocus="this.value = '';"
	           onBlur="if(this.value == '') {this.value = '请输入用户名';}"><br>
           </div>
           
           <div id="key"><label>密&nbsp;&nbsp;&nbsp;码：</label><input name="password" type="text" id="password" onFocus="this.value = '';"
	           onBlur="if(this.value == '') {this.value = '请输入密码';}">
	           <input type="submit" value="登录" id="btn">
	           <!-- 用来显示失败后的信息 -->
	           <span id="info"></span>
           </div>
      </form>
</body>
</html>