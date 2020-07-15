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

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.bde.v10.BDE10EnvelopeType;
import com.helger.bde.v11.BDE11EnvelopeType;
import com.helger.jaxb.builder.JAXBReaderBuilder;

/**
 * A reader builder for BDE documents.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The BDE implementation class to be read
 */
@NotThreadSafe
public class BDEReader <JAXBTYPE> extends JAXBReaderBuilder <JAXBTYPE, BDEReader <JAXBTYPE>>
{
  public BDEReader (@Nonnull final EBDEDocumentType eDocType, @Nonnull final Class <JAXBTYPE> aImplClass)
  {
    super (eDocType, aImplClass);
  }

  /**
   * Create a reader builder for BDE10EnvelopeType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static BDEReader <BDE10EnvelopeType> envelope10 ()
  {
    return new BDEReader <> (EBDEDocumentType.BDE10, BDE10EnvelopeType.class);
  }

  /**
   * Create a reader builder for BDE11EnvelopeType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static BDEReader <BDE11EnvelopeType> envelope11 ()
  {
    return new BDEReader <> (EBDEDocumentType.BDE11, BDE11EnvelopeType.class);
  }
}
