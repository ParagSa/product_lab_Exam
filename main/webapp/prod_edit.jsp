<%@page import="com.parag.service.ProductsServiceImpli"%>
<%@page import="com.parag.service.ProductService"%>
<jsp:useBean id="products"  class="com.parag.model.Products"></jsp:useBean>
<jsp:setProperty property="*"    name="products"  />
<%
ProductService productservice = new ProductsServiceImpli();
productservice.renew(products);
response.sendRedirect("product_list.jsp");
%>