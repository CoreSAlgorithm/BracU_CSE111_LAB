//////////////Task-1/////////////

//import java.util.Scanner;
//public class LabTask1
//{
//  public static void main(String[]args)
//  {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = new int[5];
//    int sum = 0;
//    int min = 0;
//    int max = 0;
//    double avg = 0;
//    int count = 0;
//    for(int i=0; i<arr.length; i++)
//    {
//      int num = sc.nextInt();
//      arr[i] = num;
//    }
//    for(int i=0; i<arr.length; i++)
//    {
//      if(arr[i]%2 == 0)
//      {
//        count++;
//      }
//    }
//    int[] newarr = new int[arr.length-count];
//    int newcount = 0;
//    for(int i=0; i<arr.length; i++)
//    {
//      if(arr[i]%2 != 0)
//      {
//        newarr[newcount] = arr[i];
//        newcount++;
//        sum += arr[i];
//      }
//    }
//    for(int i=0; i<newarr.length; i++)
//    {
//      for(int j=0; j<newarr.length-1-i; j++)
//      {
//        if(arr[j] > arr[j+1])
//        {
//          int temp = arr[j];
//          arr[j] = arr[j+1];
//          arr[j+1] = temp;
//        }
//      }
//    }
//    if(newarr.length == 0 )
//    {
//      System.out.print("No odd positive numbers found.");
//    }
//    else
//    {
//      System.out.println("Sum= "+sum);
//      System.out.println("Minimum= "+newarr[0]);
//      System.out.println("Maximum= "+newarr[newarr.length-1]);
//      System.out.println("Average= "+sum/newcount);
//    }
//  }
//}

//////////////Task-2/////////////

//import java.util.Scanner;
//public class LabTask1
//{
//  public static void main(String[]args)
//  {
//    Scanner sc = new Scanner(System.in);
//    String s1 = "Hello123";
//    String s2 = "Wo%%rld";
//    int sum = 0;
//    System.out.println(s1+" "+s2);
//    for(int i=0; i<s1.length(); i++)
//    {
//      int num = (int)s1.charAt(i);
//      System.out.println(num+" ");
//      if((num >= 65 && num <= 90) || (num >= 97 && num <= 122))
//      {
//        sum += num;
//      }
//    }
//    for(int i=0; i<s2.length(); i++)
//    {
//      int num = (int)s2.charAt(i);
//      System.out.println(num+" ");
//      if((num >= 65 && num <= 90) || (num >= 97 && num <= 122))
//      {
//        sum += num;
//      }
//    }
//    System.out.println(sum);
//  }
//}

//////////////Task-3/////////////

//import java.util.Scanner;
//public class LabTask1
//{
//  public static void main(String[]args)
//  {
//    Scanner sc = new Scanner(System.in);
//    int count = 0;
//    System.out.print("N=");
//    int n = sc.nextInt();
//    double[] arr = new double[n];
//    System.out.println("Please enter the elements of the array:");
//    for(int i=0; i<arr.length; i++)
//    {
//      double num = sc.nextDouble();
//      arr[i] = num;
//    }
//    for(int i=1; i<arr.length; i++)
//    {
//       if(arr[i] == arr[i-1])
//       {
//         count++;
//       }
//    }
//    double[] arr1 = new double[n-count];
//    int newcount = 0;
//    arr1[newcount] = arr[0];
//    newcount++;
//    for(int i=1; i<arr.length; i++)
//    {
//       if(arr[i] != arr[i-1])
//       {
//         arr1[newcount] = arr[i];
//         newcount++;
//       }
//    }
//    System.out.print("New Array:");
//    for(int i=0; i<arr1.length; i++)
//    {
//      System.out.print(arr1[i]+" ");
//    }
//    System.out.print("\nRemoved elements:"+count);
//  }
//}

//////////////Task-4/////////////
