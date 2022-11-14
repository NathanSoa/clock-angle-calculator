# clock-angle-calculator

Simple project to calculate the minor and major arc with clock hour and practice my programming logic. 


## How it works

First, we need to create a Clock object, passing the hour and minute values:

```java
  Clock clock = new Clock(22, 55); //Hour, Minute
```

Then, we use the methods from AngleCalculator passing the defined Clock:

```java
double minorArc = AngleCalculator.calculateMinorArc(clock);
double majorArc = AngleCalculator.calculateMajorArc(clock);
``` 

