# java-visitor-pattern-only skeleton

Visitor pattern have been implemented. Only the skeleton of the project written. Real busniss logic yet to implemented as required. Let me describe the structure.
### Abstract customer class:
This class should define a customer.
However I followed the principle "Open for extention close for modification"
To do this, Customer class accept a Visitor class Object.
Customer class extended by 4 child classes, and child classes override accept(Visitor v) method.

### Interface CustomerVisitor
interface contains child classes visitor methods.
New functionality can be added without modification our Customer class by implementing this visitor interface in offer classes (see offer package).
and we can add our new business logic here.
### Client class
Now in client class you can create visitor classes with new functionality and pass in accept method of Customer classes.


