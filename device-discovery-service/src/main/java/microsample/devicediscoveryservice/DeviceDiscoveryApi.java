package microsample.devicediscoveryservice;

import com.thoughtworks.xstream.io.binary.Token;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceDiscoveryApi {

  @Value("${app.user}")
  private String appUser;
  @Value("${eureka.instance.instance-id}")
  private String instanceId;

  @GetMapping
  public String discover()
  {
   final StringBuilder msg = new StringBuilder();

    msg.append("Start discovery of the device under instanceId: ").append(instanceId)
        .append(", by user: ").append(appUser).append("...");

   return msg.toString();
  }
}
