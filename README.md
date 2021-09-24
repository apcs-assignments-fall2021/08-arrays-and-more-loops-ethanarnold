# Arrays and More Loops

In this assignment, you'll be writing three methods to iterate through arrays in more complex ways

The first method is rotateLeft(). This method is given an array of ints as input and returns an array of ints. This method takes all of the values in an array and shifts them over to the left once. In, addition, the first value in the array "wraps around" to the last element in the array. The method has the following signature: public static int[] rotateLeft(int[] arr) {}

The first method is rotateRight(). This method is given an array of ints as input and returns an array of ints. This method takes all of the values in an array and shifts them over to the right once. In, addition, the last value in the array "wraps around" to the first element in the array. While this seems pretty similar to the previous example, it's actually a bit trickier. Make sure to test your code! The method has the following signature: public static int[] rotateRight(int[] arr) {}

The third method is duplicateReplacer(). This method is given an array of ints as input and returns an array of ints. This method replaces all the duplicate values in the array with a -1. Note that if a value shows up multiple times in an array, the first "original" value should be kept, but all subsequent duplicate values should be replaced by a -1. The method has the following signature: public static int[] duplicateReplacer(int[] arr) {}

You don't need to include a Scanner in your main method. However, your main method should contain some code where you call your three functions to test that they work properly. 

<br />
<br />

AAdd code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```

