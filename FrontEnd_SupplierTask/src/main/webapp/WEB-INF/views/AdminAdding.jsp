<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<jsp:include page="header.jsp"/>

		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					</button>	
					<a class="navbar-brand" href="#">Online Shopping</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="${contextRoot}/admin/welcome">Admin</a></li>
					<li><a href="#">Category</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
				</div>
			</div>
		</nav>
		
	
		<div class="container1" align="center" >
			<h1>Admin Adding Page</h1>
		</div>
		<div id="exTab1" class="container">
			<ul class="nav nav-pills">
				<li class="active">
					<a href="#a1" data-toggle="tab">Product</a>
				</li>
				<li>
					<a href="#2a" data-toggle="tab">Category</a>
				</li>
				<li>
					<a href="#3a" data-toggle="tab">Supplier</a>
				</li>
			</ul>
			
			<div class="tab-content clearfix">
				<div class="tab-pane active" id="a1">
					<h3>Add Product</h3>
					<form class="form-horizontal" action="${contextRoot}/admin/addProduct" method="post" enctype="multipart/form-data">
						<div class="form-group">
							<label class="control-label col-sm-4" for="productName">Product Name :  </label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="productName" placeholder="Enter Product Name" name="productName"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="description">Description :  </label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="description" placeholder="Enter Description" name="description"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="price">Price :  </label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="price" placeholder="Enter Price" name="price"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="quantity">Quantity :  </label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="quantity" placeholder="Enter Quantity" name="quantity"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="category">Category :  </label>
							<div class="col-sm-6">
								<select id="category" name="category" class="form-control">
									<option value="none">---Choose Category---</option>
									<c:forEach items="${categoryList}" var="category">
										 <option value="${category.categoryId}">Category : ${category.categoryName}</option>	
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="supplier">Supplier :  </label>
							<div class="col-sm-6">
								<select id="supplier" name="supplier" class="form-control">
									<option value="none">---Choose Supplier---</option>
									<c:forEach items="${supplierList}" var="supplier">
										 <option value="${supplier.supplierId}">Supplier : ${supplier.supplierName}</option>	
									</c:forEach>
								</select>
							</div>
						</div>
						 <div class="form-group">
							<label class="control-label col-sm-4" for="pimage">Upload Image :  </label>
							<div class="col-sm-6">
								<input type="file" class="form-control" id="file" placeholder="Upload Product Image" name="file"/>
							</div>
						</div> 
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Add Product</button>
							</div>
						</div>
					</form>

				</div>
				<div class="tab-pane" id="2a">
					<h3>Add Category</h3>
					<form:form class="form-horizontal" action="${contextRoot}/admin/addCategory" method="post" modelAttribute="categoryObj">
						<div class="form-group">
							<label class="control-label col-sm-4" for="categoryId">Category Id :  </label>
							<div class="col-sm-6">
								<form:input path="categoryId" class="form-control" id="categoryId" placeholder="Enter Category Id" name="categoryId"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="categoryName">Category Name :  </label>
							<div class="col-sm-6">
								<form:input path="categoryName" class="form-control" id="categoryName" placeholder="Enter Category Name" name="categoryName"/>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Add Category</button>
							</div>
						</div>
					</form:form>
				</div>
				<div class="tab-pane" id="3a">
					<h3>Add Supplier</h3>
					<form:form class="form-horizontal" action="${contextRoot}/admin/addSupplier" method="post" modelAttribute="supplierObj">
						<div class="form-group">
							<label class="control-label col-sm-4" for="supplierId">Supplier Id :  </label>
							<div class="col-sm-6">
								<form:input path="supplierId" class="form-control" id="supplierId" placeholder="Enter Supplier Id" name="supplierId"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="supplierName">Supplier Name :  </label>
							<div class="col-sm-6">
								<form:input path="supplierName" class="form-control" id="supplierName" placeholder="Enter Supplier Name" name="supplierName"/>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Add Supplier</button>
							</div>
						</div>
					</form:form>
					
				</div>
			</div> 
			
		</div>
		
		<!-- <footer class="footer">
      <div class="container">
        <p align="center">Created by Divya Garg</p>
      </div>
    </footer> -->
		
		
	</body>
	
</html>