<%@ page import="se.distansakademin.models.Person" %>
<%@ page import="se.distansakademin.models.Person" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Details</title>
</head>
<body>

<h1>Person details</h1>

<% for (Person person : (List<Person>) request.getAttribute("persons")) { %>

<p>
  <%= person.getFirstName() %>
  <%= person.getYear() %>
  <a href="?action=update&id=<%= person.getId() %>">Update</a>
</p>

<% } %>

<br>

<a href="?action=create">Create person</a>


</body>
</html>
