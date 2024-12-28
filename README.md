# Groovy's Silent Division by Zero

This example demonstrates how Groovy handles division by zero without explicit error handling. In many languages, dividing by zero would throw an exception. However, in Groovy, it returns `Infinity`, which can be problematic for debugging and unexpected results. The solution below adds explicit checks to prevent this.