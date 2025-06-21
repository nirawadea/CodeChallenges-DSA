import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import Array.MaxProductSubArray;
import Array.MaxProductSubArrayOptimized;
import Array.MergeSortedArray;
import BinarySearch.FirstAndLastPosition;
import BinarySearch.SearchInsertPosition;
import SlidingWindow.FindAllAnagrams;
import SlidingWindow.FirstNegativeNumWindow;
import BinarySearch.FindNumInSortedArray;
import Array.MergeSortedArray;
import TwoPointer.MoveZeros;
import String.ValidAnagram;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Palindrome Code!");
//        Palindrome p = new Palindrome();
//        ReverseString rs = new ReverseString();
//        rs.ReverseString();
//           rs.isPalindrome();


//        Ascii ascii = new Ascii();
//        ascii.calculateAscii();

//        ReverseInteger ri = new ReverseInteger();
////          System.out.println(ri.reverse(1534236469));
//
     SortedArray sa = new SortedArray();
     int[] nums = {1, 1, 3, 4};
     System.out.println("Sorted Array" + sa.removeDuplicates(nums));

//        CommonArrayElements c = new CommonArrayElements();
//        c.getCommon();
//
//        FirstLastElement firstlast = new FirstLastElement();
//        firstlast.getElement();

//RemoveDuplicatesInArraylist removeDuplicatesInArraylist = new RemoveDuplicatesInArraylist();
//
//int[] array = {5,2,4,4,2,1,3,8,9,9};
//
//int[] uniqueResult = removeDuplicatesInArraylist.removeDuplicates(array);
//
//for (int nums : uniqueResult){
//    System.out.println(nums);
//}

     ArrayBag<String> arrayBag = new ArrayBag<String>(5);
     arrayBag.add("A");
     arrayBag.add("B");
     arrayBag.add("C");
     arrayBag.add("D");
     arrayBag.add("E");

     System.out.println("Bag Contents:" + Arrays.toString(arrayBag.toArray()));

     System.out.println("Remove Method:" + arrayBag.remove("B"));

     System.out.println("Get index of" + arrayBag.getIndexOf("C"));

     System.out.println("Contains Method:" + arrayBag.contains("A"));

     System.out.println("Contains Method:" + arrayBag.contains("B"));

     System.out.println("Size Method:" + arrayBag.size());
//
     System.out.println("isEmpty Method:" + arrayBag.isEmpty());
//
     arrayBag.clear();
     System.out.println("Clear Method:" + arrayBag.isEmpty());


     System.out.println("***************Find Index of Element***************");
     String[] array = {"A", "B", "C", "D", "E", "F"};
     String element = "D";
     SerachElementInArray s = new SerachElementInArray();
     System.out.println("Index of the Element is" + " " + s.getElement(element, array));


     System.out.println("*****************Sum of all Integers in an Array******************");

     SumIntegers sum = new SumIntegers();
     String[] arry = {"1", "2", "$", "3", "#", "-4"};
     System.out.println(sum.sumOfArray(arry));


     System.out.println("*****************Fibonacci Series******************");

     FibonacciSeries fb = new FibonacciSeries();
     System.out.println(fb.fibonacci(10));

//
//     System.out.println("*****************ArrayList******************");
//     List l = new List();
//     l.check();


     System.out.println("*****************Next Greater Element ******************");

     NextGreaterElement nge = new NextGreaterElement();
     int[] arr = {1, 3, 2, 4};
     ArrayList<Integer> list = nge.NextGreaterElementInArray(arr);
     System.out.println(list);


//
//        System.out.println("*****************NGE STACK ******************");
//        StackExample sc =new StackExample();
//        int[] arry1 = {4,7,3,4,8,1};
//        System.out.println(Arrays.toString(sc.NextGreaterElement(arry1)));


     System.out.println("*****************STOCK SPAN PROBLEM******************");
//        StockSpan sp = new StockSpan();

//        System.out.println(Arrays.toString(sp.calculateSpan(spArray)));


//        int[] prices = {100,80,60,70,60,75,85};
//        System.out.println(StackExample.calculateSpan(prices));


     System.out.println("*****************MAX Histogram******************");
     int[] heights = {1, 2, 5, 6, 2, 3};
     System.out.println(MaxAreaHistogram.LargestRectangle(heights));

//        System.out.println("*****************Find Integer Odd or Even******************");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Integer:");
//        int num = sc.nextInt();
//        sc.close();
//
//        OddEvenNum bs = new OddEvenNum();
//        boolean isEven = bs.findOddEven(num);
//        System.out.println(isEven ? "even" : "odd");

