/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.entitySystem.event;

import org.terasology.engine.API;

/**
 * @author Immortius
 */
@API
public final class EventPriority {
    public static final int PRIORITY_CRITICAL = 200;
    public static final int PRIORITY_HIGH = 150;
    public static final int PRIORITY_NORMAL = 100;
    public static final int PRIORITY_LOW = 50;
    public static final int PRIORITY_TRIVIAL = 0;

    private EventPriority() {
    }
}