<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--==================================== Start product-quick-view //product-modal  ================-->
	<div class="modal product-modal fade" id="quick-view" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body p-35 pt-0">

					<div class="product-quick-view">
						<div class="container">
							<div class="row">
								<div class="col-lg-6">
	 								<div class="product-preview-wrap">
										<div class="tab-content bg-white p-50 b1 br-5">
	                                                                        
											<img src="" alt="Product Preview Image" id="PicAddres">
	                                                                        
										</div>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="product-details text-left bg-white ml-25 px-50 py-45 b1 br-5">
										<h3 class="mb-25 rmt-25" id="DrinkName"></h3>
										<!-- 
										<div class="rating mb-25">
											<div class="star mr-15">
												<i class="fa fa-star"></i>
												<i class="fa fa-star"></i>
												<i class="fa fa-star"></i>
												<i class="fa fa-star"></i>
												<i class="fa fa-star"></i>
											</div>
											<div class="text">(13 Review)</div>
										</div>
										 -->
										<p id="DrinkDesc"></p>
	                                                                    
	
										<!-- <h6>Availability: <span>In Stock</span></h6> -->
										<h4 class="price" id="DrinkPrice"></h4>
	
										<div class="product-spinner mt-20">
											<div class="number-input b1">
												<button class="minus"></button>
												<input min="1" name="quantity" value="1" type="number">
												<button class="plus"></button>
											</div>
											<a href="#" class="theme-btn br-30 ml-20">加入购物车</a>
										</div>
										<div class = "choices mt-20" >
											<form action="radio_submit" method = "get">
		                                                                    	
												<li class = "choice-control choice-radio">
													<h6><b>请选择甜度</b> </h6>
													<input type = "radio" class = "choice-control-input" name = "sweet" value = "1" checked> 
													<label class="choice-control-label" for="methodone" data-toggle="collapse" data-target="#collapseOne" aria-controls="collapseOne">全糖</label>
												</li>
												<input type = "radio" name = "sweet" value = "2"> <h7>七分糖</h7></label>
		                                                                    	
												<label>
													<input type = "radio" name = "sweet" value = "3"> <h7>半糖</h7></label>
												<label>
												<input type = "radio" name = "sweet" value = "4"> <h7>三分糖</h7></label>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>

	<!--==================================== end product-quick-view //product-modal  ================-->

</body>
</html>