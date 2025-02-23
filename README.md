# Scala Type Inference Bug

This repository demonstrates a common Scala error related to type inference. The `MyClass` example highlights how mismatched type parameters and provided values lead to compilation failures. The `bug.scala` file contains the buggy code, showcasing the error, while `bugSolution.scala` offers a corrected version and explanation.

## Problem

Scala's type system relies heavily on type inference. If the compiler cannot infer the type parameter `T` in a consistent manner with the provided value, a compilation error occurs. The solution involves ensuring that the type parameter matches the provided value or using a more general type like `Any`. 