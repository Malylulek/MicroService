package microsample.graphservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GraphAPI {

  @GetMapping
  public String getGraphForRings()
  {
    return "Transferring ring graph...";
  }
}
