// 231rdc021 Henriete Ignatjeva 17.grupa

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static int paraaduSkaits(String s){
        String temp[]=s.split(" ");
        int atzimes[]= new int [temp.length];
        int nameCount=0;
        int total=0;
        int result=0;

        for (int i=0; i<temp.length; i++){
            try {
               int num= Integer.parseInt(temp[i]);
               atzimes[i]=num;
               if (num<4){
                result++;
               }
            }catch(NumberFormatException e){
                nameCount++;
            }
        }
        for (int i=nameCount; i<temp.length; i++){
            total+=atzimes[i];
        }

        double average=total/(double)(temp.length-nameCount);
        if (average<=5){
            for (int i=0; i<nameCount; i++){
                System.out.print(temp[i]+" ");
            }
            return result;
        }else{
            return 0;
        }
    }

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("231rdc021 Henriete Ignatjeva 17.grupa");
		String fileName;
		System.out.println("input file name:");
		fileName = sc.next();
		sc.close();
        FileReader fin = new FileReader(fileName);
        Scanner scanner= new Scanner (fin);
        String s;
        System.out.println("result:");
        while(scanner.hasNextLine()){
            s=scanner.nextLine();
            int result=paraaduSkaits(s);
            if (result!=0){
            System.out.println(result);}
        }

        scanner.close();
        fin.close();
	}
}