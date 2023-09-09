import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertyfile {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\datadriven\\username.properties");
		Properties p=new Properties();
		p.load(fis);
	String	abc=p.getProperty("UN");
	System.out.println(abc);

	}

}
