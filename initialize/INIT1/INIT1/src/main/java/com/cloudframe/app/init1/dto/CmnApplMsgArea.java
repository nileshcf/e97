package com.cloudframe.app.init1.dto;

/**
*  The class CmnApplMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class CmnApplMsgArea extends CmnApplMsgAreaSerialized { 
   
      private List<char[]> cmnApplMsg; 


	
	/**
	* Constructor for CmnApplMsgArea
	**/
    public CmnApplMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnApplMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnApplMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of cmnApplMsg
	 *  Corresponding COBOL Variable is CMN-APPL-MSG
	 *	@return cmnApplMsg
	 */
	public List<char[]> getCmnApplMsg() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < CMN_APPL_MSG_SIZE;index++) {
        	list.add( getCmnApplMsg( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return cmnApplMsg
	 */
	public char[] getCmnApplMsg(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getCmnApplMsg(), resetting it to 0",index);
		    index = 0;
        } else if (index >= CMN_APPL_MSG_SIZE) {
             	index = CMN_APPL_MSG_SIZE -1; // can't exceed max array size
             	logger.trace("cmnApplMsg - Array index exceeded max Size {}, resetting it to max allowed",CMN_APPL_MSG_SIZE); 
	    }
   	      return getCharArray( (beginCmnApplMsg + index*CMN_APPL_MSG_LEN) , CMN_APPL_MSG_LEN );
    }
    
    
   public int  cmnApplMsgFieldLength() {
   	return CMN_APPL_MSG_LEN;
   }
   
	

  
  	/**
	 *	Update CmnApplMsg with the passed value at a given index
	 *  Corresponding COBOL Variable is CMN-APPL-MSG
	 *  @param index
	 *	@param value
	 */
  public void setCmnApplMsg(int index,char[] value) {
   	setCmnApplMsg(index,value,true);
   }
   
   
   /**
	 *	Update CmnApplMsg with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setCmnApplMsg(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setCmnApplMsg(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 40)  {     
		       value = substring(value,0,40);
           }  else if (value.length < 40) {
		       value = pad(40, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(40).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeCmnApplMsg(index,value);		
       }
   }
   

	
	
	

		public static int getCmnApplMsgAreaFieldLength() {
			return CMN_APPL_MSG_AREA_LENGTH;
		}

}
  
