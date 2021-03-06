/**
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A technical capability required to provide enabling infrastructure that supports the delivery of applications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getIsSuppliedByLogicalTechnologyComponents <em>Is Supplied By Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getCategoryTRM <em>Category TRM</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getStandardClass <em>Standard Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPlatformService()
 * @model
 * @generated
 */
public interface PlatformService extends Element {
	/**
	 * Returns the value of the '<em><b>Is Supplied By Logical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices <em>Supplies Platform Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Supplied By Logical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Supplied By Logical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPlatformService_IsSuppliedByLogicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices
	 * @model opposite="suppliesPlatformServices"
	 * @generated
	 */
	EList<LogicalTechnologyComponent> getIsSuppliedByLogicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Category TRM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category TRM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category TRM</em>' attribute.
	 * @see #setCategoryTRM(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPlatformService_CategoryTRM()
	 * @model
	 * @generated
	 */
	String getCategoryTRM();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getCategoryTRM <em>Category TRM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category TRM</em>' attribute.
	 * @see #getCategoryTRM()
	 * @generated
	 */
	void setCategoryTRM(String value);

	/**
	 * Returns the value of the '<em><b>Standard Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Class</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @see #setStandardClass(StandardsClass)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPlatformService_StandardClass()
	 * @model
	 * @generated
	 */
	StandardsClass getStandardClass();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getStandardClass <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Class</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @see #getStandardClass()
	 * @generated
	 */
	void setStandardClass(StandardsClass value);

} // PlatformService
