/**
 * Copyright (C) 2016-2020 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.bde.builder;

import java.util.List;

import javax.annotation.Nonnull;
import javax.xml.validation.Schema;

import com.helger.bde.CBDE;
import com.helger.bde.v10.BDE10EnvelopeType;
import com.helger.bde.v11.BDE11EnvelopeType;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.string.StringHelper;
import com.helger.jaxb.builder.IJAXBDocumentType;
import com.helger.jaxb.builder.JAXBDocumentType;

/**
 * Enumeration with all available BDE document types.
 *
 * @author Philip Helger
 */
public enum EBDEDocumentType implements IJAXBDocumentType
{
  BDE10 (BDE10EnvelopeType.class, CBDE.BDE10_XSDS),
  BDE11 (BDE11EnvelopeType.class, CBDE.BDE11_XSDS);

  private final JAXBDocumentType m_aDocType;

  private EBDEDocumentType (@Nonnull final Class <?> aClass, @Nonnull final List <ClassPathResource> aXSDs)
  {
    m_aDocType = new JAXBDocumentType (aClass, aXSDs, x -> StringHelper.trimEnd (x, "Type"));
  }

  @Nonnull
  public Class <?> getImplementationClass ()
  {
    return m_aDocType.getImplementationClass ();
  }

  @Nonnull
  @Nonempty
  @ReturnsMutableCopy
  public ICommonsList <ClassPathResource> getAllXSDResources ()
  {
    return m_aDocType.getAllXSDResources ();
  }

  @Nonnull
  public String getNamespaceURI ()
  {
    return m_aDocType.getNamespaceURI ();
  }

  @Nonnull
  @Nonempty
  public String getLocalName ()
  {
    return m_aDocType.getLocalName ();
  }

  @Nonnull
  public Schema getSchema ()
  {
    return m_aDocType.getSchema ();
  }
}
