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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface EnterpriseArchitecturePropertiesEditionPart {



	/**
	 * Init the architectures
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initArchitectures(ReferencesTableSettings settings);

	/**
	 * Update the architectures
	 * @param newValue the architectures to update
	 * 
	 */
	public void updateArchitectures();

	/**
	 * Adds the given filter to the architectures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArchitectures(ViewerFilter filter);

	/**
	 * Adds the given filter to the architectures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArchitectures(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the architectures table
	 * 
	 */
	public boolean isContainedInArchitecturesTable(EObject element);




	/**
	 * Init the containers
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainers(ReferencesTableSettings settings);

	/**
	 * Update the containers
	 * @param newValue the containers to update
	 * 
	 */
	public void updateContainers();

	/**
	 * Adds the given filter to the containers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainers(ViewerFilter filter);

	/**
	 * Adds the given filter to the containers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containers table
	 * 
	 */
	public boolean isContainedInContainersTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}