<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="hello2?search=점심먹자">점심먹자</a><br/>
<form action="/hello2">
    <label for="search">post 점심먹자</label>
    <input type="text" name="search">
    <input type="submit">
</form>
</body>
</html>