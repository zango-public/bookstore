<%@page import="com.zango.service.BooksLocalServiceUtil"%>

<%@include file="../init.jsp"%>

	

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
		<liferay-ui:search-container-column-text
			name="Configuration"			
		>
		<liferay-portlet:actionURL var="deleteBookURL" name="deleteBook" >
					<liferay-portlet:param name="bookId" value="<%=book.getBookId() %>"/>
				</liferay-portlet:actionURL>
			<aui:a href="#" label="Show Details"></aui:a>
			<br>
			<aui:button name="updateBook" type="edit" value="edit"></aui:button>
			<br>
			<aui:button name="<%=deleteBookURL %>" type="delete" value="delete"></aui:button>	
		</liferay-ui:search-container-column-text>
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

