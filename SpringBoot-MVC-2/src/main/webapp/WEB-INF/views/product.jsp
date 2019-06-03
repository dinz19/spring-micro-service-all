<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Information</h1> <hr/>
	<table border=1>
		<tr>
			<th>Product Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Descriptin</th>
		</tr>

		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td>${product.price}</td>
			<td>${product.description }</td>
		</tr>

	</table>

	<h2>
		<a href="loadForm">Add Another Record</a>
	</h2>


</body>

</html>