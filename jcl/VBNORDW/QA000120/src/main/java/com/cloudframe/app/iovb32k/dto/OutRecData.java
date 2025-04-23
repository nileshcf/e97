package com.cloudframe.app.iovb32k.dto;

/**
*  The class OutRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class OutRecData extends OutRecDataSerialized { 
   
      private List<char[]> outRecByte; 

	
	/**
	* Constructor for OutRecData
	**/
    public OutRecData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OutRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OutRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of outRecByte
	 *  Corresponding COBOL Variable is WS-OUT-REC-BYTE
	 *	@return outRecByte
	 */
	public List<char[]> getOutRecByte() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < OUT_REC_BYTE_SIZE;index++) {
        	list.add( getOutRecByte( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return outRecByte
	 */
	public char[] getOutRecByte(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getOutRecByte(), resetting it to 0",index);
		    index = 0;
        } else if (index >= OUT_REC_BYTE_SIZE) {
             	index = OUT_REC_BYTE_SIZE -1; // can't exceed max array size
             	logger.trace("outRecByte - Array index exceeded max Size {}, resetting it to max allowed",OUT_REC_BYTE_SIZE); 
	    }
   	      return getCharArray( (beginOutRecByte + index*OUT_REC_BYTE_LEN) , OUT_REC_BYTE_LEN );
    }
    
    
   public int  outRecByteFieldLength() {
   	return OUT_REC_BYTE_LEN;
   }
   
	

  
  	/**
	 *	Update OutRecByte with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-OUT-REC-BYTE
	 *  @param index
	 *	@param value
	 */
  public void setOutRecByte(int index,char[] value) {
   	setOutRecByte(index,value,true);
   }
   
   
   /**
	 *	Update OutRecByte with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setOutRecByte(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setOutRecByte(int,String,boolean), reset it to 0",index);
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
		serializeOutRecByte(index,value);		
       }
   }
   

	
	
	

		public static int getOutRecDataFieldLength() {
			return OUT_REC_DATA_LENGTH;
		}

}
  
