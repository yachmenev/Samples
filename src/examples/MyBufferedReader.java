package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//������������� BufferedReader ��� ������ �������� � �������

public class MyBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> list = new ArrayList<String>();	
		
		in(list, br);
		out(list);		
		
		br.close();		
		System.out.println("��������� ��������� ������ ���������.");
	}
	
	public static void out(ArrayList<String> list){
		// ����� ��� ������ ��������� �����
		if (list.isEmpty()){
			System.out.println("�� ������ �� �����.");
			return;
		}
		System.out.println("��� �����: ");
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	public static ArrayList<String> in(ArrayList<String> list, BufferedReader br) throws IOException {
		// ����� ��� ���������� ����� � ����������		
		String str = new String();	
		System.out.println("������� �����. \nStop - ��� ������.");
		while (!str.equals("stop") && !str.contains("stop"))	 {
			str = br.readLine();
			if (str.equals("stop") || str.contains("stop")) break;			
			list.add(str);
		} 	
		
		return list;
	}

}
