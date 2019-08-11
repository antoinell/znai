/*
 * Copyright 2019 TWO SIGMA OPEN SOURCE, LLC
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

package com.twosigma.znai.extensions.keyboard;

import com.twosigma.znai.core.ComponentsRegistry;
import com.twosigma.znai.extensions.PluginParams;
import com.twosigma.znai.extensions.PluginResult;
import com.twosigma.znai.extensions.inlinedcode.InlinedCodePlugin;
import com.twosigma.znai.parser.docelement.DocElement;
import com.twosigma.znai.search.SearchScore;
import com.twosigma.znai.search.SearchText;

import java.nio.file.Path;

public class KeyboardShortcutInlinedCodePlugin implements InlinedCodePlugin {
    private String shortcut;

    @Override
    public String id() {
        return "kbd";
    }

    @Override
    public InlinedCodePlugin create() {
        return new KeyboardShortcutInlinedCodePlugin();
    }

    @Override
    public PluginResult process(ComponentsRegistry componentsRegistry, Path markupPath, PluginParams pluginParams) {
        shortcut = pluginParams.getFreeParam();
        return PluginResult.docElement(new DocElement("KeyboardShortcut", "shortcut", shortcut));
    }

    @Override
    public SearchText textForSearch() {
        return SearchScore.STANDARD.text(shortcut);
    }

}
