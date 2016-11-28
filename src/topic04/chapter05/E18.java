package topic04.chapter05;

public class E18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Pattern A
		System.out.println("Pattern A");
		for (int rows = 1; rows <= 6; rows++){
			for (int columns = 1; columns <= rows; columns++){
				System.out.print(columns + " ");
			}
			System.out.println();
		}
// Pattern B
		System.out.println("Pattern B");
		for (int rows = 6; rows >= 1; rows--){
			for(int columns = 1; columns <= rows; columns++){
				System.out.print(columns + " ");
			}
		System.out.println();
		}
// Pattern C
		System.out.println("Pattern C");
		for (int rows = 1; rows <= 6; rows++){
			for(int space = 6 - rows; space >= 1; space--)
				System.out.print("  ");
			for(int columns = rows; columns >= 1; columns--)
				System.out.print(columns + " ");
			System.out.println();
		}
// Pattern D
		System.out.println("Pattern D");
		for (int rows = 6; rows >= 1; rows--){
			for(int space = 1 + rows; space <= 6; space++)
				System.out.print("  ");
			for(int columns = 1; columns <= rows; columns ++)
				System.out.print(columns + " ");
			System.out.println();
		}
	}

}
