/*
 * Copyright 2015 Olivier Croisier (thecodersbreakfast.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test5;
/**
 * Represents a light intensity used during led testing (see {@link net.thecodersbreakfast.lp4j.api.LaunchpadClient#testLights(LightIntensity)}.
 *
 * @author Olivier Croisier (olivier.croisier@gmail.com)
 */
public enum LightIntensity {
    /** Low light intensity */
    LOW,
    /** Medium light intensity */
    MEDIUM,
    /** High light intensity */
    HIGH
}
