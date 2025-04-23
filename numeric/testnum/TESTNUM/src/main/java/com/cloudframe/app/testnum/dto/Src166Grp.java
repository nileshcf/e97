package com.cloudframe.app.testnum.dto;

/**
*  The class Src166Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src166Grp extends Src166GrpSerialized {
   
      private List<char[]> src166; 

	
	/**
	* Constructor for Src166Grp
	**/
    public Src166Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src166
	 *  Corresponding COBOL Variable is WS-SRC-166
	 *	@return src166
	 */
	public List<char[]> getSrc166() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SRC_166_SIZE;index++) {
        	list.add( getSrc166( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src166
	 */
	public char[] getSrc166(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc166(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_166_SIZE) {
             	index = SRC_166_SIZE -1; // can't exceed max array size
             	logger.trace("src166 - Array index exceeded max Size {}, resetting it to max allowed",SRC_166_SIZE); 
	    }
   	      return getCharArray( (beginSrc166 + index*SRC_166_LEN) , SRC_166_LEN );
    }
    
    
   public int  src166FieldLength() {
   	return SRC_166_LEN;
   }
   
	

  
  	/**
	 *	Update Src166 with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-SRC-166
	 *  @param index
	 *	@param value
	 */
  public void setSrc166(int index,char[] value) {
   	setSrc166(index,value,true);
   }
   
   
   /**
	 *	Update Src166 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSrc166(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc166(int,String,boolean), reset it to 0",index);
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
		serializeSrc166(index,value);		
       }
   }
   

	
	
	

		public static int getSrc166GrpFieldLength() {
			return SRC_166_GRP_LENGTH;
		}

}
  
