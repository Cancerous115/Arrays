import java.util.Arrays;
//We can add import to print out the string instead of just a certain value
class Main{
	public static void main(String[]args){
		//array we define ase vowels, with a length of 5 characters
		
		//To define all our characters together instead of seperate change "new char[5]"
		//to {'a','e','i','o','u'};"Look at line 12 for followup"
		//if we need to sort our arrays {'a,'o','i','u','e'} then use "Arrays.sort(vowels);"
		
		char vowels[]=new char[5];
		//Once changed, we can delete all our variables below "vowels[0]='a'-[4]..."
		//Also remove "System.out.print(vowels[...]);"
		
		//a____
		//index starts at 0.For this the index is 0 and ends at 4 since our length is only 5.
		vowels[0]='a';
		vowels[1]='e';
		vowels[2]='i';
		vowels[3]='o';
		vowels[4]='u';
		//Prints out one value
		System.out.println(vowels[2]); 
		//With the "import" added we can print all the Arrays as a String
		System.out.println(Arrays.toString(vowels));
		System.out.println(vowels.length);
	}
}