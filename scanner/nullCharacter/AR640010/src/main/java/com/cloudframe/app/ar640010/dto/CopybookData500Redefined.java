package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookData500Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class CopybookData500Redefined extends CopybookData500RedefinedSerialized { 
   
			private List<CopybookEntry500> copybookEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for CopybookData500Redefined
	**/
    public CopybookData500Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CopybookData500Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookData500Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of copybookEntry500
	 *  Corresponding COBOL Variable is 500-COPYBOOK-ENTRY
	 *	@return copybookEntry500
	 */
   public List<CopybookEntry500> getCopybookEntry500() {
       return copybookEntry500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return copybookEntry500
	 */
	public CopybookEntry500 getCopybookEntry500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getCopybookEntry500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= COPYBOOK_ENTRY_500_SIZE) {
             	index = COPYBOOK_ENTRY_500_SIZE -1; // can't exceed max array size
             	logger.trace("copybookEntry500 - Array index exceeded max Size {}, resetting it to max allowed",COPYBOOK_ENTRY_500_SIZE); 
	    }
		if (index >= copybookEntry500.size()) {
       		for (int fillIndex =  copybookEntry500.size() -1; fillIndex < index;fillIndex++) {
		       copybookEntry500.add(null);
		    }
			copybookEntry500.set(index,
			   	   	new CopybookEntry500(this,beginCopybookEntry500 + index * CopybookEntry500.getCopybookEntry500FieldLength()) 
				                        ); 	
		} 
   	   CopybookEntry500 value = copybookEntry500.get(index);
   	   if (value == null) {
   	      copybookEntry500.set(index,
			   	   	new CopybookEntry500(this,beginCopybookEntry500 + index * CopybookEntry500.getCopybookEntry500FieldLength()) 
				                        ); 
		  value = copybookEntry500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update CopybookEntry500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-COPYBOOK-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setCopybookEntry500(int index,char[] value) {
   	getCopybookEntry500(index).setString(value);
   }
   
	

	
	
	

		public static int getCopybookData500RedefinedFieldLength() {
			return COPYBOOK_DATA_500_REDEFINED_LENGTH;
		}

}
  
