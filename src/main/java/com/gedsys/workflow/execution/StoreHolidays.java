package com.gedsys.workflow.execution;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoreHolidays implements ExecutionListener {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Override
    public void notify(DelegateExecution execution) throws Exception {
        Object startDate = execution.getVariable("startDate");
        Object endDate = execution.getVariable("endDate");
        Object user = execution.getVariable("initiator");

        LOGGER.warn("Realizamos el almacenamiento del rago de vacaciones");
        LOGGER.warn("la fecha de inicio es => {}", startDate);
        LOGGER.warn("la fecha de fin es => {}", startDate);
        LOGGER.warn("El usuario es => {}", startDate);
    }
}
