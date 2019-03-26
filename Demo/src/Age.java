
public class Age {
public String ValidAge(int age)
{
	if(age>17)
		return "valid";
	else
		return "invalid";
}
public String ValidParty(String a)
{
	if(a.contentEquals("tbp"))
	{
		return "cbn";
	}
else 
		return "invalid";

}
}
