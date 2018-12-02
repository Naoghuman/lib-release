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

/**
 * 
    URL to GitHub project.
    Connect to github project last release (returned as json).
    Opens a github last release url in common browser.
    Extract infos from the json (see ReleaseGitHubConnection).
    Extract the infos about the last release.
    Extract the infos about the last release notes.
    Extract the url to the last release download jar file.
    Contains all methods to convert the 'markdown' release note to a 'html' note.
        Special: #Nr will be convert to a link from the active GitHub project.

 *
 * @since   0.2.0-PRERELEASE
 * @version 0.2.0-PRERELEASE
 * @author  Naoghuman
 */
public interface ReleaseServer {
    
    /**
     * 
     * @param   serverURL 
     * @since   0.2.0-PRERELEASE
     * @version 0.2.0-PRERELEASE
     * @author  Naoghuman
     */
    public void configure(final String serverURL);
    
    /**
     * 
     * @param  json
     * @return 
     * @since   0.2.0-PRERELEASE
     * @version 0.2.0-PRERELEASE
     * @author  Naoghuman
     */
    public String convertJSONtoHTML(final String json);
    
    /**
     * 
     * @param   releaseURL 
     * @since   0.2.0-PRERELEASE
     * @version 0.2.0-PRERELEASE
     * @author  Naoghuman
     */
    public void download(final String releaseURL);
    
    /**
     * 
     * @param   issue
     * @return 
     * @since   0.2.0-PRERELEASE
     * @version 0.2.0-PRERELEASE
     * @author  Naoghuman
     */
    public String getIssueURL(final int issue);
    
    /**
     * 
     * @param   release
     * @return 
     * @since   0.2.0-PRERELEASE
     * @version 0.2.0-PRERELEASE
     * @author  Naoghuman
     */
    public String getReleaseURL(final String release);
    
}
