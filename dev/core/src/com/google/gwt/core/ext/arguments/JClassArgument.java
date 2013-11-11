/*
 * Copyright 2013 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.core.ext.arguments;

/**
 * Compile time class argument.
 */
public class JClassArgument extends JConstantArgument {
  
  public static JClassArgument valueOf(String className) {
    return new JClassArgument(className);
  }
  
  private final String className;
  
  private JClassArgument(String className) {
    this.className = className;
  }
    
  public String getClassName() {
    return className;
  }
}