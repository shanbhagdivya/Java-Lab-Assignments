public class NearestNeighbours {
    public static void main(String[] args) {
        int[] array = {1, 7, 12, 16, 19, 21}; // Sample array
        int index = findNearestNeighbours(array);
        System.out.println("Index of the first number: " + index);
    }

    public static int findNearestNeighbours(int[] array) {
        if (array == null || array.length < 2) {
            return -1; // Invalid input
        }

        int minDistance = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int currentDistance = Math.abs(array[i] - array[i + 1]);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                index = i; // Update index of the first number
            }
        }

        return index;
    }
}
