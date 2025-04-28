package com.cloudframe.app.o529351u.rest;

/**
*  The class PpaPpoaltRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

public class PpaPpoaltRecord { 	
   protected Logger logger = LoggerFactory.getLogger(PpaPpoaltRecord.class);

   /*  Child Field declaration */
            @JsonProperty("ppaFixedPortion")
    		private PpaFixedPortion ppaFixedPortion = new PpaFixedPortion();
    	private List<PpaPpoId> ppaPpoId = new ArrayList<>();
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of ppaFixedPortion
	 *	@return ppaFixedPortion
	 */   
	 public PpaFixedPortion getPpaFixedPortion() {
   	      return ppaFixedPortion;
     }
   //*** setGroup.txt starts
   /**
	* 	Update PpaFixedPortion with the passed value
	*	@param value
	*/
   @JsonIgnore	
   public void setPpaFixedPortion(com.cloudframe.app.o529351u.dto.PpaFixedPortion value) throws CFException{
		ppaFixedPortion.populateFrom(value);
   }   

      /**
	* 	Update PpaFixedPortion with the passed value
	*	@param value
	*/
   public void setPpaFixedPortion(PpaFixedPortion value) {
      ppaFixedPortion = value; 
   }  
   //*** setGroup.txt ends
	/**
	 *	Returns the  value of ppaPpoId
	 *	@return ppaPpoId
	 */
   public List<PpaPpoId> getPpaPpoId() {
       return ppaPpoId;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ppaPpoId
	 */
	public PpaPpoId getPpaPpoId(int index) {
   	   return ppaPpoId.get(index);

   }
//*** setArrayGroup.txt starts
  	/**
	 *	Update PpaPpoId at index with the passed value
	 *  @param index
	 *	@param value
	 */
   @JsonIgnore
  public void setPpaPpoId(int index,com.cloudframe.app.o529351u.dto.PpaPpoId value) throws CFException{
         //*** setArrayChild.txt starts
       // Array Group not yet handled		
         //*** setArrayChild.txt ends
   }
      
   public void setPpaPpoId(int index,PpaPpoId value) {
   	   ppaPpoId.set(index,value);
   }
   //*** setArrayGroup.txt ends
	
 @JsonIgnore
 public void setPpaPpoaltRecord(com.cloudframe.app.o529351u.dto.PpaPpoaltRecord ppaPpoaltRecord)  throws CFException{
            ppaFixedPortion.setPpaFixedPortion(ppaPpoaltRecord.getPpaFixedPortion());
            for(int index = 0 ; index < ppaPpoId.size() ; index++){
                ppaPpoId.get(index).setPpaPpoId(ppaPpoaltRecord.getPpaPpoId(index));
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.PpaPpoaltRecord ppaPpoaltRecord)  throws CFException {
		         ppaFixedPortion.populateFrom(ppaPpoaltRecord.getPpaFixedPortion());
                 ppaPpoId.clear();
                 ppaPpoaltRecord.getPpaPpoId().forEach( item -> {
                 if(!CFUtil.trim(item.toCharArray()).isEmpty()) {
                     PpaPpoId ppaPpoIdItem = new PpaPpoId();
                     try {
                        ppaPpoIdItem.populateFrom(item);
                        ppaPpoId.add(ppaPpoIdItem);
                     } catch (CFException e) {
                        throw new RuntimeException(e);
                    }
				}
		     });
  }

}
  
