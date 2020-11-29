package ru.IShorin.JavaPractice.laba24;

 class Trousers {
    public static void main(String[] args){
        String[] shirts = new String[11];
        shirts[0] = "Yellow,XL";
        shirts[1] = "Black,L";
        shirts[2] = "Blue,XL";
        shirts[3] = "Red,M";
        shirts[4] = "Tan,XL";
        shirts[5] = "Black,XL";
        shirts[6] = "White,XL";
        shirts[7] = "White,L";
        shirts[8] = "Green,S";
        shirts[9] = "Orange,S";
        shirts[10] = "Maroon,S";
        for (String shirt : shirts) {
            Trousers shirt1 = new Trousers(shirt);
            System.out.println(shirt1.toString());
        }
    }
    private String color, size;

     Trousers(String array){
        try {
            String[] tmp = array.split(",");
            color = tmp[1];
            size = tmp[2];
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }


}
