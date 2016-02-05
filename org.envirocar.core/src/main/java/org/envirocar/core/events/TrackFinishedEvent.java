/**
 * Copyright (C) 2013 - 2015 the enviroCar community
 * <p>
 * This file is part of the enviroCar app.
 * <p>
 * The enviroCar app is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * The enviroCar app is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along
 * with the enviroCar app. If not, see http://www.gnu.org/licenses/.
 */
package org.envirocar.core.events;

import com.google.common.base.MoreObjects;

import org.envirocar.core.entity.Track;

/**
 * TODO JavaDoc
 *
 * @author dewall
 */
public class TrackFinishedEvent {

    public final Track mTrack;

    /**
     * Constructor.
     *
     * @param track the finished track
     */
    public TrackFinishedEvent(final Track track) {
        this.mTrack = track;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("TrackID", mTrack != null ? mTrack.getTrackID() : "null")
                .toString();
    }
}
