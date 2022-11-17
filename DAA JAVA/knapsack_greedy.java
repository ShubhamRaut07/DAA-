import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class ItemValue {
	
	int value;
	int weight;
	double unitValue;
	
	ItemValue(int value, int weight) {
		this.value = value;
		this.weight = weight;
		this.unitValue = (double) value / (double) weight;
	}
	
}

public class knapsack_greedy {
	
	public static void main(String[] args) {
		        
		double maxValue = 0;
		
		int W = 22;
		ItemValue[] arr = new ItemValue[4];
        
		arr[0] = new ItemValue(6, 4);
		arr[1] = new ItemValue(6, 4);;
		arr[2] = new ItemValue(4, 4);
		arr[3] = new ItemValue(4, 4);
		
        Arrays.sort(arr, new Comparator<ItemValue>() {
        	
        	@Override
        	public int compare(ItemValue o1, ItemValue o2) {
        		return (int) (o2.unitValue - o1.unitValue);
        	}
        	
        });
        
        for(ItemValue item : arr) {
        	
        	if(item.weight < W) {
        		maxValue += item.value;
        		W -= item.weight;
        	} else {
        		//Multiplying unit cost with the available space/ capacity/ W.
        		maxValue += (W * item.unitValue);
        		W = 0;
        		break;
        	}

        }
        System.out.println(maxValue);
	}

}
