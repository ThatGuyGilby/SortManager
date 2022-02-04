## Table of Contents
- [How to Use the Project](#how-to-use-the-project)
- [Phase 1](#phase-1)
- [Phase 2](#phase-2)
- [Phase 3](#phase-3)
- [Phase 4](#phase-4)
- [Phase 5](#phase-5)

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

[⮬ Table of Contents](#table-of-contents)

# Phase 1

Write a program which will take an array of ints and sort it using a bubble sort algorithm and then a merge sort algorithm. Include JUnit tests for this and all subsequent phases (and all subsequent projects for the rest of time).

Relevant Classes
- [BubbleSorter.java](../main/src/main/java/com/jgilbride/sorting/model/BubbleSorter.java)
- [MergeSorter.java](../main/src/main/java/com/jgilbride/sorting/model/MergeSorter.java)

[⮬ Table of Contents](#table-of-contents)

# Phase 2

Update your project to use MVC and start to incorporate some of the design principles discussed earlier in the course (OOP, SOLID, design patterns). Create classes which implements MVC, including SortManager (controller) and a DisplayManager (view) classes. The code should include a basic factory pattern to determine which sorter to use. Make sure packages are created properly and the structure follows the MVC pattern. Create an interface which both sort classes can implement and make sure your application uses this interface where possible.

Relevant Classes
- [SortManager.java](../main/src/main/java/com/jgilbride/sorting/controller/SortManager.java)
- [SorterWindow.java](../main/src/main/java/com/jgilbride/sorting/view/SorterWindow.java)
- [Sorter.java](../main/src/main/java/com/jgilbride/sorting/model/Sorter.java)
- [SuperSorter.java](../main/src/main/java/com/jgilbride/sorting/model/SuperSorter.java)
- [SorterType.java](../main/src/main/java/com/jgilbride/sorting/model/SorterType.java)

[⮬ Table of Contents](#table-of-contents)

# Phase 3

Add logging code into the Sort Manager project. Set up log4j in the project and add a properties file. Create logs at different levels and fully test the resulting output. Have output going to a log file created in the resources directory. Ensure there are meaningful log messages added to the project and that they reflect the needs of the levels for which they are set.

Relevant Classes
- [log4j2.properties](../main/src/main/resources/log4j2.properties)

[⮬ Table of Contents](#table-of-contents)

Logging Message Implementations
```Java
    public static void logExecutionTime(long startTime)
    {
        long endTime = System.nanoTime();
        long executionNanoTime = endTime - startTime;
        StringBuilder stringBuilder = new StringBuilder("Execution time: ");
        stringBuilder.append(executionNanoTime);
        stringBuilder.append("ns | ");
        stringBuilder.append(executionNanoTime * 0.000000001);
        stringBuilder.append("s");
        logger.info(stringBuilder.toString());
    }
```
```Java
    public static void logExecutionTime(long startTime)
    {
        ...

        sortManager = new SortManager();

        logger.info("SorterWindow created successfully");
    }
```

[⮬ Table of Contents](#table-of-contents)

# Phase 4

Integrate a new class to implement a binary search tree approach for sorting, so that the BST can be called in the same way as the other sort algorithms. The new class should implement the current Sorter interface. Add code that calls the BST and passes in the array that will be used to construct the tree and then return a sorted array. Use the Facade design pattern for this step and implement a nested class to represent a node in the tree.

Relevant Classes
- [BinaryTree.java](../main/src/main/java/com/jgilbride/sorting/model/BinaryTree.java)
- [BinaryTreeSorter.java](../main/src/main/java/com/jgilbride/sorting/model/BinaryTreeSorter.java)

[⮬ Table of Contents](#table-of-contents)

# Phase 5

Add timing information to the project and allow the user to select multiple algorithms to compare their performance.

Implementation of compareTo using the Comparable interface in [SuperSorter.java](../main/src/main/java/com/jgilbride/sorting/model/SuperSorter.java) using the execution time of each object to determine their order.
```Java
    @Override
    public int compareTo(SuperSorter o)
    {
        long myStartTime = System.nanoTime();
        sort(new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8});
        long myTimeTaken = System.nanoTime() - myStartTime;

        long oStartTime = System.nanoTime();
        o.sort(new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8});
        long oTimeTaken = System.nanoTime() - myStartTime;

        if (myTimeTaken == oTimeTaken)
        {
            return 0;
        }
        else if (myTimeTaken < oTimeTaken)
        {
            return 1;
        }

        return -1;
    }
```

[⮬ Table of Contents](#table-of-contents)