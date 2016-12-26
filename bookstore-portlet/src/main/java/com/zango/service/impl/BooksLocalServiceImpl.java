package com.zango.service.impl;


import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.pushnotifications.service.PushNotificationsDeviceLocalServiceUtil;
import com.liferay.pushnotifications.service.PushNotificationsDeviceServiceUtil;
import com.liferay.pushnotifications.service.persistence.PushNotificationsDeviceUtil;
import com.zango.model.Books;
import com.zango.service.base.BooksLocalServiceBaseImpl;

/**
 * The implementation of the books local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.zango.service.BooksLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.zango.service.base.BooksLocalServiceBaseImpl
 * @see com.zango.service.BooksLocalServiceUtil
 */
public class BooksLocalServiceImpl extends BooksLocalServiceBaseImpl {
	
	public static final int MAX_USERS = 200;
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.zango.service.BooksLocalServiceUtil} to access the books local service.
     */
	public Books addBooks(String bookName, String bookAuthor,String bookResume ,ServiceContext serviceContext) throws SystemException, PortalException{
		
		Books book = booksPersistence.create(counterLocalService.increment());
		book.setBookAuthor(bookAuthor);
		book.setBookName(bookName);
		book.setBookResume(bookResume);
		
		sendNotification(false);
		return this.addBooks(book);
		
	} 
	
	private void sendNotification(boolean newNotification) throws PortalException, SystemException {
		System.out.println("Send Notification Called !");
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("message", "A new book has been added!");
		System.out.println("JsonObject Has been added !");


		//FIXME find by token instead of users
		List<User> users = findSomeUsers(0, MAX_USERS);
		long[] ids = getPrimaryKeysFromAList(users);
		
		for(int i=0;i<ids.length;i++){
			System.out.println("Ids Called  !"+ids[i]);
		}
		
		
		PushNotificationsDeviceLocalServiceUtil.sendPushNotification(ids,jsonObject);

	}
	
	private List<User> findSomeUsers(int from, int to) throws PortalException, SystemException {
		Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
		long companyId = company.getCompanyId();
		System.out.println("Users found!");
		return UserLocalServiceUtil.getCompanyUsers(companyId, from, to);
	}

	private long[] getPrimaryKeysFromAList(List<User> users) {
		long[] ids = new long[users.size()];

		for (int i = 0; i < users.size(); i++) {
			ids[i] = users.get(i).getPrimaryKey();
		}
		return ids;
	}
	
	
	public Books deleteBook(long bookId, ServiceContext serviceContext) throws PortalException, SystemException{
		return this.deleteBooks(bookId);
	}
	
	public Books updateBook(long bookId,String bookName,String bookAuthor,String bookResume,ServiceContext serviceContext)throws PortalException, SystemException{
		Books book=booksPersistence.findByPrimaryKey(bookId);
		book.setBookName(bookName);
		book.setBookAuthor(bookAuthor);
		book.setBookResume(bookResume);
		
		return this.updateBooks(book);		
	}
	
	public Books getBooks(){
		return this.getBooks();
	}
	
}
	
	

