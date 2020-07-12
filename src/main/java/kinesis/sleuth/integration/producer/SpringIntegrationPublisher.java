package kinesis.sleuth.integration.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;

/**
 * @author Manideep
 * @Description
 */
@EnableBinding(Source.class)
public class SpringIntegrationPublisher {
	@Autowired
	private Source binder;

	public void publish(String publishString) {
		binder.output().send(MessageBuilder.withPayload(publishString).build());
	}

}
