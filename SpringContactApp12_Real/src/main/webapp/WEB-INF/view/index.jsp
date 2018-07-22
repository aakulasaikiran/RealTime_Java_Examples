<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login - Contact Application</title>


</head>

<body>
	<table border="1" width="80%" align="center">
		<tr>
			<td height="80px" bgcolor="cyan" >
			<img  src="/resources/images/bg.jpg">
				<%-- Header --%> <jsp:include page="include/header.jsp" />
			</td>
		</tr>
		<tr>
			<td height="25px">
				<%-- Menu --%> <jsp:include page="include/menu.jsp" />
			</td>
		</tr>
		<tr>
			<td height="350px" valign="top">
				<h3 style="color: red;">User Login</h3> <c:if test="${err!=null}">
					<p>${err}</p>
				</c:if> <c:if test="${param.act eq 'lo'}">
					<p class="success">Logout Successfully! Thanks For Using
						Contact Application</p>
				</c:if> <c:if test="${param.act eq 'reg'}">
					<p class="success">Registration Successfully Complited. Please
						login</p>
				</c:if> <s:url var="url_login" value="/login" /> <f:form
					action="${url_login}" modelAttribute="command">
					<table border="1">
						<tr>
							<td>Username</td>
							<td><f:input path="loginName" /></td>
						</tr>

						<tr>
							<td>Password</td>
							<td><f:password path="password" /></td>
						</tr>


						<tr>

							<td colspan="2" align="right"><button>Login</button> <br />
								<a href="#">New User Registration </a></td>
						</tr>


					</table>


				</f:form>

			</td>
		</tr>
		<tr>
			<td height="25px">
				<%-- Footer --%> <jsp:include page="include/footer.jsp" />
			</td>
		</tr>
	</table>
</body>
</html>
