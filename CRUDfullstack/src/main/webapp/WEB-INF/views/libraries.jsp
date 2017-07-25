<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="col-lg-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Transactions Panel</h3>
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
                                        <c:forEach items = "${libraries }" var = "library">
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
                                <div class="text-right">
                                    <a href="#">View All Transactions <i class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
</body>
</html>