<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>NextGen Rides</title>
</head>
<body>
	<center>
		<h1>Booking Management</h1>
        <h2>
        	<a href="new">Add New booking</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All bookings</a>
        	
        </h2>
	</center>
    <div align="center">
		<c:if test="${user != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${user == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${user != null}">
            			Edit User
            		</c:if>
            		<c:if test="${user == null}">
            			Add New User
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${user != null}">
        			<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
        		</c:if>            
            <tr>
                <th>User Name: </th>
                <td>
                	<input type="text" name="username" size="45"
                			value="<c:out value='${user.username}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>Rent_date: </th>
                <td>
                	<input type="text" name="rent_date" size="45"
                			value="<c:out value='${user.rent_date}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Destination_start: </th>
                <td>
                	<input type="text" name="destination_start" size="15"
                			value="<c:out value='${user.destination_start}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Destination_end: </th>
                <td>
                	<input type="text" name="destination_end" size="15"
                			value="<c:out value='${user.destination_end}' />"
                	/>
                </td>
            </tr>
             <tr>
                <th>payment: </th>
                <td>
                	<input type="text" name="payment" size="15"
                			value="<c:out value='${user.payment}' />"
                	/>
                </td>
            </tr>
             <tr>
                <th>bike: </th>
                <td>
                	<input type="text" name="bike" size="15"
                			value="<c:out value='${user.bike}' />"
                	/>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>
