package com.zango.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Books. This utility wraps
 * {@link com.zango.service.impl.BooksServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BooksService
 * @see com.zango.service.base.BooksServiceBaseImpl
 * @see com.zango.service.impl.BooksServiceImpl
 * @generated
 */
public class BooksServiceUtil {
    private static BooksService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.zango.service.impl.BooksServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.zango.model.Books getBook()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBook();
    }

    public static java.util.List<com.zango.model.Books> getAllBooks()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAllBooks();
    }

    public static void clearService() {
        _service = null;
    }

    public static BooksService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BooksService.class.getName());

            if (invokableService instanceof BooksService) {
                _service = (BooksService) invokableService;
            } else {
                _service = new BooksServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(BooksServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BooksService service) {
    }
}
