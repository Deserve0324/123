var ip,iph,em=0;
$(function(){
	$("#loginid").change(function(){//验证账号是否重复
		var loginIdZ = /^[a-zA-Z]{1}([a-zA-Z0-9]|[_]){5,17}$/;
		var loginId = this.value;
		var inputId = "#loginid";
		var setHtmlId = "#loginId_text";
		var setHtmlText = "该账号已经被注册";
		var inputValue = loginId;
		var keyValue = "loginId" + "="+ inputValue;
//		alert(keyValue);
		if(!loginIdZ.test(loginId)){
			$(inputId).focus();
			$(inputId).val("");
			$(inputId).attr("placeholder","账号格式不正确！");
			$(inputId).addClass("inp");
		}else{
			ip=1;
		}
	});
	
	$("input[id='phoneno']").change(function(){//验证手机号是否已经被使用
		var phoneZ = /^1[3|5|7|8][0-9]{9}$/
		var phone = this.value;
		var inputId = "#phoneno";
		var setHtmlId = "#phone_text";
		var setHtmlText = "该手机号已经被使用";
		var inputValue = phone;
		var dataKey = "phone";
		var keyValue = "phone" + "="+ inputValue;
		if(!phoneZ.test(phone)){
			$(inputId).focus();
			$(inputId).val("");
			$(inputId).attr("placeholder","请正确填写手机号！");
			$(inputId).addClass("inp");
		}else{
		 iph=1;
		}
		
	});
	$("input[id='email']").change(function(){//验证邮箱是否已经被使用
		var emailZ = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
		var email = this.value;
		var inputId = "#email";
		var setHtmlId = "#email_text";
		var setHtmlText = "该邮箱已经被使用";
		var inputValue = email;
		var keyValue = "email="+inputValue;
		if(!emailZ.test(email)){
			$(inputId).focus();
			$(inputId).val("");
			$(inputId).attr("placeholder","请正确填写邮箱地址！");
			$(inputId).addClass("inp");
		}else{
			em=1;
		}
	});

})
function login(){
	if(ip & iph &em){
		alert("注册成功！按确定返回登录界面");
		window.location.href="index.html";
	}
}
