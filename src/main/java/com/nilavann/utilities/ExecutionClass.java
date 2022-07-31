package com.nilavann.utilities;

import com.nilavann.problems.easy.NumberOfBuildingsFacingTheSun;

import java.util.*;

public class ExecutionClass {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        int[] unSortedArray = new int[]{30, 65, 23, 1, 6, 78, 54, 1, 100};
        Scanner scan = new Scanner(System.in);
        //System.out.println(FindUniqueNumber.findUniqueNumber(Arrays.asList( intArray)));
        //System.out.println(SubArrayMaxSum.solveSubArrayMaxSum(Arrays.asList( new Integer[]{1,2,13,-3,10})));
        // Arrays.stream( InsertionSort.descendingSort(unSortedArray)).forEach( i -> System.out.println(i));

        //Arrays.stream( SelectionSort.sortDescending(unSortedArray)).forEach( i -> System.out.println(i));

        //System.out.println(SubArrayMaxSum.solveSubArrayMaxSumRecursiveSolution( new int[]{1,-9,100,-1000,2}));

        //Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).reduce(0, (i,j) -> i + j);

        //int t = Integer.parseInt( scan.nextLine());

        //Scanner scan = new Scanner(System.in);
        int[] arr = new int[]{ 2,3,4,5};
        //System.out.println(bestSum( 100, arr, new ArrayList<>(), new HashMap<>()));

        /*System.out.println(CanHowBestSubString.allConstruct( "abcd", new String[]{ "ab", "cd", "cd", "def", "abcd", "ef", "c", "d"}, new HashMap<>()));
        System.out.println(CanHowBestSubString.allConstructTabulation( "abcd", new String[]{ "ab", "cd", "cd", "def", "abcd", "ef", "c", "d"}));

        System.out.println(CanHowBestSubString.countConstruct( "eeeeeeeeeeeef", new String[]{ "e", "eee", "ef"}, new HashMap<>()));

        List<List<String>> result = CanHowBestSubString.allConstructTabulation( "eeeeeeeeeeeef", new String[]{ "e", "eee", "ef"});
        System.out.println( "Size: " + result.size());*/

        //System.out.println( );

        method( 2,3,1, new int[]{1,1,1}, new int[]{1,1,1});
        //Stream.of( arr).forEach(System.out::println);
        scan.close();


        System.out.println( NumberOfBuildingsFacingTheSun.numberOfBuildingsFacingTheSun( new int[]{ 2,3,4,5}));
        System.out.println( NumberOfBuildingsFacingTheSun.numberOfBuildingsFacingTheSun( new int[]{ 2,3,4,5}));

    }


    public static int binarySearchIndex( int[] arr, int key, int low, int high, int minIndex){


        if( low > high) return  minIndex;

        int mid = low + (high - low) / 2;

        if( arr[mid] == key){
            return mid + 1;
        }
        else if( key > arr[mid]){

            return binarySearchIndex( arr, key, mid + 1, high, minIndex);
        }else{
            return binarySearchIndex( arr, key, low, mid -1, mid);
        }
    }


    public static void method(int n, int m, int k, int[] initial, int[] interval){
        int low = 1;
        int high = 10;

        int sq = Math.min( n, m);
        int[] nutCount = new int[m];
        int ans = 0;
        StringBuilder sb = new StringBuilder();

        while( low <= high){

            int mid = low + ( ( high - low)/2);

            for ( int i = 0; i < m; i++){

                if( mid < initial[i]){
                    nutCount[i] = 0;
                }else{
                    nutCount[i] = 1 + ( mid - initial[i])/ interval[i];
                }
            }

            Arrays.sort( nutCount);
            int tnutCount = 0;

            int index = m - 1;
            for( int j = 0; j < sq; j++){

                tnutCount += nutCount[index--];
            }

            if( tnutCount >= k){

                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
		System.out.println( ans);
    }

}
