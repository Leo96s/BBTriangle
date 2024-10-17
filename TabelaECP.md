
# Test Case Design (ECP)
                Generic Pré-Conditions
    Valid Class                     Invaid Class
    s1>0 and s2>0 and s3>0          s1 ≤ 0 and s2 ≤ 0 and s3 ≤ 0  

| Use Case   | Critérios                         | C.E.V                                              | C.E.I                                                 |
|------------|-----------------------------------|----------------------------------------------------|-------------------------------------------------------|
|            | Specific Use Case Pre-Conditions  |
|            | nº inputs                         | 3                                                  | != 3                                                  |
| Equilátero | tipo inputs                       | int                                                | != int                                                |
|            | restrições dos inputs             | s1 = s2 = s3                                       | s1 != s2 != s3                                        |
|            | Specific Use Case Pre-Conditions  | isImpossible=False                                 | isImpossible=True                                     |
|            | nº inputs                         | 3                                                  | != 3                                                  |
| Isosceles  | tipo inputs                       | int                                                | != int                                                |
|            | restrições dos inputs             | s1=s2!=s3 or s2=s1!=s3 or s3=s2!=s1                |                                                       |
|            | Specific Use Case Pre-Conditions  | isImpossible=False                                 | isImpossible=True                                     |
|            | nº inputs                         | 3                                                  | != 3                                                  |
| Rectangulo | tipo inputs                       | int                                                | != int                                                |
|            | restrições dos inputs             | s1^2=s2^2+s3^2 or s2^2=s1^2+s3^2 or s3^2=s1^2+s2^2 | s1^2!=s2^2+s3^2 or s2^2!=s1^2+s3^2 or s3^2!=s1^2+s2^2 |
|            | Specific Use Case Pre-Conditions  | isImpossible=False AND isRightAngle=False          | isImpossible=True OR isRightAngle=True                |
|            | nº inputs                         | 3                                                  | != 3                                                  |
| Escaleno   | tipo inputs                       | int                                                | != int                                                |
|            | restrições dos inputs             | s1!=s2!=s3                                         | s1==s2==s3                                            |
|            | Specific Use Case Pre-Conditions  |                                                    |                                                       |
|            | nº inputs                         | 3                                                  | != 3                                                  |
| Impossivel | tipo inputs                       | int                                                | != int                                                |
|            | restrições dos inputs             | s1<= 0 ou s2<=0 ou s3<=0                           | s1> 0 ou s2>0 ou s3>0                                 |