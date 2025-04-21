package com.cloudframe.app.db2func.dto;

/**
*  The class Parmbuf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class Parmbuf extends ParmbufSerialized { 
   
      private List<char[]> parmarry; 

	
	/**
	* Constructor for Parmbuf
	**/
    public Parmbuf() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parmbuf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parmbuf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of parmarry
	 *  Corresponding COBOL Variable is PARMARRY
	 *	@return parmarry
	 */
	public List<char[]> getParmarry() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < PARMARRY_SIZE;index++) {
        	list.add( getParmarry( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return parmarry
	 */
	public char[] getParmarry(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getParmarry(), resetting it to 0",index);
		    index = 0;
        } else if (index >= PARMARRY_SIZE) {
             	index = PARMARRY_SIZE -1; // can't exceed max array size
             	logger.trace("parmarry - Array index exceeded max Size {}, resetting it to max allowed",PARMARRY_SIZE); 
	    }
   	      return getCharArray( (beginParmarry + index*PARMARRY_LEN) , PARMARRY_LEN );
    }
    
    
   public int  parmarryFieldLength() {
   	return PARMARRY_LEN;
   }
   
	

  
  	/**
	 *	Update Parmarry with the passed value at a given index
	 *  Corresponding COBOL Variable is PARMARRY
	 *  @param index
	 *	@param value
	 */
  public void setParmarry(int index,char[] value) {
   	setParmarry(index,value,true);
   }
   
   
   /**
	 *	Update Parmarry with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setParmarry(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setParmarry(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 127)  {     
		       value = substring(value,0,127);
           }  else if (value.length < 127) {
		       value = pad(127, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(127).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeParmarry(index,value);		
       }
   }
   

	
	
	

		public static int getParmbufFieldLength() {
			return PARMBUF_LENGTH;
		}

}
  
