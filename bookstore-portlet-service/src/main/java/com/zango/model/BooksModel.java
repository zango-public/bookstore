package com.zango.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Books service. Represents a row in the &quot;bookstore_Books&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.zango.model.impl.BooksModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.zango.model.impl.BooksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Books
 * @see com.zango.model.impl.BooksImpl
 * @see com.zango.model.impl.BooksModelImpl
 * @generated
 */
public interface BooksModel extends BaseModel<Books> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a books model instance should use the {@link Books} interface instead.
     */

    /**
     * Returns the primary key of this books.
     *
     * @return the primary key of this books
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this books.
     *
     * @param primaryKey the primary key of this books
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this books.
     *
     * @return the uuid of this books
     */
    @AutoEscape
    public String getUuid();

    /**
     * Sets the uuid of this books.
     *
     * @param uuid the uuid of this books
     */
    public void setUuid(String uuid);

    /**
     * Returns the book ID of this books.
     *
     * @return the book ID of this books
     */
    public long getBookId();

    /**
     * Sets the book ID of this books.
     *
     * @param bookId the book ID of this books
     */
    public void setBookId(long bookId);

    /**
     * Returns the book name of this books.
     *
     * @return the book name of this books
     */
    @AutoEscape
    public String getBookName();

    /**
     * Sets the book name of this books.
     *
     * @param bookName the book name of this books
     */
    public void setBookName(String bookName);

    /**
     * Returns the book author of this books.
     *
     * @return the book author of this books
     */
    @AutoEscape
    public String getBookAuthor();

    /**
     * Sets the book author of this books.
     *
     * @param bookAuthor the book author of this books
     */
    public void setBookAuthor(String bookAuthor);

    /**
     * Returns the book resume of this books.
     *
     * @return the book resume of this books
     */
    @AutoEscape
    public String getBookResume();

    /**
     * Sets the book resume of this books.
     *
     * @param bookResume the book resume of this books
     */
    public void setBookResume(String bookResume);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.zango.model.Books books);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.zango.model.Books> toCacheModel();

    @Override
    public com.zango.model.Books toEscapedModel();

    @Override
    public com.zango.model.Books toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
