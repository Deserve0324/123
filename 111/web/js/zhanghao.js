$(function(){
	$("#name").change(function(){//验证账号是否重复
		var loginIdZ = /^[a-zA-Z]{0}([a-zA-Z0-9]|[_]){5,17}$/;
		var loginId = this.value;
		var inputId = "#name";
		var setHtmlId = "#loginId_text";
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
	})