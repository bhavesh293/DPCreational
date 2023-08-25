# Proxy Pattern

Simply, proxy means an object representing another object.

Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern.

According to GoF, a Proxy Pattern "provides the control for accessing the original object".

Proxy pattern is also known as Surrogate or Placeholder or handles or wrappers.

RMI API uses proxy design pattern. Stub and Skeleton are two proxy objects used in RMI.

They are closely related in structure, but not purpose, to Adapters and Decorators.

## Advantage of Proxy Pattern
It provides the protection to the original object from the outside world.

## Types of proxies

Types of proxies

##### Remote proxy:
They are responsible for representing the object located remotely. Talking to the real object might involve marshalling and unmarshalling of data and talking to the remote object. All that logic is encapsulated in these proxies and the client application need not worry about them.

##### Virtual proxy:

These proxies will provide some default and instant results if the real object is supposed to take some time to produce results. These proxies initiate the operation on real objects and provide a default result to the application. Once the real object is done, these proxies push the actual data to the client where it has provided dummy data earlier.

##### Protection proxy:

If an application does not have access to some resource then such proxies will talk to the objects in applications that have access to that resource and then get the result back.

##### Smart Proxy:

A smart proxy provides additional layer of security by interposing specific actions when the object is accessed. An example can be to check if the real object is locked before it is accessed to ensure that no other object can change it.