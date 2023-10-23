package com.gedsys.workflow.execution;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.ArrayList;
import java.util.List;

public class AproversCompletion implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        List<String> aprobadores = (ArrayList<String>) delegateExecution.getVariable("aprobadores");
        delegateExecution.setVariable("aprobado", true);
    }
}
