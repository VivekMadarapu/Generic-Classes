import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Railroad {

    Scanner file;
    ArrayStack<Integer> trackA = new ArrayStack<>(1000);
    ArrayStack<Integer> station = new ArrayStack<>(1000);

    public Railroad(String path){
        try {
            file = new Scanner(new File(path));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void run(){
        int size = file.nextInt();
        file.nextLine();

        for(int i = size; i > 0;i--){
            trackA.push(i);
        }

        while(file.hasNext()) {
            String line = file.nextLine();
            if (line.length() == 1 && Integer.parseInt(line.trim()) == 0) {
                line = file.nextLine();
                size = Integer.parseInt(line);
                if (size == 0) {
                    return;
                }
                trackA = new ArrayStack<>(size);
                for (int i = size; i > 0; i--) {
                    trackA.push(i);
                }
                station = new ArrayStack<>(size);
                System.out.println();
            } else {
                System.out.println("Ran");
//                String tempLine = line.replaceAll("\\s+", "");
//                boolean isValid = true;
//                while (tempLine.length() > 0) {
//                    if(trackA.isEmpty()){
//                        System.out.println("You done goof");
//                    }
//                    if (!trackA.isEmpty() && Integer.parseInt(tempLine.charAt(0) + "") == trackA.peek()) {
//                        trackA.pop();
//                        tempLine = tempLine.substring(1);
//                    } else {
//                        if (!trackA.isEmpty()) {
//                            station.push(trackA.pop());
//                        } else {
//                            if (Integer.parseInt(tempLine.charAt(0) + "") == station.peek()) {
//                                station.pop();
//                                tempLine = tempLine.substring(1);
//                            } else {
//                                isValid = false;
//                                tempLine = "";
//                            }
//                        }
//                    }
//                }
//                if (isValid) {
//                    System.out.println("Yes");
//                } else {
//
//                    System.out.println("No");
//                }
            }
        }
    }
}

