 package singeleton;
//Lazy Synchronized Initialization
 public final class SingletonDemo {
	    private static SingletonDemo instance = null;
	    private SingletonDemo() { }
	 
	    public static synchronized SingletonDemo getInstance() {
	        if (instance == null) {
	            instance = new SingletonDemo();
	        }
	 
	        return instance;
	    }
	}
