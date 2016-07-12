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
package com.helger.bde;

import java.util.List;

import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotation.PresentForCodeCoverage;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.io.resource.IReadableResource;

/**
 * Contains all the constants for BDE handling.
 *
 * @author Philip Helger
 */
@Immutable
public final class CBDE
{
  /**
   * XML Schema resources for BDE 1.0 - since include is used, the other schemas
   * must not be specified.
   */
  public static final String BDE10_XSD_PATH = "/schemas/bde10/BDE-Envelope-1.0.xsd";
  /**
   * XML Schema resources for BDE 1.0 - since include is used, the other schemas
   * must not be specified.
   */
  public static final List <? extends IReadableResource> BDE10_XSDS = CollectionHelper.makeUnmodifiable (new ClassPathResource (BDE10_XSD_PATH));

  /** Namespace URI for BDE 1.0 */
  public static final String BDE10_NS = "http://docs.oasis-open.org/bdxr/ns/bde/1.0/Envelope";

  @PresentForCodeCoverage
  private static final CBDE s_aInstance = new CBDE ();

  private CBDE ()
  {}
}
