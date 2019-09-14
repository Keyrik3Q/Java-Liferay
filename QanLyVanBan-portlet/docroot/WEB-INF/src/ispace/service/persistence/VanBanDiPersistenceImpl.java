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

import ispace.NoSuchVanBanDiException;

import ispace.model.VanBanDi;

import ispace.model.impl.VanBanDiImpl;
import ispace.model.impl.VanBanDiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the van ban di service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see VanBanDiPersistence
 * @see VanBanDiUtil
 * @generated
 */
public class VanBanDiPersistenceImpl extends BasePersistenceImpl<VanBanDi>
	implements VanBanDiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VanBanDiUtil} to access the van ban di persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VanBanDiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDiModelImpl.FINDER_CACHE_ENABLED, VanBanDiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDiModelImpl.FINDER_CACHE_ENABLED, VanBanDiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VanBanDiPersistenceImpl() {
		setModelClass(VanBanDi.class);
	}

	/**
	 * Caches the van ban di in the entity cache if it is enabled.
	 *
	 * @param vanBanDi the van ban di
	 */
	@Override
	public void cacheResult(VanBanDi vanBanDi) {
		EntityCacheUtil.putResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDiImpl.class, vanBanDi.getPrimaryKey(), vanBanDi);

		vanBanDi.resetOriginalValues();
	}

	/**
	 * Caches the van ban dis in the entity cache if it is enabled.
	 *
	 * @param vanBanDis the van ban dis
	 */
	@Override
	public void cacheResult(List<VanBanDi> vanBanDis) {
		for (VanBanDi vanBanDi : vanBanDis) {
			if (EntityCacheUtil.getResult(
						VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
						VanBanDiImpl.class, vanBanDi.getPrimaryKey()) == null) {
				cacheResult(vanBanDi);
			}
			else {
				vanBanDi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all van ban dis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VanBanDiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VanBanDiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the van ban di.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VanBanDi vanBanDi) {
		EntityCacheUtil.removeResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDiImpl.class, vanBanDi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VanBanDi> vanBanDis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VanBanDi vanBanDi : vanBanDis) {
			EntityCacheUtil.removeResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
				VanBanDiImpl.class, vanBanDi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new van ban di with the primary key. Does not add the van ban di to the database.
	 *
	 * @param Id the primary key for the new van ban di
	 * @return the new van ban di
	 */
	@Override
	public VanBanDi create(long Id) {
		VanBanDi vanBanDi = new VanBanDiImpl();

		vanBanDi.setNew(true);
		vanBanDi.setPrimaryKey(Id);

		return vanBanDi;
	}

	/**
	 * Removes the van ban di with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the van ban di
	 * @return the van ban di that was removed
	 * @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDi remove(long Id)
		throws NoSuchVanBanDiException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the van ban di with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the van ban di
	 * @return the van ban di that was removed
	 * @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDi remove(Serializable primaryKey)
		throws NoSuchVanBanDiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VanBanDi vanBanDi = (VanBanDi)session.get(VanBanDiImpl.class,
					primaryKey);

			if (vanBanDi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVanBanDiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vanBanDi);
		}
		catch (NoSuchVanBanDiException nsee) {
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
	protected VanBanDi removeImpl(VanBanDi vanBanDi) throws SystemException {
		vanBanDi = toUnwrappedModel(vanBanDi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vanBanDi)) {
				vanBanDi = (VanBanDi)session.get(VanBanDiImpl.class,
						vanBanDi.getPrimaryKeyObj());
			}

			if (vanBanDi != null) {
				session.delete(vanBanDi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vanBanDi != null) {
			clearCache(vanBanDi);
		}

		return vanBanDi;
	}

	@Override
	public VanBanDi updateImpl(ispace.model.VanBanDi vanBanDi)
		throws SystemException {
		vanBanDi = toUnwrappedModel(vanBanDi);

		boolean isNew = vanBanDi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vanBanDi.isNew()) {
				session.save(vanBanDi);

				vanBanDi.setNew(false);
			}
			else {
				session.merge(vanBanDi);
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

		EntityCacheUtil.putResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDiImpl.class, vanBanDi.getPrimaryKey(), vanBanDi);

		return vanBanDi;
	}

	protected VanBanDi toUnwrappedModel(VanBanDi vanBanDi) {
		if (vanBanDi instanceof VanBanDiImpl) {
			return vanBanDi;
		}

		VanBanDiImpl vanBanDiImpl = new VanBanDiImpl();

		vanBanDiImpl.setNew(vanBanDi.isNew());
		vanBanDiImpl.setPrimaryKey(vanBanDi.getPrimaryKey());

		vanBanDiImpl.setId(vanBanDi.getId());
		vanBanDiImpl.setSoKiHieu(vanBanDi.getSoKiHieu());
		vanBanDiImpl.setLoaiVanBan(vanBanDi.getLoaiVanBan());
		vanBanDiImpl.setSoVanBan(vanBanDi.getSoVanBan());
		vanBanDiImpl.setNguoiKy(vanBanDi.getNguoiKy());
		vanBanDiImpl.setNgayKy(vanBanDi.getNgayKy());

		return vanBanDiImpl;
	}

	/**
	 * Returns the van ban di with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the van ban di
	 * @return the van ban di
	 * @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVanBanDiException, SystemException {
		VanBanDi vanBanDi = fetchByPrimaryKey(primaryKey);

		if (vanBanDi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVanBanDiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vanBanDi;
	}

	/**
	 * Returns the van ban di with the primary key or throws a {@link ispace.NoSuchVanBanDiException} if it could not be found.
	 *
	 * @param Id the primary key of the van ban di
	 * @return the van ban di
	 * @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDi findByPrimaryKey(long Id)
		throws NoSuchVanBanDiException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the van ban di with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the van ban di
	 * @return the van ban di, or <code>null</code> if a van ban di with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VanBanDi vanBanDi = (VanBanDi)EntityCacheUtil.getResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
				VanBanDiImpl.class, primaryKey);

		if (vanBanDi == _nullVanBanDi) {
			return null;
		}

		if (vanBanDi == null) {
			Session session = null;

			try {
				session = openSession();

				vanBanDi = (VanBanDi)session.get(VanBanDiImpl.class, primaryKey);

				if (vanBanDi != null) {
					cacheResult(vanBanDi);
				}
				else {
					EntityCacheUtil.putResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
						VanBanDiImpl.class, primaryKey, _nullVanBanDi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VanBanDiModelImpl.ENTITY_CACHE_ENABLED,
					VanBanDiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vanBanDi;
	}

	/**
	 * Returns the van ban di with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the van ban di
	 * @return the van ban di, or <code>null</code> if a van ban di with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDi fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the van ban dis.
	 *
	 * @return the van ban dis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VanBanDi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the van ban dis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of van ban dis
	 * @param end the upper bound of the range of van ban dis (not inclusive)
	 * @return the range of van ban dis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VanBanDi> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the van ban dis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of van ban dis
	 * @param end the upper bound of the range of van ban dis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of van ban dis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VanBanDi> findAll(int start, int end,
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

		List<VanBanDi> list = (List<VanBanDi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VANBANDI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VANBANDI;

				if (pagination) {
					sql = sql.concat(VanBanDiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VanBanDi>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VanBanDi>(list);
				}
				else {
					list = (List<VanBanDi>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the van ban dis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VanBanDi vanBanDi : findAll()) {
			remove(vanBanDi);
		}
	}

	/**
	 * Returns the number of van ban dis.
	 *
	 * @return the number of van ban dis
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

				Query q = session.createQuery(_SQL_COUNT_VANBANDI);

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
	 * Initializes the van ban di persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.VanBanDi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VanBanDi>> listenersList = new ArrayList<ModelListener<VanBanDi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VanBanDi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VanBanDiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VANBANDI = "SELECT vanBanDi FROM VanBanDi vanBanDi";
	private static final String _SQL_COUNT_VANBANDI = "SELECT COUNT(vanBanDi) FROM VanBanDi vanBanDi";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vanBanDi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VanBanDi exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VanBanDiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "SoKiHieu", "LoaiVanBan", "SoVanBan", "NguoiKy", "NgayKy"
			});
	private static VanBanDi _nullVanBanDi = new VanBanDiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VanBanDi> toCacheModel() {
				return _nullVanBanDiCacheModel;
			}
		};

	private static CacheModel<VanBanDi> _nullVanBanDiCacheModel = new CacheModel<VanBanDi>() {
			@Override
			public VanBanDi toEntityModel() {
				return _nullVanBanDi;
			}
		};
}