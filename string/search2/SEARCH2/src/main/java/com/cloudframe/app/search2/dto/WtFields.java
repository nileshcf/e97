package com.cloudframe.app.search2.dto;

/**
*  The class WtFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class WtFields extends WtFieldsSerialized {
   
			private List<CodeCtrl> codeCtrl = new ArrayList<>();
    	
	
	/**
	* Constructor for WtFields
	**/
    public WtFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CODE_CTRL_SIZE;arrayIndex++) {
						codeCtrl.add(new CodeCtrl(this, beginCodeCtrl + 
						arrayIndex * CodeCtrl.getCodeCtrlFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of codeCtrl
	 *  Corresponding COBOL Variable is WS-CODE-CTRL
	 *	@return codeCtrl
	 */
   public List<CodeCtrl> getCodeCtrl() {
       return codeCtrl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return codeCtrl
	 */
	public CodeCtrl getCodeCtrl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getCodeCtrl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CODE_CTRL_SIZE) {
             	index = CODE_CTRL_SIZE -1; // can't exceed max array size
             	logger.trace("codeCtrl - Array index exceeded max Size {}, resetting it to max allowed",CODE_CTRL_SIZE); 
	    }
		if (index >= codeCtrl.size()) {
       		for (int fillIndex =  codeCtrl.size() -1; fillIndex < index;fillIndex++) {
		       codeCtrl.add(null);
		    }
			codeCtrl.set(index,
			   	   	new CodeCtrl(this,beginCodeCtrl + index * CodeCtrl.getCodeCtrlFieldLength()) 
				                        ); 	
		} 
   	   CodeCtrl value = codeCtrl.get(index);
   	   if (value == null) {
   	      codeCtrl.set(index,
			   	   	new CodeCtrl(this,beginCodeCtrl + index * CodeCtrl.getCodeCtrlFieldLength()) 
				                        ); 
		  value = codeCtrl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update CodeCtrl at index with the passed value
	 *  Corresponding COBOL Variable is WS-CODE-CTRL
	 *  @param index
	 *	@param value
	 */
  public void setCodeCtrl(int index,char[] value) {
   	getCodeCtrl(index).setString(value);
   }
   
	

	
	
	

		public static int getWtFieldsFieldLength() {
			return WT_FIELDS_LENGTH;
		}

}
  
