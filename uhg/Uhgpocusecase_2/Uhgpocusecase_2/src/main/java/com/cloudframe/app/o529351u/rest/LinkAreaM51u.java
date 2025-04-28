package com.cloudframe.app.o529351u.rest;

/**
*  The class LinkAreaM51u is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LinkAreaM51u { 	
   protected Logger logger = LoggerFactory.getLogger(LinkAreaM51u.class);

   /*  Child Field declaration */
            @JsonProperty("m51uFlags")
    		private M51uFlags m51uFlags = new M51uFlags();
            @JsonProperty("m51uLinkage")
    		private M51uLinkage m51uLinkage = new M51uLinkage();
            @JsonProperty("uGenericTranslation51")
    		private UGenericTranslation51 uGenericTranslation51 = new UGenericTranslation51();
                  private String uCcmNOSvcInd51 = "";
                  private String uSpiTblId51 = "";
                  private String uHcrProcessSw51 = "";
                  private String uHcrSpiSw51 = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of m51uFlags
	 *	@return m51uFlags
	 */   
	 public M51uFlags getM51uFlags() {
   	      return m51uFlags;
     }
   //*** setGroup.txt starts
   /**
	* 	Update M51uFlags with the passed value
	*	@param value
	*/
   @JsonIgnore	
   public void setM51uFlags(com.cloudframe.app.o529351u.dto.M51uFlags value) throws CFException{
		m51uFlags.populateFrom(value);
   }   

      /**
	* 	Update M51uFlags with the passed value
	*	@param value
	*/
   public void setM51uFlags(M51uFlags value) {
      m51uFlags = value; 
   }  
   //*** setGroup.txt ends
	/**
	 *	Returns the value of m51uLinkage
	 *	@return m51uLinkage
	 */   
	 public M51uLinkage getM51uLinkage() {
   	      return m51uLinkage;
     }
   //*** setGroup.txt starts
   /**
	* 	Update M51uLinkage with the passed value
	*	@param value
	*/
   @JsonIgnore	
   public void setM51uLinkage(com.cloudframe.app.o529351u.dto.M51uLinkage value) throws CFException{
		m51uLinkage.populateFrom(value);
   }   

      /**
	* 	Update M51uLinkage with the passed value
	*	@param value
	*/
   public void setM51uLinkage(M51uLinkage value) {
      m51uLinkage = value; 
   }  
   //*** setGroup.txt ends
	/**
	 *	Returns the value of uGenericTranslation51
	 *	@return uGenericTranslation51
	 */   
	 public UGenericTranslation51 getUGenericTranslation51() {
   	      return uGenericTranslation51;
     }
   //*** setGroup.txt starts
   /**
	* 	Update UGenericTranslation51 with the passed value
	*	@param value
	*/
   @JsonIgnore	
   public void setUGenericTranslation51(com.cloudframe.app.o529351u.dto.UGenericTranslation51 value) throws CFException{
		uGenericTranslation51.populateFrom(value);
   }   

      /**
	* 	Update UGenericTranslation51 with the passed value
	*	@param value
	*/
   public void setUGenericTranslation51(UGenericTranslation51 value) {
      uGenericTranslation51 = value; 
   }  
   //*** setGroup.txt ends
	/**
	 *	Returns the value of uCcmNOSvcInd51
	 *	@return uCcmNOSvcInd51
	 */
   public String getUCcmNOSvcInd51() {           
   		return uCcmNOSvcInd51;
   }

  
	/**
	*  set variable uCcmNOSvcInd51
	*  @param value
	**/
   public void setUCcmNOSvcInd51(String value) {
	uCcmNOSvcInd51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uSpiTblId51
	 *	@return uSpiTblId51
	 */
   public String getUSpiTblId51() {           
   		return uSpiTblId51;
   }

  
	/**
	*  set variable uSpiTblId51
	*  @param value
	**/
   public void setUSpiTblId51(String value) {
	uSpiTblId51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uHcrProcessSw51
	 *	@return uHcrProcessSw51
	 */
   public String getUHcrProcessSw51() {           
   		return uHcrProcessSw51;
   }

  
	/**
	*  set variable uHcrProcessSw51
	*  @param value
	**/
   public void setUHcrProcessSw51(String value) {
	uHcrProcessSw51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uHcrSpiSw51
	 *	@return uHcrSpiSw51
	 */
   public String getUHcrSpiSw51() {           
   		return uHcrSpiSw51;
   }

  
	/**
	*  set variable uHcrSpiSw51
	*  @param value
	**/
   public void setUHcrSpiSw51(String value) {
	uHcrSpiSw51 = value.trim(); 
   }   
 @JsonIgnore
 public void setLinkAreaM51u(com.cloudframe.app.o529351u.dto.LinkAreaM51u linkAreaM51u)  throws CFException{
            m51uFlags.setM51uFlags(linkAreaM51u.getM51uFlags());
            m51uLinkage.setM51uLinkage(linkAreaM51u.getM51uLinkage());
            uGenericTranslation51.setUGenericTranslation51(linkAreaM51u.getUGenericTranslation51());
            if (uCcmNOSvcInd51 != null && !uCcmNOSvcInd51.isEmpty()) {
                linkAreaM51u.setUCcmNOSvcInd51(uCcmNOSvcInd51.toCharArray());
            }
            if (uSpiTblId51 != null && !uSpiTblId51.isEmpty()) {
                linkAreaM51u.setUSpiTblId51(uSpiTblId51.toCharArray());
            }
            if (uHcrProcessSw51 != null && !uHcrProcessSw51.isEmpty()) {
                linkAreaM51u.setUHcrProcessSw51(uHcrProcessSw51.toCharArray());
            }
            if (uHcrSpiSw51 != null && !uHcrSpiSw51.isEmpty()) {
                linkAreaM51u.setUHcrSpiSw51(uHcrSpiSw51.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.LinkAreaM51u linkAreaM51u)  throws CFException {
		         m51uFlags.populateFrom(linkAreaM51u.getM51uFlags());
		         m51uLinkage.populateFrom(linkAreaM51u.getM51uLinkage());
		         uGenericTranslation51.populateFrom(linkAreaM51u.getUGenericTranslation51());
            setUCcmNOSvcInd51(String.valueOf(linkAreaM51u.getUCcmNOSvcInd51()));
            setUSpiTblId51(String.valueOf(linkAreaM51u.getUSpiTblId51()));
            setUHcrProcessSw51(String.valueOf(linkAreaM51u.getUHcrProcessSw51()));
            setUHcrSpiSw51(String.valueOf(linkAreaM51u.getUHcrSpiSw51()));
  }

}
  
