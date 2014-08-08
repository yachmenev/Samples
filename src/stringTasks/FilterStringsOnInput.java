package stringTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
����������� ������ �� Java: ������ grep

���������� ����������� ���������� ���������, ������� �� ����������� ����� ��������� 
���������� ���������� �� ���� � �� ������ ���������� ���� �� �������, 
������� �������� ����� ������������ ��������� �� ���� � �������� ���������.

�������� ����������:
��������� �� ������ ��������� �������
� ���������� ����� ���� �������� �� ���� �����, � ���������
� �������� ��������� ����� ���� ������ �� ���������� �����, � ���������� ���������
*/

public class FilterStringsOnInput {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		String word = "word";
		try {
			input(list, br, word);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.trimToSize();
		
		out(list);
		
		System.out.println("��������� ��������� ������ ���������.");
	}
	
	public static ArrayList<String> input(ArrayList<String> list, BufferedReader br, String word) throws IOException{
		System.out.println("������� �����. \n stop - ��� ������.");
		String str = new String();
		do {
			if (str.equalsIgnoreCase("stop")) break;
			str = br.readLine();
			if (str.contains(word)) list.add(str);
		} while (!str.equalsIgnoreCase("stop"));
		return list;
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