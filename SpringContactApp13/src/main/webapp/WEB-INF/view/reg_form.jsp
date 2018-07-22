<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">

<title>User Registration - Contact Application</title>

</head>

<s:url var="url_css" value="./images/reg3.jpg" />

<body  background="${url_css}">
	<table border="1" width="80%" align="center">
		<tr>
			<td height="80px">
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
				<%-- Page Content Area--%>
				<h3>User Registration</h3> <c:if test="${err!=null}">
					<p class="error">${err}</p>
				</c:if> <%-- <c:if test="${param.act eq 'lo'}">
					<p class="success">Logout Successfully! Thanks For Using
						Contact Application</p>
				</c:if> --%> <s:url var="url_reg" value="/register" /> <f:form
					action="${url_reg}" modelAttribute="command">
					<table border="1">
					<tr>
							<td>Name</td>
							<td><f:input path="user.name" /></td>
						</tr>
						<tr>
							<td>Phone</td>
							<td><f:input path="user.phone" /></td>
						</tr>
						<tr>
							<td>Email</td>
							<td><f:input path="user.email" /></td>
						</tr>
						<tr>
							<td>Address</td>
							<td><f:textarea path="user.address" /></td>
						</tr>
						<tr>
							<td>Username</td>
							<td><f:input path="user.loginName" /></td>
						</tr>

						<tr>
							<td>Password</td>
							<td><f:password path="user.password" /></td>
						</tr>

						
						<tr>

							<td colspan="2" align="right">
								<button>Submit</button>
							</td>
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
