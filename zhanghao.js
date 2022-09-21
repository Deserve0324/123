$("#loginid").change(function(){//验证账号是否重复
	var loginIdZ = /^[a-zA-Z]{1}([a-zA-Z0-9]|[_]){5,17}$/;
	var loginId = this.value;
	var inputId = "#loginid";
	var setHtmlId = "#loginId_text";
	var setHtmlText = "该账号已经被注册";
	var inputValue = loginId;
	var keyValue = "loginId" + "="+ inputValue;
	if(!loginIdZ.test(loginId)){
		$(inputId).focus();
		$(inputId).val("");
		$(inputId).attr("placeholder","账号格式不正确！");
		$(inputId).addClass("inp");
	}
});
