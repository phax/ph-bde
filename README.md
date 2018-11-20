# ph-bde

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7b6deab23df3422fba492a85ecb72720)](https://www.codacy.com/app/philip/ph-bde?utm_source=github.com&utm_medium=referral&utm_content=phax/ph-bde&utm_campaign=badger)

OASIS BDE (Business Document Envelope) Java wrapper library.
It supports easily reading and writing of BDE 1.0 and BDE 1.1 documents.
It allows conversion between Java domain objects and XML representations.

It is licensed under Apache 2.0 license.

It requires at least Java 8 to be used.

# News and noteworthy

* v2.0.1 - work in progress
    * Removed Maven dependencies to Xades XSDs - never used
    * Requires at least ph-commons 9.2.0
* v2.0.0 - 2017-11-08
    * Updated to ph-commons 9.0.0
    * Updated to BDE 1.1 CS 01
* v1.0.0 - 2016-07-15
    * Initial version

# Maven usage

Add the following to your pom.xml to use this artifact:
```
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-bde</artifactId>
  <version>2.0.0</version>
</dependency>
```

# References

  * [OASIS Business Document Envelope Version 1.0](http://docs.oasis-open.org/bdxr/bdx-bde/v1.0/cs01/bdx-bde-v1.0-cs01.html)
  * [OASIS Business Document Envelope Version 1.1 CS 01](http://docs.oasis-open.org/bdxr/bdx-bde/v1.1/bdx-bde-v1.1.html)

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
On Twitter: <a href="https://twitter.com/philiphelger">@philiphelger</a>
