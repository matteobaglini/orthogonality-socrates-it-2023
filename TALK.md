# TDD, SOLID, FP ORTHOGONALITY

## TALK TARGETS

put in the same coding session:
Test-Driven Development
Emergent Design
Refactoring
4 Rules of Simple Design
SOLID principles
FP principles
Monad

**NOT A FULL DEEP LESSON ON EVERYTHING**

## KATA

https://www.codurance.com/katas/password-validation
Iteration 1 - Basic password validation

- Have more than 8 characters
- Contains a capital letter
- Contains a lowercase
- Contains a number
- Contains an underscore

## AGENDA:

1. classic TDD cycle for first check
   1.1 express the test (red)
   1.2 make the test pass (green)
   1.3 refactor
2. same as before but failure case
3. same as before but second check
   3.1. one red test, talk about that
   3.2. the code makes the change harder than necessary. Should you tidy it up before making the change? Not now
   3.1 express the intent, extract functions (SRP)
4. TDD cycle for third check
   4.1. ok same smell as before
   4.2 Tidy it up? Yeah, now let's refactor! (on green of course)
5. make design scalable with SOLID (more SRP, OCP and DIP)
   5.1 extract classes
   5.2 extract interface
   5.3 put all checks in a list
   5.4 introduce a filed in ctor
   5.5 introduce a parameter
6. refactor tests!
   6.1 move specific cases on proper suite
   6.2 better express validator responsibility
7. enrich validation result
   7.1 now we compose the checks by composing bool values
   7.1 should I throw? should I build something? should ...
   7.2 cannot complete a computation is a side-effect let's grab
   7.3 Option, Try, Either? what?
   7.4 How refactor return type? Parallel design
   7.5 now we sill compose validation result values
8. accumulate errors
   8.1 change the types
   8.2 change the combinators
