class Doctor
{
	private String gender;
	private int age;
	private String study;
	private String types;
	public Doctor(String gender,int age,String study,String types)
	{
		this.gender=gender;
		this.age=age;
		this.study=study;
		this.types=types;
	}
	public String getGender()
	{
		return gender;
	}
	public String getStudy()
	{
		return study;
	}
	public String getTypes()
	{
		return types;
	}
	public int getAge()
	{
		return age;
	}
}
