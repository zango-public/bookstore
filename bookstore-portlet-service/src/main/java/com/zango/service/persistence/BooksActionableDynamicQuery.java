package com.zango.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zango.model.Books;

import com.zango.service.BooksLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BooksActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BooksActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BooksLocalServiceUtil.getService());
        setClass(Books.class);

        setClassLoader(com.zango.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bookId");
    }
}
