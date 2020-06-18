
package org.mule.modules.news.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.news.NewsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>NewsConnectorProcessAdapter</code> is a wrapper around {@link NewsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-06-18T08:36:21+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class NewsConnectorProcessAdapter
    extends NewsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<NewsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, NewsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final NewsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,NewsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, NewsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, NewsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
