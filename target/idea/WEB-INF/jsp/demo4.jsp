
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="demo4" modelAttribute="user">
    编号：<s:input path="id"/><br>
    爱好：<s:checkboxes path="loves" items="${allLoves}"/><br>
    cs:<s:select path="cityId">
    <s:option value="0">请选择</s:option>
            <s:options items="${cityList}" itemValue="id" itemLabel="name"></s:options>

        </s:select>
    性别：<s:radiobuttons path="sex" items="${['男','女']}"/>
    <input type="submit" value="提交">
    
</s:form>
</body>
</html>
