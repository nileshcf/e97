package com.cloudframe.app.init1.dto;

/**
*  The class CmnErrMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class CmnErrMsgArea extends CmnErrMsgAreaSerialized { 
   
      private List<char[]> cmnErrText; 

	
	/**
	* Constructor for CmnErrMsgArea
	**/
    public CmnErrMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnErrMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of cmnErrText
	 *  Corresponding COBOL Variable is CMN-ERR-TEXT
	 *	@return cmnErrText
	 */
	public List<char[]> getCmnErrText() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < CMN_ERR_TEXT_SIZE;index++) {
        	list.add( getCmnErrText( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return cmnErrText
	 */
	public char[] getCmnErrText(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getCmnErrText(), resetting it to 0",index);
		    index = 0;
        } else if (index >= CMN_ERR_TEXT_SIZE) {
             	index = CMN_ERR_TEXT_SIZE -1; // can't exceed max array size
             	logger.trace("cmnErrText - Array index exceeded max Size {}, resetting it to max allowed",CMN_ERR_TEXT_SIZE); 
	    }
   	      return getCharArray( (beginCmnErrText + index*CMN_ERR_TEXT_LEN) , CMN_ERR_TEXT_LEN );
    }
    
    
   public int  cmnErrTextFieldLength() {
   	return CMN_ERR_TEXT_LEN;
   }
   
	

  
  	/**
	 *	Update CmnErrText with the passed value at a given index
	 *  Corresponding COBOL Variable is CMN-ERR-TEXT
	 *  @param index
	 *	@param value
	 */
  public void setCmnErrText(int index,char[] value) {
   	setCmnErrText(index,value,true);
   }
   
   
   /**
	 *	Update CmnErrText with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setCmnErrText(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setCmnErrText(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 64)  {     
		       value = substring(value,0,64);
           }  else if (value.length < 64) {
		       value = pad(64, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(64).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeCmnErrText(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes CmnErrMsgArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < CMN_ERR_TEXT_SIZE;index++) {
             setCmnErrText(index, CONSTANTS.SPACE_64);
         }
   }

		public static int getCmnErrMsgAreaFieldLength() {
			return CMN_ERR_MSG_AREA_LENGTH;
		}

}
  
