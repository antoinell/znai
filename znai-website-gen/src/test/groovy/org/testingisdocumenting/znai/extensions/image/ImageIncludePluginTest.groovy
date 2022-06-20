/*
 * Copyright 2022 znai maintainers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.testingisdocumenting.znai.extensions.image

import org.junit.Test
import org.testingisdocumenting.znai.extensions.include.PluginsTestUtils

import static org.testingisdocumenting.webtau.Matchers.code
import static org.testingisdocumenting.webtau.Matchers.throwException

class ImageIncludePluginTest {
    @Test
    void "should handle external http resources and not attempt to read them"() {
        def props = PluginsTestUtils.processIncludeAndGetProps(
                ":include-image: https://super-image")

        props.should == [imageSrc: 'https://super-image',
                         shapes: []]
    }

    @Test
    void "should accept integer as pixel ratio"() {
        def props = PluginsTestUtils.processIncludeAndGetProps(
                ":include-image: dummy.png {pixelRatio: 1}")

        props.should == [imageSrc: '/test-doc/dummy.png',
                         pixelRatio: 1.0,
                         width: 592.0,
                         height: 535.0,
                         timestamp: 0,
                         shapes: []]
    }

    @Test
    void "should validate align option"() {
        code {
            PluginsTestUtils.processIncludeAndGetProps(":include-image: dummy.png {align: \"cen\"}")
        } should throwException(IllegalArgumentException,
                "<align> only accept following values: \"left\", \"center\", \"right\"")
    }
}
