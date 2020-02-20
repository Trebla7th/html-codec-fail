<%--
  Created by IntelliJ IDEA.
  User: brandesa
  Date: 2020-02-20
  Time: 10:12
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>Blah Blah</title>
</head>

<body>

Total objects saved: ${total}<br/>


Failures:
<ul>
<g:each in="${failures}">
  <li>${it.name} - ${it.value}</li>
</g:each>
</ul>

</body>
</html>