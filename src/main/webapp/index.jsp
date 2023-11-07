<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<br/>
<form method="post" action="display-discount">
    <label>Product Description</label>
    <input type="text" name="description" placeholder="description"/><br>
    <label>List Price</label>
    <input type="number" name="price" placeholder="price"/><br>
    <label>Discount Percent</label>
    <input type="number" name="percent" placeholder="percent"/><br>
    <input type="submit" name="submit" value="Send"/>
</form>
</body>
</html>