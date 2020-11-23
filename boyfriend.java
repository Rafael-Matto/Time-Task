 static void measureOfBmi() {
      //this command will calculed Body mass index
          int weight;
          double bmi,height;
          Scanner input = new Scanner(System.in); 
          System.out.println("Please enter your height in metric: ");         
          height = Double.parseDouble(input.nextLine()); 
          
          System.out.println("Please enter your Weight in Kg: ");
          weight = Integer.parseInt(input.nextLine());
          
          bmi =  weight/(height *height);
         
          DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            System.out.println(df.format("Your Bmi is: "+bmi));
      }
