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

import ispace.NoSuchSoVanBanException;

import ispace.model.SoVanBan;

import ispace.model.impl.SoVanBanImpl;
import ispace.model.impl.SoVanBanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the so van ban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see SoVanBanPersistence
 * @see SoVanBanUtil
 * @generated
 */
public class SoVanBanPersistenceImpl extends BasePersistenceImpl<SoVanBan>
	implements SoVanBanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SoVanBanUtil} to access the so van ban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SoVanBanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
			SoVanBanModelImpl.FINDER_CACHE_ENABLED, SoVanBanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
			SoVanBanModelImpl.FINDER_CACHE_ENABLED, SoVanBanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
			SoVanBanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SoVanBanPersistenceImpl() {
		setModelClass(SoVanBan.class);
	}

	/**
	 * Caches the so van ban in the entity cache if it is enabled.
	 *
	 * @param soVanBan the so van ban
	 */
	@Override
	public void cacheResult(SoVanBan soVanBan) {
		EntityCacheUtil.putResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
			SoVanBanImpl.class, soVanBan.getPrimaryKey(), soVanBan);

		soVanBan.resetOriginalValues();
	}

	/**
	 * Caches the so van bans in the entity cache if it is enabled.
	 *
	 * @param soVanBans the so van bans
	 */
	@Override
	public void cacheResult(List<SoVanBan> soVanBans) {
		for (SoVanBan soVanBan : soVanBans) {
			if (EntityCacheUtil.getResult(
						SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
						SoVanBanImpl.class, soVanBan.getPrimaryKey()) == null) {
				cacheResult(soVanBan);
			}
			else {
				soVanBan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all so van bans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SoVanBanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SoVanBanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the so van ban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SoVanBan soVanBan) {
		EntityCacheUtil.removeResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
			SoVanBanImpl.class, soVanBan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SoVanBan> soVanBans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SoVanBan soVanBan : soVanBans) {
			EntityCacheUtil.removeResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
				SoVanBanImpl.class, soVanBan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new so van ban with the primary key. Does not add the so van ban to the database.
	 *
	 * @param Id the primary key for the new so van ban
	 * @return the new so van ban
	 */
	@Override
	public SoVanBan create(long Id) {
		SoVanBan soVanBan = new SoVanBanImpl();

		soVanBan.setNew(true);
		soVanBan.setPrimaryKey(Id);

		return soVanBan;
	}

	/**
	 * Removes the so van ban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the so van ban
	 * @return the so van ban that was removed
	 * @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SoVanBan remove(long Id)
		throws NoSuchSoVanBanException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the so van ban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the so van ban
	 * @return the so van ban that was removed
	 * @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SoVanBan remove(Serializable primaryKey)
		throws NoSuchSoVanBanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SoVanBan soVanBan = (SoVanBan)session.get(SoVanBanImpl.class,
					primaryKey);

			if (soVanBan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSoVanBanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(soVanBan);
		}
		catch (NoSuchSoVanBanException nsee) {
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
	protected SoVanBan removeImpl(SoVanBan soVanBan) throws SystemException {
		soVanBan = toUnwrappedModel(soVanBan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(soVanBan)) {
				soVanBan = (SoVanBan)session.get(SoVanBanImpl.class,
						soVanBan.getPrimaryKeyObj());
			}

			if (soVanBan != null) {
				session.delete(soVanBan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (soVanBan != null) {
			clearCache(soVanBan);
		}

		return soVanBan;
	}

	@Override
	public SoVanBan updateImpl(ispace.model.SoVanBan soVanBan)
		throws SystemException {
		soVanBan = toUnwrappedModel(soVanBan);

		boolean isNew = soVanBan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (soVanBan.isNew()) {
				session.save(soVanBan);

				soVanBan.setNew(false);
			}
			else {
				session.merge(soVanBan);
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

		EntityCacheUtil.putResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
			SoVanBanImpl.class, soVanBan.getPrimaryKey(), soVanBan);

		return soVanBan;
	}

	protected SoVanBan toUnwrappedModel(SoVanBan soVanBan) {
		if (soVanBan instanceof SoVanBanImpl) {
			return soVanBan;
		}

		SoVanBanImpl soVanBanImpl = new SoVanBanImpl();

		soVanBanImpl.setNew(soVanBan.isNew());
		soVanBanImpl.setPrimaryKey(soVanBan.getPrimaryKey());

		soVanBanImpl.setId(soVanBan.getId());
		soVanBanImpl.setTen(soVanBan.getTen());

		return soVanBanImpl;
	}

	/**
	 * Returns the so van ban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the so van ban
	 * @return the so van ban
	 * @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SoVanBan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSoVanBanException, SystemException {
		SoVanBan soVanBan = fetchByPrimaryKey(primaryKey);

		if (soVanBan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSoVanBanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return soVanBan;
	}

	/**
	 * Returns the so van ban with the primary key or throws a {@link ispace.NoSuchSoVanBanException} if it could not be found.
	 *
	 * @param Id the primary key of the so van ban
	 * @return the so van ban
	 * @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SoVanBan findByPrimaryKey(long Id)
		throws NoSuchSoVanBanException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the so van ban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the so van ban
	 * @return the so van ban, or <code>null</code> if a so van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SoVanBan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SoVanBan soVanBan = (SoVanBan)EntityCacheUtil.getResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
				SoVanBanImpl.class, primaryKey);

		if (soVanBan == _nullSoVanBan) {
			return null;
		}

		if (soVanBan == null) {
			Session session = null;

			try {
				session = openSession();

				soVanBan = (SoVanBan)session.get(SoVanBanImpl.class, primaryKey);

				if (soVanBan != null) {
					cacheResult(soVanBan);
				}
				else {
					EntityCacheUtil.putResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
						SoVanBanImpl.class, primaryKey, _nullSoVanBan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SoVanBanModelImpl.ENTITY_CACHE_ENABLED,
					SoVanBanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return soVanBan;
	}

	/**
	 * Returns the so van ban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the so van ban
	 * @return the so van ban, or <code>null</code> if a so van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SoVanBan fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the so van bans.
	 *
	 * @return the so van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SoVanBan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the so van bans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.SoVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of so van bans
	 * @param end the upper bound of the range of so van bans (not inclusive)
	 * @return the range of so van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SoVanBan> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the so van bans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.SoVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of so van bans
	 * @param end the upper bound of the range of so van bans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of so van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SoVanBan> findAll(int start, int end,
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

		List<SoVanBan> list = (List<SoVanBan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOVANBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOVANBAN;

				if (pagination) {
					sql = sql.concat(SoVanBanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SoVanBan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SoVanBan>(list);
				}
				else {
					list = (List<SoVanBan>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the so van bans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SoVanBan soVanBan : findAll()) {
			remove(soVanBan);
		}
	}

	/**
	 * Returns the number of so van bans.
	 *
	 * @return the number of so van bans
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

				Query q = session.createQuery(_SQL_COUNT_SOVANBAN);

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
	 * Initializes the so van ban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.SoVanBan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SoVanBan>> listenersList = new ArrayList<ModelListener<SoVanBan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SoVanBan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SoVanBanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOVANBAN = "SELECT soVanBan FROM SoVanBan soVanBan";
	private static final String _SQL_COUNT_SOVANBAN = "SELECT COUNT(soVanBan) FROM SoVanBan soVanBan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "soVanBan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SoVanBan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SoVanBanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Ten"
			});
	private static SoVanBan _nullSoVanBan = new SoVanBanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SoVanBan> toCacheModel() {
				return _nullSoVanBanCacheModel;
			}
		};

	private static CacheModel<SoVanBan> _nullSoVanBanCacheModel = new CacheModel<SoVanBan>() {
			@Override
			public SoVanBan toEntityModel() {
				return _nullSoVanBan;
			}
		};
}