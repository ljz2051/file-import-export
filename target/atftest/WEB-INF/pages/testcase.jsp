<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%
    //String  path = request.getContextPath();

%>
<html>
<head>
    <title>testcase</title>
</head>
<body>
<form action="testcaseController/insert" method="post">
    ID<input type="number" name="id"/><br/>
    编号<input type="number" name="casecode"><br/>
    优先级
    <select name="prio">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
    </select>
    <button type="submit">确定</button>
</form>
</body>
</html>