/**
 * Copyright (C) 2016-2021 Philip Helger (www.helger.com)
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
package com.helger.bde;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.PresentForCodeCoverage;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.xsds.ccts.cct.schemamodule.CCCTS;
import com.helger.xsds.xmldsig.CXMLDSig;

/**
 * Contains all the constants for BDE handling.
 *
 * @author Philip Helger
 */
@Immutable
public final class CBDE
{
  @Nonnull
  private static ClassLoader _getCL ()
  {
    return CBDE.class.getClassLoader ();
  }

  /**
   * XML Schema resources for BDE 1.0 - since include is used, the other schemas
   * must not be specified.
   */
  public static final String BDE10_XSD_PATH = "/schemas/bde10/BDE-Envelope-1.0.xsd";

  /**
   * XML Schema resources for BDE 1.0 - since include is used, the other schemas
   * must not be specified.
   */
  @CodingStyleguideUnaware
  public static final List <ClassPathResource> BDE10_XSDS = new CommonsArrayList <> (CCCTS.getXSDResource (),
                                                                                     CXMLDSig.getXSDResource (),
                                                                                     new ClassPathResource (BDE10_XSD_PATH,
                                                                                                            _getCL ())).getAsUnmodifiable ();

  /** Namespace URI for BDE 1.0 */
  public static final String BDE10_NS = "http://docs.oasis-open.org/bdxr/ns/bde/1.0/Envelope";

  /**
   * XML Schema resources for BDE 1.1 - since include is used, the other schemas
   * must not be specified.
   */
  public static final String BDE11_XSD_PATH = "/schemas/bde11/BDE-Envelope-1.1.xsd";

  /**
   * XML Schema resources for BDE 1.0 - since include is used, the other schemas
   * must not be specified.
   */
  @CodingStyleguideUnaware
  public static final List <ClassPathResource> BDE11_XSDS = new CommonsArrayList <> (CCCTS.getXSDResource (),
                                                                                     CXMLDSig.getXSDResource (),
                                                                                     new ClassPathResource (BDE11_XSD_PATH,
                                                                                                            _getCL ())).getAsUnmodifiable ();

  @PresentForCodeCoverage
  private static final CBDE s_aInstance = new CBDE ();

  private CBDE ()
  {}
}
