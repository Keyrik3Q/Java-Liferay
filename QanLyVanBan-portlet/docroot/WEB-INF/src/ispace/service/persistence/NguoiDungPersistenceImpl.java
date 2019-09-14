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

package ispace.service.persistence;

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

import ispace.NoSuchNguoiDungException;

import ispace.model.NguoiDung;

import ispace.model.impl.NguoiDungImpl;
import ispace.model.impl.NguoiDungModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the nguoi dung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see NguoiDungPersistence
 * @see NguoiDungUtil
 * @generated
 */
public class NguoiDungPersistenceImpl extends BasePersistenceImpl<NguoiDung>
	implements NguoiDungPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NguoiDungUtil} to access the nguoi dung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NguoiDungImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
			NguoiDungModelImpl.FINDER_CACHE_ENABLED, NguoiDungImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
			NguoiDungModelImpl.FINDER_CACHE_ENABLED, NguoiDungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
			NguoiDungModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public NguoiDungPersistenceImpl() {
		setModelClass(NguoiDung.class);
	}

	/**
	 * Caches the nguoi dung in the entity cache if it is enabled.
	 *
	 * @param nguoiDung the nguoi dung
	 */
	@Override
	public void cacheResult(NguoiDung nguoiDung) {
		EntityCacheUtil.putResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
			NguoiDungImpl.class, nguoiDung.getPrimaryKey(), nguoiDung);

		nguoiDung.resetOriginalValues();
	}

	/**
	 * Caches the nguoi dungs in the entity cache if it is enabled.
	 *
	 * @param nguoiDungs the nguoi dungs
	 */
	@Override
	public void cacheResult(List<NguoiDung> nguoiDungs) {
		for (NguoiDung nguoiDung : nguoiDungs) {
			if (EntityCacheUtil.getResult(
						NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
						NguoiDungImpl.class, nguoiDung.getPrimaryKey()) == null) {
				cacheResult(nguoiDung);
			}
			else {
				nguoiDung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nguoi dungs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NguoiDungImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NguoiDungImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nguoi dung.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NguoiDung nguoiDung) {
		EntityCacheUtil.removeResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
			NguoiDungImpl.class, nguoiDung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NguoiDung> nguoiDungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NguoiDung nguoiDung : nguoiDungs) {
			EntityCacheUtil.removeResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
				NguoiDungImpl.class, nguoiDung.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nguoi dung with the primary key. Does not add the nguoi dung to the database.
	 *
	 * @param Id the primary key for the new nguoi dung
	 * @return the new nguoi dung
	 */
	@Override
	public NguoiDung create(long Id) {
		NguoiDung nguoiDung = new NguoiDungImpl();

		nguoiDung.setNew(true);
		nguoiDung.setPrimaryKey(Id);

		return nguoiDung;
	}

	/**
	 * Removes the nguoi dung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the nguoi dung
	 * @return the nguoi dung that was removed
	 * @throws ispace.NoSuchNguoiDungException if a nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NguoiDung remove(long Id)
		throws NoSuchNguoiDungException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the nguoi dung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nguoi dung
	 * @return the nguoi dung that was removed
	 * @throws ispace.NoSuchNguoiDungException if a nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NguoiDung remove(Serializable primaryKey)
		throws NoSuchNguoiDungException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NguoiDung nguoiDung = (NguoiDung)session.get(NguoiDungImpl.class,
					primaryKey);

			if (nguoiDung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNguoiDungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nguoiDung);
		}
		catch (NoSuchNguoiDungException nsee) {
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
	protected NguoiDung removeImpl(NguoiDung nguoiDung)
		throws SystemException {
		nguoiDung = toUnwrappedModel(nguoiDung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nguoiDung)) {
				nguoiDung = (NguoiDung)session.get(NguoiDungImpl.class,
						nguoiDung.getPrimaryKeyObj());
			}

			if (nguoiDung != null) {
				session.delete(nguoiDung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nguoiDung != null) {
			clearCache(nguoiDung);
		}

		return nguoiDung;
	}

	@Override
	public NguoiDung updateImpl(ispace.model.NguoiDung nguoiDung)
		throws SystemException {
		nguoiDung = toUnwrappedModel(nguoiDung);

		boolean isNew = nguoiDung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (nguoiDung.isNew()) {
				session.save(nguoiDung);

				nguoiDung.setNew(false);
			}
			else {
				session.merge(nguoiDung);
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

		EntityCacheUtil.putResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
			NguoiDungImpl.class, nguoiDung.getPrimaryKey(), nguoiDung);

		return nguoiDung;
	}

	protected NguoiDung toUnwrappedModel(NguoiDung nguoiDung) {
		if (nguoiDung instanceof NguoiDungImpl) {
			return nguoiDung;
		}

		NguoiDungImpl nguoiDungImpl = new NguoiDungImpl();

		nguoiDungImpl.setNew(nguoiDung.isNew());
		nguoiDungImpl.setPrimaryKey(nguoiDung.getPrimaryKey());

		nguoiDungImpl.setId(nguoiDung.getId());
		nguoiDungImpl.setTen(nguoiDung.getTen());
		nguoiDungImpl.setNguoiKy(nguoiDung.getNguoiKy());

		return nguoiDungImpl;
	}

	/**
	 * Returns the nguoi dung with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nguoi dung
	 * @return the nguoi dung
	 * @throws ispace.NoSuchNguoiDungException if a nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NguoiDung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNguoiDungException, SystemException {
		NguoiDung nguoiDung = fetchByPrimaryKey(primaryKey);

		if (nguoiDung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNguoiDungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nguoiDung;
	}

	/**
	 * Returns the nguoi dung with the primary key or throws a {@link ispace.NoSuchNguoiDungException} if it could not be found.
	 *
	 * @param Id the primary key of the nguoi dung
	 * @return the nguoi dung
	 * @throws ispace.NoSuchNguoiDungException if a nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NguoiDung findByPrimaryKey(long Id)
		throws NoSuchNguoiDungException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the nguoi dung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nguoi dung
	 * @return the nguoi dung, or <code>null</code> if a nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NguoiDung fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NguoiDung nguoiDung = (NguoiDung)EntityCacheUtil.getResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
				NguoiDungImpl.class, primaryKey);

		if (nguoiDung == _nullNguoiDung) {
			return null;
		}

		if (nguoiDung == null) {
			Session session = null;

			try {
				session = openSession();

				nguoiDung = (NguoiDung)session.get(NguoiDungImpl.class,
						primaryKey);

				if (nguoiDung != null) {
					cacheResult(nguoiDung);
				}
				else {
					EntityCacheUtil.putResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
						NguoiDungImpl.class, primaryKey, _nullNguoiDung);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NguoiDungModelImpl.ENTITY_CACHE_ENABLED,
					NguoiDungImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nguoiDung;
	}

	/**
	 * Returns the nguoi dung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the nguoi dung
	 * @return the nguoi dung, or <code>null</code> if a nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NguoiDung fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the nguoi dungs.
	 *
	 * @return the nguoi dungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NguoiDung> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nguoi dungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nguoi dungs
	 * @param end the upper bound of the range of nguoi dungs (not inclusive)
	 * @return the range of nguoi dungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NguoiDung> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nguoi dungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nguoi dungs
	 * @param end the upper bound of the range of nguoi dungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nguoi dungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NguoiDung> findAll(int start, int end,
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

		List<NguoiDung> list = (List<NguoiDung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NGUOIDUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NGUOIDUNG;

				if (pagination) {
					sql = sql.concat(NguoiDungModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NguoiDung>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NguoiDung>(list);
				}
				else {
					list = (List<NguoiDung>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nguoi dungs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NguoiDung nguoiDung : findAll()) {
			remove(nguoiDung);
		}
	}

	/**
	 * Returns the number of nguoi dungs.
	 *
	 * @return the number of nguoi dungs
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

				Query q = session.createQuery(_SQL_COUNT_NGUOIDUNG);

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
	 * Initializes the nguoi dung persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.NguoiDung")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NguoiDung>> listenersList = new ArrayList<ModelListener<NguoiDung>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NguoiDung>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NguoiDungImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NGUOIDUNG = "SELECT nguoiDung FROM NguoiDung nguoiDung";
	private static final String _SQL_COUNT_NGUOIDUNG = "SELECT COUNT(nguoiDung) FROM NguoiDung nguoiDung";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nguoiDung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NguoiDung exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NguoiDungPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Ten", "NguoiKy"
			});
	private static NguoiDung _nullNguoiDung = new NguoiDungImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NguoiDung> toCacheModel() {
				return _nullNguoiDungCacheModel;
			}
		};

	private static CacheModel<NguoiDung> _nullNguoiDungCacheModel = new CacheModel<NguoiDung>() {
			@Override
			public NguoiDung toEntityModel() {
				return _nullNguoiDung;
			}
		};
}