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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

/**
 * <p>Provides ...</p>
 * <p>
 * <p>Created on 25/08/2016 by willows_s</p>
 *
 * @author <a href="mailto:willows_s@iblocks.co.uk">willows_s</a>
 */
@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({@JsonSubTypes.Type(value = Sub1Bean.class, name = "sub1")})
@ApiModel(description = "BaseBean", discriminator = "type", subTypes = {Sub1Bean.class})
public class BaseBean {
    public String type;
    public int a;
    public String b;
}
