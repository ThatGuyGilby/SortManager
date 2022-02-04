## Table of Contents
- [SortManager](#sortmanager)
    * [How to Use the Project](#how-to-use-the-project)
    * [Sort Manager Project Engineering 108/108a](#sort-manager-project-engineering-108-108a)
- [Phase 1](#phase-1)
- [Phase 2](#phase-2)
- [Phase 3](#phase-3)
- [Phase 4](#phase-4)
- [Phase 5](#phase-5)

# SortManager
## How to Use the Project

1. Click the green "Code" button 

![](https://i.imgur.com/NJJEAcF.png)

2. Click "Download ZIP"

![](https://i.imgur.com/oIFRjQE.png)

3. Right-click the downloaded file and click "Extract Here"

![](https://i.imgur.com/MsepGvG.png)

4. Double-click the extracted folder

![](https://i.imgur.com/MDUlzSy.png)

5. Right-click in the empty explorer and click "Open Folder as Intellij IDEA Project"

![](https://i.imgur.com/QjeuY1U.png)

6. Enjoy the project!

## Sort Manager Project Engineering 108/108a
# Phase 1

Write a program which will take an array of ints and sort it using a bubble sort algorithm and then a merge sort algorithm. Include JUnit tests for this and all subsequent phases (and all subsequent projects for the rest of time).

- [BubbleSorter.java](../main/src/main/java/com/jgilbride/sorting/model/BubbleSorter.java)
- [MergeSorter.java](../main/src/main/java/com/jgilbride/sorting/model/MergeSorter.java)

# Phase 2
Update your project to use MVC and start to incorporate some of the design principles discussed earlier in the course (OOP, SOLID, design patterns). Create classes which implements MVC, including SortManager (controller) and a DisplayManager (view) classes. The code should include a basic factory pattern to determine which sorter to use. Make sure packages are created properly and the structure follows the MVC pattern. Create an interface which both sort classes can implement and make sure your application uses this interface where possible.

- [SortManager.java](../main/src/main/java/com/jgilbride/sorting/controller/SortManager.java)
- [SorterWindow.java](../main/src/main/java/com/jgilbride/sorting/view/SorterWindow.java)
- [Sorter.java](../main/src/main/java/com/jgilbride/sorting/model/Sorter.java)
- [SuperSorter.java](../main/src/main/java/com/jgilbride/sorting/model/SuperSorter.java)

# Phase 3
Add logging code into the Sort Manager project. Set up log4j in the project and add a properties file. Create logs at different levels and fully test the resulting output. Have output going to a log file created in the resources directory. Ensure there are meaningful log messages added to the project and that they reflect the needs of the levels for which they are set.
- [SortManager.java](../main/src/main/java/com/jgilbride/sorting/controller/SortManager.java)
- [SorterWindow.java](../main/src/main/java/com/jgilbride/sorting/view/SorterWindow.java)
- [log4j2.properties](../main/src/main/resources/log4j2.properties)
# Phase 4
Integrate a new class to implement a binary search tree approach for sorting, so that the BST can be called in the same way as the other sort algorithms. The new class should implement the current Sorter interface. Add code that calls the BST and passes in the array that will be used to construct the tree and then return a sorted array. Use the Facade design pattern for this step and implement a nested class to represent a node in the tree.

# Phase 5
Add timing information to the project and allow the user to select multiple algorithms to compare their performance.
