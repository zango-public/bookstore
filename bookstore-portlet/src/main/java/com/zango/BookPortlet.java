package com.zango;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.zango.service.BooksLocalServiceUtil;

/**
 * Portlet implementation class BookPortlet
 */
public class BookPortlet extends MVCPortlet {
	
	
	/**
	 *  Add book to database!
	 * @param actionRequest
	 * @param actionResponse
	 * @throws SystemException
	 * @throws PortalException
	 */
	public void addBook(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException{		
		
		String bookName = ParamUtil.get(actionRequest, "bookName", "The msytery");
		String bookAuthor = ParamUtil.get(actionRequest, "bookAuthor", "Reda Virtuoso");
		String bookResume = ParamUtil.get(actionRequest, "bookResume", "An awesome book talking about nothing at all!");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		BooksLocalServiceUtil.addBooks(bookName,bookAuthor,bookResume,serviceContext);		
	}

}
