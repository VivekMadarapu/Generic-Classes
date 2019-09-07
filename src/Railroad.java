import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Railroad {

    Scanner file;

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
        ArrayStack<Integer> trackA = new ArrayStack<>(size);
        for(int i = size; i > 0;i--){
            trackA.push(i);
        }
        ArrayStack<Integer> station = new ArrayStack<>(size);
        String line =  file.nextLine();
        if(line.length() == 1 && Integer.parseInt(line) == 0){
            line = file.nextLine();
            size = Integer.parseInt(line);
            if(size == 0){
                return;
            }
            trackA = new ArrayStack<>(size);
            for(int i = size; i > 0;i--){
                trackA.push(i);
            }
            station = new ArrayStack<>(size);
        }
        else{
            String tempLine = line;
            boolean isValid = true;
            while(tempLine.length() != 0){
                if(tempLine.charAt(0) == trackA.peek()){
                    tempLine = tempLine.substring(1);
                }
                else{
                    station.push(trackA.pop());
                    if(tempLine.charAt(0) == station.peek()){

                    }
                    else if(trackA.isEmpty()){
                        isValid = false;
                    }
                }
            }
        }
    }
}

