/*
 * Copyright 2021 znai maintainers
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

package org.testingisdocumenting.znai.doxygen.parser;

import org.testingisdocumenting.znai.extensions.api.ApiLinkedText;
import org.testingisdocumenting.znai.structure.DocStructure;
import org.testingisdocumenting.znai.utils.XmlUtils;
import org.w3c.dom.Node;

public class DoxygenTextWithLinksParser {
    private DoxygenTextWithLinksParser() {
    }

    public static ApiLinkedText parse(DocStructure docStructure, Node nodeWithLinks) {
        ApiLinkedText result = new ApiLinkedText();
        XmlUtils.forEach(nodeWithLinks.getChildNodes(), (node) -> {
            if (node.getNodeType() == Node.TEXT_NODE) {
                result.addPart(node.getTextContent());
            }

            if (node.getNodeName().equals("ref")) {
                String refId = XmlUtils.getAttributeText(node, "refid");
                result.addPart(node.getTextContent(), () -> docStructure.findGlobalAnchorUrl(refId).orElse(""));
            }
        });

        return result;
    }
}
