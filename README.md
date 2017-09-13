# incremental build testing

This small test tree is exercising incremental rebuild behavior in pants & sbt to see if our assumptions are being met.

## project structure

```
.----.  dep  .----.
| A  | <---- | B  |
`----`       `----`
```

## experiments

| experiment | expectation | pants | sbt |
|===|===|===|===|
| change public signature of A  | invalidate B | | |
| change private signature of A | don't invalidate B | | |
| change function body of A     | don't invalidate B | | |
| change anything in B          | don't invalidate A | | |
