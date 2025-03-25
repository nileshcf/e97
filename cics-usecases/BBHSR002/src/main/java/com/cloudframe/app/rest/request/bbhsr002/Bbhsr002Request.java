package com.cloudframe.app.rest.request.bbhsr002;

import com.cloudframe.app.rest.Metadata;
import io.swagger.v3.oas.annotations.media.Schema;

public class Bbhsr002Request {

  private Metadata metadata;

  private F5957reqInput f5957reqInput = new F5957reqInput();

  @Schema(description = "Default value is empty", defaultValue = " ")
  private String f5957reqInputAsBlob;

  private HsrRequestArea hsrRequestArea = new HsrRequestArea();

  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrRequestAreaAsBlob;

  private ReqHsrHipaaList reqHsrHipaaList = new ReqHsrHipaaList();

  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqHsrHipaaListAsBlob;

  /** @return the metadata */
  public Metadata getMetadata() {
    return metadata;
  }

  /** @param metadata the metadata to set */
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
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
  /** @return the hsrRequestArea */
  public HsrRequestArea getHsrRequestArea() {
    return hsrRequestArea;
  }

  /** @param hsrRequestArea the hsrRequestArea to set */
  public void setHsrRequestArea(HsrRequestArea hsrRequestArea) {
    this.hsrRequestArea = hsrRequestArea;
  }

  /** @return the hsrRequestAreaAsBlob */
  public String getHsrRequestAreaAsBlob() {
    return hsrRequestAreaAsBlob;
  }

  /** @param hsrRequestAreaAsBlob the hsrRequestAreaAsBlob to set */
  public void setHsrRequestAreaAsBlob(String hsrRequestAreaAsBlob) {
    this.hsrRequestAreaAsBlob = hsrRequestAreaAsBlob;
  }
  /** @return the reqHsrHipaaList */
  public ReqHsrHipaaList getReqHsrHipaaList() {
    return reqHsrHipaaList;
  }

  /** @param reqHsrHipaaList the reqHsrHipaaList to set */
  public void setReqHsrHipaaList(ReqHsrHipaaList reqHsrHipaaList) {
    this.reqHsrHipaaList = reqHsrHipaaList;
  }

  /** @return the reqHsrHipaaListAsBlob */
  public String getReqHsrHipaaListAsBlob() {
    return reqHsrHipaaListAsBlob;
  }

  /** @param reqHsrHipaaListAsBlob the reqHsrHipaaListAsBlob to set */
  public void setReqHsrHipaaListAsBlob(String reqHsrHipaaListAsBlob) {
    this.reqHsrHipaaListAsBlob = reqHsrHipaaListAsBlob;
  }
}
