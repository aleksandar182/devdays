package models.helpers;

/**
 * The type Administrator statistics.
 */
public class AdministratorStatistics {

	Long numOfRestaurants;
	Long numOfUsers;
	Long numOfCities;
	Long numOfCuisines;


	private AdministratorStatistics() {}

	public static AdministratorStatistics getObject()
	{
		return new AdministratorStatistics();
	}

	public Long getNumOfRestaurants()
	{
		return this.numOfRestaurants;
	}


	public AdministratorStatistics setNumOfRestaurants(Long numOfRestaurants)
	{
		this.numOfRestaurants = numOfRestaurants;
		return this;
	}

	public Long getNumOfUsers() {

		return this.numOfUsers;
	}
	public AdministratorStatistics setNumOfUsers(Long numOfUsers)
	{
		this.numOfUsers=numOfUsers;
		return this;
	}

	public Long getNumOfCities()
	{
		return this.numOfCities;
	}
	public AdministratorStatistics setNumOfCities(Long numOfCities)
	{
		this.numOfCities = numOfCities;
		return this;
	}

	public Long getNumOfCuisines()
	{
		return this.numOfCuisines;
	}
	public AdministratorStatistics setNumOfCuisines(Long numOfCuisines)
	{
		this.numOfCuisines=numOfCuisines;
		return this;
	}

}
