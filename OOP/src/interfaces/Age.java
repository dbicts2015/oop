// Interface Age declares methods for getting age and name.
// all methods in an interface are implicitly public and abstract
// An interface can contain constant declarations in addition to method 
// declarations. All constant values defined in an interface are implicitly 
// public, static, and final

package interfaces;

public interface Age
// een interface is een abstracte klasse
// waarin alle methodes per definitie public en abstract zijn

// het is NIET toegestaan attributen te definieren in een interface
// (uitzondering: publieke constanten)
{
	// private String magNiet; // compileerfout
	static final int AANTAL = 100;

	int getAge();

	String getName();

	// compileerfout; een interface mag alleen abstracte methodes bevatten
	// void doIets(){
	// System.out.println("Dit mag niet!!!");
	// }
}
