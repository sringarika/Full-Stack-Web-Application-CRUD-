<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
    <spring:url var = "css" value="/resources/css"></spring:url>
    <spring:url var = "js" value="/resources/js"></spring:url>
    <spring:url var = "images" value="/resources/images"></spring:url>
    <spring:url var = "font-awesome" value="/resources/font-awesome"></spring:url>
    <c:set var = "contextRoot" value = "${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap Core CSS -->
    <link href="${css }/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${css }/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="${css}/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${font-awesome}/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Libraries List</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-hover table-striped">
                                    <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Zipcode</th>
                                                <th>Neighborhood</th>
                                                <th>Council District</th>
                                                <th>Police District</th>
                                                <th>Location</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items = "${libraries}" var = "library">
                                        	<tr>
                                        		<td>${library.name }</td>
                                                <td>${library.zipCode }</td>
                                                <td>${library.neighborhood }</td>
                                                <td>${library.councilDistrict }</td>
                                                <td>${library.policeDistrict }</td>
                                                <td>${library.location1 }</td>
                                        	</tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- jQuery -->
    <script src="${js }/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${js }/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="${js }/raphael.min.js"></script>
    <script src="${js }/morris.min.js"></script>
    <script src="${js }/morris-data.js"></script>
</body>
</html>