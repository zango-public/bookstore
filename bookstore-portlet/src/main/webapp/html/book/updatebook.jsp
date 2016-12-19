<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.zango.service.BooksLocalServiceUtil"%>
<%@page import="com.zango.model.Books" %>
<%@include file="../init.jsp"%>

<%
String bookId=ParamUtil.getString(request,"bookId");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/html/book/showbooks.jsp"/>
</portlet:renderURL>

<liferay-ui:header backURL="<%=backURL%>" title="Back To Books" />

<liferay-portlet:actionURL name="updateBook" var="updateBookURL">
					<liferay-portlet:param name="bookId" value="<%=bookId %>"/>
</liferay-portlet:actionURL>
<aui:form action="<%=updateBookURL %>" name="bookForm">
<aui:input name="bookName" label="book-name" helpMessage="book-name-help">
			<aui:validator name="required"></aui:validator>
	</aui:input>	
	<aui:input name="bookAuthor" label="book-author" helpMessage="book-author-help">
			<aui:validator name="required"></aui:validator>
	</aui:input>	
	<aui:input name="bookResume" label="book-resume"></aui:input>
	<aui:button type="submit" value="Update Book"></aui:button>
</aui:form>