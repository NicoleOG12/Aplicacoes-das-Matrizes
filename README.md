<h1 align="center">📚 Exercícios de Matrizes e Aplicações</h1>

<p align="center">
  <em>Resumo e resolução dos exercícios sobre matrizes aplicadas a sistemas lineares, grafos, processamento de imagens e matemática computacional.</em>
</p>

---

## 🧮 Exercício 1 — Sistemas Lineares

Dada a matriz de coeficientes:
[ 3 1 ]
[ 2 4 ]


- **a)** Sistema linear correspondente:  
  3x + 1y = b₁  
  2x + 4y = b₂  

- **b)** Diagonal principal:  
  Elementos 3 e 4.

- **c)** Importância da diagonal no método de Gauss-Seidel:  
  A diagonal principal permite isolar as variáveis para atualização iterativa, sendo essencial para garantir a convergência do método.

---

## 🌐 Exercício 2 — Algoritmos de Grafos

Grafo com vértices A, B, C e conexões:  
A → B, B → C, A → A (auto-laço)

- **a)** Matriz de adjacência 3×3:

|   | A | B | C |
|---|---|---|---|
| A | 1 | 1 | 0 |
| B | 0 | 0 | 1 |
| C | 0 | 0 | 0 |

- **b)** Elemento da diagonal que indica auto-laço:  
  Posição [0][0] = 1.

- **c)** Verificação de vizinhança:  
  Se o elemento [i][j] = 1, há uma aresta do vértice i para o vértice j.

---

## 🖼️ Exercício 3 — Processamento de Imagens

Matriz de pixels (4×4):

[ 10 10 10 10 ]
[ 10 100 100 10 ]
[ 10 100 100 10 ]
[ 10 10 10 10 ]

- **a)** Visualização:  
  Imagem com borda clara e centro escuro.

- **b)** Filtro diagonal aplicado:


- **c)** O filtro realça bordas diagonais, detectando mudanças de intensidade nas diagonais da imagem.

---

## 📐 Exercício 4 — Matemática Computacional

Matriz triangular:

[ 2 4 5 ]
[ 0 3 6 ]
[ 0 0 7 ]


- **a)** Diagonal principal:  
  2, 3 e 7.

- **b)** Determinante:  
  Produto da diagonal = 2 × 3 × 7 = 42.

- **c)** Autovalores:  
  São os elementos da diagonal principal: 2, 3 e 7.

---


