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

import ispace.NoSuchLoaiVanBanException;

import ispace.model.LoaiVanBan;

import ispace.model.impl.LoaiVanBanImpl;
import ispace.model.impl.LoaiVanBanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the loai van ban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see LoaiVanBanPersistence
 * @see LoaiVanBanUtil
 * @generated
 */
public class LoaiVanBanPersistenceImpl extends BasePersistenceImpl<LoaiVanBan>
	implements LoaiVanBanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LoaiVanBanUtil} to access the loai van ban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LoaiVanBanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVanBanModelImpl.FINDER_CACHE_ENABLED, LoaiVanBanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVanBanModelImpl.FINDER_CACHE_ENABLED, LoaiVanBanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVanBanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LoaiVanBanPersistenceImpl() {
		setModelClass(LoaiVanBan.class);
	}

	/**
	 * Caches the loai van ban in the entity cache if it is enabled.
	 *
	 * @param loaiVanBan the loai van ban
	 */
	@Override
	public void cacheResult(LoaiVanBan loaiVanBan) {
		EntityCacheUtil.putResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVanBanImpl.class, loaiVanBan.getPrimaryKey(), loaiVanBan);

		loaiVanBan.resetOriginalValues();
	}

	/**
	 * Caches the loai van bans in the entity cache if it is enabled.
	 *
	 * @param loaiVanBans the loai van bans
	 */
	@Override
	public void cacheResult(List<LoaiVanBan> loaiVanBans) {
		for (LoaiVanBan loaiVanBan : loaiVanBans) {
			if (EntityCacheUtil.getResult(
						LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
						LoaiVanBanImpl.class, loaiVanBan.getPrimaryKey()) == null) {
				cacheResult(loaiVanBan);
			}
			else {
				loaiVanBan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loai van bans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LoaiVanBanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LoaiVanBanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loai van ban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LoaiVanBan loaiVanBan) {
		EntityCacheUtil.removeResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVanBanImpl.class, loaiVanBan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LoaiVanBan> loaiVanBans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LoaiVanBan loaiVanBan : loaiVanBans) {
			EntityCacheUtil.removeResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
				LoaiVanBanImpl.class, loaiVanBan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loai van ban with the primary key. Does not add the loai van ban to the database.
	 *
	 * @param Id the primary key for the new loai van ban
	 * @return the new loai van ban
	 */
	@Override
	public LoaiVanBan create(long Id) {
		LoaiVanBan loaiVanBan = new LoaiVanBanImpl();

		loaiVanBan.setNew(true);
		loaiVanBan.setPrimaryKey(Id);

		return loaiVanBan;
	}

	/**
	 * Removes the loai van ban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the loai van ban
	 * @return the loai van ban that was removed
	 * @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVanBan remove(long Id)
		throws NoSuchLoaiVanBanException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the loai van ban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loai van ban
	 * @return the loai van ban that was removed
	 * @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVanBan remove(Serializable primaryKey)
		throws NoSuchLoaiVanBanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LoaiVanBan loaiVanBan = (LoaiVanBan)session.get(LoaiVanBanImpl.class,
					primaryKey);

			if (loaiVanBan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoaiVanBanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loaiVanBan);
		}
		catch (NoSuchLoaiVanBanException nsee) {
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
	protected LoaiVanBan removeImpl(LoaiVanBan loaiVanBan)
		throws SystemException {
		loaiVanBan = toUnwrappedModel(loaiVanBan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loaiVanBan)) {
				loaiVanBan = (LoaiVanBan)session.get(LoaiVanBanImpl.class,
						loaiVanBan.getPrimaryKeyObj());
			}

			if (loaiVanBan != null) {
				session.delete(loaiVanBan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (loaiVanBan != null) {
			clearCache(loaiVanBan);
		}

		return loaiVanBan;
	}

	@Override
	public LoaiVanBan updateImpl(ispace.model.LoaiVanBan loaiVanBan)
		throws SystemException {
		loaiVanBan = toUnwrappedModel(loaiVanBan);

		boolean isNew = loaiVanBan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (loaiVanBan.isNew()) {
				session.save(loaiVanBan);

				loaiVanBan.setNew(false);
			}
			else {
				session.merge(loaiVanBan);
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

		EntityCacheUtil.putResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVanBanImpl.class, loaiVanBan.getPrimaryKey(), loaiVanBan);

		return loaiVanBan;
	}

	protected LoaiVanBan toUnwrappedModel(LoaiVanBan loaiVanBan) {
		if (loaiVanBan instanceof LoaiVanBanImpl) {
			return loaiVanBan;
		}

		LoaiVanBanImpl loaiVanBanImpl = new LoaiVanBanImpl();

		loaiVanBanImpl.setNew(loaiVanBan.isNew());
		loaiVanBanImpl.setPrimaryKey(loaiVanBan.getPrimaryKey());

		loaiVanBanImpl.setId(loaiVanBan.getId());
		loaiVanBanImpl.setTen(loaiVanBan.getTen());

		return loaiVanBanImpl;
	}

	/**
	 * Returns the loai van ban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai van ban
	 * @return the loai van ban
	 * @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVanBan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLoaiVanBanException, SystemException {
		LoaiVanBan loaiVanBan = fetchByPrimaryKey(primaryKey);

		if (loaiVanBan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLoaiVanBanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return loaiVanBan;
	}

	/**
	 * Returns the loai van ban with the primary key or throws a {@link ispace.NoSuchLoaiVanBanException} if it could not be found.
	 *
	 * @param Id the primary key of the loai van ban
	 * @return the loai van ban
	 * @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVanBan findByPrimaryKey(long Id)
		throws NoSuchLoaiVanBanException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the loai van ban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai van ban
	 * @return the loai van ban, or <code>null</code> if a loai van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVanBan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LoaiVanBan loaiVanBan = (LoaiVanBan)EntityCacheUtil.getResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
				LoaiVanBanImpl.class, primaryKey);

		if (loaiVanBan == _nullLoaiVanBan) {
			return null;
		}

		if (loaiVanBan == null) {
			Session session = null;

			try {
				session = openSession();

				loaiVanBan = (LoaiVanBan)session.get(LoaiVanBanImpl.class,
						primaryKey);

				if (loaiVanBan != null) {
					cacheResult(loaiVanBan);
				}
				else {
					EntityCacheUtil.putResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
						LoaiVanBanImpl.class, primaryKey, _nullLoaiVanBan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LoaiVanBanModelImpl.ENTITY_CACHE_ENABLED,
					LoaiVanBanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return loaiVanBan;
	}

	/**
	 * Returns the loai van ban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the loai van ban
	 * @return the loai van ban, or <code>null</code> if a loai van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVanBan fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the loai van bans.
	 *
	 * @return the loai van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiVanBan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai van bans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LoaiVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai van bans
	 * @param end the upper bound of the range of loai van bans (not inclusive)
	 * @return the range of loai van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiVanBan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai van bans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LoaiVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai van bans
	 * @param end the upper bound of the range of loai van bans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loai van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiVanBan> findAll(int start, int end,
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

		List<LoaiVanBan> list = (List<LoaiVanBan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAIVANBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAIVANBAN;

				if (pagination) {
					sql = sql.concat(LoaiVanBanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LoaiVanBan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiVanBan>(list);
				}
				else {
					list = (List<LoaiVanBan>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the loai van bans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LoaiVanBan loaiVanBan : findAll()) {
			remove(loaiVanBan);
		}
	}

	/**
	 * Returns the number of loai van bans.
	 *
	 * @return the number of loai van bans
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

				Query q = session.createQuery(_SQL_COUNT_LOAIVANBAN);

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
	 * Initializes the loai van ban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.LoaiVanBan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LoaiVanBan>> listenersList = new ArrayList<ModelListener<LoaiVanBan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LoaiVanBan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LoaiVanBanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOAIVANBAN = "SELECT loaiVanBan FROM LoaiVanBan loaiVanBan";
	private static final String _SQL_COUNT_LOAIVANBAN = "SELECT COUNT(loaiVanBan) FROM LoaiVanBan loaiVanBan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loaiVanBan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LoaiVanBan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LoaiVanBanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Ten"
			});
	private static LoaiVanBan _nullLoaiVanBan = new LoaiVanBanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LoaiVanBan> toCacheModel() {
				return _nullLoaiVanBanCacheModel;
			}
		};

	private static CacheModel<LoaiVanBan> _nullLoaiVanBanCacheModel = new CacheModel<LoaiVanBan>() {
			@Override
			public LoaiVanBan toEntityModel() {
				return _nullLoaiVanBan;
			}
		};
}