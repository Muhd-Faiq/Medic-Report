enum ExpertList
{
	EXPERT1("USA","ALLERGISTS"),
	EXPERT2("UKM","ANESTHSIOLOGISTS"),
	EXPERT3("UK","CARDIOLOGISTS"),
	EXPERT4("USIM","COLON");

	private String study;
	private String types;
	private ExpertList(String study,String types)
	{
		this.study=study;
		this.types=types;
	}
	public String getStudy()
	{
		return study;
	}
	public String getTypes()
	{
		return types;
	}

}
