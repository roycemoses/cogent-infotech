package stereotype_annotation;

import org.springframework.stereotype.Component;

// the bean object: (name="history")
@Component("history")
public class HistoryService {

	public void store()
	{
		System.out.println("Storing the history...");
	}

}
