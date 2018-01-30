/** something that can be eaten */

public interface Edible {
    default public int getCalories() { return 100; } 
}
