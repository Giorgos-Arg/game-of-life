# game-of-life

This java program implements [Conway’s Game Of Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).

## Usage

Compilation:

```bash
javac *.java
```
Run:

```bash
java RunGameOfLife
```

## Example

```bash
java RunGameOfLife

*** Welcome to the Game of Life! ***

Give the grid's height: 10

Give the grid's width: 10

Give the number of generations: 5

The initial grid:
 ____________________
| - - - # # # # # - - |
| - # - - - # # # - # |
| - # # # - - # # # # |
| # - # # # # # # - - |
| # - - - - # # - # # |
| # - # - - # # - - # |
| - # # # - # - # - # |
| - # - # # # - - - - |
| # - # # # - - - # # |
| # - - - # # - # # - |
 ____________________

Generation 1:
 ____________________
| - - - - # - - # # - |
| - # - - - - - - - # |
| # - - - - - - - - # |
| # - - - - - - - - - |
| # - # - - - - - # # |
| # - # # - - - - - # |
| # - - - - - - - # - |
| # - - - - # # - - # |
| # - # - - - # # # # |
| - # - - # # - # # # |
 ____________________

Generation 2:
 ____________________
| - - - - - - - - # - |
| - - - - - - - - - # |
| # # - - - - - - - - |
| # - - - - - - - # # |
| # - # # - - - - # # |
| # - # # - - - - - # |
| # - - - - - - - # # |
| # - - - - # # - - # |
| # - - - # - - - - - |
| - # - - - # - - - # |
 ____________________

Generation 3:
 ____________________
| - - - - - - - - - - |
| - - - - - - - - - - |
| # # - - - - - - # # |
| # - # - - - - - # # |
| # - # # - - - - - - |
| # - # # - - - - - - |
| # - - - - - - - # # |
| # # - - - # - - # # |
| # # - - # - # - - - |
| - - - - - - - - - - |
 ____________________

Generation 4:
 ____________________
| - - - - - - - - - - |
| - - - - - - - - - - |
| # # - - - - - - # # |
| # - # # - - - - # # |
| # - - - - - - - - - |
| # - # # - - - - - - |
| # - # - - - - - # # |
| - - - - - # - # # # |
| # # - - - # - - - - |
| - - - - - - - - - - |
 ____________________

Generation 5:
 ____________________
| - - - - - - - - - - |
| - - - - - - - - - - |
| # # # - - - - - # # |
| # - # - - - - - # # |
| # - - - - - - - - - |
| # - # # - - - - - - |
| - - # # - - - # - # |
| # - - - - - # # - # |
| - - - - - - # - # - |
| - - - - - - - - - - |
 ____________________

*** End of the Game of Life! ***
```

## Author

Giorgos Argyrides (g.aryrides@outlook.com)