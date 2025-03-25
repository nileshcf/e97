package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.rest.Metadata;

public class Bbhsr002Response {

  private Metadata metadata;

  private HsrReturnArea hsrReturnArea;
  private String hsrReturnAreaAsBlob;
  private FoundnMsgCallerArea foundnMsgCallerArea;
  private String foundnMsgCallerAreaAsBlob;
  private F5957reqInput f5957reqInput;
  private String f5957reqInputAsBlob;

  /** @return the metadata */
  public Metadata getMetadata() {
    return metadata;
  }

  /** @param metadata the metadata to set */
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  /** @return the hsrReturnArea */
  public HsrReturnArea getHsrReturnArea() {
    return hsrReturnArea;
  }

  /** @param hsrReturnArea the hsrReturnArea to set */
  public void setHsrReturnArea(HsrReturnArea hsrReturnArea) {
    this.hsrReturnArea = hsrReturnArea;
  }

  /** @return the hsrReturnAreaAsBlob */
  public String getHsrReturnAreaAsBlob() {
    return hsrReturnAreaAsBlob;
  }

  /** @param hsrReturnAreaAsBlob the hsrReturnAreaAsBlob to set */
  public void setHsrReturnAreaAsBlob(String hsrReturnAreaAsBlob) {
    this.hsrReturnAreaAsBlob = hsrReturnAreaAsBlob;
  }
  /** @return the foundnMsgCallerArea */
  public FoundnMsgCallerArea getFoundnMsgCallerArea() {
    return foundnMsgCallerArea;
  }

  /** @param foundnMsgCallerArea the foundnMsgCallerArea to set */
  public void setFoundnMsgCallerArea(FoundnMsgCallerArea foundnMsgCallerArea) {
    this.foundnMsgCallerArea = foundnMsgCallerArea;
  }

  /** @return the foundnMsgCallerAreaAsBlob */
  public String getFoundnMsgCallerAreaAsBlob() {
    return foundnMsgCallerAreaAsBlob;
  }

  /** @param foundnMsgCallerAreaAsBlob the foundnMsgCallerAreaAsBlob to set */
  public void setFoundnMsgCallerAreaAsBlob(String foundnMsgCallerAreaAsBlob) {
    this.foundnMsgCallerAreaAsBlob = foundnMsgCallerAreaAsBlob;
  }
  /** @return the f5957reqInput */
  public F5957reqInput getF5957reqInput() {
    return f5957reqInput;
  }

  /** @param f5957reqInput the f5957reqInput to set */
  public void setF5957reqInput(F5957reqInput f5957reqInput) {
    this.f5957reqInput = f5957reqInput;
  }

  /** @return the f5957reqInputAsBlob */
  public String getF5957reqInputAsBlob() {
    return f5957reqInputAsBlob;
  }

  /** @param f5957reqInputAsBlob the f5957reqInputAsBlob to set */
  public void setF5957reqInputAsBlob(String f5957reqInputAsBlob) {
    this.f5957reqInputAsBlob = f5957reqInputAsBlob;
  }
}
