<%@page import="com.parag.service.ProductsServiceImpli"%>
<%@page import="com.parag.service.ProductService"%>

<%
String p1 = request.getParameter("ref");
int id2 = Integer.parseInt(p1);
ProductService productService = new ProductsServiceImpli();
productService.removeByPId(id2);
response.sendRedirect("product_list.jsp");

%>