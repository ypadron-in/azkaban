package cloudflow.service;

import cloudflow.error.CloudFlowException;
import cloudflow.model.Execution;
import cloudflow.model.Experiment;
import cloudflow.model.User;

public interface ExecutionService {

   Execution executeFlow (Execution execution, User user) throws CloudFlowException;


   // Initially defined here because executions and experiments are related but can be extracted
   // into a separate service.
   Experiment createExperiment(Experiment experiment, User user) throws CloudFlowException;
}
