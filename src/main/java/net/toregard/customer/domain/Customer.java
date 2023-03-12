package net.toregard.customer.domain;

import io.grpc.stub.ServerCalls;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.UUID;

@Aggregate
public class Customer {
    UUID uuid;
    String name;



}
