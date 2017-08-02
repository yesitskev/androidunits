Android Units
==========

A utility class for converting between different Android display units without requiring an
application context. This uses the system global shared `Resources` object and is not configured for
the current screen (can not use dimension units, does not change based on orientation, etc).

In future iterations of this utility I would like to accommodate to above changes.



Example Usage
-------------

Lets say you want to set the text size while drawing a custom view:
```java
paint.setTextSize(AndroidUnit.SCALED_PIXELS.toPixels(8));
```

Or you want to draw a rectangle with rounded corners:
```java
float radius = AndroidUnit.DENSITY_PIXELS.toPixels(12);
canvas.drawRoundRect(rect, radius, radius, paint);
```


Download
--------

Add via Gradle:


```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
dependencies {
  compile 'com.github.kevelbreh:androidunits:0.1.1'
}
```

Or Maven:

```xml
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
    <groupId>com.github.kevelbreh</groupId>
    <artifactId>androidunits</artifactId>
    <version>0.1.1</version>
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
