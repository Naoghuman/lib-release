/*
 * Copyright (C) 2018 Naoghuman's dream
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.naoghuman.lib.release.internal;

import com.github.naoghuman.lib.release.core.ReleaseClient;

/**
 *
 * @since   0.2.0-PRERELEASE
 * @version 0.2.0-PRERELEASE
 * @author  Naoghuman
 */
public final class DefaultReleaseClient implements ReleaseClient {
    
    private boolean checkDuringStartup = Boolean.FALSE;
    
    private String ActualVersion = "0.1.0-PRERELEASE"; // NOI18N

    @Override
    public String getActualVersion() {
        return ActualVersion;
    }

    @Override
    public boolean isCheckDuringStartup() {
        return checkDuringStartup;
    }

    @Override
    public void setActualVersion(final String actualVersion) {
        DefaultReleaseValidator.requireNonNullAndNotEmpty(actualVersion);
        
        this.ActualVersion = ActualVersion;
    }

    @Override
    public void setCheckDuringStartup(final boolean checkDuringStartup) {
        this.checkDuringStartup = checkDuringStartup;
    }
    
}
