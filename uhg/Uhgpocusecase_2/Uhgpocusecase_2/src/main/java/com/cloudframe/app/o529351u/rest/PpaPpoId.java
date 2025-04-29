package com.cloudframe.app.o529351u.rest;

/**
*  The class PpaPpoId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PpaPpoId { 	
   protected Logger logger = LoggerFactory.getLogger(PpaPpoId.class);

   /*  Child Field declaration */
            @JsonProperty("ppaOccurrence")
    		private PpaOccurrence ppaOccurrence = new PpaOccurrence();
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of ppaOccurrence
	 *	@return ppaOccurrence
	 */   
	 public PpaOccurrence getPpaOccurrence() {
   	      return ppaOccurrence;
     }
   //*** setGroup.txt starts
   /**
	* 	Update PpaOccurrence with the passed value
	*	@param value
	*/
   @JsonIgnore	
   public void setPpaOccurrence(com.cloudframe.app.o529351u.dto.PpaOccurrence value) throws CFException{
		ppaOccurrence.populateFrom(value);
   }   

      /**
	* 	Update PpaOccurrence with the passed value
	*	@param value
	*/
   public void setPpaOccurrence(PpaOccurrence value) {
      ppaOccurrence = value; 
   }  
   //*** setGroup.txt ends
 @JsonIgnore
 public void setPpaPpoId(com.cloudframe.app.o529351u.dto.PpaPpoId ppaPpoId)  throws CFException{
            ppaOccurrence.setPpaOccurrence(ppaPpoId.getPpaOccurrence());
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.PpaPpoId ppaPpoId)  throws CFException {
		         ppaOccurrence.populateFrom(ppaPpoId.getPpaOccurrence());
  }

}
  
