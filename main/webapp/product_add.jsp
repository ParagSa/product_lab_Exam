<%@page import="com.parag.service.ProductsServiceImpli"%>
<%@page import="com.parag.service.ProductService"%>
<jsp:useBean id="product" class="com.parag.model.Products"></jsp:useBean>
<jsp:setProperty property="*" name="product"/>
<%
ProductService proService = new ProductsServiceImpli();
proService.add(product);
response.sendRedirect("product_list.jsp");
%>