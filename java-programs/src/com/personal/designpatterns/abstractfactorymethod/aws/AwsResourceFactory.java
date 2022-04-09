package com.personal.designpatterns.abstractfactorymethod.aws;

import com.personal.designpatterns.abstractfactorymethod.Instance;
import com.personal.designpatterns.abstractfactorymethod.Instance.Capacity;
import com.personal.designpatterns.abstractfactorymethod.ResourceFactory;
import com.personal.designpatterns.abstractfactorymethod.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
