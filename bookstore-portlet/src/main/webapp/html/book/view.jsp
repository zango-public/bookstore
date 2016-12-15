<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@page import="com.zango.service.BooksLocalServiceUtil" %>
<%@include file="../init.jsp"%>

This is the <b>Book</b> portlet in View mode.

<liferay-portlet:actionURL name="addBook" var="addBookURL">
</liferay-portlet:actionURL>

<aui:form action="<%=addBookURL %>" name="bookForm">
	<aui:input name="bookName" label="book-name" helpMessage="book-name-help">
			<aui:validator name="required"></aui:validator>
	</aui:input>	
	<aui:input name="bookAuthor" label="book-author" helpMessage="book-author-help">
			<aui:validator name="required"></aui:validator>
	</aui:input>	
	<aui:input name="bookResume" label="book-resume"></aui:input>
	<aui:button type="submit" value="submit"></aui:button>
</aui:form>