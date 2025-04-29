package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtShsArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class ExtShsArea extends ExtShsAreaSerialized { 
   
			private List<ExtSpoTbl> extSpoTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for ExtShsArea
	**/
    public ExtShsArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtShsArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtShsArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of extSpoTbl
	 *  Corresponding COBOL Variable is WS-EXT-SPO-TBL
	 *	@return extSpoTbl
	 */
   public List<ExtSpoTbl> getExtSpoTbl() {
       return extSpoTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return extSpoTbl
	 */
	public ExtSpoTbl getExtSpoTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getExtSpoTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= EXT_SPO_TBL_SIZE) {
             	index = EXT_SPO_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("extSpoTbl - Array index exceeded max Size {}, resetting it to max allowed",EXT_SPO_TBL_SIZE); 
	    }
		if (index >= extSpoTbl.size()) {
       		for (int fillIndex =  extSpoTbl.size() -1; fillIndex < index;fillIndex++) {
		       extSpoTbl.add(null);
		    }
			extSpoTbl.set(index,
			   	   	new ExtSpoTbl(this,beginExtSpoTbl + index * ExtSpoTbl.getExtSpoTblFieldLength()) 
				                        ); 	
		} 
   	   ExtSpoTbl value = extSpoTbl.get(index);
   	   if (value == null) {
   	      extSpoTbl.set(index,
			   	   	new ExtSpoTbl(this,beginExtSpoTbl + index * ExtSpoTbl.getExtSpoTblFieldLength()) 
				                        ); 
		  value = extSpoTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ExtSpoTbl at index with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-SPO-TBL
	 *  @param index
	 *	@param value
	 */
  public void setExtSpoTbl(int index,char[] value) {
   	getExtSpoTbl(index).setString(value);
   }
   
	

	
	
	

		public static int getExtShsAreaFieldLength() {
			return EXT_SHS_AREA_LENGTH;
		}

}
  
