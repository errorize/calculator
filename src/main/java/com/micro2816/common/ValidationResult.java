/*
 * JDK's License:
 * Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * The program's License:
 * Since the program obeys to Apache License. Please see more details about Apache License.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.micro2816.common;

/**
 * @see 
 * @author Micro
 * @since 2019年10月18日 下午4:17:41
 * @version V1.0
 * @copyright Micro2816 Corporation Limited Copyright (c) 2019
 *
 */
public class ValidationResult {
    private boolean status;
    private String message;
    private Object data;
    
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
