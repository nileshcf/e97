package com.cloudframe.app.bm8090m.dto;

/**
*  The class WTobPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class WTobPe8090m extends WTobPe8090mSerialized { 
   
			private List<WEloPe8090m> wEloPe8090m = new ArrayList<>();
    	
	
	/**
	* Constructor for WTobPe8090m
	**/
    public WTobPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WTobPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WTobPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of wEloPe8090m
	 *  Corresponding COBOL Variable is W-ELO-PE8090M
	 *	@return wEloPe8090m
	 */
   public List<WEloPe8090m> getWEloPe8090m() {
       return wEloPe8090m;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wEloPe8090m
	 */
	public WEloPe8090m getWEloPe8090m(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWEloPe8090m(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= W_ELO_PE_8090M_SIZE) {
             	index = W_ELO_PE_8090M_SIZE -1; // can't exceed max array size
             	logger.trace("wEloPe8090m - Array index exceeded max Size {}, resetting it to max allowed",W_ELO_PE_8090M_SIZE); 
	    }
		if (index >= wEloPe8090m.size()) {
       		for (int fillIndex =  wEloPe8090m.size() -1; fillIndex < index;fillIndex++) {
		       wEloPe8090m.add(null);
		    }
			wEloPe8090m.set(index,
			   	   	new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength()) 
				                        ); 	
		} 
   	   WEloPe8090m value = wEloPe8090m.get(index);
   	   if (value == null) {
   	      wEloPe8090m.set(index,
			   	   	new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength()) 
				                        ); 
		  value = wEloPe8090m.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WEloPe8090m at index with the passed value
	 *  Corresponding COBOL Variable is W-ELO-PE8090M
	 *  @param index
	 *	@param value
	 */
  public void setWEloPe8090m(int index,char[] value) {
   	getWEloPe8090m(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes WTobPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (wEloPe8090m.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  W_ELO_PE_8090M_SIZE;index++) {
              WEloPe8090m  newElement = new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength());
              newElement.initialize();
               wEloPe8090m.add(newElement);
          }
     } else {
        if (wEloPe8090m.size() < W_ELO_PE_8090M_SIZE) {
          // prefill it first
          for (int index = wEloPe8090m.size();index <  W_ELO_PE_8090M_SIZE;index++) {
              WEloPe8090m  newElement = new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength());
               wEloPe8090m.add(newElement);
          }
        }
        
     	for (int index = 0;index <  W_ELO_PE_8090M_SIZE;index++) {
     		WEloPe8090m wEloPe8090mVar = wEloPe8090m.get(index);
 			if (wEloPe8090mVar == null) {
                wEloPe8090mVar = new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength());
                  wEloPe8090m.set(index, wEloPe8090mVar);
			} 
			wEloPe8090mVar.initialize();
		}
     }
   }

		public static int getWTobPe8090mFieldLength() {
			return W_TOB_PE_8090M_LENGTH;
		}

}
  
