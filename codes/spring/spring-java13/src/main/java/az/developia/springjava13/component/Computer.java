package az.developia.springjava13.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "myComp1")
@Primary
public class Computer {
	private Integer id;
	private String model;

	public Computer() {

		this.id = 2;
		this.model = "g62";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
