##Type Inference
The Scala compiler can often infer the type of an expression so you don’t have to declare it explicitly.

* ####Omitting the type
```bash 
val businessName = "Montreux Jazz Café"
def squareOf(x: Int) = x * x
```
* ####Parameters
Never infers method parameter types, can infer anonymous function parameter types
```bash 
Seq(1, 3, 4).map(x => x * 2)  // List(2, 6, 8)
```

##Operators
In Scala, operators are methods.
* ####Infix and Dot Notation
```bash 
10.+(1)
10 + 1
```

* ####Defining and using operators
You can use any legal identifier as an operator

* ####Precedence
```bash 
(characters not shown below)
* / %
+ -
:
= !
< >
&
^
|
(all letters)
```
##By Name Parameters
By-name parameters are only evaluated when used. They are in contrast to by-value parameters. To make a parameter called by-name, simply prepend => to its type.
```bash 
def calculate(input: => Int) = input * 37
```
