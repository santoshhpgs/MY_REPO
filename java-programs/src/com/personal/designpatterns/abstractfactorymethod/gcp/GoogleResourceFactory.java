package com.personal.designpatterns.abstractfactorymethod.gcp;

import com.personal.designpatterns.abstractfactorymethod.Instance;
import com.personal.designpatterns.abstractfactorymethod.Instance.Capacity;
import com.personal.designpatterns.abstractfactorymethod.ResourceFactory;
import com.personal.designpatterns.abstractfactorymethod.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
