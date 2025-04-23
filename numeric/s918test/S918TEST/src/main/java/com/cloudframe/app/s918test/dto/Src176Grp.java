package com.cloudframe.app.s918test.dto;

/**
*  The class Src176Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src176Grp extends Src176GrpSerialized {
   
      private List<char[]> src176; 

	
	/**
	* Constructor for Src176Grp
	**/
    public Src176Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src176
	 *  Corresponding COBOL Variable is WS-SRC-176
	 *	@return src176
	 */
	public List<char[]> getSrc176() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SRC_176_SIZE;index++) {
        	list.add( getSrc176( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src176
	 */
	public char[] getSrc176(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc176(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_176_SIZE) {
             	index = SRC_176_SIZE -1; // can't exceed max array size
             	logger.trace("src176 - Array index exceeded max Size {}, resetting it to max allowed",SRC_176_SIZE); 
	    }
   	      return getCharArray( (beginSrc176 + index*SRC_176_LEN) , SRC_176_LEN );
    }
    
    
   public int  src176FieldLength() {
   	return SRC_176_LEN;
   }
   
	

  
  	/**
	 *	Update Src176 with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-SRC-176
	 *  @param index
	 *	@param value
	 */
  public void setSrc176(int index,char[] value) {
   	setSrc176(index,value,true);
   }
   
   
   /**
	 *	Update Src176 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSrc176(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc176(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeSrc176(index,value);		
       }
   }
   

	
	
	

		public static int getSrc176GrpFieldLength() {
			return SRC_176_GRP_LENGTH;
		}

}
  
