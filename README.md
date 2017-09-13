# incremental build testing

This small test tree is exercising incremental rebuild behavior in pants & sbt to see if our assumptions are being met.

## project structure

```
src/main/scala/A/A.scala
- class A
src/main/scala/B/B.scala
- class B uses A internally
```

## experiments

| experiment | expectation | pants | sbt ~compile |
|===|===|===|===|
| change public signature of A  | invalidate B | | 2 |
| change private signature of A | don't invalidate B | | 1 |
| change function body of A     | don't invalidate B | | 1 |
| change anything in B          | don't invalidate A | | 1 |
