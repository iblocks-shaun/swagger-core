/*
 * Copyright (c) 2001-2016 iBlocks Ltd.
 * 28a, Cole Street, London Bridge, SE1 4YH, England.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * iBlocks Ltd. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with iBlocks.
 */

package io.swagger.models;

import io.swagger.annotations.ApiModel;

/**
 * <p>Provides ...</p>
 * <p>
 * <p>Created on 25/08/2016 by willows_s</p>
 *
 * @author <a href="mailto:willows_s@iblocks.co.uk">willows_s</a>
 */
@ApiModel(description = "Sub1Bean", parent = BaseBean.class)
public class Sub1Bean extends BaseBean {
    public int c;
}
