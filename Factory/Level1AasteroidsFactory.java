public class Level1AasteroidsFactory extends AsteroidsFactory {
    public Asteroids createAsteroids(int score) {

        if(score>1000) return new RockyAsteroids();
         
        return new SiliconAsteroids();
        
    }
}