//        System.out.println("*****************Multiplication******************");
//        int number = 2;
//        MultiplicationTable multiplication = new MultiplicationTable();
//        System.out.println("Total Result is:" + multiplication.Multiplication(number));


     System.out.println("*****************Sum Of Natural Numbers******************");
     SumOfNatural natural = new SumOfNatural();
//        SumOfNatural.swap();

     int b = 2;
     int newObj = natural.sumOfNatural(b);
     System.out.println(newObj);


     System.out.println("*****************Arithmetic Progression******************");
     ArithmeticProgression.AP(2, 5, 4);


     System.out.println("*****************Alternate Array Element in List******************");

     int[] obj = {10, 20, 30, 40, 50};
     ArrayList<Integer> listObj = AlternateArrayElement.getAlternate(obj);
     System.out.println(listObj);

     System.out.println("*****************Linear Search In Array******************");
     int[] arry3 = {1, 4, 6, 3, 2};
     LinearSearch ls = new LinearSearch();
     int resultNew = ls.serachIndex(arry3, 2);
     System.out.println(resultNew);

     System.out.println("*****************Largest Element In Array******************");
     int[] arry4 = {4, 5, 6, 7, 1};
     LargestElement largest = new LargestElement();
     int res = largest.findLargest(arry4);
     System.out.println("Second Largest Element in Array is:" + res);

     System.out.println("*****************Check If Array is Sorted******************");
     int[] arry5 = {4, 4, 5, 6, 7, 5};
     CheckSortedArray cs = new CheckSortedArray();
//        System.out.println(checkSorted.checkSorted(arry5));
     cs.checkSortedArray(arry5);

     System.out.println("*****************Reverse an Array******************");
     ReverseArray rev = new ReverseArray();
     int[] arry6 = {1, 2, 3, 4, 5};

     System.out.println("Reversed Array" + Arrays.toString(arry6));


     System.out.println("*****************Maximun Consecutive Numbers******************");
     MaxConsecutiveNum max = new MaxConsecutiveNum();
     int[] arry7 = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
//        int result1 = max.findMaxConsecutive(arry7);
     System.out.println(max.findMaxConsecutive(arry7));


     System.out.println("*****************Stock Buy and Sell******************");
     StockBuySell sbs = new StockBuySell();
     int[] arry8 = {100, 180, 260, 310, 40, 535, 695};
     int profitSell = sbs.maxProfit(arry8);
     System.out.println(profitSell);

     System.out.println("*****************Check Duplicate******************");
     CheckDuplicateArray dupe = new CheckDuplicateArray();
     int[] arry9 = {2, 4, 6, 5, 8, 9, 9};
     boolean resultCheckDuplicate = dupe.checkDuplicate(arry9);
     System.out.println(resultCheckDuplicate);

     System.out.println("*****************Minimum of Sorted Array******************");
     MinOfSortedArray min = new MinOfSortedArray();
     int[] arry10 = {4, 5, 6, 7, 0, 1, 2};
     int resultMin = min.findMinimunElement(arry10);
     System.out.println(resultMin);

     System.out.println("*****************Reverse Array of Group******************");
     ReverseArrayGroup revGroup = new ReverseArrayGroup();
     int[] arry11 = {1, 2, 3, 4, 5, 6, 7, 8};
     int k = 5;
     revGroup.reverseArrayGroup(arry11, k);

     System.out.println("*****************Two Sum Array******************");
//        TwoSumArray ts = new TwoSumArray();
     int[] arry12 = {2, 6, 5, 8, 11};
//        int n = 5;
     int target = 14;
     String ans = TwoSumArray.twoSum(arry12, target);
     System.out.println("Your Answer is" + ans);


     System.out.println("*****************Selection sort******************");
     int[] arr13 = {13,46,24,52,20,9};
     SelectionSort.sort(arr13);

     System.out.println("*****************Find Numbers that appears only once******************");
     int[] arr14 = {4,1,2,1,2};
     FindNumAppearOnce find = new FindNumAppearOnce();
     int findKey = find.findNumAppearOnce(arr14);
     System.out.println("The key is " + "" + findKey);

     System.out.println("*****************Subaaray Sum Equals to K******************");
     SubarrySumEqualsK sub = new SubarrySumEqualsK();
     int[] arr15 = {9,4,20,3,10,5};
     int K = 33;
     int resultSub = sub.subarraySum(arr15, K);
     System.out.println(resultSub);

     System.out.println("*****************Longest Subaaray Sum Equals to K******************");
     int[] arr16 = {2,3,5,1,9} ;
     long k1 = 10;
     int result = LongestSubarray.longestSubarray(arr16,k1);
     System.out.println(result);


     System.out.println("*****************Kadane's Algorithm******************");
     int[] arr17 = {-2,1,-3,4,-1,2,1,-5,4};
     int[] arr18 = {4,-1,2,1};
     int kadaneResult = KadaneAlgorithm.MaxSubarraySum(arr17);
     System.out.println(kadaneResult);


     System.out.println("*****************Product of Array Except Itself******************");
     ProductOfArray product = new ProductOfArray();
     int[] arr19 = {1,2,3,4};
     int[] resultProduct = ProductOfArray.productExceptItsel(arr19);
     System.out.println(Arrays.toString(resultProduct));


     System.out.println("*****************Subset******************");
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for(int i = 0; i < 5; i++){
      list1.add(i+1);
     }
     ArrayList<ArrayList<Integer>> r = Subsets.getSubsets(list1, 0);
     System.out.println(r);


     System.out.println("*****************Comparable Sort Array******************");
     Integer[] arra = {5, 3, 8, 1, 6};

     System.out.println("Before sorting: " + Arrays.toString(arra));

     // Call the selection sort method from SortArray class
     SortArray.selectionSort(arra, arra.length);

     System.out.println("After sorting: " + Arrays.toString(arra));

     System.out.println("*****************Print LinkedList******************");
     Node n = new Node(10);
     n.next = new Node(20);
     n.next.next = new Node(30);
     n.next.next.next = new Node(40);
     n.next.next.next.next = new Node(50);
     n.next.next.next.next.next = n.next;


