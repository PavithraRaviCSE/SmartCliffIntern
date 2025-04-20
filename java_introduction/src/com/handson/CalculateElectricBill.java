/*Electricity bill calculator: Calculate the bill for 30 days based on
the given below data.
a) There are 2 fans of 60W each. Usage of each fan is 6
hours per day.
b) There are 3 lights of 40W each. Usage of each light is 8
hours per day.
c) For the other electrical appliances, the total
consumption per day is 3000W.
d) Cost of 1 unit is Rs.6
*/

package com.handson;


public class CalculateElectricBill {
	public static void main(String args[]) {
		int fan = 2 * 60,fan_hour = 8;
		int lights = 3 * 40, l_hour = 8;
		int others = 3000;
		int watt_per_day = fan * fan_hour + lights * l_hour + others;
		int watt_per_month = watt_per_day * 30;
		System.out.print("the bill for the electricity : " + 6 * (watt_per_month/1000) );
		
	}
		
}
