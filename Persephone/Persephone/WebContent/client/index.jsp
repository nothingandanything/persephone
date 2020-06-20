<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<div class="page-wrapper">
<!-- Preloader -->
<div class="preloader"></div>
<jsp:include page="head.jsp"></jsp:include>

<jsp:include page="slider.jsp"></jsp:include>

<jsp:include page="hot_sale.jsp"></jsp:include>

<jsp:include page="foot.jsp"></jsp:include>

</div>
<!-- Scroll Top Button -->
    <button class="scroll-top scroll-to-target" data-target="html"><span class="fa fa-angle-up"></span></button>


    <!-- jequery plugins -->
    <script src="${pageContext.request.contextPath}/client/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/client/js/bootstrap-v4.1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/client/js/jquery.nice-select.min.js"></script>
    <script src="${pageContext.request.contextPath}/client/js/jquery.simpleLoadMore.min.js"></script>
    <script src="${pageContext.request.contextPath}/client/js/slick.min.js"></script>
    <script src="${pageContext.request.contextPath}/client/js/appear.js"></script>

    <!-- Custom script -->
    <script src="${pageContext.request.contextPath}/client/js/script.js"></script>

</body>
</html>