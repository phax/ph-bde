/**
 * Copyright (C) 2016-2017 Philip Helger (www.helger.com)
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

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import com.helger.bde.v10.BDE10EnvelopeType;
import com.helger.bde.v11.BDE11EnvelopeType;
import com.helger.commons.io.file.iterate.FileSystemIterator;

/**
 * Test class for class {@link BDEWriter}.
 *
 * @author Philip Helger
 */
public final class BDEWriterTest
{
  @Test
  public void testBDE10 ()
  {
    for (final File aFile : new FileSystemIterator ("src/test/resources/examples/bde10/good"))
      if (aFile.isFile ())
      {
        final BDE10EnvelopeType aDoc = BDEReader.envelope10 ().read (aFile);
        assertNotNull (aFile.getAbsolutePath (), aDoc);
        assertNotNull (aFile.getAbsolutePath (), BDEWriter.envelope10 ().getAsDocument (aDoc));
      }
  }

  @Test
  public void testBDE11 ()
  {
    for (final File aFile : new FileSystemIterator ("src/test/resources/examples/bde11/good"))
      if (aFile.isFile ())
      {
        final BDE11EnvelopeType aDoc = BDEReader.envelope11 ().read (aFile);
        assertNotNull (aFile.getAbsolutePath (), aDoc);
        assertNotNull (aFile.getAbsolutePath (), BDEWriter.envelope11 ().getAsDocument (aDoc));
      }
  }
}
