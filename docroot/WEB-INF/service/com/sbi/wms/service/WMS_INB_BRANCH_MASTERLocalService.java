/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.sbi.wms.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the w m s_ i n b_ b r a n c h_ m a s t e r local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTERLocalServiceUtil
 * @see com.sbi.wms.service.base.WMS_INB_BRANCH_MASTERLocalServiceBaseImpl
 * @see com.sbi.wms.service.impl.WMS_INB_BRANCH_MASTERLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface WMS_INB_BRANCH_MASTERLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WMS_INB_BRANCH_MASTERLocalServiceUtil} to access the w m s_ i n b_ b r a n c h_ m a s t e r local service. Add custom service methods to {@link com.sbi.wms.service.impl.WMS_INB_BRANCH_MASTERLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the w m s_ i n b_ b r a n c h_ m a s t e r to the database. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER addWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new w m s_ i n b_ b r a n c h_ m a s t e r with the primary key. Does not add the w m s_ i n b_ b r a n c h_ m a s t e r to the database.
	*
	* @param REC_ID the primary key for the new w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the new w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER createWMS_INB_BRANCH_MASTER(
		long REC_ID);

	/**
	* Deletes the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	* @throws PortalException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER deleteWMS_INB_BRANCH_MASTER(
		long REC_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the w m s_ i n b_ b r a n c h_ m a s t e r from the database. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER deleteWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER fetchWMS_INB_BRANCH_MASTER(
		long REC_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r
	* @throws PortalException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER getWMS_INB_BRANCH_MASTER(
		long REC_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @param end the upper bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs (not inclusive)
	* @return the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> getWMS_INB_BRANCH_MASTERs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* @return the number of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getWMS_INB_BRANCH_MASTERsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the w m s_ i n b_ b r a n c h_ m a s t e r in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER updateWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the w m s_ i n b_ b r a n c h_ m a s t e r in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @param merge whether to merge the w m s_ i n b_ b r a n c h_ m a s t e r with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER updateWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;
}