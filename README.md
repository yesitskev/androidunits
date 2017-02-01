Android Units
==========

A utility class for converting between different Android display units



Example Usage
-------------

How can I get the pixels for the display pixel (dp) measurement I have?
```java
float topPaddingOrSomething = AndroidUnits.DENSITY_PIXELS.toPixels(8);
```


Download
--------

Add via Gradle:
```groovy
compile 'com.github.kevelbreh:androidunits:0.1.0'
```
or Maven:
```xml
<dependency>
  <groupId>com.github.kevelbre</groupId>
  <artifactId>androidunits</artifactId>
  <version>0.1.0</version>
</dependency>
```


License
-------

    Copyright 2017 Kevin Woodland

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.