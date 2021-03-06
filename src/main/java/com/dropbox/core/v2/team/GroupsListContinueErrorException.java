/* DO NOT EDIT */
/* This file was generated from team_groups.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * GroupsListContinueError} error.
 */
public class GroupsListContinueErrorException extends DbxApiException {
    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxTeamTeamRequests#groupsListContinue(String)}.
     */
    public final GroupsListContinueError errorValue;

    public GroupsListContinueErrorException(String requestId, LocalizedText userMessage, GroupsListContinueError errorValue) {
        super(requestId, userMessage, buildMessage("groups/list/continue", userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