//     System.out.println("Print List");
//     Node.countNodes(n);
//     System.out.println(Node.searchNodes(n,30));
//
//     System.out.println("Printing Reversed LinkedList");
//     Node reverse = Node.reverseLinkedList(n);
//     Node.printList(reverse);

     System.out.println("Detect Loop in Linked List");
     boolean hasLoop = Node.detectLoop(n);
     System.out.println("Loop is " + hasLoop);


     System.out.println("*****************Max Sum Subarray of Size K******************");
     MaxSubArraySizeK subarray = new MaxSubArraySizeK();
     int[] array2 = {100,200,300,400};
     int kSize = 2;
     int subarrayResult = subarray.maxSubArray(kSize,array2);
     System.out.println(subarrayResult);


     System.out.println("*****************First Negative Number In Window******************");
     int[] arrNums = {8,-1,-2,2,-3,6,8,-1};
     int knum = 3;
     List li = FirstNegativeNumWindow.firstNegativeWindow(arrNums,knum);
     System.out.println(Arrays.toString(li.toArray()));

     System.out.println("*****************Find Number In A Sorted Array******************");
     int[] sortedArray = {1,3,5,9,10,11,12,15,20,25,30};
     int targetValue = 15;
     boolean resultNum = FindNumInSortedArray.binarySearch(sortedArray, targetValue);
     System.out.println(resultNum);

     System.out.println("*****************Search Insert Position******************");
     //1,3,5,6 ->7
     int[] numsArray = {1,3,5,6};
     int tval = 2;
     SearchInsertPosition search = new SearchInsertPosition();
     int binarys = search.searchInsert(numsArray,tval);
     System.out.println(binarys);

     System.out.println("*****************Merge Sorted Array******************");
     int[] nums1 = {1,2,3,0,0,0};
     int[] nums2 = {2,5,6};
     int m= 3;
     int n1 = 3;
     MergeSortedArray mergeSortedArray = new MergeSortedArray();
     mergeSortedArray.merge(nums1,m,nums2,n1);
     System.out.println(Arrays.toString(nums1));

     System.out.println("*****************Move Zeros******************");
     MoveZeros mover = new MoveZeros();
     int[] Movenums = {0, 1, 0, 3, 12};
     System.out.println("Before: " + Arrays.toString(Movenums));
     mover.moveZeroes(Movenums);
     System.out.println("After: " + Arrays.toString(Movenums));

     System.out.println("*****************First and Last Position in a Sorted Array******************");
     FirstAndLastPosition flp = new FirstAndLastPosition();
     int[] arryss = {1,3,5,5,5,5,45,80,110};
     int x = 5;
     FirstAndLastPosition.findPosition(arryss,x);

     System.out.println("*****************Valid Anagram******************");
     String s1 = "anagram";
     String s2 = "nagara";
     ValidAnagram va = new ValidAnagram();
     boolean isAnagramCheck = va.isAnagram(s1,s2);
     System.out.println(isAnagramCheck);

     System.out.println("*****************Find All Anagrams in a String******************");
     String str = "cbaebabacd";
     String str2 = "abc";
     List<Integer> l = FindAllAnagrams.findAnagram(str,str2);
     System.out.println(l);

     System.out.println("*****************Maximum Product Subarray******************");
     int[] maxSubArr = {2,3,-2,4};
     MaxProductSubArrayOptimized maxSub = new MaxProductSubArrayOptimized();
     int maxResult = maxSub.maxProduct(maxSubArr);
     System.out.println(maxResult);

    }
 }
