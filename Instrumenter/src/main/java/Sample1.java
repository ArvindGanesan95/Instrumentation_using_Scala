

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample1 {

    private static Logger logger = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {

        logger.info("Logging a method declaration with name : main()");
		if (args.length < 5) {
            logger.info("Logging a method invocation with name : exit()");
			logger.error("There needs to 5 input arguments");
            System.exit(-1);
			logger.info("Logging a method invocation with name : error()");
        }

        int a = Integer.parseInt(args[0]);
		logger.info("Logging a variable declaration and its value a : {}", a);
        int b = Integer.parseInt(args[1]);
		logger.info("Logging a variable declaration and its value b : {}", b);
		logger.info("Logging a method invocation with name : parseInt()");
		logger.info("Logging a method invocation with name : parseInt()");
		logger.info("Logging a method invocation with name : parseInt()");
		logger.info("Logging a method invocation with name : parseInt()");
		logger.info("Logging a method invocation with name : parseInt()");
        int c = Integer.parseInt(args[2]);
		logger.info("Logging a variable declaration and its value c : {}", c);
        int d = Integer.parseInt(args[3]);
		logger.info("Logging a variable declaration and its value d : {}", d);
        int e = Integer.parseInt(args[4]);
		logger.info("Logging a variable declaration and its value e : {}", e);

        logger.info("Logging a for statement");
		for (int i = 0; i < a; i++) {

            b = b - 1;
			logger.info("Logging a method invocation with name : add()");
            add(a, b);
        }

        int m = 0;
		logger.info("Logging a variable declaration and its value m : {}", m);

        logger.info("Logging a while statement");
		while (m < e) {
            logger.info("Logging a method invocation with name : add()");
			m++;
            add(a, b);
        }
    }

    public static int add(int a, int b) {
        logger.info("Logging a method declaration with name : add()");
		return a + b;
    }

}
