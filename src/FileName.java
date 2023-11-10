
public class FileName {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("2");
		list.add("54");
		list.add("44");
		list.add("1");
		
		int arr[] = new int [list.size()];
		int q=0;
		for(String str : list) {
			arr[q] = Integer.parseInt(str);
			q++;
		}
		
		
//		<<<<<<< HEAD
//		abc
//		asd
//		adsassd
//		asdasd
//		asdasd
//		=======
//		asdasd
//		asdasd
//		asdasd
		
		int temp;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

