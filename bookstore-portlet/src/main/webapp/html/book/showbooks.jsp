<%@page import="com.zango.service.BooksLocalServiceUtil"%>

<%@include file="../init.jsp"%>


<liferay-portlet:renderURL var="addbookURL">
	<liferay-portlet:param name="mvcPath" value="/html/book/createbook.jsp"/>
</liferay-portlet:renderURL> 
<liferay-portlet:renderURL var="showDetailURL">
	<liferay-portlet:param name="mvcPath" value="/html/book/showdetailbook.jsp"/>
</liferay-portlet:renderURL>
<a href="<%=addbookURL %>">Add Book</a>
<aui:field-wrapper>
<liferay-portlet:actionURL var="deleteBookURL" name="deleteBook" >
				</liferay-portlet:actionURL>
<liferay-ui:search-container delta="10" emptyResultsMessage="no-book-were-found">
	<liferay-ui:search-container-results>
	
		<%
		results = BooksLocalServiceUtil.getBookses(searchContainer.getStart(), searchContainer.getEnd());
		total = BooksLocalServiceUtil.getBooksesCount();
		searchContainer.setResults(results);
		searchContainer.setTotal(total);
		
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.zango.model.Books" keyProperty="bookId" modelVar="book">
		<liferay-ui:search-container-column-text 
			name="name"
			value="<%= book.getBookName() %>"
			target="_blank"
		/>

		<liferay-ui:search-container-column-text
			name="book-name"
			property="bookName"
		/>
		<liferay-ui:search-container-column-text
			name="book-author"
			property="bookAuthor"
		/>
		<liferay-ui:search-container-column-text
			name="book-resume"
			property="bookResume"
		/>
		
		<liferay-ui:search-container-column-jsp name="Actions" path="/html/book/actionbook.jsp" align="right" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:field-wrapper>
