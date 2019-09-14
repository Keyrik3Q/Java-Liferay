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

import ispace.NoSuchVanBanDenException;

import ispace.model.VanBanDen;

import ispace.model.impl.VanBanDenImpl;
import ispace.model.impl.VanBanDenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the van ban den service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see VanBanDenPersistence
 * @see VanBanDenUtil
 * @generated
 */
public class VanBanDenPersistenceImpl extends BasePersistenceImpl<VanBanDen>
	implements VanBanDenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VanBanDenUtil} to access the van ban den persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VanBanDenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDenModelImpl.FINDER_CACHE_ENABLED, VanBanDenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDenModelImpl.FINDER_CACHE_ENABLED, VanBanDenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VanBanDenPersistenceImpl() {
		setModelClass(VanBanDen.class);
	}

	/**
	 * Caches the van ban den in the entity cache if it is enabled.
	 *
	 * @param vanBanDen the van ban den
	 */
	@Override
	public void cacheResult(VanBanDen vanBanDen) {
		EntityCacheUtil.putResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDenImpl.class, vanBanDen.getPrimaryKey(), vanBanDen);

		vanBanDen.resetOriginalValues();
	}

	/**
	 * Caches the van ban dens in the entity cache if it is enabled.
	 *
	 * @param vanBanDens the van ban dens
	 */
	@Override
	public void cacheResult(List<VanBanDen> vanBanDens) {
		for (VanBanDen vanBanDen : vanBanDens) {
			if (EntityCacheUtil.getResult(
						VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
						VanBanDenImpl.class, vanBanDen.getPrimaryKey()) == null) {
				cacheResult(vanBanDen);
			}
			else {
				vanBanDen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all van ban dens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VanBanDenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VanBanDenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the van ban den.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VanBanDen vanBanDen) {
		EntityCacheUtil.removeResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDenImpl.class, vanBanDen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VanBanDen> vanBanDens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VanBanDen vanBanDen : vanBanDens) {
			EntityCacheUtil.removeResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
				VanBanDenImpl.class, vanBanDen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new van ban den with the primary key. Does not add the van ban den to the database.
	 *
	 * @param Id the primary key for the new van ban den
	 * @return the new van ban den
	 */
	@Override
	public VanBanDen create(long Id) {
		VanBanDen vanBanDen = new VanBanDenImpl();

		vanBanDen.setNew(true);
		vanBanDen.setPrimaryKey(Id);

		return vanBanDen;
	}

	/**
	 * Removes the van ban den with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the van ban den
	 * @return the van ban den that was removed
	 * @throws ispace.NoSuchVanBanDenException if a van ban den with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDen remove(long Id)
		throws NoSuchVanBanDenException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the van ban den with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the van ban den
	 * @return the van ban den that was removed
	 * @throws ispace.NoSuchVanBanDenException if a van ban den with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDen remove(Serializable primaryKey)
		throws NoSuchVanBanDenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VanBanDen vanBanDen = (VanBanDen)session.get(VanBanDenImpl.class,
					primaryKey);

			if (vanBanDen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVanBanDenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vanBanDen);
		}
		catch (NoSuchVanBanDenException nsee) {
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
	protected VanBanDen removeImpl(VanBanDen vanBanDen)
		throws SystemException {
		vanBanDen = toUnwrappedModel(vanBanDen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vanBanDen)) {
				vanBanDen = (VanBanDen)session.get(VanBanDenImpl.class,
						vanBanDen.getPrimaryKeyObj());
			}

			if (vanBanDen != null) {
				session.delete(vanBanDen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vanBanDen != null) {
			clearCache(vanBanDen);
		}

		return vanBanDen;
	}

	@Override
	public VanBanDen updateImpl(ispace.model.VanBanDen vanBanDen)
		throws SystemException {
		vanBanDen = toUnwrappedModel(vanBanDen);

		boolean isNew = vanBanDen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vanBanDen.isNew()) {
				session.save(vanBanDen);

				vanBanDen.setNew(false);
			}
			else {
				session.merge(vanBanDen);
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

		EntityCacheUtil.putResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
			VanBanDenImpl.class, vanBanDen.getPrimaryKey(), vanBanDen);

		return vanBanDen;
	}

	protected VanBanDen toUnwrappedModel(VanBanDen vanBanDen) {
		if (vanBanDen instanceof VanBanDenImpl) {
			return vanBanDen;
		}

		VanBanDenImpl vanBanDenImpl = new VanBanDenImpl();

		vanBanDenImpl.setNew(vanBanDen.isNew());
		vanBanDenImpl.setPrimaryKey(vanBanDen.getPrimaryKey());

		vanBanDenImpl.setId(vanBanDen.getId());
		vanBanDenImpl.setSoKiHieu(vanBanDen.getSoKiHieu());
		vanBanDenImpl.setLoaiVanBan(vanBanDen.getLoaiVanBan());
		vanBanDenImpl.setSoVanBan(vanBanDen.getSoVanBan());
		vanBanDenImpl.setNguoiKy(vanBanDen.getNguoiKy());
		vanBanDenImpl.setNgayKy(vanBanDen.getNgayKy());

		return vanBanDenImpl;
	}

	/**
	 * Returns the van ban den with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the van ban den
	 * @return the van ban den
	 * @throws ispace.NoSuchVanBanDenException if a van ban den with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVanBanDenException, SystemException {
		VanBanDen vanBanDen = fetchByPrimaryKey(primaryKey);

		if (vanBanDen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVanBanDenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vanBanDen;
	}

	/**
	 * Returns the van ban den with the primary key or throws a {@link ispace.NoSuchVanBanDenException} if it could not be found.
	 *
	 * @param Id the primary key of the van ban den
	 * @return the van ban den
	 * @throws ispace.NoSuchVanBanDenException if a van ban den with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDen findByPrimaryKey(long Id)
		throws NoSuchVanBanDenException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the van ban den with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the van ban den
	 * @return the van ban den, or <code>null</code> if a van ban den with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VanBanDen vanBanDen = (VanBanDen)EntityCacheUtil.getResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
				VanBanDenImpl.class, primaryKey);

		if (vanBanDen == _nullVanBanDen) {
			return null;
		}

		if (vanBanDen == null) {
			Session session = null;

			try {
				session = openSession();

				vanBanDen = (VanBanDen)session.get(VanBanDenImpl.class,
						primaryKey);

				if (vanBanDen != null) {
					cacheResult(vanBanDen);
				}
				else {
					EntityCacheUtil.putResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
						VanBanDenImpl.class, primaryKey, _nullVanBanDen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VanBanDenModelImpl.ENTITY_CACHE_ENABLED,
					VanBanDenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vanBanDen;
	}

	/**
	 * Returns the van ban den with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the van ban den
	 * @return the van ban den, or <code>null</code> if a van ban den with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VanBanDen fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the van ban dens.
	 *
	 * @return the van ban dens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VanBanDen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the van ban dens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of van ban dens
	 * @param end the upper bound of the range of van ban dens (not inclusive)
	 * @return the range of van ban dens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VanBanDen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the van ban dens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of van ban dens
	 * @param end the upper bound of the range of van ban dens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of van ban dens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VanBanDen> findAll(int start, int end,
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

		List<VanBanDen> list = (List<VanBanDen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VANBANDEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VANBANDEN;

				if (pagination) {
					sql = sql.concat(VanBanDenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VanBanDen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VanBanDen>(list);
				}
				else {
					list = (List<VanBanDen>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the van ban dens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VanBanDen vanBanDen : findAll()) {
			remove(vanBanDen);
		}
	}

	/**
	 * Returns the number of van ban dens.
	 *
	 * @return the number of van ban dens
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

				Query q = session.createQuery(_SQL_COUNT_VANBANDEN);

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
	 * Initializes the van ban den persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.VanBanDen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VanBanDen>> listenersList = new ArrayList<ModelListener<VanBanDen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VanBanDen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VanBanDenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VANBANDEN = "SELECT vanBanDen FROM VanBanDen vanBanDen";
	private static final String _SQL_COUNT_VANBANDEN = "SELECT COUNT(vanBanDen) FROM VanBanDen vanBanDen";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vanBanDen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VanBanDen exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VanBanDenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "SoKiHieu", "LoaiVanBan", "SoVanBan", "NguoiKy", "NgayKy"
			});
	private static VanBanDen _nullVanBanDen = new VanBanDenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VanBanDen> toCacheModel() {
				return _nullVanBanDenCacheModel;
			}
		};

	private static CacheModel<VanBanDen> _nullVanBanDenCacheModel = new CacheModel<VanBanDen>() {
			@Override
			public VanBanDen toEntityModel() {
				return _nullVanBanDen;
			}
		};
}