package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys005Table502 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Sys005Table502 extends Sys005Table502Serialized {
   
      private List<char[]> sys005Data502; 

	
	/**
	* Constructor for Sys005Table502
	**/
    public Sys005Table502() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of sys005Data502
	 *  Corresponding COBOL Variable is 502-SYS005-DATA
	 *	@return sys005Data502
	 */
	public List<char[]> getSys005Data502() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SYS_005_DATA_502_SIZE;index++) {
        	list.add( getSys005Data502( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return sys005Data502
	 */
	public char[] getSys005Data502(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSys005Data502(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SYS_005_DATA_502_SIZE) {
             	index = SYS_005_DATA_502_SIZE -1; // can't exceed max array size
             	logger.trace("sys005Data502 - Array index exceeded max Size {}, resetting it to max allowed",SYS_005_DATA_502_SIZE); 
	    }
   	      return getCharArray( (beginSys005Data502 + index*SYS_005_DATA_502_LEN) , SYS_005_DATA_502_LEN );
    }
    
    
   public int  sys005Data502FieldLength() {
   	return SYS_005_DATA_502_LEN;
   }
   
	

  
  	/**
	 *	Update Sys005Data502 with the passed value at a given index
	 *  Corresponding COBOL Variable is 502-SYS005-DATA
	 *  @param index
	 *	@param value
	 */
  public void setSys005Data502(int index,char[] value) {
   	setSys005Data502(index,value,true);
   }
   
   
   /**
	 *	Update Sys005Data502 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSys005Data502(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSys005Data502(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 6)  {     
		       value = substring(value,0,6);
           }  else if (value.length < 6) {
		       value = pad(6, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(6).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeSys005Data502(index,value);		
       }
   }
   

	
	
	

		public static int getSys005Table502FieldLength() {
			return SYS_005_TABLE_502_LENGTH;
		}

}
  
