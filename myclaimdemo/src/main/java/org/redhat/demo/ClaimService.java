package org.redhat.demo;

import org.redhat.demo.data.ClaimInput;
import org.redhat.demo.data.ClaimOutput;

public interface ClaimService {

	public ClaimOutput apply(ClaimInput input);
	
}
