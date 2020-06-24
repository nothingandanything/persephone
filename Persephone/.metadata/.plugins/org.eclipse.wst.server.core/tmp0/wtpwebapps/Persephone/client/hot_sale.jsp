<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!--==================================================================== 
            Start Special Offer Section
        =====================================================================-->
        <section class="special-offer text-center pt-80 rpt-70 pb-35">
            <div class="container">
                <div class="section-title mb-15">
                    <div class="row">
                      <div class="col-md-1"></div>
                      <div class="col-md-1"></div>
                      <div class="col-md-1"></div>
					  <div class="col-md-6 notice b1 br5">
					  <h3>公告栏</h3>
						  <div class="notice-slider">		
						  <c:forEach items="${noticeList}" var="n">				    
						  	<div class="notice-item">
						  	 <h4 style="color:#292633;" class="text-left ml-20" >${n.title}</h4>
						  	 <h5 style="color:#292633;" class="text-left ml-20" >${n.details}</h5>
						    </div>	
						   </c:forEach>				   
						  </div>
					
                      </div>
                     
                      <div class="col-md-1"></div>
                      <div class="col-md-1"></div>
                      <div class="col-md-1"></div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-lg-10">
						<h2>本周热卖</h2>
                        <div class="special-offer-inner special-offer-slider">


                            <!--single Product -->
                            <div class="single-product">
                                <div class="special-offer-product bg-white m-25 p-25 b1 br-5">
                                    <div class="off">10%<span>off</span></div>
                                    <div class="product-img-wrap">
                                        <img style = "width:220px;height:215px;" src="${pageContext.request.contextPath}/client/img/drink/drink1.jpg" alt="img">
                                    </div>
                                    <div class="product-content">
                                        <div class="offer-product-price">
                                            <span class="discounted-price">￥18</span>
                                            <span class="actual-price has-discount">￥20</span>
                                        </div>
                                        <p>巧克力奶霜拿铁 </p>
                                    </div>
                                    <div class="product-action">
                                        <a href="${pageContext.request.contextPath}/client/#" class="add-to-btn">加入购物车</a>
                                       
                                    </div>
                                </div>
                            </div>


                            <!--single Product -->
                            <div class="single-product">
                                <div class="special-offer-product bg-white m-25 p-25 b1 br-5">
                                    <div class="off">10%<span>off</span></div>
                                    <div class="product-img-wrap">
                                        <img style = "width:220px;height:215px;" src="${pageContext.request.contextPath}/client/img/drink/drink2.jpg" alt="img">
                                    </div>
                                    <div class="product-content">
                                        <div class="offer-product-price">
                                            <span class="discounted-price">￥9</span>
                                            <span class="actual-price has-discount">￥10</span>
                                        </div>
                                        <p>冻柠绿茶</p>
                                    </div>
                                    <div class="product-action">
                                        <a href="${pageContext.request.contextPath}/client/#" class="add-to-btn">加入购物车</a>
                                        
                                    </div>
                                </div>
                            </div>


                            <!--single Product -->
                            <div class="single-product">
                                <div class="special-offer-product bg-white m-25 p-25 b1 br-5">
                                    <div class="off">10%<span>off</span></div>
                                    <div class="product-img-wrap">
                                        <img style = "width:220px;height:215px;" src="${pageContext.request.contextPath}/client/img/drink/drink3.jpg" alt="img">
                                    </div>
                                    <div class="product-content">
                                        <div class="offer-product-price">
                                            <span class="discounted-price">￥22</span>
                                            <span class="actual-price has-discount">￥25</span>
                                        </div>
                                        <p>奥利奥星冰乐</p>
                                    </div>
                                    <div class="product-action">
                                        <a href="${pageContext.request.contextPath}/client/#" class="add-to-btn">加入购物车</a>
                                        
                                    </div>
                                </div>
                            </div>


                            <!--single Product -->
                            <div class="single-product">
                                <div class="special-offer-product bg-white m-25 p-25 b1 br-5">
                                    <div class="off">10%<span>off</span></div>
                                    <div class="product-img-wrap">
                                        <img style = "width:220px;height:215px;" src="${pageContext.request.contextPath}/client/img/drink/drink4.jpg" alt="img">
                                    </div>
                                    <div class="product-content">
                                        <div class="offer-product-price">
                                            <span class="discounted-price">￥18</span>
                                            <span class="actual-price has-discount">￥20</span>
                                        </div>
                                        <p>奥利奥奶盖茶</p>
                                    </div>
                                    <div class="product-action">
                                        <a href="${pageContext.request.contextPath}/client/#" class="add-to-btn">加入购物车</a>
                                        
                                    </div>
                                </div>
                            </div>


                            <!--single Product -->
                            <div class="single-product">
                                <div class="special-offer-product bg-white m-25 p-25 b1 br-5">
                                    <div class="off">10%<span>off</span></div>
                                    <div class="product-img-wrap">
                                        <img style = "width:220px;height:215px;" src="${pageContext.request.contextPath}/client/img/drink/drink5.png" alt="img">
                                    </div>
                                    <div class="product-content">
                                        <div class="offer-product-price">
                                            <span class="discounted-price">￥18</span>
                                            <span class="actual-price has-discount">￥20</span>
                                        </div>
                                        <p>醇奶可可</p>
                                    </div>
                                    <div class="product-action">
                                        <a href="${pageContext.request.contextPath}/client/#" class="add-to-btn">加入购物车</a>
                                        
                                    </div>
                                </div>
                            </div>

                        </div>
                        
                    </div>
                </div>

            </div>
        </section>
        <!--==================================================================== 
            End Special Offer Section
        =====================================================================-->