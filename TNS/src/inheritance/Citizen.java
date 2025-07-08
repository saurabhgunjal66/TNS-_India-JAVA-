package inheritance;

public class Citizen{
	private int Id;
	private String name;
	private long adhar;
	private String add;
	
	public Citizen() {
		System.out.println("defailt constructor");
	}

	public Citizen(int id, String name, long adhar, String add) {
		
		Id = id;
		this.name = name;
		this.adhar = adhar;
		this.add = add;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Citizen [Id=" + Id + ", name=" + name + ", adhar=" + adhar + ", add=" + add + "]";
	}
	
	
		
}
