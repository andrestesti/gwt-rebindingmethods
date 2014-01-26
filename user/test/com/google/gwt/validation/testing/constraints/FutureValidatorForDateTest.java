/*
 * Copyright 2010 Google Inc.
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
package com.google.gwt.validation.testing.constraints;

import com.google.gwt.validation.client.constraints.FutureValidatorForDate;

import java.util.Date;

import javax.validation.constraints.Future;

/**
 * Tests for {@link FutureValidatorForDate}.
 */
public class FutureValidatorForDateTest extends
    ConstraintValidatorTestCase<Future, Date> {

  @SuppressWarnings("unused")
  @Future
  private Date defaultField;

  @Override
  protected FutureValidatorForDate createValidator() {
    return new FutureValidatorForDate();
  }

  public void testAssertIsValid_nowMinus1000() {
    assertConstraintValidator(new Date(new Date().getTime() - 1000), false);
  }

  public void testAssertIsValid_nowPlus1000() {
    assertConstraintValidator(new Date(new Date().getTime() + 1000), true);
  }

  @Override
  protected Class<Future> getAnnotationClass() {
    return Future.class;
  }
}
