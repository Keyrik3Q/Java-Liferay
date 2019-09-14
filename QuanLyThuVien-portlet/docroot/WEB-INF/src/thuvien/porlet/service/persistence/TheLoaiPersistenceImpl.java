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

package thuvien.porlet.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import thuvien.porlet.NoSuchTheLoaiException;

import thuvien.porlet.model.TheLoai;
import thuvien.porlet.model.impl.TheLoaiImpl;
import thuvien.porlet.model.impl.TheLoaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the the loai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see TheLoaiPersistence
 * @see TheLoaiUtil
 * @generated
 */
public class TheLoaiPersistenceImpl extends BasePersistenceImpl<TheLoai>
	implements TheLoaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TheLoaiUtil} to access the the loai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TheLoaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
			TheLoaiModelImpl.FINDER_CACHE_ENABLED, TheLoaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
			TheLoaiModelImpl.FINDER_CACHE_ENABLED, TheLoaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
			TheLoaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TheLoaiPersistenceImpl() {
		setModelClass(TheLoai.class);
	}

	/**
	 * Caches the the loai in the entity cache if it is enabled.
	 *
	 * @param theLoai the the loai
	 */
	@Override
	public void cacheResult(TheLoai theLoai) {
		EntityCacheUtil.putResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
			TheLoaiImpl.class, theLoai.getPrimaryKey(), theLoai);

		theLoai.resetOriginalValues();
	}

	/**
	 * Caches the the loais in the entity cache if it is enabled.
	 *
	 * @param theLoais the the loais
	 */
	@Override
	public void cacheResult(List<TheLoai> theLoais) {
		for (TheLoai theLoai : theLoais) {
			if (EntityCacheUtil.getResult(
						TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
						TheLoaiImpl.class, theLoai.getPrimaryKey()) == null) {
				cacheResult(theLoai);
			}
			else {
				theLoai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all the loais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TheLoaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TheLoaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the the loai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TheLoai theLoai) {
		EntityCacheUtil.removeResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
			TheLoaiImpl.class, theLoai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TheLoai> theLoais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TheLoai theLoai : theLoais) {
			EntityCacheUtil.removeResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
				TheLoaiImpl.class, theLoai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new the loai with the primary key. Does not add the the loai to the database.
	 *
	 * @param Id the primary key for the new the loai
	 * @return the new the loai
	 */
	@Override
	public TheLoai create(long Id) {
		TheLoai theLoai = new TheLoaiImpl();

		theLoai.setNew(true);
		theLoai.setPrimaryKey(Id);

		return theLoai;
	}

	/**
	 * Removes the the loai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the the loai
	 * @return the the loai that was removed
	 * @throws thuvien.porlet.NoSuchTheLoaiException if a the loai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheLoai remove(long Id)
		throws NoSuchTheLoaiException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the the loai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the the loai
	 * @return the the loai that was removed
	 * @throws thuvien.porlet.NoSuchTheLoaiException if a the loai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheLoai remove(Serializable primaryKey)
		throws NoSuchTheLoaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TheLoai theLoai = (TheLoai)session.get(TheLoaiImpl.class, primaryKey);

			if (theLoai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTheLoaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(theLoai);
		}
		catch (NoSuchTheLoaiException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TheLoai removeImpl(TheLoai theLoai) throws SystemException {
		theLoai = toUnwrappedModel(theLoai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(theLoai)) {
				theLoai = (TheLoai)session.get(TheLoaiImpl.class,
						theLoai.getPrimaryKeyObj());
			}

			if (theLoai != null) {
				session.delete(theLoai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (theLoai != null) {
			clearCache(theLoai);
		}

		return theLoai;
	}

	@Override
	public TheLoai updateImpl(thuvien.porlet.model.TheLoai theLoai)
		throws SystemException {
		theLoai = toUnwrappedModel(theLoai);

		boolean isNew = theLoai.isNew();

		Session session = null;

		try {
			session = openSession();

			if (theLoai.isNew()) {
				session.save(theLoai);

				theLoai.setNew(false);
			}
			else {
				session.merge(theLoai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
			TheLoaiImpl.class, theLoai.getPrimaryKey(), theLoai);

		return theLoai;
	}

	protected TheLoai toUnwrappedModel(TheLoai theLoai) {
		if (theLoai instanceof TheLoaiImpl) {
			return theLoai;
		}

		TheLoaiImpl theLoaiImpl = new TheLoaiImpl();

		theLoaiImpl.setNew(theLoai.isNew());
		theLoaiImpl.setPrimaryKey(theLoai.getPrimaryKey());

		theLoaiImpl.setId(theLoai.getId());
		theLoaiImpl.setTenTheLoai(theLoai.getTenTheLoai());

		return theLoaiImpl;
	}

	/**
	 * Returns the the loai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the the loai
	 * @return the the loai
	 * @throws thuvien.porlet.NoSuchTheLoaiException if a the loai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheLoai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTheLoaiException, SystemException {
		TheLoai theLoai = fetchByPrimaryKey(primaryKey);

		if (theLoai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTheLoaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return theLoai;
	}

	/**
	 * Returns the the loai with the primary key or throws a {@link thuvien.porlet.NoSuchTheLoaiException} if it could not be found.
	 *
	 * @param Id the primary key of the the loai
	 * @return the the loai
	 * @throws thuvien.porlet.NoSuchTheLoaiException if a the loai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheLoai findByPrimaryKey(long Id)
		throws NoSuchTheLoaiException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the the loai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the the loai
	 * @return the the loai, or <code>null</code> if a the loai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheLoai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TheLoai theLoai = (TheLoai)EntityCacheUtil.getResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
				TheLoaiImpl.class, primaryKey);

		if (theLoai == _nullTheLoai) {
			return null;
		}

		if (theLoai == null) {
			Session session = null;

			try {
				session = openSession();

				theLoai = (TheLoai)session.get(TheLoaiImpl.class, primaryKey);

				if (theLoai != null) {
					cacheResult(theLoai);
				}
				else {
					EntityCacheUtil.putResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
						TheLoaiImpl.class, primaryKey, _nullTheLoai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TheLoaiModelImpl.ENTITY_CACHE_ENABLED,
					TheLoaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return theLoai;
	}

	/**
	 * Returns the the loai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the the loai
	 * @return the the loai, or <code>null</code> if a the loai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheLoai fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the the loais.
	 *
	 * @return the the loais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheLoai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the the loais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.TheLoaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of the loais
	 * @param end the upper bound of the range of the loais (not inclusive)
	 * @return the range of the loais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheLoai> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the the loais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.TheLoaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of the loais
	 * @param end the upper bound of the range of the loais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of the loais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheLoai> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TheLoai> list = (List<TheLoai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THELOAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THELOAI;

				if (pagination) {
					sql = sql.concat(TheLoaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TheLoai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TheLoai>(list);
				}
				else {
					list = (List<TheLoai>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the the loais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TheLoai theLoai : findAll()) {
			remove(theLoai);
		}
	}

	/**
	 * Returns the number of the loais.
	 *
	 * @return the number of the loais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_THELOAI);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the the loai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.thuvien.porlet.model.TheLoai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TheLoai>> listenersList = new ArrayList<ModelListener<TheLoai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TheLoai>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TheLoaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THELOAI = "SELECT theLoai FROM TheLoai theLoai";
	private static final String _SQL_COUNT_THELOAI = "SELECT COUNT(theLoai) FROM TheLoai theLoai";
	private static final String _ORDER_BY_ENTITY_ALIAS = "theLoai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TheLoai exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TheLoaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "TenTheLoai"
			});
	private static TheLoai _nullTheLoai = new TheLoaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TheLoai> toCacheModel() {
				return _nullTheLoaiCacheModel;
			}
		};

	private static CacheModel<TheLoai> _nullTheLoaiCacheModel = new CacheModel<TheLoai>() {
			@Override
			public TheLoai toEntityModel() {
				return _nullTheLoai;
			}
		};
}