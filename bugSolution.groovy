```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Correct handling for null input
  }
  // ... rest of the method
}

def calculateSomething(x, y) {
  if (y == 0) {
    throw new IllegalArgumentException("Cannot divide by zero")
  }
  return x / y
}

try {
  println calculateSomething(10, 0) 
} catch (IllegalArgumentException e) {
  println "Error: " + e.message
}

println calculateSomething(10,2)
```