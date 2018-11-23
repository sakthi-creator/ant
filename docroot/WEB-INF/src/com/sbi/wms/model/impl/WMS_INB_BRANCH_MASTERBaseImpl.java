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

package com.sbi.wms.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.sbi.wms.model.WMS_INB_BRANCH_MASTER;
import com.sbi.wms.service.WMS_INB_BRANCH_MASTERLocalServiceUtil;

/**
 * The extended model base implementation for the WMS_INB_BRANCH_MASTER service. Represents a row in the &quot;SBI_WMS_INB_BRANCH_MASTER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WMS_INB_BRANCH_MASTERImpl}.
 * </p>
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTERImpl
 * @see com.sbi.wms.model.WMS_INB_BRANCH_MASTER
 * @generated
 */
public abstract class WMS_INB_BRANCH_MASTERBaseImpl
	extends WMS_INB_BRANCH_MASTERModelImpl implements WMS_INB_BRANCH_MASTER {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a w m s_ i n b_ b r a n c h_ m a s t e r model instance should use the {@link WMS_INB_BRANCH_MASTER} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			WMS_INB_BRANCH_MASTERLocalServiceUtil.addWMS_INB_BRANCH_MASTER(this);
		}
		else {
			WMS_INB_BRANCH_MASTERLocalServiceUtil.updateWMS_INB_BRANCH_MASTER(this);
		}
	}
}