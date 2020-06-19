<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Home</title>

    <!-- Fav Icons -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/client/img/favicon.png" type="image/x-icon">
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/client/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/client/css/responsive.css">

        <header class="main-header">
            <div class="container">
                <div class="header-inner">
                    <div class="logo">
                        <a href="${pageContext.request.contextPath}/client/index.jsp"><img style = "width:125px;height:50px;" src="${pageContext.request.contextPath}/client/img/logo1.1.jpg" alt="Main Logo"></a>
                    </div>
                    
                    <div class="categories">
                        <button ><i class="flaticon-list"></i>
                        <span>Categories</span></button>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-apple"></i> Fruits and Vegetables</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-chicken-hand-drawn-outline"></i> Meat and Fish</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-pressure-washer"></i> Home and Cleaning</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-pest"></i> Pest Control</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-stationery"></i> Office Products</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-make-up"></i> Beauty Products</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-first-aid-kit"></i> Health Products</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-track"></i> Pet Care</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-sketch"></i> Home Appliances</a></li>
                            <li><a href="${pageContext.request.contextPath}/client/shop.jsp"><i class="flaticon-baby-boy"></i> Baby Care</a></li>
                        </ul>
                    </div>
                    
                    <form action="#" class="menu-search">
                        <select name="select-category">
                            <option value="option-1">All Categories</option>
                            <option value="option-2">Fruits and Vegetables</option>
                            <option value="option-3">Meat and Fish</option>
                            <option value="option-4">Home and Cleaning</option>
                            <option value="option-5">Pest Control</option>
                            <option value="option-6">Office Products</option>
                            <option value="option-7">Beauty Products</option>
                            <option value="option-8">Health Products</option>
                            <option value="option-9">Pet Care</option>
                            <option value="option-10">Home Appliances</option>
                            <option value="option-11">Baby Care</option>
                        </select>
                        <input type="search" placeholder="Search" required>
                        <button type="submit" >Search</button>
                    </form>
                    
                    <div class="menu-collections">
                        <div class="collection-item cart">
                            <i class="flaticon-shopping-cart"></i>
                            <div class="collection-inner">
                                <div class="alert single-collection">
                                    <button data-dismiss="alert"><i class="flaticon-delete-button"></i></button>
                                    <div class="collection-image">
                                        <img src="${pageContext.request.contextPath}/client/img/shop/cart-1.png" alt="">
                                    </div>
                                    <div class="collection-content">
                                        <p>Danish Full Cream Milk</p>
                                        <h6>$120.00</h6>
                                    </div>
                                </div>
                                <div class="alert single-collection">
                                    <button data-dismiss="alert"><i class="flaticon-delete-button"></i></button>
                                    <div class="collection-image">
                                        <img src="${pageContext.request.contextPath}/client/img/shop/cart-2.png" alt="">
                                    </div>
                                    <div class="collection-content">
                                        <p>Healthy Yellow Papaya</p>
                                        <h6>$120.00</h6>
                                    </div>
                                </div>
                                <div class="collection-btn">
                                    <a href="${pageContext.request.contextPath}/client/cart.jsp" class="theme-btn bg-blue no-shadow mr-10">View Cart</a>
                                    <a href="${pageContext.request.contextPath}/client/checkout.jsp" class="theme-btn ml-auto no-shadow">Checkout</a>
                                </div>
                            </div>
                        </div>
                        <div class="collection-item profile">
                            <i class="flaticon-user-1"></i>
                            <div class="collection-inner">
                                <ul>
                                    <li><a href="${pageContext.request.contextPath}/client/cart.jsp">购物车</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/checkout.jsp">支付</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/login.jsp">登录</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/register.jsp">注册</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    
                    <div class="main-menu">
                        <button style = "background:#FF9933;"><i class="flaticon-list-menu"></i></button>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/client/index.jsp">Home</a></li>
                            <li class="dropdown"><a href="#">Blog</a>
                                <ul>
                                    <li><a href="${pageContext.request.contextPath}/client/blog.jsp">All Blog</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/blog-details.jsp">Blog Details</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="#">Shop</a>
                                <ul>
                                    <li><a href="${pageContext.request.contextPath}/client/shop.jsp">Shop Page</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/shop-details.jsp">Shop Details</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/cart.jsp">Cart Page</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/checkout.jsp">Checkout</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="${pageContext.request.contextPath}/client/#">Pages</a>
                                <ul>
                                    <li><a href="${pageContext.request.contextPath}/client/sign-in.jsp">Sign In</a></li>
                                    <li><a href="${pageContext.request.contextPath}/client/sign-up.jsp">Sign Up</a></li>
                                </ul>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/client/contact.jsp">Contact</a></li>
                        </ul>
                        <div class="menu-overlay"></div>
                    </div>
                </div>
            </div>
            <div class="collection-close"></div>
        </header>