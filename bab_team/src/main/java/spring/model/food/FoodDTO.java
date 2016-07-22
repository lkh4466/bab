package spring.model.food;

public class FoodDTO {
	private int foodNum;
	private String recipe;
	private int calorie;
	private String foodName;
	private int recipePrice;
	private String grpCode;
	
	public int getFoodNum() {
		return foodNum;
	}
	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getRecipePrice() {
		return recipePrice;
	}
	public void setRecipePrice(int recipePrice) {
		this.recipePrice = recipePrice;
	}
	public String getGrpCode() {
		return grpCode;
	}
	public void setGrpCode(String grpCode) {
		this.grpCode = grpCode;
	}
	
}
