package com.csmastery.command.controller;

import com.csmastery.command.orders.ICommand;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JuniorWaiter implements IWaiter {

  private ICommand command;

  public void makeOrder() {
    command.execute();
  }
}