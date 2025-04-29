package com.cloudframe.app.init1.dto;

/**
*  The class CmnErrMsgBytes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class CmnErrMsgBytes extends CmnErrMsgBytesSerialized { 
   
      private List<char[]> cmnErrByte; 

	
	/**
	* Constructor for CmnErrMsgBytes
	**/
    public CmnErrMsgBytes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnErrMsgBytes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsgBytes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of cmnErrByte
	 *  Corresponding COBOL Variable is CMN-ERR-BYTE
	 *	@return cmnErrByte
	 */
	public List<char[]> getCmnErrByte() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < CMN_ERR_BYTE_SIZE;index++) {
        	list.add( getCmnErrByte( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return cmnErrByte
	 */
	public char[] getCmnErrByte(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getCmnErrByte(), resetting it to 0",index);
		    index = 0;
        } else if (index >= CMN_ERR_BYTE_SIZE) {
             	index = CMN_ERR_BYTE_SIZE -1; // can't exceed max array size
             	logger.trace("cmnErrByte - Array index exceeded max Size {}, resetting it to max allowed",CMN_ERR_BYTE_SIZE); 
	    }
   	      return getCharArray( (beginCmnErrByte + index*CMN_ERR_BYTE_LEN) , CMN_ERR_BYTE_LEN );
    }
    
    
   public int  cmnErrByteFieldLength() {
   	return CMN_ERR_BYTE_LEN;
   }
   
	

  
  	/**
	 *	Update CmnErrByte with the passed value at a given index
	 *  Corresponding COBOL Variable is CMN-ERR-BYTE
	 *  @param index
	 *	@param value
	 */
  public void setCmnErrByte(int index,char[] value) {
   	setCmnErrByte(index,value,true);
   }
   
   
   /**
	 *	Update CmnErrByte with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setCmnErrByte(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setCmnErrByte(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeCmnErrByte(index,value);		
       }
   }
   

	
	
	

		public static int getCmnErrMsgBytesFieldLength() {
			return CMN_ERR_MSG_BYTES_LENGTH;
		}

}
  
