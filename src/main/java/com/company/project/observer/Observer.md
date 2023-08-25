## Observer - behavioral pattern

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its dependent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

## Implementation
Observer pattern uses three actor classes. Subject, Observer and Client. 

Subject is an object having methods to attach and detach observers to a client object.

We have created an abstract class Observer and a concrete class Subject that is extending class Observer.

when one object changes state, all its dependents are notified and updated automatically".

The observer pattern is also known as Dependents or Publish-Subscribe.

It provides the support for broadcast-type communication.

## UML 

![UML](observer_pattern_uml_diagram.jpg)