<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.zango.model.Books"%>
<%@page import="com.zango.service.BooksLocalServiceUtil"%>

<%@include file="../init.jsp"%>


<%
	String bookAuthor=ParamUtil.getString(request,"bookAuthor");
	String bookName=ParamUtil.getString(request,"bookName");
	String bookResume=ParamUtil.getString(request,"bookResume");
%>
This is the <b>Book</b> portlet in View mode.
<br><br>
<br>
<liferay-portlet:renderURL var="showBookURL">
	<liferay-portlet:param name="mvcPath" value="/html/book/showbooks.jsp"/>
</liferay-portlet:renderURL>
<aui:a href="<%= showBookURL %>" >
Go back to books
</aui:a>
<br><br>
<br>

<aui:form>
	<aui:input value="<%=bookName %>" label="Book Name" name="bookName" disabled="true"/>
	<aui:input value="<%=bookAuthor %>" label="Book Author" name="bookAuthor" disabled="true"/>	
	<aui:input value="<%=bookResume %>" label="Book Resume" name="bookResume" disabled="true"/> 		
</aui:form>