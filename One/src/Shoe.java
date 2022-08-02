
public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String brand, model;
	private int shoeReleaseYear;

public Shoe() {
    brand = "";
    model = "";
    shoeReleaseYear = 2021;
}

public Shoe(String make, String model) {
    this.brand = brand;
    this.model = model;
    shoeReleaseYear = 2021;
}

public Shoe(String make, String model, int shoeReleaseYear) {
    this.brand = brand;
    this.model = model;
    this.shoeReleaseYear = shoeReleaseYear;
}

public String getMake() {
    return brand;
}

public void setMake(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getManufacturingYear() {
    return shoeReleaseYear;
}

public void setManufacturingYear(int shoeReleaseYear) {
    this.shoeReleaseYear = shoeReleaseYear;
}
@Override
public String toString() {
    return "Shoe{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", shoeReleaseYear=" + shoeReleaseYear +
            '}';
}

public boolean isNewShoe() {
    return shoeReleaseYear >= 2022;
}
}