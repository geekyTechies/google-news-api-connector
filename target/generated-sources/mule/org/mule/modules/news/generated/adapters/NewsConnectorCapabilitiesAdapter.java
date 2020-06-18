
package org.mule.modules.news.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.news.NewsConnector;


/**
 * A <code>NewsConnectorCapabilitiesAdapter</code> is a wrapper around {@link NewsConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-06-18T08:36:21+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class NewsConnectorCapabilitiesAdapter
    extends NewsConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
