
public class runner {
public static void main(String[] args) {
	Robot Johnny5=new Robot(true,"Johnny5");
	Robot Johnny6=new Robot(false,"Johnny6");
System.out.println(Johnny5.name);
Johnny6.borg();
Johnny5.borg();
}
}
