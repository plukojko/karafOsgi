package restService;


import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Created on 2/21/2018.
 */
public class MainActivator implements BundleActivator {
    private Server server;

    public void start(BundleContext bundleContext) {
        System.out.println("Hello Bundle!");
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setAddress("http://localhost:8282/user");
        factory.setResourceClasses(UserServiceImpl.class);
        factory.setResourceProvider(new SingletonResourceProvider(new UserServiceImpl()));
        factory.setProvider(new JAXBElementProvider());
        server = factory.create();
        server.start();
    }

    public void stop(BundleContext bundleContext) {
        System.out.println("Bye bye");
        server.stop();
    }
}
