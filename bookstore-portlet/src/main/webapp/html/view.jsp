<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>
<%@page import="com.zango.service.BooksLocalServiceUtil" %>
<%@include file="init.jsp"%>

This is the <b>Liferay Book</b>.
 
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






