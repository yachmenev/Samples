package shortWay;

import java.util.Random;

public class ShortWay {

	public static void main(String[] args) {
		
		Point a = new Point(random(), random());
		Point b = new Point(random(), random());		
		Point a2 = null;
		//Клонируем точку А для дальнейшего использования.
		try {
			a2 = (Point) a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		showData(a, b, a2);
		//showWay(a, b);
		
		//Цикл считающий необходимое кол-во шагов.
		int count = 0;
		while (!a2.equals(b)) {
			if (a2.x < b.x) a2.x++;
			if (a2.x > b.x) a2.x--;
			if (a2.y < b.y) a2.y++;
			if (a2.y > b.y) a2.y--;
			count++;
		}
		
		System.out.println("\nNeed " + (count-1) + " points\n");
		
		//Массив для хранения точек пути.
		Point way[];
		if (count != 0)	{
			way = new Point[count-1];
		} else way = new Point[1];
		
		//Снова клонируем А в А2 так как А2 изменилась в ходе подсчета шагов.
		try {
			a2 = (Point) a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//Цикл считающий шаги и записывающий их в массив.
		count = 0;
		while (!a2.equals(b)) {
			if (a2.x < b.x) a2.x++;
			if (a2.x > b.x) a2.x--;
			if (a2.y < b.y) a2.y++;
			if (a2.y > b.y) a2.y--;
			try {
				if (count < way.length)	way[count] = (Point) a2.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			count++;
		}
		
		//showData(a, b, a2);
		//showArray(way);
		showWay(a, b, way);
		
		
		System.out.println("The Programme ENDED correctly.");
		

	}
	//Метод отрисовывает поле координат и точки А, В.
	public static void showWay(Point a, Point b){
		for (int i = 0; i < 10; i++){			
			for (int j = 0; j < 10; j++){
				if (a.x == i && a.y == j) System.out.print("A ");
				else if (b.x == i && b.y == j) System.out.print("B ");
				else	System.out.print("* ");				
			}
			System.out.print("\n");
		}		
	}
	// Метод отрисовывает поле с точками и кротчайшим путем.
	public static void showWay(Point a, Point b, Point[] way){
		for (int i = 0; i < 10; i++){			
			for (int j = 0; j < 10; j++){
				if (a.x == i && a.y == j) {System.out.print("A ");}
				else if (b.x == i && b.y == j) {System.out.print("B ");}
					else if (ravno(i, j, way)) {System.out.print("■ ");}	
						else System.out.print("□ ");
				
					} System.out.print("\n");									
			}
							
	}
	//Метод выводящий промежуточные значения точек А, Б и временной переменной.
	public static void showData(Point a, Point b, Point a2){
		System.out.println("Intermediate data:");
		System.out.println("A: " + a.toString());
		System.out.println("B: " + b.toString());
		//System.out.println("A2: " + a2.toString() + "\n");
		
	}
	//Метод выводящий промежуточные значения точек А, Б, А2 и массив в который записан путь.
	public static void showArray(Point[] way){
		System.out.println("Way array:");
		for (int i = 0; i < way.length; i++){
			System.out.println(i + ": " + way[i].toString());
		} 
		System.out.println();
	}
	//Метод создающий две случайные точки А и Б на координатной сетке 10х10
	public static int random(){
		Random r = new Random();
		int x = r.nextInt(10);
		return x;
	}
	//Метод выявляет совпадения текущих координат Х и У с точками проложенного маршрута
	public static boolean ravno(int x, int y, Point[] way){
		for (int i = 0; i < way.length; i++){
			if (way[i].x == x && way[i].y == y){
				return true;
			}
		}
		return false;		
	}

}