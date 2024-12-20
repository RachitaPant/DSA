# 🚀 Coding Problem Solutions Repository

Welcome to my repository of coding solutions! This collection includes problems I've solved from various coding platforms, organized by categories and difficulty levels. The goal of this repository is to track my progress, share my learning, and help others by providing clear, well-documented solutions.

## 📚 Platforms Covered

- [LeetCode](https://leetcode.com/)
- [Codeforces](https://codeforces.com/)
- [GeeksforGeeks](https://www.geeksforgeeks.org/)
- [HackerRank](https://www.hackerrank.com/)
- [Code360-Coding Ninjas](https://www.naukri.com/code360/home)


## 🗂️ Folder Structure

The repository is organized into folders by platform and further divided by categories or problem types.

```
.
├── leetcode/
│   ├── arrays/
│   ├── strings/
│   └── dynamic_programming/
│
├── codeforces/
│   ├── div2/
│   └── div3/
│
├── geeksforgeeks/
│   └── sorting/
│
└── hackerrank/
    └── algorithms/
```

## 📝 Problem Format

Each solution file includes:

1. **Problem Link**: A link to the original problem statement.
2. **Solution**: The code written in the respective programming language.
3. **Explanation**: Comments and explanations to clarify the approach and logic.

### Example Solution File

```cpp
// Problem: Two Sum (https://leetcode.com/problems/two-sum/)
// Language: C++

// Approach: Use a hashmap to store the indices of numbers seen so far.

#include <iostream>
#include <unordered_map>
#include <vector>

std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::unordered_map<int, int> indices;
    for (int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];
        if (indices.find(complement) != indices.end()) {
            return {indices[complement], i};
        }
        indices[nums[i]] = i;
    }
    return {};
}
```

## ✅ Goals of this Repository

- 📈 Track my **problem-solving progress**.
- 💡 Improve my understanding of **data structures and algorithms**.
- 🛠️ Share **solutions and explanations** with others.
- 🔄 Continuously **refactor and optimize** solutions as I learn new techniques.

## 🤝 Contributing

If you find any improvements or have suggestions, feel free to open an issue or submit a pull request!

## 💬 Feedback

I'm always open to feedback! Feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/rachita-pant-22b211207/) or reach out via email at **rachitap89@gmail.com**.

---

Happy Coding! 🚀

