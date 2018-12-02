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
package com.github.naoghuman.lib.release.core;

import com.github.naoghuman.lib.release.internal.DefaultReleaseClient;
import com.github.naoghuman.lib.release.internal.DefaultReleaseServerGitHub;
import java.util.Optional;

/**
 *
 * @since   0.2.0-PRERELEASE
 * @version 0.2.0-PRERELEASE
 * @author  Naoghuman
 */
public final class ReleaseFacade implements ReleaseClient, ReleaseServer {
    
    private static final Optional<ReleaseFacade> INSTANCE = Optional.of(new ReleaseFacade());
    
    /**
     * Returns a {@code singleton} instance from this facade.
     * 
     * @return  a {@code singleton} instance from this facade.
     * @since   0.2.0-PRERELEASE
     * @version 0.2.0-PRERELEASE
     * @author  Naoghuman
     */
    public static ReleaseFacade getDefault() {
        return INSTANCE.get();
    }
    
    private final ReleaseClient releaseClient = new DefaultReleaseClient();
    private final ReleaseServer releaseServer = new DefaultReleaseServerGitHub();
    
    private ReleaseFacade() {
        
    }

    @Override
    public void configure(final String serverURL) {
        releaseServer.configure(serverURL);
    }

    @Override
    public String convertJSONtoHTML(final String json) {
        return releaseServer.convertJSONtoHTML(json);
    }

    @Override
    public void download(final String releaseURL) {
        releaseServer.download(releaseURL);
    }

    @Override
    public String getActualVersion() {
        return releaseClient.getActualVersion();
    }

    @Override
    public String getIssueURL(final int issue) {
        return releaseServer.getIssueURL(issue);
    }

    @Override
    public String getReleaseURL(final String release) {
        return releaseServer.getReleaseURL(release);
    }

    @Override
    public boolean isCheckDuringStartup() {
        return releaseClient.isCheckDuringStartup();
    }

    @Override
    public void setActualVersion(final String actualVersion) {
        releaseClient.setActualVersion(actualVersion);
    }

    @Override
    public void setCheckDuringStartup(final boolean checkDuringStartup) {
        releaseClient.setCheckDuringStartup(checkDuringStartup);
    }
    
    
}
