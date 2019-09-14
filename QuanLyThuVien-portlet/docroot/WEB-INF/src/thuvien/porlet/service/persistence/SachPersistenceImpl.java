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

import thuvien.porlet.NoSuchSachException;

import thuvien.porlet.model.Sach;
import thuvien.porlet.model.impl.SachImpl;
import thuvien.porlet.model.impl.SachModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the sach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see SachPersistence
 * @see SachUtil
 * @generated
 */
public class SachPersistenceImpl extends BasePersistenceImpl<Sach>
	implements SachPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SachUtil} to access the sach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SachImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SachModelImpl.ENTITY_CACHE_ENABLED,
			SachModelImpl.FINDER_CACHE_ENABLED, SachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SachModelImpl.ENTITY_CACHE_ENABLED,
			SachModelImpl.FINDER_CACHE_ENABLED, SachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SachModelImpl.ENTITY_CACHE_ENABLED,
			SachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SachPersistenceImpl() {
		setModelClass(Sach.class);
	}

	/**
	 * Caches the sach in the entity cache if it is enabled.
	 *
	 * @param sach the sach
	 */
	@Override
	public void cacheResult(Sach sach) {
		EntityCacheUtil.putResult(SachModelImpl.ENTITY_CACHE_ENABLED,
			SachImpl.class, sach.getPrimaryKey(), sach);

		sach.resetOriginalValues();
	}

	/**
	 * Caches the sachs in the entity cache if it is enabled.
	 *
	 * @param sachs the sachs
	 */
	@Override
	public void cacheResult(List<Sach> sachs) {
		for (Sach sach : sachs) {
			if (EntityCacheUtil.getResult(SachModelImpl.ENTITY_CACHE_ENABLED,
						SachImpl.class, sach.getPrimaryKey()) == null) {
				cacheResult(sach);
			}
			else {
				sach.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sachs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SachImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SachImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sach.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sach sach) {
		EntityCacheUtil.removeResult(SachModelImpl.ENTITY_CACHE_ENABLED,
			SachImpl.class, sach.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Sach> sachs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Sach sach : sachs) {
			EntityCacheUtil.removeResult(SachModelImpl.ENTITY_CACHE_ENABLED,
				SachImpl.class, sach.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sach with the primary key. Does not add the sach to the database.
	 *
	 * @param Id the primary key for the new sach
	 * @return the new sach
	 */
	@Override
	public Sach create(long Id) {
		Sach sach = new SachImpl();

		sach.setNew(true);
		sach.setPrimaryKey(Id);

		return sach;
	}

	/**
	 * Removes the sach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the sach
	 * @return the sach that was removed
	 * @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sach remove(long Id) throws NoSuchSachException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the sach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sach
	 * @return the sach that was removed
	 * @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sach remove(Serializable primaryKey)
		throws NoSuchSachException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Sach sach = (Sach)session.get(SachImpl.class, primaryKey);

			if (sach == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sach);
		}
		catch (NoSuchSachException nsee) {
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
	protected Sach removeImpl(Sach sach) throws SystemException {
		sach = toUnwrappedModel(sach);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sach)) {
				sach = (Sach)session.get(SachImpl.class, sach.getPrimaryKeyObj());
			}

			if (sach != null) {
				session.delete(sach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sach != null) {
			clearCache(sach);
		}

		return sach;
	}

	@Override
	public Sach updateImpl(thuvien.porlet.model.Sach sach)
		throws SystemException {
		sach = toUnwrappedModel(sach);

		boolean isNew = sach.isNew();

		Session session = null;

		try {
			session = openSession();

			if (sach.isNew()) {
				session.save(sach);

				sach.setNew(false);
			}
			else {
				session.merge(sach);
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

		EntityCacheUtil.putResult(SachModelImpl.ENTITY_CACHE_ENABLED,
			SachImpl.class, sach.getPrimaryKey(), sach);

		return sach;
	}

	protected Sach toUnwrappedModel(Sach sach) {
		if (sach instanceof SachImpl) {
			return sach;
		}

		SachImpl sachImpl = new SachImpl();

		sachImpl.setNew(sach.isNew());
		sachImpl.setPrimaryKey(sach.getPrimaryKey());

		sachImpl.setId(sach.getId());
		sachImpl.setTenSach(sach.getTenSach());
		sachImpl.setTheLoaiId(sach.getTheLoaiId());
		sachImpl.setSoLuong(sach.getSoLuong());
		sachImpl.setTrangThai(sach.getTrangThai());
		sachImpl.setNhaXB(sach.getNhaXB());
		sachImpl.setMaSach(sach.getMaSach());
		sachImpl.setKe(sach.getKe());
		sachImpl.setTang(sach.getTang());

		return sachImpl;
	}

	/**
	 * Returns the sach with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sach
	 * @return the sach
	 * @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sach findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSachException, SystemException {
		Sach sach = fetchByPrimaryKey(primaryKey);

		if (sach == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sach;
	}

	/**
	 * Returns the sach with the primary key or throws a {@link thuvien.porlet.NoSuchSachException} if it could not be found.
	 *
	 * @param Id the primary key of the sach
	 * @return the sach
	 * @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sach findByPrimaryKey(long Id)
		throws NoSuchSachException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the sach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sach
	 * @return the sach, or <code>null</code> if a sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sach fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Sach sach = (Sach)EntityCacheUtil.getResult(SachModelImpl.ENTITY_CACHE_ENABLED,
				SachImpl.class, primaryKey);

		if (sach == _nullSach) {
			return null;
		}

		if (sach == null) {
			Session session = null;

			try {
				session = openSession();

				sach = (Sach)session.get(SachImpl.class, primaryKey);

				if (sach != null) {
					cacheResult(sach);
				}
				else {
					EntityCacheUtil.putResult(SachModelImpl.ENTITY_CACHE_ENABLED,
						SachImpl.class, primaryKey, _nullSach);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SachModelImpl.ENTITY_CACHE_ENABLED,
					SachImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sach;
	}

	/**
	 * Returns the sach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the sach
	 * @return the sach, or <code>null</code> if a sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sach fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the sachs.
	 *
	 * @return the sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Sach> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.SachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sachs
	 * @param end the upper bound of the range of sachs (not inclusive)
	 * @return the range of sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Sach> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.SachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sachs
	 * @param end the upper bound of the range of sachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Sach> findAll(int start, int end,
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

		List<Sach> list = (List<Sach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SACH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SACH;

				if (pagination) {
					sql = sql.concat(SachModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Sach>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Sach>(list);
				}
				else {
					list = (List<Sach>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the sachs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Sach sach : findAll()) {
			remove(sach);
		}
	}

	/**
	 * Returns the number of sachs.
	 *
	 * @return the number of sachs
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

				Query q = session.createQuery(_SQL_COUNT_SACH);

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
	 * Initializes the sach persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.thuvien.porlet.model.Sach")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Sach>> listenersList = new ArrayList<ModelListener<Sach>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Sach>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SachImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SACH = "SELECT sach FROM Sach sach";
	private static final String _SQL_COUNT_SACH = "SELECT COUNT(sach) FROM Sach sach";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sach.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sach exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SachPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "TenSach", "TheLoaiId", "SoLuong", "TrangThai", "NhaXB",
				"MaSach", "Ke", "Tang"
			});
	private static Sach _nullSach = new SachImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Sach> toCacheModel() {
				return _nullSachCacheModel;
			}
		};

	private static CacheModel<Sach> _nullSachCacheModel = new CacheModel<Sach>() {
			@Override
			public Sach toEntityModel() {
				return _nullSach;
			}
		};
}