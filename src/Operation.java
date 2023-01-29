public class Operation {
    public static void main(String[] args) {

        int numberString=0;
        do{
            String nameOperation=args[numberString];
            int numberLeft=Integer.parseInt(args[numberString+1]);
            int numberRight=Integer.parseInt(args[numberString+2]);

            switch (nameOperation){
                case "SUMA":
                    System.out.println(numberLeft + " + " + numberRight +" = " +(numberLeft + numberRight));
                    break;
                case "RESTA":
                    System.out.println(numberLeft + " - " + numberRight +" = " +(numberLeft - numberRight));
                    break;
                case "MULTIPLICACION":
                    System.out.println(numberLeft + " * " + numberRight +" = " +(numberLeft * numberRight));
                    break;
                case "DIVISION":
                    System.out.println(numberLeft + " / " + numberRight +" = " +(numberLeft / numberRight));
                    break;
            }
            numberString +=3;
        }while(numberString < args.length);
    }
}