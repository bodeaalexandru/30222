package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Insects.BUTTERFLY.equals(type)){
			return new Butterfly();
		}else if(Constants.Animals.Insects.COCKROACH.equals(type)){
			return new Cockroach();
		}else if(Constants.Animals.Insects.SPIDER.equals(type)){
			return new Spider();
		}else {
			throw new Exception("Invalid Animal exception");
		}
	}

}
