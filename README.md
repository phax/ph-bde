# ph-bde

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7b6deab23df3422fba492a85ecb72720)](https://www.codacy.com/app/philip/ph-bde?utm_source=github.com&utm_medium=referral&utm_content=phax/ph-bde&utm_campaign=badger)

OASIS BDE (Business Document Envelope) Java wrapper library.
It supports easily reading and writing of BDE 1.0 and BDE 1.1 documents.
It allows conversion between Java domain objects and XML representations.

OASIS BDE is superseded by OASIS/CEFACT XHE (Exchange Header Envelope) 1.0. See [ph-xhe](https://github.com/phax/ph-xhe) for a Java implementation.

It is licensed under Apache 2.0 license.

It requires at least Java 8 to be used.

# Maven usage

Add the following to your pom.xml to use this artifact, replacing `x.y.z` with the effective version number:

```xml
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-bde</artifactId>
  <version>x.y.z</version>
</dependency>
```

# News and noteworthy

* v2.3.0 - work in progress
    * Updated to ph-commons 10
* v2.2.3 - 2020-09-17
    * Updated to Jakarta JAXB 2.3.3
* v2.2.2 - 2020-08-28
    * Using Java 8 date and time classes for JAXB created classes
* v2.2.1 - 2020-05-26
    * Updated to ph-xsds 2.3.0 (changed Maven groupId)
* v2.2.0 - 2020-04-01
    * Using a consistent prefix for all type names  
* v2.1.1 - 2019-05-28
    * Reusing external CCTS and XMLDSig classes 
* v2.1.0 - 2018-11-22
    * Removed Maven dependencies to Xades XSDs - never used
    * Requires at least ph-commons 9.2.0
* v2.0.0 - 2017-11-08
    * Updated to ph-commons 9.0.0
    * Updated to BDE 1.1 CS 01
* v1.0.0 - 2016-07-15
    * Initial version

# References

* [OASIS Business Document Envelope Version 1.0](http://docs.oasis-open.org/bdxr/bdx-bde/v1.0/cs01/bdx-bde-v1.0-cs01.html)
* [OASIS Business Document Envelope Version 1.1 CS 01](http://docs.oasis-open.org/bdxr/bdx-bde/v1.1/bdx-bde-v1.1.html)

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
On Twitter: <a href="https://twitter.com/philiphelger">@philiphelger</a> |
Kindly supported by [YourKit Java Profiler](https://www.yourkit.com)