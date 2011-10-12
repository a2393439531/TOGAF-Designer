/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.ui.application;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.ide.application.IDEWorkbenchAdvisor;
import org.obeonetwork.dsl.togaf.ui.perspectives.TogafPerspective;

public class ApplicationWorkbenchAdvisor extends /* WorkbenchAdvisor */IDEWorkbenchAdvisor {

	@Override
	public String getInitialWindowPerspectiveId() {
		return TogafPerspective.ID;
	}

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(this, configurer);
	}

	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);

		/*
		 * configurer.setSaveAndRestore(true);
		 * PlatformUI.getPreferenceStore().setValue
		 * (IWorkbenchPreferenceConstants.CLOSE_EDITORS_ON_EXIT, true);
		 * PlatformUI
		 * .getPreferenceStore().setValue(IWorkbenchPreferenceConstants
		 * .SHOW_TRADITIONAL_STYLE_TABS, false);
		 * PlatformUI.getPreferenceStore().
		 * setDefault(IWorkbenchPreferenceConstants.DOCK_PERSPECTIVE_BAR,
		 * IWorkbenchPreferenceConstants.TOP_RIGHT);
		 */
	}
}