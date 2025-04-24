package com.cloudframe.app.bm8090m.dto;

/**
*  The class WTpePe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class WTpePe8090m extends WTpePe8090mSerialized { 
   
			private List<WElpPe8090m> wElpPe8090m = new ArrayList<>();
    	
	
	/**
	* Constructor for WTpePe8090m
	**/
    public WTpePe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WTpePe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WTpePe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of wElpPe8090m
	 *  Corresponding COBOL Variable is W-ELP-PE8090M
	 *	@return wElpPe8090m
	 */
   public List<WElpPe8090m> getWElpPe8090m() {
       return wElpPe8090m;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wElpPe8090m
	 */
	public WElpPe8090m getWElpPe8090m(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWElpPe8090m(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= W_ELP_PE_8090M_SIZE) {
             	index = W_ELP_PE_8090M_SIZE -1; // can't exceed max array size
             	logger.trace("wElpPe8090m - Array index exceeded max Size {}, resetting it to max allowed",W_ELP_PE_8090M_SIZE); 
	    }
		if (index >= wElpPe8090m.size()) {
       		for (int fillIndex =  wElpPe8090m.size() -1; fillIndex < index;fillIndex++) {
		       wElpPe8090m.add(null);
		    }
			wElpPe8090m.set(index,
			   	   	new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength()) 
				                        ); 	
		} 
   	   WElpPe8090m value = wElpPe8090m.get(index);
   	   if (value == null) {
   	      wElpPe8090m.set(index,
			   	   	new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength()) 
				                        ); 
		  value = wElpPe8090m.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WElpPe8090m at index with the passed value
	 *  Corresponding COBOL Variable is W-ELP-PE8090M
	 *  @param index
	 *	@param value
	 */
  public void setWElpPe8090m(int index,char[] value) {
   	getWElpPe8090m(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes WTpePe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (wElpPe8090m.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  W_ELP_PE_8090M_SIZE;index++) {
              WElpPe8090m  newElement = new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength());
              newElement.initialize();
               wElpPe8090m.add(newElement);
          }
     } else {
        if (wElpPe8090m.size() < W_ELP_PE_8090M_SIZE) {
          // prefill it first
          for (int index = wElpPe8090m.size();index <  W_ELP_PE_8090M_SIZE;index++) {
              WElpPe8090m  newElement = new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength());
               wElpPe8090m.add(newElement);
          }
        }
        
     	for (int index = 0;index <  W_ELP_PE_8090M_SIZE;index++) {
     		WElpPe8090m wElpPe8090mVar = wElpPe8090m.get(index);
 			if (wElpPe8090mVar == null) {
                wElpPe8090mVar = new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength());
                  wElpPe8090m.set(index, wElpPe8090mVar);
			} 
			wElpPe8090mVar.initialize();
		}
     }
   }

		public static int getWTpePe8090mFieldLength() {
			return W_TPE_PE_8090M_LENGTH;
		}

}
  
