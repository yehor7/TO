
package com.mycompany.oop.facade;
import java.util.List;

public class Compiler {

  public static int compile(String input) throws Exception {

    Parser parser = new Parser();
    List<String> tokens = Tokenizer.tokenize(input);
    Node expression = parser.parse(tokens);
    int result = Generator.generate(expression);

    return result;
  }
    
}
