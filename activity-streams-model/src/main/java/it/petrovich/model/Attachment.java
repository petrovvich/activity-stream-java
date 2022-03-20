package it.petrovich.model;

import it.petrovich.model.interfaces.Typed;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#attachment	">attachment definition</a>.
 * <br>
 * Identifies a resource attached or related to an object that potentially requires special
 * handling. The intent is to provide a model that is at least semantically similar to attachments
 * in email.
 */
public class Attachment implements Typed {

  protected String _type;
  protected String _content;
  protected String _url;

  @Override
  public String getType() {
    return _type;
  }

  public void setType(String type) {
    _type = type;
  }

  public String getContent() {
    return _content;
  }

  public void setContent(String content) {
    _content = content;
  }

  public String getUrl() {
    return _url;
  }

  public void setUrl(String url) {
    _url = url;
  }
}
