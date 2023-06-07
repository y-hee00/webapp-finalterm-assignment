<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>환자 목록 전체 조회</h1>
<table>
    <tr>
        <th>환자번호</th>
        <th>환자명</th>
        <th>생년월일</th>
        <th>성별</th>
        <th>처치내용</th>
        <th>전화번호</th>
        <th>진료과코드</th>
        <th>입퇴원여부</th>
    </tr>
    <c:forEach items="${ requestScope.memberlist}" var="member">
        <tr>
            <td>${ member.memberCode }</td>
            <td>${ member.memberName }</td>
            <td>${ member.birthDate }</td>
            <td>${ member.gender }</td>
            <td>${ member.detailInfo }</td>
            <td>${ member.phone }</td>
            <td>${ member.teamCode }</td>
            <td>${ member.activeStatus }</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
