# **Graph Terminologies**  

## **Basic Components of a Graph**  
- **Vertex (Node)**: A fundamental unit in a graph.  
- **Edge**: A connection between two vertices.  

---

## **Types of Graphs**  
A graph can have different properties:  

- **Weighted vs. Unweighted**:  
  - **Weighted**: Each edge has a value (e.g., distance, cost).  
  - **Unweighted**: All edges are considered equal.  

- **Directed vs. Undirected**:  
  - **Directed (DiGraph)**: Edges have a direction (A → B).  
  - **Undirected**: Edges have no direction (A ↔ B).  

- **Labeled vs. Unlabeled**:  
  - **Labeled**: Nodes or edges have unique identifiers.  
  - **Unlabeled**: No unique identifiers for nodes/edges.  

📌 **Possible Combinations:**  
- Weighted **Directed** Labeled  
- Weighted **Undirected** Labeled  
- Unweighted **Directed** Labeled  
- Unweighted **Undirected** Labeled  
- Weighted **Directed** Unlabeled  
- Weighted **Undirected** Unlabeled  
- Unweighted **Directed** Unlabeled  
- Unweighted **Undirected** Unlabeled  

---

## **Sparse vs. Dense Graphs**  
- **Sparse Graph**:  
  - Number of edges ≈ **O(n)** (in proportion to the number of nodes).  
  - Many nodes have few connections.  
- **Dense Graph**:  
  - Number of edges ≈ **O(n²)** (almost all nodes are connected).  
  - Most nodes are connected to many others.  

---

## **In-Degree and Out-Degree**  
- **In-Degree**: Number of **incoming** edges to a node.  
- **Out-Degree**: Number of **outgoing** edges from a node.  
- **Summation Rule**:  
  - **Sum of degrees of all nodes** = **2 × Total edges**  
  - Each **undirected edge** contributes **to the degree of two nodes**.  
  - **For directed graphs**:  
    - **Σ(In-degree) + Σ(Out-degree) = 2E**  
    - **In-degree = Out-degree = E** (for balanced graphs).  


