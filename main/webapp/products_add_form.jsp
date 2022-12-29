<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add form</title>
</head>
<body>
<form action="product_add.jsp" method="post">
<div>
<label>Product Id</label>
<input type="text" name="pid">
</div>
<div>
<label>Product Name</label>
<input type="text" name="pname">
</div>
<div>
<label>Quantity</label>
<input type="text" name="pqty">
</div>
<div>
<label>Price</label>
<input type="text" name="pprice">
</div>
<div>
<label>Date </label>
<input type="text" name="pdate">
</div>
<button type="submit">Add</button>

</form>

</body>
</html>