public abstract class Animal {
    public String name;
    public String eat;
    public int age;
    public Animal (String speciesName,String food,int years) {
        name = speciesName;
        eat = food;
        age = years;
    }
    public abstract void voice();
    public void makeNoise() {
        System.out.println("Animals make noise");
    }

    public String getName(){
        return name;
    }

    public String getEat(){
        return eat;
    }

    public int getAge(){
        return age;
    }
}

    class Mammal extends Animal {
        int weight;

        public Mammal(String speciesName, String food, int years,int animalWeight) {
            super(speciesName, food, years);
            weight= animalWeight;
        }

        @Override
        public void voice() {
            System.out.println("Ar-r-r-r");
        }

        public int getWeight(){
            return weight;
        }
    }

    class Tiger extends Mammal {
        String day;
        int hours;

        public Tiger(String speciesName, String food, int years,String dayNight, int sleepHours, int animalWeight) {
            super(speciesName,food,years,animalWeight);
            day = dayNight;
            hours = sleepHours;
        }

        @Override
        public void voice() {
            System.out.println("Ar-r-r-r!");
        }

        public void sleep(String day) {
            System.out.println("Animal sleeps at "+ day);
        }

        public void sleep(int hours) {
            System.out.println("Animal sleeps almost " + hours);
        }
    }

    class Reptile extends Animal {
         public Reptile(String speciesName, String food, int years) {
             super(speciesName, food, years);
         }

         @Override
         public void voice() {
             System.out.println("Sh-sh-sh");
         }
    }

    class Snakes extends Reptile {
          boolean toxic;
          int length;

          public Snakes(String speciesName, String food, int years, boolean poison,int snakeLength) {
            super(speciesName, food, years);
            toxic = poison;
            length = snakeLength;
          }

          @Override
          public void voice() {
              System.out.println("ssssssss");
          }
    }

class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("White tiger", "meat", 50, "day", 8, 78);
        Snakes snakes = new Snakes("Anaconda", "meat", 80, false, 15);

        System.out.println("Name " + tiger.getName());
        System.out.println("Eats " + tiger.getEat());
        System.out.println("Live almost " + tiger.getAge());
        System.out.println("Sleep at " + tiger.day);
        System.out.println("Sleeps almost " + tiger.hours);
        System.out.println("Weight is " + tiger.getWeight());

        System.out.println("Name " + snakes.getName());
        System.out.println("Eats " + snakes.getEat());
        System.out.println("Live almost " + snakes.getAge());
        System.out.println("Is it toxic? - " + snakes.toxic);
        System.out.println("Length " + snakes.length + "m");
    }
}