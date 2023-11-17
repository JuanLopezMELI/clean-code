package org.example.examples;

import org.example.utils.Cryptographer;
import org.example.utils.Session;
import org.example.utils.User;
import org.example.utils.UserRepository;

public class AvoidSideEffects {

  UserRepository userRepository = new UserRepository();
  Cryptographer cryptography = new Cryptographer();

  //Bad
  public boolean checkPassword(String username, String password) {
    User user = userRepository.findUser(username);
    if(user != null) {
      String codedPhrase = user.getPhraseEncodedByPassword();
      String phrase = cryptography.decrypt(codedPhrase, password);
      if("Valid Password".equals(phrase)) {
        Session.initialize(); //Problematic
        return true;
      }
    }
    return false;
  }

  //Good
  public boolean checkPassword2(String username, String password) {
    User user = userRepository.findUser(username);
    if(user != null) {
      String codedPhrase = user.getPhraseEncodedByPassword();
      String phrase = cryptography.decrypt(codedPhrase, password);
      return "Valid Password".equals(phrase);
    }
    return false;
  }
}
