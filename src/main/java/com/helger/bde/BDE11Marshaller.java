/**
 * Copyright (C) 2016-2018 Philip Helger (www.helger.com)
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

import javax.annotation.concurrent.NotThreadSafe;

import com.helger.bde.v11.BDE11EnvelopeType;
import com.helger.bde.v11.ObjectFactory;
import com.helger.jaxb.GenericJAXBMarshaller;

/**
 * This is the reader and writer for BDE 1.1 documents. This class may be
 * derived to override protected methods from {@link GenericJAXBMarshaller}.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class BDE11Marshaller extends GenericJAXBMarshaller <BDE11EnvelopeType>
{
  public BDE11Marshaller ()
  {
    super (BDE11EnvelopeType.class, CBDE.BDE11_XSDS, o -> new ObjectFactory ().createEnvelope (o));
  }
}
