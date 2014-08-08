package stringTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Реализовать задачу на Java: Аналог grep

Необходимо реализовать консольную программу, которая бы фильтровала поток текстовой 
информации подаваемой на вход и на выходе показывала лишь те строчки, 
которые содержат слово передаваемое программе на вход в качестве аргумента.

Варианты усложнения:
Программа не должна учитывать регистр
В аргументах может быть передано не одно слово, а несколько
В качестве аргумента может быть задано не конкретное слово, а регулярное выражение
*/

public class FilterStrings {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		try {
			input(list, br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.trimToSize();
		
		list = filter(list);
		
		out(list);
		
		System.out.println("Программа закончила работу корректно.");
	}
	
	public static ArrayList<String> input(ArrayList<String> list, BufferedReader br) throws IOException{
		System.out.println("Введите текст. \n stop - для выхода.");
		String str;
		do {
			str = br.readLine();
			if (str.equals("stop")) break;
			list.add(str);
		} while (!str.equals("stop"));
		return list;
	}
	
	public static ArrayList<String> filter(ArrayList<String> list){
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).contains("word")){
				list2.add(list.get(i));
			}
		}
		return list2;
	}
	public static void out(ArrayList<String> list){
		int i = 0;
		if (!list.isEmpty()){
			do {
				System.out.println(list.get(i));
				i++;
			} while (i < list.size());
		}
		
	}

}
