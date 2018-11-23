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

import com.sbi.wms.model.Exclusif_WMS;
import com.sbi.wms.service.Exclusif_WMSLocalServiceUtil;

/**
 * The extended model base implementation for the Exclusif_WMS service. Represents a row in the &quot;SBI_Exclusif_WMS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Exclusif_WMSImpl}.
 * </p>
 *
 * @author Syed
 * @see Exclusif_WMSImpl
 * @see com.sbi.wms.model.Exclusif_WMS
 * @generated
 */
public abstract class Exclusif_WMSBaseImpl extends Exclusif_WMSModelImpl
	implements Exclusif_WMS {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a exclusif_ w m s model instance should use the {@link Exclusif_WMS} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			Exclusif_WMSLocalServiceUtil.addExclusif_WMS(this);
		}
		else {
			Exclusif_WMSLocalServiceUtil.updateExclusif_WMS(this);
		}
	}
}