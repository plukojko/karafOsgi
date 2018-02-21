package restService;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created on 2/21/2018.
 */
public class MainActivator implements BundleActivator {

    public void start(BundleContext bundleContext) {
        System.out.println("Hello Bundle!");
    }

    public void stop(BundleContext bundleContext) {
        System.out.println("Bye bye");
    }
}
