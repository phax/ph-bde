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
import com.helger.jaxb.builder.JAXBValidationBuilder;

/**
 * A writer builder for SBDH documents.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The SBDH implementation class to be read
 */
@NotThreadSafe
public class BDEValidator <JAXBTYPE> extends JAXBValidationBuilder <JAXBTYPE, BDEValidator <JAXBTYPE>>
{
  public BDEValidator (@Nonnull final EBDEDocumentType eDocType)
  {
    super (eDocType);
  }

  public BDEValidator (@Nonnull final Class <JAXBTYPE> aClass)
  {
    this (BDEDocumentTypes.getDocumentTypeOfImplementationClass (aClass));
  }

  /**
   * Create a validator builder for BDE10EnvelopeType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static BDEValidator <BDE10EnvelopeType> envelope10 ()
  {
    return new BDEValidator<> (EBDEDocumentType.BDE10);
  }
}
