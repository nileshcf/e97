package com.cloudframe.app.bm8090m.dto;

/**
*  The class WtabPartx is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class WtabPartx extends WtabPartxSerialized { 
   
			private List<WeleTab> weleTab = new ArrayList<>();
    	
	
	/**
	* Constructor for WtabPartx
	**/
    public WtabPartx() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WtabPartx. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtabPartx(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of weleTab
	 *  Corresponding COBOL Variable is WELE-TAB
	 *	@return weleTab
	 */
   public List<WeleTab> getWeleTab() {
       return weleTab;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return weleTab
	 */
	public WeleTab getWeleTab(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWeleTab(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WELE_TAB_SIZE) {
             	index = WELE_TAB_SIZE -1; // can't exceed max array size
             	logger.trace("weleTab - Array index exceeded max Size {}, resetting it to max allowed",WELE_TAB_SIZE); 
	    }
		if (index >= weleTab.size()) {
       		for (int fillIndex =  weleTab.size() -1; fillIndex < index;fillIndex++) {
		       weleTab.add(null);
		    }
			weleTab.set(index,
			   	   	new WeleTab(this,beginWeleTab + index * WeleTab.getWeleTabFieldLength()) 
				                        ); 	
		} 
   	   WeleTab value = weleTab.get(index);
   	   if (value == null) {
   	      weleTab.set(index,
			   	   	new WeleTab(this,beginWeleTab + index * WeleTab.getWeleTabFieldLength()) 
				                        ); 
		  value = weleTab.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WeleTab at index with the passed value
	 *  Corresponding COBOL Variable is WELE-TAB
	 *  @param index
	 *	@param value
	 */
  public void setWeleTab(int index,char[] value) {
   	getWeleTab(index).setString(value);
   }
   
	

	
	
	

		public static int getWtabPartxFieldLength() {
			return WTAB_PARTX_LENGTH;
		}

}
  
