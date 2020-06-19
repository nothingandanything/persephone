<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	共${ bean.totalCount }种商品
	<table>
		<tr>
			<c:forEach items="${ bean.productList }" var="drink" varStatus="vs">
				<td>
					名称：${drink.drinkName}, 价格：${drink.drinkPrice}, 类型：${drink.drinkType}, 
					甜度：${drink.drinkSweet}, 温度：${drink.drinkTemp}, 规格：${drink.drinkSpec},
					描述：${drink.drinkDesc}, 图片：${drink.picAddres}
				</td>
			</c:forEach>
		</tr>
	</table>
	<div>
		<ul>
			<c:if test="${bean.currentPage!=1}">
				<a href="${pageContext.request.contextPath}/search?currentPage=${bean.currentPage-1}&searchfield=${bean.searchfield}">上一页</a>
			</c:if>
			<c:if test="${bean.currentPage==1}">
				上一页
			</c:if>
			<li>${ bean.currentPage }</li>
			<c:if test="${bean.currentPage!=bean.totalPage&&bean.totalPage!=0}">
				<a href="${pageContext.request.contextPath}/search?currentPage=${bean.currentPage+1}&searchfield=${bean.searchfield}">下一页</a>
			</c:if>
			<c:if test="${bean.currentPage==bean.totalPage||bean.totalPage==0}">
				下一页
			</c:if>
		</ul>
	</div>
</body>
</html>