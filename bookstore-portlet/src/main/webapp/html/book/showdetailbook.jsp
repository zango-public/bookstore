<%@page import="com.zango.service.BooksLocalServiceUtil"%>

<%@include file="../init.jsp"%>

This is the <b>Book</b> portlet in View mode.
<br><br>
<br>
Virtuoso
<liferay-portlet:renderURL var="showBookURL">
	<liferay-portlet:param name="mvcPath" value="/html/book/showbooks.jsp"/>
</liferay-portlet:renderURL>
<aui:a href="<%= showBookURL %>" >
Go back to books
</aui:a>
