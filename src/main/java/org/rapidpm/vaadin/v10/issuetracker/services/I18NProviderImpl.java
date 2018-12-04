package org.rapidpm.vaadin.v10.issuetracker.services;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.i18n.I18NProvider;

public class I18NProviderImpl implements I18NProvider, HasLogger {


  private static final Map<String, String> translations = new HashMap<>();

  static {
    translations.put("login.username.placeholder" , "username");
    translations.put("login.password.placeholder" , "password");
    translations.put("login.rememberme.label" , "remember Me");
    translations.put("login.button.ok.text" , "OK");
    translations.put("login.button.cancel.text" , "Cancel");
  }

  @Override
  public List<Locale> getProvidedLocales() {
    return List.of(Locale.ENGLISH);
  }

  @Override
  public String getTranslation(String s , Locale locale , Object... objects) {
    return translations.getOrDefault(s , s);
  }
}
