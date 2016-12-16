<%@page import="com.zango.model.Books"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.zango.service.BooksLocalServiceUtil"%>
<%@include file="../init.jsp"%>


<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Books book = (Books) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:actionURL name="deleteBook" var="deleteURL">
		<portlet:param name="bookId"
			value="<%=String.valueOf(book.getBookId())%>" />
	</portlet:actionURL>
	<portlet:actionURL name="showDetailBook" var="showBookURL">
		<portlet:param name="bookId"
			value="<%=String.valueOf(book.getBookId())%>" />
	</portlet:actionURL>
	<portlet:actionURL  var="updateBookURL" name="goToUpdateView">
		<portlet:param name="bookId"	value="<%=String.valueOf(book.getBookId())%>" />
		<%-- <portlet:param name="bookName"	value="<%=String.valueOf(book.getBookName())%>" />		
		<portlet:param name="bookAuthor"	value="<%=String.valueOf(book.getBookAuthor())%>" />				
		<portlet:param name="bookResume"	value="<%=String.valueOf(book.getBookResume())%>" /> --%>				
	</portlet:actionURL>
	<liferay-ui:icon image="view" message="View" url="<%=showBookURL.toString()%>" />
	<liferay-ui:icon image="view" message="Edit" url="<%=updateBookURL.toString()%>" />
	<liferay-ui:icon-delete image="delete" message="Delete" url="<%=deleteURL.toString()%>" />

</liferay-ui:icon-menu>