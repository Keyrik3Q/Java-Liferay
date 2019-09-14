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

import ispace.NoSuchLuanChuyenException;

import ispace.model.LuanChuyen;

import ispace.model.impl.LuanChuyenImpl;
import ispace.model.impl.LuanChuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the luan chuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see LuanChuyenPersistence
 * @see LuanChuyenUtil
 * @generated
 */
public class LuanChuyenPersistenceImpl extends BasePersistenceImpl<LuanChuyen>
	implements LuanChuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LuanChuyenUtil} to access the luan chuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LuanChuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
			LuanChuyenModelImpl.FINDER_CACHE_ENABLED, LuanChuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
			LuanChuyenModelImpl.FINDER_CACHE_ENABLED, LuanChuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
			LuanChuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LuanChuyenPersistenceImpl() {
		setModelClass(LuanChuyen.class);
	}

	/**
	 * Caches the luan chuyen in the entity cache if it is enabled.
	 *
	 * @param luanChuyen the luan chuyen
	 */
	@Override
	public void cacheResult(LuanChuyen luanChuyen) {
		EntityCacheUtil.putResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
			LuanChuyenImpl.class, luanChuyen.getPrimaryKey(), luanChuyen);

		luanChuyen.resetOriginalValues();
	}

	/**
	 * Caches the luan chuyens in the entity cache if it is enabled.
	 *
	 * @param luanChuyens the luan chuyens
	 */
	@Override
	public void cacheResult(List<LuanChuyen> luanChuyens) {
		for (LuanChuyen luanChuyen : luanChuyens) {
			if (EntityCacheUtil.getResult(
						LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
						LuanChuyenImpl.class, luanChuyen.getPrimaryKey()) == null) {
				cacheResult(luanChuyen);
			}
			else {
				luanChuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all luan chuyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LuanChuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LuanChuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the luan chuyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LuanChuyen luanChuyen) {
		EntityCacheUtil.removeResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
			LuanChuyenImpl.class, luanChuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LuanChuyen> luanChuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LuanChuyen luanChuyen : luanChuyens) {
			EntityCacheUtil.removeResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
				LuanChuyenImpl.class, luanChuyen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new luan chuyen with the primary key. Does not add the luan chuyen to the database.
	 *
	 * @param Id the primary key for the new luan chuyen
	 * @return the new luan chuyen
	 */
	@Override
	public LuanChuyen create(long Id) {
		LuanChuyen luanChuyen = new LuanChuyenImpl();

		luanChuyen.setNew(true);
		luanChuyen.setPrimaryKey(Id);

		return luanChuyen;
	}

	/**
	 * Removes the luan chuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the luan chuyen
	 * @return the luan chuyen that was removed
	 * @throws ispace.NoSuchLuanChuyenException if a luan chuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LuanChuyen remove(long Id)
		throws NoSuchLuanChuyenException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the luan chuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the luan chuyen
	 * @return the luan chuyen that was removed
	 * @throws ispace.NoSuchLuanChuyenException if a luan chuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LuanChuyen remove(Serializable primaryKey)
		throws NoSuchLuanChuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LuanChuyen luanChuyen = (LuanChuyen)session.get(LuanChuyenImpl.class,
					primaryKey);

			if (luanChuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLuanChuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(luanChuyen);
		}
		catch (NoSuchLuanChuyenException nsee) {
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
	protected LuanChuyen removeImpl(LuanChuyen luanChuyen)
		throws SystemException {
		luanChuyen = toUnwrappedModel(luanChuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(luanChuyen)) {
				luanChuyen = (LuanChuyen)session.get(LuanChuyenImpl.class,
						luanChuyen.getPrimaryKeyObj());
			}

			if (luanChuyen != null) {
				session.delete(luanChuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (luanChuyen != null) {
			clearCache(luanChuyen);
		}

		return luanChuyen;
	}

	@Override
	public LuanChuyen updateImpl(ispace.model.LuanChuyen luanChuyen)
		throws SystemException {
		luanChuyen = toUnwrappedModel(luanChuyen);

		boolean isNew = luanChuyen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (luanChuyen.isNew()) {
				session.save(luanChuyen);

				luanChuyen.setNew(false);
			}
			else {
				session.merge(luanChuyen);
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

		EntityCacheUtil.putResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
			LuanChuyenImpl.class, luanChuyen.getPrimaryKey(), luanChuyen);

		return luanChuyen;
	}

	protected LuanChuyen toUnwrappedModel(LuanChuyen luanChuyen) {
		if (luanChuyen instanceof LuanChuyenImpl) {
			return luanChuyen;
		}

		LuanChuyenImpl luanChuyenImpl = new LuanChuyenImpl();

		luanChuyenImpl.setNew(luanChuyen.isNew());
		luanChuyenImpl.setPrimaryKey(luanChuyen.getPrimaryKey());

		luanChuyenImpl.setId(luanChuyen.getId());
		luanChuyenImpl.setKieuVanBan(luanChuyen.getKieuVanBan());
		luanChuyenImpl.setIdVanBan(luanChuyen.getIdVanBan());
		luanChuyenImpl.setNgayGui(luanChuyen.getNgayGui());
		luanChuyenImpl.setNgayNhan(luanChuyen.getNgayNhan());
		luanChuyenImpl.setNguoiGui(luanChuyen.getNguoiGui());
		luanChuyenImpl.setNguoiNhan(luanChuyen.getNguoiNhan());
		luanChuyenImpl.setYKien(luanChuyen.getYKien());
		luanChuyenImpl.setHanXuLi(luanChuyen.getHanXuLi());
		luanChuyenImpl.setYKienPhanHoi(luanChuyen.getYKienPhanHoi());
		luanChuyenImpl.setNgayPhanHoi(luanChuyen.getNgayPhanHoi());

		return luanChuyenImpl;
	}

	/**
	 * Returns the luan chuyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the luan chuyen
	 * @return the luan chuyen
	 * @throws ispace.NoSuchLuanChuyenException if a luan chuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LuanChuyen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLuanChuyenException, SystemException {
		LuanChuyen luanChuyen = fetchByPrimaryKey(primaryKey);

		if (luanChuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLuanChuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return luanChuyen;
	}

	/**
	 * Returns the luan chuyen with the primary key or throws a {@link ispace.NoSuchLuanChuyenException} if it could not be found.
	 *
	 * @param Id the primary key of the luan chuyen
	 * @return the luan chuyen
	 * @throws ispace.NoSuchLuanChuyenException if a luan chuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LuanChuyen findByPrimaryKey(long Id)
		throws NoSuchLuanChuyenException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the luan chuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the luan chuyen
	 * @return the luan chuyen, or <code>null</code> if a luan chuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LuanChuyen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LuanChuyen luanChuyen = (LuanChuyen)EntityCacheUtil.getResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
				LuanChuyenImpl.class, primaryKey);

		if (luanChuyen == _nullLuanChuyen) {
			return null;
		}

		if (luanChuyen == null) {
			Session session = null;

			try {
				session = openSession();

				luanChuyen = (LuanChuyen)session.get(LuanChuyenImpl.class,
						primaryKey);

				if (luanChuyen != null) {
					cacheResult(luanChuyen);
				}
				else {
					EntityCacheUtil.putResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
						LuanChuyenImpl.class, primaryKey, _nullLuanChuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LuanChuyenModelImpl.ENTITY_CACHE_ENABLED,
					LuanChuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return luanChuyen;
	}

	/**
	 * Returns the luan chuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the luan chuyen
	 * @return the luan chuyen, or <code>null</code> if a luan chuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LuanChuyen fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the luan chuyens.
	 *
	 * @return the luan chuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LuanChuyen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the luan chuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LuanChuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of luan chuyens
	 * @param end the upper bound of the range of luan chuyens (not inclusive)
	 * @return the range of luan chuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LuanChuyen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the luan chuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LuanChuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of luan chuyens
	 * @param end the upper bound of the range of luan chuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of luan chuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LuanChuyen> findAll(int start, int end,
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

		List<LuanChuyen> list = (List<LuanChuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LUANCHUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LUANCHUYEN;

				if (pagination) {
					sql = sql.concat(LuanChuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LuanChuyen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LuanChuyen>(list);
				}
				else {
					list = (List<LuanChuyen>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the luan chuyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LuanChuyen luanChuyen : findAll()) {
			remove(luanChuyen);
		}
	}

	/**
	 * Returns the number of luan chuyens.
	 *
	 * @return the number of luan chuyens
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

				Query q = session.createQuery(_SQL_COUNT_LUANCHUYEN);

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
	 * Initializes the luan chuyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.LuanChuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LuanChuyen>> listenersList = new ArrayList<ModelListener<LuanChuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LuanChuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LuanChuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LUANCHUYEN = "SELECT luanChuyen FROM LuanChuyen luanChuyen";
	private static final String _SQL_COUNT_LUANCHUYEN = "SELECT COUNT(luanChuyen) FROM LuanChuyen luanChuyen";
	private static final String _ORDER_BY_ENTITY_ALIAS = "luanChuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LuanChuyen exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LuanChuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "KieuVanBan", "IdVanBan", "NgayGui", "NgayNhan",
				"NguoiGui", "NguoiNhan", "YKien", "HanXuLi", "YKienPhanHoi",
				"NgayPhanHoi"
			});
	private static LuanChuyen _nullLuanChuyen = new LuanChuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LuanChuyen> toCacheModel() {
				return _nullLuanChuyenCacheModel;
			}
		};

	private static CacheModel<LuanChuyen> _nullLuanChuyenCacheModel = new CacheModel<LuanChuyen>() {
			@Override
			public LuanChuyen toEntityModel() {
				return _nullLuanChuyen;
			}
		};
}