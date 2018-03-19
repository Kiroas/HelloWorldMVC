package helloworldmvc.model;

public class Model implements IModel{
	
	public String getMessage() {
		return Model.class.getResource("message.txt").getFile();
	}

}
