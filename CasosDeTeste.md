# Test Cases 
| #TC   | Inputs | Inputs | Inputs | Condição Execução | R. Esperado | R. Obtido |
|-------|--------|--------|--------|-------------------|-------------|-----------|
|       | S1     | S2     | S3     |                   |             |           |
| TC#1  | MAXINT | 0      | 0      |                   | Impossível  |           |
| TC#2  | 0      | MAXINT | 0      |                   | Impossível  |           |
| TC#3  | 0      | 0      | MAXINT |                   | Impossível  |           |
| TC#4  | 0      | MAXINT | MAXINT |                   | Impossível  |           |
| TC#5  | MAXINT | MAXINT | 0      |                   | Impossível  |           |
| TC#6  | MAXINT | 0      | MAXINT |                   | Impossível  |           |
| TC#7  | MAXINT | MAXINT | MAXINT |                   | Equilátero  |           |
| TC#8  | 0      | 0      | 0      |                   | Impossível  |           |
| TC#9  | null   | null   | null   |                   | Impossível  |           |
| TC#10 | 1      | 1      | 1      |                   | Equilátero  |           |
| TC#11 | 1      | 1      | 2      |                   | Isosceles   |           |
| TC#12 | 1      | 2      | 1      |                   | Isosceles   |           |
| TC#13 | 2      | 1      | 1      |                   | Isosceles   |           |
| TC#14 | 6      | 8      | 10     |                   | Rectangulo  |           |
| TC#15 | 6      | 10     | 8      |                   | Rectangulo  |           |
| TC#16 | 10     | 8      | 6      |                   | Rectangulo  |           |
| TC#17 | 1      | 2      | 3      |                   | Escaleno    |           |
| TC#18 | -1     | 2      | 3      |                   | Impossível  |           |
| TC#19 | 1      | -2     | 3      |                   | Impossível  |           |
| TC#20 | 1      | 2      | -3     |                   | Impossível  |           |
| TC#21 | -1     | 2      | -3     |                   | Impossível  |           |
| TC#22 | 1      | -2     | -3     |                   | Impossível  |           |
| TC#23 | -1     | -2     | -3     |                   | Impossível  |           |
