package com.cloudframe.app.si994010.dto;

/**
*  The class ElementTable800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class ElementTable800 extends ElementTable800Serialized {
   
      private List<char[]> element800; 

	
	/**
	* Constructor for ElementTable800
	**/
    public ElementTable800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
							for (int arrayIndex = 0; arrayIndex < ELEMENT_800_SIZE;arrayIndex++) {
								setElement800(arrayIndex,fillSpace(1));
							}
    }


 

    /**
	 *	Returns the value of element800
	 *  Corresponding COBOL Variable is 800-ELEMENT
	 *	@return element800
	 */
	public List<char[]> getElement800() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < ELEMENT_800_SIZE;index++) {
        	list.add( getElement800( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return element800
	 */
	public char[] getElement800(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getElement800(), resetting it to 0",index);
		    index = 0;
        } else if (index >= ELEMENT_800_SIZE) {
             	index = ELEMENT_800_SIZE -1; // can't exceed max array size
             	logger.trace("element800 - Array index exceeded max Size {}, resetting it to max allowed",ELEMENT_800_SIZE); 
	    }
   	      return getCharArray( (beginElement800 + index*ELEMENT_800_LEN) , ELEMENT_800_LEN );
    }
    
    
   public int  element800FieldLength() {
   	return ELEMENT_800_LEN;
   }
   
	

  
  	/**
	 *	Update Element800 with the passed value at a given index
	 *  Corresponding COBOL Variable is 800-ELEMENT
	 *  @param index
	 *	@param value
	 */
  public void setElement800(int index,char[] value) {
   	setElement800(index,value,true);
   }
   
   
   /**
	 *	Update Element800 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setElement800(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setElement800(int,String,boolean), reset it to 0",index);
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
		serializeElement800(index,value);		
       }
   }
   

	
	
	

		public static int getElementTable800FieldLength() {
			return ELEMENT_TABLE_800_LENGTH;
		}

}
  
