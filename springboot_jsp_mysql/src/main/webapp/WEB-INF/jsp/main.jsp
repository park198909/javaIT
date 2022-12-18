<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSP를 사용할 땐 타임리프를 추가하지 않는다
spring web, spring dev tool, MySQL Driver, Spring Data JPA
-->
<!-- 
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
 -->
 <!-- src/webapp/WEB-INF/jsp/main.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringBoot JSP MySQL 게시판</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="/">Management</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br><br>
<div class="container">
	<div class="row">
		<h1> 게시판 </h1>	
	</div>
	
	<div class="row">
		<div class="col-lg-3">
			<a href="/new" class="btn btn-primary btn-sm mb-3">등록하기</a>
		</div>
	</div>
	
	<table class="table table-striped table-bordered">
  <thead class="table-dark">
    <tr>
      <th>Name</th>
      <th>Gender</th>
      <th>Phone</th>
      <th>Email</th>
      <th>Actions</th>
    </tr>
  </thead>
  <tbody>
  <!-- jsp 빠른for문 -->
  	<c:forEach items="${users}" var="user">
		<tr>
			<td><c:out value="${user.name}"/></td>
			<td><c:out value="${user.gender}"/></td>
			<td><c:out value="${user.phone}"/></td>
			<td><c:out value="${user.email}"/></td>
			<td>
				<a href="<c:url value='/edit/${user.id}'/>" class="btn btn-primary">수정하기</a>
				<a href="<c:url value='/${user.id}'/>" class="btn btn-danger">삭제하기</a>
			</td>
		</tr>
    </c:forEach>
  </tbody>
</table>

</div>

</body>
</html>