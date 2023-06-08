<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

<h3>MEMBER_INFO 테이블에서 전체 환자 정보 조회</h3>
<button onclick="location.href='${pageContext.servletContext.contextPath}/member/allList'">전체환자 조회하기</button>

<h3>MEMBER_INFO 테이블에서 입원 환자 전체 정보 조회</h3>
<button onclick="location.href='${pageContext.servletContext.contextPath}/member/list'">입원환자 조회하기</button>

<h3>MEMBER_INFO 테이블에서 MEMBER_CODE를 이용하여 환자 정보 조회해오기</h3>
<form action="member/select">
    <label>조회할 환자코드 : </label>
    <input type="text" name="memberCode" id="memberCode">
    <button type="submit">조회하기</button>
</form>

<h3>MEMBER_INFO 테이블에서 신규 환자 정보 추가</h3>
<form action="${ pageContext.servletContext.contextPath }/member/insert" method="post">
    환자명 : <input type="text" name="memberName"><br>
    생년월일 : <input type="date" name="birthDate"><br>
    성별 : <input type="text" name="gender"><br>
    처치내용 : <input type="text" name="detailInfo"><br>
    전화번호 : <input type="tel" name="phone"><br>
    진료과코드 :
    <select name="teamCode">
        <option value="1">외과</option>
        <option value="2">내과</option>
        <option value="3">피부과</option>
        <option value="4">정형외과</option>
    </select>
    <br>
    <button type="submit">등록하기</button>
</form>

<h3>MEMBER_INFO 테이블에서 환자 입/퇴원 정보 수정</h3>
<form action="${ pageContext.servletContext.contextPath }/member/update" method="post">
    환자코드 : <input type="text" name="memberCode"><br>
    입퇴원여부 : <input type="text" name="activeStatus"><br>
    <button type="submit">수정하기</button>
</form>


<h3>MEMBER_INFO 테이블에서 환자 정보 삭제</h3>
<form action="${ pageContext.servletContext.contextPath }/member/delete" method="post">
    환자코드 : <input type="text" name="memberCode"><br>
    <button type="submit">삭제하기</button>
</form>


</body>
</html>
