<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

환자번호 : ${ requestScope.selecteMember.memberCode }<br>
환자명 : ${ requestScope.selecteMember.memberName }<br>
생년월일 : ${ requestScope.selecteMember.birthDate }<br>
성별 : ${ requestScope.selecteMember.gender }<br>
처치내용 : ${ requestScope.selecteMember.detailInfo }<br>
진료과코드 : ${ requestScope.selecteMember.teamCode }<br>

</body>
</html>
