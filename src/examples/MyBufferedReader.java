package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Использование BufferedReader для чтения символов с консоли

public class MyBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> list = new ArrayList<String>();	
		
		in(list, br);
		out(list);		
		
		br.close();		
		System.out.println("Программа закончила работу корректно.");
	}
	
	public static void out(ArrayList<String> list){
		// Метод для вывода считанных строк
		if (list.isEmpty()){
			System.out.println("Вы ничего не ввели.");
			return;
		}
		System.out.println("Ваш текст: ");
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	public static ArrayList<String> in(ArrayList<String> list, BufferedReader br) throws IOException {
		// Метод для считывания строк с клавиатуры		
		String str = new String();	
		System.out.println("Введите текст. \nStop - для выхода.");
		while (!str.equals("stop") && !str.contains("stop"))	 {
			str = br.readLine();
			if (str.equals("stop") || str.contains("stop")) break;			
			list.add(str);
		} 	
		
		return list;
	}

}
