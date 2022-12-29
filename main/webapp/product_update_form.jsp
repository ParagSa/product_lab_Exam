<%@page import="java.lang.reflect.Parameter"%>
<%@page import="com.parag.model.Products"%>
<%@page import="com.parag.service.ProductsServiceImpli"%>
<%@page import="com.parag.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String p1= request.getParameter("ref");
    int id2 = Integer.parseInt(p1);
    ProductService productService = new ProductsServiceImpli();
    Products products = productService.getByPidorRef(id2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Update</title>
</head>
<body>
<form action="prod_edit.jsp" method="post">
<input type="hidden" name="ref" value="<%=products.getRef()%>">
<div>
<label>Product Id</label>
<input type="text" name="pid"  value="<%= products.getPid()%>" >
</div>
<div>
<label>Product Name</label>
<input type="text" name="pname"  value="<%= products.getPname() %>"  >
</div>
<div>
<label>Quantity</label>
<input type="text" name="pqty"  value="<%= products.getPqty()%>" >
</div>
<div>
<label>Price</label>
<input type="text" name="pprice"  value="<%= products.getPprice()%>" >
</div>
<div>
<label>Date </label>
<input type="text" name="pdate"   value="<%= products.getPdate()%>" >
</div>
<button type="submit">Update</button>

</form>


</body>
</html>