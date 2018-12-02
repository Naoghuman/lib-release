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

import com.github.naoghuman.lib.release.core.ReleaseServer;

/**
 *
 * @since   0.2.0-PRERELEASE
 * @version 0.2.0-PRERELEASE
 * @author  Naoghuman
 */
public final class DefaultReleaseServerGitHub implements ReleaseServer {

    @Override
    public void configure(final String serverURL) {
        DefaultReleaseValidator.requireNonNullAndNotEmpty(serverURL);
    }

    @Override
    public String convertJSONtoHTML(final String json) {
        DefaultReleaseValidator.requireNonNullAndNotEmpty(json);
        
        return null;
    }

    @Override
    public void download(final String releaseURL) {
        DefaultReleaseValidator.requireNonNullAndNotEmpty(releaseURL);
    }

    @Override
    public String getIssueURL(final int issue) {
        DefaultReleaseValidator.requireNotLesserThen(0, issue);
        
        return null;
    }

    @Override
    public String getReleaseURL(final String release) {
        DefaultReleaseValidator.requireNonNullAndNotEmpty(release);
        
        return null;
    }
    
}
