package com.mycompany.oop.facade;

public class Generator {

  public static int generate(Node expression) throws Exception {
    if (expression instanceof ExpressionNode) {
      ExpressionNode expressionNode = (ExpressionNode) expression;

      OperandNode rightOperandNode = (OperandNode) expressionNode.getRight();
      OperandNode leftOperandNode = (OperandNode) expressionNode.getLeft();

      int result = rightOperandNode.getValue() + leftOperandNode.getValue();

      return result;

    } else {
      throw new Exception("Error in generator");
    }
  }
    
}
