var UserNameObj;
var UserPwdObj;
var ReUserPwdObj;
var UserPhoneObj;

var UserNameMsg;
var UserPwdMsg;
var ReUserPwdMsg;
var UserPhoneMsg;

window.onload = function() {	// 页面加载之后, 获取页面中的对象
	UserNameObj = document.getElementById("UserName");
	UserPwdObj = document.getElementById("UserPwd");
	ReUserPwdObj = document.getElementById("ReUserPwd");
	UserPhoneObj = document.getElementById("UserPhone");

	UserNameMsg = document.getElementById("UserNameMsg");
	UserPwdMsg = document.getElementById("UserPwdMsg");
	ReUserPwdMsg = document.getElementById("ReUserPwdMsg");
	UserPhoneMsg = document.getElementById("UserPhoneMsg");
};

function checkForm () {
	var bUserName = checkUserName();
	var bUserPwd = checkUserPwd();
	var bReUserPwd = checkReUserPwd();
	var bUserPhone = checkUserPhone();
	return bUserName && bUserPwd && bReUserPwd && bUserPhone;
}

function checkUserName () {
	var regex = /^.{4,8}$/;  // 任意字符, 4到8位
	var value = UserNameObj.value;
	var msg = "";
	if (!value)
		msg = "必须填写用户名！";
	else if (!regex.test(value))
		msg = "用户名不合法！";
	UserNameMsg.innerHTML = msg;  // 将提示消息放入SPAN
	UserNameObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg = "";
}

function checkUserPwd () {
	var regex = /^.{4,8}$/;  // 任意字符, 4到8位
	var value = UserPwdObj.value;
	var msg = "";
	if (!value)
		msg = "必须填写密码！";
	else if (!regex.test(value))
		msg = "密码不合法！";
	UserPwdMsg.innerHTML = msg;
	UserPwdObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}

function checkReUserPwd() {		// 验证确认密码
	var passwordValue = UserPwdObj.value;
	var confirmValue = ReUserPwdObj.value;
	var msg = "";

    if(!confirmValue){
	    msg = "必须填写确认密码！";
	}
	else	if (passwordValue != confirmValue){
		msg = "密码必须保持一致！";
    }
	ReUserPwdMsg.innerHTML = msg;
	ReUserPwdObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}

function checkUserPhone () {
	var regex = /^[0-9]{11}$/;  // 11位数字
	var value = UserPhoneObj.value;
	var msg = "";
	if (!value)
		msg = "必须填写联系电话！";
	else if (!regex.test(value))
		msg = "联系电话不合法！";
	UserPhoneMsg.innerHTML = msg;
	UserPhoneObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}