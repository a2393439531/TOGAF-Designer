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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface EventPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the ID
	 * 
	 */
	public String getID();

	/**
	 * Defines a new ID
	 * @param newValue the new ID to set
	 * 
	 */
	public void setID(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the category
	 * 
	 */
	public String getCategory();

	/**
	 * Defines a new category
	 * @param newValue the new category to set
	 * 
	 */
	public void setCategory(String newValue);


	/**
	 * @return the source
	 * 
	 */
	public String getSource();

	/**
	 * Defines a new source
	 * @param newValue the new source to set
	 * 
	 */
	public void setSource(String newValue);


	/**
	 * @return the owner
	 * 
	 */
	public String getOwner();

	/**
	 * Defines a new owner
	 * @param newValue the new owner to set
	 * 
	 */
	public void setOwner(String newValue);


	/**
	 * @return the is Generated By Actors
	 * 
	 */
	public EObject getIsGeneratedByActors();

	/**
	 * Init the is Generated By Actors
	 * @param settings the combo setting
	 */
	public void initIsGeneratedByActors(EObjectFlatComboSettings settings);

	/**
	 * Defines a new is Generated By Actors
	 * @param newValue the new is Generated By Actors to set
	 * 
	 */
	public void setIsGeneratedByActors(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setIsGeneratedByActorsButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the is Generated By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsGeneratedByActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Generated By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsGeneratedByActors(ViewerFilter filter);




	/**
	 * Init the is Resolved By Actors
	 * @param settings settings for the is Resolved By Actors ReferencesTable 
	 */
	public void initIsResolvedByActors(ReferencesTableSettings settings);

	/**
	 * Update the is Resolved By Actors
	 * @param newValue the is Resolved By Actors to update
	 * 
	 */
	public void updateIsResolvedByActors();

	/**
	 * Adds the given filter to the is Resolved By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsResolvedByActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Resolved By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsResolvedByActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Resolved By Actors table
	 * 
	 */
	public boolean isContainedInIsResolvedByActorsTable(EObject element);




	/**
	 * Init the is Resolved By Business Services
	 * @param settings settings for the is Resolved By Business Services ReferencesTable 
	 */
	public void initIsResolvedByBusinessServices(ReferencesTableSettings settings);

	/**
	 * Update the is Resolved By Business Services
	 * @param newValue the is Resolved By Business Services to update
	 * 
	 */
	public void updateIsResolvedByBusinessServices();

	/**
	 * Adds the given filter to the is Resolved By Business Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsResolvedByBusinessServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Resolved By Business Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsResolvedByBusinessServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Resolved By Business Services table
	 * 
	 */
	public boolean isContainedInIsResolvedByBusinessServicesTable(EObject element);




	/**
	 * Init the is Resolved By Processes
	 * @param settings settings for the is Resolved By Processes ReferencesTable 
	 */
	public void initIsResolvedByProcesses(ReferencesTableSettings settings);

	/**
	 * Update the is Resolved By Processes
	 * @param newValue the is Resolved By Processes to update
	 * 
	 */
	public void updateIsResolvedByProcesses();

	/**
	 * Adds the given filter to the is Resolved By Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsResolvedByProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Resolved By Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsResolvedByProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Resolved By Processes table
	 * 
	 */
	public boolean isContainedInIsResolvedByProcessesTable(EObject element);




	/**
	 * Init the is Generated By Processes
	 * @param settings settings for the is Generated By Processes ReferencesTable 
	 */
	public void initIsGeneratedByProcesses(ReferencesTableSettings settings);

	/**
	 * Update the is Generated By Processes
	 * @param newValue the is Generated By Processes to update
	 * 
	 */
	public void updateIsGeneratedByProcesses();

	/**
	 * Adds the given filter to the is Generated By Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsGeneratedByProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Generated By Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsGeneratedByProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Generated By Processes table
	 * 
	 */
	public boolean isContainedInIsGeneratedByProcessesTable(EObject element);




	/**
	 * Init the delegates
	 * @param settings settings for the delegates ReferencesTable 
	 */
	public void initDelegates(ReferencesTableSettings settings);

	/**
	 * Update the delegates
	 * @param newValue the delegates to update
	 * 
	 */
	public void updateDelegates();

	/**
	 * Adds the given filter to the delegates edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter);

	/**
	 * Adds the given filter to the delegates edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the delegates table
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element);




	/**
	 * Init the is Delegated By
	 * @param settings settings for the is Delegated By ReferencesTable 
	 */
	public void initIsDelegatedBy(ReferencesTableSettings settings);

	/**
	 * Update the is Delegated By
	 * @param newValue the is Delegated By to update
	 * 
	 */
	public void updateIsDelegatedBy();

	/**
	 * Adds the given filter to the is Delegated By edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Delegated By edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Delegated By table
	 * 
	 */
	public boolean isContainedInIsDelegatedByTable(EObject element);





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