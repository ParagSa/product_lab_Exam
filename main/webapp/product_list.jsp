<%@page import="com.parag.model.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.parag.service.ProductsServiceImpli" %>
    <%@page import="com.parag.service.ProductService" %>
    <% 
    ProductService productService = new ProductsServiceImpli();
    List<Products> products= productService.getAll(0);{
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list</title>
</head>
<body>
<table>
<thead>
<tr>
<th>Product id </th>
<th>Product name</th>
<th>Product Quantity</th>
<th>Price</th>
<th>date of purchase</th>
</tr>
</thead>
<tbody>
<% for(Products prod: products){ %>
<tr>
<td><%=prod.getPid() %></td>
<td><%=prod.getPname()%></td>
<td><%=prod.getPqty() %></td>
<td><%=prod.getPprice()   %></td>
<td><%=prod.getPdate() %></td>
<td><a href="prod_delete.jsp?ref=<%=prod.getRef()%>">Delete</a></td>
<td><a href="product_update_form.jsp?ref=<%=prod.getRef()%>">edit</a></td>
</tr>
<%} %>
</tbody>

</table>

</body>
</html>
<%}%>