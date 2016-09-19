/*
 * EnterpriseLoginEvent.java
 *
 * Copyright (c) 2016 Auth0 (http://auth0.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.auth0.android.lock.events;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class EnterpriseLoginEvent {

    private final String strategyName;
    private final String connectionName;
    private final String username;
    private final String password;
    private final boolean useRO;

    public EnterpriseLoginEvent(@Nullable String strategyName, @NonNull String connectionName, String username, String password) {
        this.strategyName = strategyName;
        this.connectionName = connectionName;
        this.username = username;
        this.password = password;
        this.useRO = true;
    }

    public EnterpriseLoginEvent(@Nullable String strategyName, @NonNull String connectionName) {
        this.strategyName = strategyName;
        this.connectionName = connectionName;
        this.username = "";
        this.password = "";
        this.useRO = false;
    }

    @Nullable
    public String getStrategyName() {
        return strategyName;
    }

    @NonNull
    public String getConnectionName() {
        return connectionName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean useRO() {
        return useRO;
    }
}