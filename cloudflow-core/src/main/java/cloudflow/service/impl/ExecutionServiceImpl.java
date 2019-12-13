package cloudflow.service.impl;

import cloudflow.error.CloudFlowException;
import cloudflow.model.Experiment;
import cloudflow.model.Execution;
import cloudflow.model.User;

import cloudflow.service.ExecutionService;

import java.util.Collections;

public class ExecutionServiceImpl implements ExecutionService {
    @Override
    public Execution executeFlow(Execution execution, User user) throws CloudFlowException {
        throw new CloudFlowException(Collections.emptyList());
    }

    @Override
    public Experiment createExperiment(Experiment experiment, User user) throws CloudFlowException  {
        throw new CloudFlowException(Collections.emptyList());
    }
}
