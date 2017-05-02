package stepdef;
import cucumber.api.java.en.*;

public class Calculator {
	
	
	@Given("^user is providing two numbers \"([^\"]*)\" & \"([^\"]*)\"$")
	public void user_is_providing_two_numbers(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is providing two numbers " + arg1 +" "+ arg2 );
	    dataTypes();
	}

	@Then("^\"([^\"]*)\" numbers$")
	public void numbers(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("perform the operation" + arg1);
	}

	@Then("^verify result is \"([^\"]*)\"$")
	public void verify_result_is(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("result" + arg1);
	}

	@Given("^user is providing number \"([^\"]*)\"$")
	public void user_is_providing_number(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("providing single number" + arg1);
	}

	

public void dataTypes(){
	/*
	 * This method is written for studying datatypes
	 *
	 * */
	byte a = 0;
	short b = 0;
	int c = 0;
	long d = 0;
	float e= 0;
	double f = 0;
	char g = '0';
	boolean h = false;
	
	System.out.println("Variable a of type byte : " +a);
	System.out.println("Variable b of type short : " +b);
	System.out.println("Variable c of type int : " +c);
	System.out.println("Variable d of type long : " +d);
	System.out.println("Variable e of type float : " +e);
	System.out.println("Variable f of type double : " +f);
	System.out.println("Variable g of type char : " +g);
	System.out.println("Variable h of type boolean : " +h);
	
    System.out.println("Byte : " +Byte.MIN_VALUE + " " +Byte.MAX_VALUE + " " +Byte.SIZE + " "+Byte.BYTES);
    System.out.println("Short : " +Short.MIN_VALUE + " " +Short.MAX_VALUE+ " " +Short.SIZE + " "+Short.BYTES);
    System.out.println("Int : " +Integer.MIN_VALUE + " " +Integer.MAX_VALUE+ " " +Integer.SIZE + " "+Integer.BYTES);
    System.out.println("Long : " +Long.MIN_VALUE + " " +Long.MAX_VALUE+ " " +Long.SIZE + " "+Long.BYTES);
    System.out.println("Float : " +Float.MIN_VALUE + " " +Float.MAX_VALUE+ " " +Float.SIZE + " "+Float.BYTES);
    System.out.println("Double : " +Double.MIN_VALUE + " " +Double.MAX_VALUE+ " " +Double.SIZE + " "+Double.BYTES);
   System.out.println("Character : " +Character.SIZE + " " +Character.BYTES);
}


}