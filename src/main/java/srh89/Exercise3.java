package srh89;

public class Exercise3 {
	public static void main(String[] args) {
		int num = 0;
		if (args.length != 1) {
			System.out.println("Error: Wrong number of arguments");
			System.exit(1);
		}
		try {
			num = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Error: Number must be an integer");
			System.exit(1);
		}

		int tri, slices;

		tri = triangle(num);
		slices = lazy(num);
		
		String output = "Tri(%d) = %d\nLazy(%d) = %d";
		System.out.format(output, num, tri, num, slices);
	}

	public static int triangle(int num) {
		int tri = 0;
		for (int i = num; i > 0; i--) {
			tri += i;
		}
		return tri;
	}

	public static int lazy(int num) {
		int slices = 0;
		slices = (num*num + num + 2)/2;
		return slices;
	}
}
