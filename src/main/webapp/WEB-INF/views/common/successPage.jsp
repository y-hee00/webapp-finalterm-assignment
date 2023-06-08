<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <script>
      (function() {
          const successCode = '${requestScope.successCode}';

          let successMessage = '';
          let movePath = '';

          switch (successCode){
              case 'insertMember' :
                  successMessage = '신규 환자 등록 성공!';
                  movePath = '${pageContext.servletContext.contextPath}/member/allList';
                  break;
              case 'updateMember' :
                  successMessage = '환자 정보 수정 성공!';
                  movePath = '${pageContext.servletContext.contextPath}/member/allList';
                  break;
              case 'deleteMember' :
                  successMessage = '환자 정보 삭제 성공!';
                  movePath = '${pageContext.servletContext.contextPath}/member/allList';
                  break;
          }

          alert(successMessage);
          location.href = movePath;

      })();
  </script>

</body>
</html>
