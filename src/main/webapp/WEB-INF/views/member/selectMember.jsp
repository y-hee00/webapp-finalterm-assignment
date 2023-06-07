<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

환자번호 : ${ requestScope.memberList.memberCode }<br>
환자명 : ${ requestScope.memberList.memberName }<br>
생년월일 : ${ requestScope.memberList.birthDate }<br>
성별 : ${ requestScope.memberList.gender }<br>
처치내용 : ${ requestScope.memberList.detailInfo }<br>
진료과코드 : ${ requestScope.memberList.teamCode }<br>

</body>
</html>