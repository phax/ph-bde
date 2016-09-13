/**
 * Copyright (C) 2016 Philip Helger (www.helger.com)
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

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.bde.v10.BDE10EnvelopeType;
import com.helger.bde.v11.BDE11EnvelopeType;
import com.helger.jaxb.builder.JAXBWriterBuilder;
import com.helger.xml.namespace.MapBasedNamespaceContext;

/**
 * A writer builder for BDE documents.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The BDE implementation class to be read
 */
@NotThreadSafe
public class BDEWriter <JAXBTYPE> extends JAXBWriterBuilder <JAXBTYPE, BDEWriter <JAXBTYPE>>
{
  public BDEWriter (@Nonnull final EBDEDocumentType eDocType)
  {
    super (eDocType);

    // Create a special namespace context for the passed document type
    final MapBasedNamespaceContext aNSContext = new MapBasedNamespaceContext ();
    aNSContext.setDefaultNamespaceURI (m_aDocType.getNamespaceURI ());
    setNamespaceContext (aNSContext);
  }

  /**
   * Create a writer builder for BDE10EnvelopeType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static BDEWriter <BDE10EnvelopeType> envelope10 ()
  {
    return new BDEWriter<> (EBDEDocumentType.BDE10);
  }

  /**
   * Create a writer builder for BDE11EnvelopeType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static BDEWriter <BDE11EnvelopeType> envelope11 ()
  {
    return new BDEWriter<> (EBDEDocumentType.BDE11);
  }
}
