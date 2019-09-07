public class Main {

    public static void main(String[] args) {
       /*
       Railroad railroad = new Railroad("railroad.dat");
       railroad.run();
       */
        ArrayStack<Integer> trackA = new ArrayStack<Integer>(5);
        trackA.push(5);
        trackA.push(4);
        trackA.push(3);
        trackA.push(2);
        trackA.push(1);
        ArrayStack<Integer> station = new ArrayStack<>(5);
        String tempLine = "12345";
        boolean isValid = true;
        while(tempLine.length() > 0){
            if(!trackA.isEmpty() && tempLine.charAt(0) == trackA.peek()){
                trackA.pop();
                tempLine = tempLine.substring(1);
            }
            else{
                if(!trackA.isEmpty()) {
                    station.push(trackA.pop());
                }
                else {
                    if (tempLine.charAt(0) == station.peek()) {
                        station.pop();
                        tempLine = tempLine.substring(1);
                    } else {
                        isValid = false;
                        tempLine = "";
                    }
                }
            }
        }
        if(isValid){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
}
