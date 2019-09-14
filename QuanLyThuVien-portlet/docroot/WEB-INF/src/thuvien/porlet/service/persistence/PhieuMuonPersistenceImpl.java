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

import thuvien.porlet.NoSuchPhieuMuonException;

import thuvien.porlet.model.PhieuMuon;
import thuvien.porlet.model.impl.PhieuMuonImpl;
import thuvien.porlet.model.impl.PhieuMuonModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the phieu muon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see PhieuMuonPersistence
 * @see PhieuMuonUtil
 * @generated
 */
public class PhieuMuonPersistenceImpl extends BasePersistenceImpl<PhieuMuon>
	implements PhieuMuonPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PhieuMuonUtil} to access the phieu muon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PhieuMuonImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
			PhieuMuonModelImpl.FINDER_CACHE_ENABLED, PhieuMuonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
			PhieuMuonModelImpl.FINDER_CACHE_ENABLED, PhieuMuonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
			PhieuMuonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PhieuMuonPersistenceImpl() {
		setModelClass(PhieuMuon.class);
	}

	/**
	 * Caches the phieu muon in the entity cache if it is enabled.
	 *
	 * @param phieuMuon the phieu muon
	 */
	@Override
	public void cacheResult(PhieuMuon phieuMuon) {
		EntityCacheUtil.putResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
			PhieuMuonImpl.class, phieuMuon.getPrimaryKey(), phieuMuon);

		phieuMuon.resetOriginalValues();
	}

	/**
	 * Caches the phieu muons in the entity cache if it is enabled.
	 *
	 * @param phieuMuons the phieu muons
	 */
	@Override
	public void cacheResult(List<PhieuMuon> phieuMuons) {
		for (PhieuMuon phieuMuon : phieuMuons) {
			if (EntityCacheUtil.getResult(
						PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
						PhieuMuonImpl.class, phieuMuon.getPrimaryKey()) == null) {
				cacheResult(phieuMuon);
			}
			else {
				phieuMuon.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phieu muons.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PhieuMuonImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PhieuMuonImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phieu muon.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PhieuMuon phieuMuon) {
		EntityCacheUtil.removeResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
			PhieuMuonImpl.class, phieuMuon.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PhieuMuon> phieuMuons) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PhieuMuon phieuMuon : phieuMuons) {
			EntityCacheUtil.removeResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
				PhieuMuonImpl.class, phieuMuon.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phieu muon with the primary key. Does not add the phieu muon to the database.
	 *
	 * @param Id the primary key for the new phieu muon
	 * @return the new phieu muon
	 */
	@Override
	public PhieuMuon create(long Id) {
		PhieuMuon phieuMuon = new PhieuMuonImpl();

		phieuMuon.setNew(true);
		phieuMuon.setPrimaryKey(Id);

		return phieuMuon;
	}

	/**
	 * Removes the phieu muon with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the phieu muon
	 * @return the phieu muon that was removed
	 * @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuMuon remove(long Id)
		throws NoSuchPhieuMuonException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the phieu muon with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phieu muon
	 * @return the phieu muon that was removed
	 * @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuMuon remove(Serializable primaryKey)
		throws NoSuchPhieuMuonException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PhieuMuon phieuMuon = (PhieuMuon)session.get(PhieuMuonImpl.class,
					primaryKey);

			if (phieuMuon == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPhieuMuonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phieuMuon);
		}
		catch (NoSuchPhieuMuonException nsee) {
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
	protected PhieuMuon removeImpl(PhieuMuon phieuMuon)
		throws SystemException {
		phieuMuon = toUnwrappedModel(phieuMuon);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phieuMuon)) {
				phieuMuon = (PhieuMuon)session.get(PhieuMuonImpl.class,
						phieuMuon.getPrimaryKeyObj());
			}

			if (phieuMuon != null) {
				session.delete(phieuMuon);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phieuMuon != null) {
			clearCache(phieuMuon);
		}

		return phieuMuon;
	}

	@Override
	public PhieuMuon updateImpl(thuvien.porlet.model.PhieuMuon phieuMuon)
		throws SystemException {
		phieuMuon = toUnwrappedModel(phieuMuon);

		boolean isNew = phieuMuon.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phieuMuon.isNew()) {
				session.save(phieuMuon);

				phieuMuon.setNew(false);
			}
			else {
				session.merge(phieuMuon);
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

		EntityCacheUtil.putResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
			PhieuMuonImpl.class, phieuMuon.getPrimaryKey(), phieuMuon);

		return phieuMuon;
	}

	protected PhieuMuon toUnwrappedModel(PhieuMuon phieuMuon) {
		if (phieuMuon instanceof PhieuMuonImpl) {
			return phieuMuon;
		}

		PhieuMuonImpl phieuMuonImpl = new PhieuMuonImpl();

		phieuMuonImpl.setNew(phieuMuon.isNew());
		phieuMuonImpl.setPrimaryKey(phieuMuon.getPrimaryKey());

		phieuMuonImpl.setId(phieuMuon.getId());
		phieuMuonImpl.setUserId(phieuMuon.getUserId());
		phieuMuonImpl.setSachId(phieuMuon.getSachId());
		phieuMuonImpl.setNgayMuon(phieuMuon.getNgayMuon());
		phieuMuonImpl.setNgayTra(phieuMuon.getNgayTra());
		phieuMuonImpl.setSoLuong(phieuMuon.getSoLuong());
		phieuMuonImpl.setXacNhan(phieuMuon.getXacNhan());
		phieuMuonImpl.setTrangThai(phieuMuon.getTrangThai());

		return phieuMuonImpl;
	}

	/**
	 * Returns the phieu muon with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieu muon
	 * @return the phieu muon
	 * @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuMuon findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPhieuMuonException, SystemException {
		PhieuMuon phieuMuon = fetchByPrimaryKey(primaryKey);

		if (phieuMuon == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPhieuMuonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phieuMuon;
	}

	/**
	 * Returns the phieu muon with the primary key or throws a {@link thuvien.porlet.NoSuchPhieuMuonException} if it could not be found.
	 *
	 * @param Id the primary key of the phieu muon
	 * @return the phieu muon
	 * @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuMuon findByPrimaryKey(long Id)
		throws NoSuchPhieuMuonException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the phieu muon with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieu muon
	 * @return the phieu muon, or <code>null</code> if a phieu muon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuMuon fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PhieuMuon phieuMuon = (PhieuMuon)EntityCacheUtil.getResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
				PhieuMuonImpl.class, primaryKey);

		if (phieuMuon == _nullPhieuMuon) {
			return null;
		}

		if (phieuMuon == null) {
			Session session = null;

			try {
				session = openSession();

				phieuMuon = (PhieuMuon)session.get(PhieuMuonImpl.class,
						primaryKey);

				if (phieuMuon != null) {
					cacheResult(phieuMuon);
				}
				else {
					EntityCacheUtil.putResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
						PhieuMuonImpl.class, primaryKey, _nullPhieuMuon);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PhieuMuonModelImpl.ENTITY_CACHE_ENABLED,
					PhieuMuonImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phieuMuon;
	}

	/**
	 * Returns the phieu muon with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the phieu muon
	 * @return the phieu muon, or <code>null</code> if a phieu muon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuMuon fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the phieu muons.
	 *
	 * @return the phieu muons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuMuon> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phieu muons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.PhieuMuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phieu muons
	 * @param end the upper bound of the range of phieu muons (not inclusive)
	 * @return the range of phieu muons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuMuon> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phieu muons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.PhieuMuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phieu muons
	 * @param end the upper bound of the range of phieu muons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phieu muons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuMuon> findAll(int start, int end,
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

		List<PhieuMuon> list = (List<PhieuMuon>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHIEUMUON);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHIEUMUON;

				if (pagination) {
					sql = sql.concat(PhieuMuonModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PhieuMuon>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PhieuMuon>(list);
				}
				else {
					list = (List<PhieuMuon>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the phieu muons from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PhieuMuon phieuMuon : findAll()) {
			remove(phieuMuon);
		}
	}

	/**
	 * Returns the number of phieu muons.
	 *
	 * @return the number of phieu muons
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

				Query q = session.createQuery(_SQL_COUNT_PHIEUMUON);

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
	 * Initializes the phieu muon persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.thuvien.porlet.model.PhieuMuon")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PhieuMuon>> listenersList = new ArrayList<ModelListener<PhieuMuon>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PhieuMuon>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PhieuMuonImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHIEUMUON = "SELECT phieuMuon FROM PhieuMuon phieuMuon";
	private static final String _SQL_COUNT_PHIEUMUON = "SELECT COUNT(phieuMuon) FROM PhieuMuon phieuMuon";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phieuMuon.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PhieuMuon exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PhieuMuonPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "UserId", "SachId", "NgayMuon", "NgayTra", "SoLuong",
				"XacNhan", "TrangThai"
			});
	private static PhieuMuon _nullPhieuMuon = new PhieuMuonImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PhieuMuon> toCacheModel() {
				return _nullPhieuMuonCacheModel;
			}
		};

	private static CacheModel<PhieuMuon> _nullPhieuMuonCacheModel = new CacheModel<PhieuMuon>() {
			@Override
			public PhieuMuon toEntityModel() {
				return _nullPhieuMuon;
			}
		};
}