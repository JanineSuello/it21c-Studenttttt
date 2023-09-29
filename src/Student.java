
class Student {

     String name;
     String section;
     String motto;
    
}

  class Main{
    public static void main (String[] args){
        Student s = new Student();
        s.name = "Janine Grace P. Suello";
        s.section = "IT21C-IT24";
        s.motto = "Fall down seven times, Stand up eight." ;
        System.out.println("My name is " + s.name + ", I am from " + s.section + ", and my motto is: " + s.motto);
        
    }
}
