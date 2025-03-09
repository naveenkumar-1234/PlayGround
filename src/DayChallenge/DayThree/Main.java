package DayChallenge.DayThree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //leetcode contest saturday
    public static int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if((i - k ) < 0 && ( i + k ) < nums.length){
                sum += (nums[i+k] < nums[i]) ? nums[i] : 0 ;
            }
            else if((i - k ) >= 0 && ( i + k ) >= nums.length){
                sum += (nums[i-k] < nums[i]) ? nums[i] : 0 ;
            }else{
                sum += (nums[i-k] < nums[i] && nums[i+k] < nums[i]) ? nums[i] : 0 ;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
            Employee employee = new FullTimeEmployee();
            employee.calculateSalary();
            System.out.println(employee.salary);
            Employee emp2 = new PartTimeEmployee();
            emp2.calculateSalary();
        System.out.println(emp2.salary);
    }
}
