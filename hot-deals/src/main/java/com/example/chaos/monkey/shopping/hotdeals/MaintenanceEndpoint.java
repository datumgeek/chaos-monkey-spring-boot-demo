package com.example.chaos.monkey.shopping.hotdeals;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;

@Endpoint(id = "maintenance")
public class MaintenanceEndpoint implements HealthIndicator {
  private Status status = Status.UP;

  @ReadOperation
  public Status getStatus() {
    return status;
  }

  @WriteOperation
  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public Health health() {
    return Health.status(this.status).build();
  }
}
