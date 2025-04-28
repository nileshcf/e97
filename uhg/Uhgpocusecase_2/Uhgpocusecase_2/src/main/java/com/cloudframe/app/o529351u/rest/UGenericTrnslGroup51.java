package com.cloudframe.app.o529351u.rest;

/**
*  The class UGenericTrnslGroup51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;

public class UGenericTrnslGroup51 { 	
   protected Logger logger = LoggerFactory.getLogger(UGenericTrnslGroup51.class);

   /*  Child Field declaration */
                  private String uGenericTrnsl51 = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of uGenericTrnsl51
	 *	@return uGenericTrnsl51
	 */
   public String getUGenericTrnsl51() {           
   		return uGenericTrnsl51;
   }

  
	/**
	*  set variable uGenericTrnsl51
	*  @param value
	**/
   public void setUGenericTrnsl51(String value) {
	uGenericTrnsl51 = value.trim(); 
   }   
 @JsonIgnore
 public void setUGenericTrnslGroup51(com.cloudframe.app.o529351u.dto.UGenericTrnslGroup51 uGenericTrnslGroup51)  throws CFException{
            if (uGenericTrnsl51 != null && !uGenericTrnsl51.isEmpty()) {
                uGenericTrnslGroup51.setUGenericTrnsl51(uGenericTrnsl51.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.UGenericTrnslGroup51 uGenericTrnslGroup51)  throws CFException {
            setUGenericTrnsl51(String.valueOf(uGenericTrnslGroup51.getUGenericTrnsl51()));
  }

}
  
