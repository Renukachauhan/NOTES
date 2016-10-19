<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NOTES</title>
</head>
<body>
<%@include file="header.jsp" %>


<br>
<br>
<form class="form-horizontal" role="form">
<div class="form-group">
<label for=categoryId" class="control-label col-sm-2">
Category_Id:
</label>
<div class="col-sm-10">
<input type="number"  class="form-control" id="categoryId" />
</div>

<label for=name" class="control-label col-sm-2">
Name:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="name" />
</div>

<label for=description" class="control-label col-sm-2">
Description:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="description" />
</div>

</div>

<%@include file="footer.jsp" %>
</body>

</html>