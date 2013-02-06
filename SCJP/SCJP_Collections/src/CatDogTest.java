import java.util.*;

class Dog {
    public Dog(String n) {
        name = n;
    }

    public String name;

    public boolean equals(Object o) {
        if ((o instanceof Dog) && (((Dog) o).name == name)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return name.length();
    }
}

class Cat {
    public String name;

    public Cat() {
        super();
        Random rand = new Random();
        this.name = Integer.valueOf(rand.nextInt()).toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}

enum Pets {
    DOG, CAT, HORSE
}

class CatDogTest {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<Object, Object>();
        m.put("k1", new Dog("aiko")); // add some key/value pairs
        m.put("k2", Pets.DOG);
        m.put(Pets.CAT, "CAT key");
        Dog d1 = new Dog("clover"); // let's keep this reference
        m.put(d1, "Dog key");
        m.put(new Cat(), "Cat key");
        System.out.println(m.get("k1")); // #1
        String k2 = "k2";
        System.out.println(m.get(k2)); // #2
        Pets p = Pets.CAT;
        System.out.println(m.get(p)); // #3
        System.out.println(m.get(d1)); // #4
        
        System.out.println(m.get(new Cat())); // #5
        
        System.out.println(m.size()); // #6
    }
}