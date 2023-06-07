<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

<h3>MEMBER_INFO 테이블에서 환자 전체 정보 조회 (치료중인 환자만 조회할 것) : /member_info/list (get)</h3>
<button onclick="location.href='${pageContext.servletContext.contextPath}/member/list'">환자정보 전체 조회하기</button>

<h3>MEMBER_INFO 테이블에서 MEMBER_CODE를 이용하여 환자 정보 조회해오기</h3>
<form action="member/select">
    <label>조회할 환자코드 : </label>
    <input type="text" name="memberCode" id="memberCode">
    <button type="submit">조회하기</button>
</form>

<h3>MEMBER_INFO 테이블에서 신규 환자 정보 추가 (필요한 정보를 입력받을 수 있는 form을 만들어서 추가할 것) : /member_info/insert (post)</h3>
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
    <button type="submit">신규 환자 등록</button>
</form>

<h3>MEMBER_INFO 테이블에서 환자 정보 수정 (환자코드와 변경할 정보를 입력 받아 코드와 일치하는 환자의 정보 변경 - 원하는 데이터 변경) : /member_info/update (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/member/update" method="post">
    환자코드 : <input type="text" name="memberCode"><br>
    입퇴원여부 : <input type="text" name="activeStatus"><br>
    <button type="submit">입/퇴원 수정</button>
</form>


<h3>MEMBER_INFO 테이블에서 환자 정보 삭제 (환자코드 입력 받아 코드와 일치하는 행 삭제) : /member_info/delete (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/member/delete" method="post">
    환자코드 : <input type="text" name="memberCode"><br>
    <button type="submit">환자 정보 삭제</button>
</form>


</body>
</html>
