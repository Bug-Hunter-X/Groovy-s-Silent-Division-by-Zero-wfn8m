```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Correct handling for null input
  }
  // ... rest of the method
}

//Example where this error may occur
def calculateSomething(x, y) {
  return x / y
}

println calculateSomething(10,0)
```