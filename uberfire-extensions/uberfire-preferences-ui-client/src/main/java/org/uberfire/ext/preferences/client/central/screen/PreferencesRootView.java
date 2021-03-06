/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.preferences.client.central.screen;

import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

@Templated
public class PreferencesRootView implements IsElement,
                                            PreferencesRootScreen.View {

    private final TranslationService translationService;

    @Inject
    @DataField("preferences-navbar")
    private Div navbar;

    @Inject
    @DataField("preferences-editor")
    private Div editor;

    @Inject
    @DataField("preferences-actions")
    private Div actions;

    @Inject
    public PreferencesRootView(TranslationService translationService) {
        this.translationService = translationService;
    }

    @Override
    public void init(PreferencesRootScreen presenter) {
    }

    @Override
    public HTMLElement getNavbarContainer() {
        return navbar;
    }

    @Override
    public HTMLElement getEditorContainer() {
        return editor;
    }

    @Override
    public HTMLElement getActionsContainer() {
        return actions;
    }

    @Override
    public String getTranslation(String key) {
        return translationService.format(key);
    }
}
