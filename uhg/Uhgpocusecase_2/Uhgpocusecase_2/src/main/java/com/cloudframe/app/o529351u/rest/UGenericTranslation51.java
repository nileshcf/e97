package com.cloudframe.app.o529351u.rest;

/**
*  The class UGenericTranslation51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.util.*;

public class UGenericTranslation51 { 	
   protected Logger logger = LoggerFactory.getLogger(UGenericTranslation51.class);

   /*  Child Field declaration */
    	private List<UGenericTrnslGroup51> uGenericTrnslGroup51 = new ArrayList<>();
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the  value of uGenericTrnslGroup51
	 *	@return uGenericTrnslGroup51
	 */
   public List<UGenericTrnslGroup51> getUGenericTrnslGroup51() {
       return uGenericTrnslGroup51;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return uGenericTrnslGroup51
	 */
	public UGenericTrnslGroup51 getUGenericTrnslGroup51(int index) {
   	   return uGenericTrnslGroup51.get(index);

   }
//*** setArrayGroup.txt starts
  	/**
	 *	Update UGenericTrnslGroup51 at index with the passed value
	 *  @param index
	 *	@param value
	 */
   @JsonIgnore
  public void setUGenericTrnslGroup51(int index,com.cloudframe.app.o529351u.dto.UGenericTrnslGroup51 value) throws CFException{
         //*** setArrayChild.txt starts
      uGenericTrnslGroup51.get(index).setUGenericTrnsl51(String.valueOf(value.getUGenericTrnsl51()));
         //*** setArrayChild.txt ends
   }
      
   public void setUGenericTrnslGroup51(int index,UGenericTrnslGroup51 value) {
   	   uGenericTrnslGroup51.set(index,value);
   }
   //*** setArrayGroup.txt ends
	
 @JsonIgnore
 public void setUGenericTranslation51(com.cloudframe.app.o529351u.dto.UGenericTranslation51 uGenericTranslation51)  throws CFException{
            for(int index = 0 ; index < uGenericTrnslGroup51.size() ; index++){
                uGenericTrnslGroup51.get(index).setUGenericTrnslGroup51(uGenericTranslation51.getUGenericTrnslGroup51(index));
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.UGenericTranslation51 uGenericTranslation51)  throws CFException {
                 uGenericTrnslGroup51.clear();
                 uGenericTranslation51.getUGenericTrnslGroup51().forEach( item -> {
                 if(!CFUtil.trim(item.toCharArray()).isEmpty()) {
                     UGenericTrnslGroup51 uGenericTrnslGroup51Item = new UGenericTrnslGroup51();
                     try {
                        uGenericTrnslGroup51Item.populateFrom(item);
                        uGenericTrnslGroup51.add(uGenericTrnslGroup51Item);
                     } catch (CFException e) {
                        throw new RuntimeException(e);
                    }
				}
		     });
  }

}
  
