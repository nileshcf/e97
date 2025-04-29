package com.cloudframe.app.s918test.dto;

/**
*  The class Src178Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.s918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src178Grp extends Src178GrpSerialized {
   
      private List<char[]> src178; 

	
	/**
	* Constructor for Src178Grp
	**/
    public Src178Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src178
	 *  Corresponding COBOL Variable is WS-SRC-178
	 *	@return src178
	 */
	public List<char[]> getSrc178() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SRC_178_SIZE;index++) {
        	list.add( getSrc178( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src178
	 */
	public char[] getSrc178(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc178(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_178_SIZE) {
             	index = SRC_178_SIZE -1; // can't exceed max array size
             	logger.trace("src178 - Array index exceeded max Size {}, resetting it to max allowed",SRC_178_SIZE); 
	    }
   	      return getCharArray( (beginSrc178 + index*SRC_178_LEN) , SRC_178_LEN );
    }
    
    
   public int  src178FieldLength() {
   	return SRC_178_LEN;
   }
   
	

  
  	/**
	 *	Update Src178 with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-SRC-178
	 *  @param index
	 *	@param value
	 */
  public void setSrc178(int index,char[] value) {
   	setSrc178(index,value,true);
   }
   
   
   /**
	 *	Update Src178 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSrc178(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc178(int,String,boolean), reset it to 0",index);
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
		serializeSrc178(index,value);		
       }
   }
   

	
	
	

		public static int getSrc178GrpFieldLength() {
			return SRC_178_GRP_LENGTH;
		}

}
  
