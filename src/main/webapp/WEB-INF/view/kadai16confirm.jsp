<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dto.kadai16" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。宜しければ確認ボタンをおしてください</p>
	<%
		kadai16 customer = (kadai16)session.getAttribute("input_data");
	%>
	名前:<%=customer.getName() %><br>
	年齢:<%=customer.getAge() %><br>
		<%
		String genderStr = request.getParameter("gender");
		int ge = Integer.parseInt(genderStr);
		String gender = ge == 1 ?"男":"女";
		%>
		性別:
		<%=customer.getGender() %><br>
		<br>
		電話番号:<%=customer.getTel() %><br>
		メールアドレス:<%=customer.getMail() %><br>
		パスワード:********<br>
		
		<a href="kadai16ExecuteServlet">確認</a>
		<a href="kadai16FormServlet">戻る</a>

</body>
</html>