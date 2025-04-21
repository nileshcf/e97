package com.cloudframe.app.testnum.dto;

/**
*  The class Src164Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/


import com.cloudframe.app.testnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Src164Grp extends Src164GrpSerialized {
   
      private List<char[]> src164; 

	
	/**
	* Constructor for Src164Grp
	**/
    public Src164Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of src164
	 *  Corresponding COBOL Variable is WS-SRC-164
	 *	@return src164
	 */
	public List<char[]> getSrc164() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SRC_164_SIZE;index++) {
        	list.add( getSrc164( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return src164
	 */
	public char[] getSrc164(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSrc164(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SRC_164_SIZE) {
             	index = SRC_164_SIZE -1; // can't exceed max array size
             	logger.trace("src164 - Array index exceeded max Size {}, resetting it to max allowed",SRC_164_SIZE); 
	    }
   	      return getCharArray( (beginSrc164 + index*SRC_164_LEN) , SRC_164_LEN );
    }
    
    
   public int  src164FieldLength() {
   	return SRC_164_LEN;
   }
   
	

  
  	/**
	 *	Update Src164 with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-SRC-164
	 *  @param index
	 *	@param value
	 */
  public void setSrc164(int index,char[] value) {
   	setSrc164(index,value,true);
   }
   
   
   /**
	 *	Update Src164 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSrc164(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSrc164(int,String,boolean), reset it to 0",index);
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
		serializeSrc164(index,value);		
       }
   }
   

	
	
	

		public static int getSrc164GrpFieldLength() {
			return SRC_164_GRP_LENGTH;
		}

}
  
