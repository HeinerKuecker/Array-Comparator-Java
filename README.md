# Array Comparator Java
Java Comparator classes to compare primitive arrays and object arrays with one or multiple dimensions.

This repository contains an Eclipse project ARRAY_COMPARATOR with the associated files.

The Unit tests run in JUnit4.

# Null handling:

[Enum Nulls](https://github.com/HeinerKuecker/Array-Comparator-Java/blob/master/ARRAY_COMPARATOR/src/de/heinerkuecker/comparator/array/Nulls.java "/ARRAY_COMPARATOR/src/de/heinerkuecker/comparator/array/Nulls.java")

**LESSER**: Handle null arrays or null elements as lesser than existing arrays or elements.

**GREATER**: Handle null arrays or null elements as greater than existing arrays or elements.

**FORBIDDEN**: Null arrays or elements are forbidden, an *NullPointerException* will be throwed.
