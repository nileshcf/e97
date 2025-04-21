package com.cloudframe.app.iovb32k.dto;

/**
*  The class InRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class InRecData extends InRecDataSerialized { 
   
      private List<char[]> inRecByte; 

	
	/**
	* Constructor for InRecData
	**/
    public InRecData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of inRecByte
	 *  Corresponding COBOL Variable is WS-IN-REC-BYTE
	 *	@return inRecByte
	 */
	public List<char[]> getInRecByte() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IN_REC_BYTE_SIZE;index++) {
        	list.add( getInRecByte( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return inRecByte
	 */
	public char[] getInRecByte(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getInRecByte(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IN_REC_BYTE_SIZE) {
             	index = IN_REC_BYTE_SIZE -1; // can't exceed max array size
             	logger.trace("inRecByte - Array index exceeded max Size {}, resetting it to max allowed",IN_REC_BYTE_SIZE); 
	    }
   	      return getCharArray( (beginInRecByte + index*IN_REC_BYTE_LEN) , IN_REC_BYTE_LEN );
    }
    
    
   public int  inRecByteFieldLength() {
   	return IN_REC_BYTE_LEN;
   }
   
	

  
  	/**
	 *	Update InRecByte with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-IN-REC-BYTE
	 *  @param index
	 *	@param value
	 */
  public void setInRecByte(int index,char[] value) {
   	setInRecByte(index,value,true);
   }
   
   
   /**
	 *	Update InRecByte with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setInRecByte(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setInRecByte(int,String,boolean), reset it to 0",index);
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
		serializeInRecByte(index,value);		
       }
   }
   

	
	
	

		public static int getInRecDataFieldLength() {
			return IN_REC_DATA_LENGTH;
		}

}
  
