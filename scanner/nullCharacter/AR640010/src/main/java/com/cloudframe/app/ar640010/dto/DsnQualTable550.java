package com.cloudframe.app.ar640010.dto;

/**
*  The class DsnQualTable550 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class DsnQualTable550 extends DsnQualTable550Serialized {
   
      private List<char[]> dsnQual550; 

	
	/**
	* Constructor for DsnQualTable550
	**/
    public DsnQualTable550() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
							for (int arrayIndex = 0; arrayIndex < DSN_QUAL_550_SIZE;arrayIndex++) {
								setDsnQual550(arrayIndex,fillSpace(8));
							}
    }


 

    /**
	 *	Returns the value of dsnQual550
	 *  Corresponding COBOL Variable is 550-DSN-QUAL
	 *	@return dsnQual550
	 */
	public List<char[]> getDsnQual550() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < DSN_QUAL_550_SIZE;index++) {
        	list.add( getDsnQual550( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return dsnQual550
	 */
	public char[] getDsnQual550(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDsnQual550(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DSN_QUAL_550_SIZE) {
             	index = DSN_QUAL_550_SIZE -1; // can't exceed max array size
             	logger.trace("dsnQual550 - Array index exceeded max Size {}, resetting it to max allowed",DSN_QUAL_550_SIZE); 
	    }
   	      return getCharArray( (beginDsnQual550 + index*DSN_QUAL_550_LEN) , DSN_QUAL_550_LEN );
    }
    
    
   public int  dsnQual550FieldLength() {
   	return DSN_QUAL_550_LEN;
   }
   
	

  
  	/**
	 *	Update DsnQual550 with the passed value at a given index
	 *  Corresponding COBOL Variable is 550-DSN-QUAL
	 *  @param index
	 *	@param value
	 */
  public void setDsnQual550(int index,char[] value) {
   	setDsnQual550(index,value,true);
   }
   
   
   /**
	 *	Update DsnQual550 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setDsnQual550(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDsnQual550(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 8)  {     
		       value = substring(value,0,8);
           }  else if (value.length < 8) {
		       value = pad(8, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(8).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeDsnQual550(index,value);		
       }
   }
   

	
	
	

		public static int getDsnQualTable550FieldLength() {
			return DSN_QUAL_TABLE_550_LENGTH;
		}

}
  
