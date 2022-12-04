/*
 * Copyright (C) 2022 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.escapevelocity;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for class {@link DirectiveNode}.
 *
 * @see DirectiveNode
 *
 */
public class DirectiveNodeTest{

  @Test
  public void testRender() {
      ConstantExpressionNode constantExpressionNode = new ConstantExpressionNode("", 2695, new Integer(2853));
      try { 
        new DirectiveNode.ForEachNode("", 2695, "", constantExpressionNode, new DirectiveNode.IfNode("", 0, constantExpressionNode, constantExpressionNode, constantExpressionNode)).render(null, new StringBuilder((CharSequence) ""));
        fail("Expecting exception: EvaluationException");
      } catch(EvaluationException e) {
         assertEquals(Node.class.getName(), e.getStackTrace()[0].getClassName());
      }
  }

}