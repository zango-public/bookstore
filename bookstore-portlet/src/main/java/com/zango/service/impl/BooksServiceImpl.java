package com.zango.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.ac.AccessControlled;
import com.zango.model.Books;
import com.zango.service.BooksLocalServiceUtil;
import com.zango.service.base.BooksServiceBaseImpl;

/**
 * The implementation of the books remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.zango.service.BooksService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.zango.service.base.BooksServiceBaseImpl
 * @see com.zango.service.BooksServiceUtil
 */
public class BooksServiceImpl extends BooksServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.zango.service.BooksServiceUtil} to access the books remote service.
     */
	@AccessControlled(guestAccessEnabled=true)
	public Books getBook() throws PortalException, SystemException{
		return BooksLocalServiceUtil.getBooks(21901);
	}
		
	@AccessControlled(guestAccessEnabled=true)
	public List<Books> getAllBooks() throws SystemException{
		return BooksLocalServiceUtil.getBookses(0, BooksLocalServiceUtil.getBooksesCount());
	}
}
