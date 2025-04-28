package com.cloudframe.app.callvp77.dto;

/**
*  The class InSrtArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.callvp77.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class InSrtArray extends InSrtArraySerialized { 
   
      private List<char[]> inSrtItem; 

	
	/**
	* Constructor for InSrtArray
	**/
    public InSrtArray() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of inSrtItem
	 *  Corresponding COBOL Variable is IN-SRT-ITEM
	 *	@return inSrtItem
	 */
	public List<char[]> getInSrtItem() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IN_SRT_ITEM_SIZE;index++) {
        	list.add( getInSrtItem( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return inSrtItem
	 */
	public char[] getInSrtItem(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getInSrtItem(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IN_SRT_ITEM_SIZE) {
             	index = IN_SRT_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("inSrtItem - Array index exceeded max Size {}, resetting it to max allowed",IN_SRT_ITEM_SIZE); 
	    }
   	      return getCharArray( (beginInSrtItem + index*IN_SRT_ITEM_LEN) , IN_SRT_ITEM_LEN );
    }
    
    
   public int  inSrtItemFieldLength() {
   	return IN_SRT_ITEM_LEN;
   }
   
	

  
  	/**
	 *	Update InSrtItem with the passed value at a given index
	 *  Corresponding COBOL Variable is IN-SRT-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setInSrtItem(int index,char[] value) {
   	setInSrtItem(index,value,true);
   }
   
   
   /**
	 *	Update InSrtItem with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setInSrtItem(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setInSrtItem(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 74)  {     
		       value = substring(value,0,74);
           }  else if (value.length < 74) {
		       value = pad(74, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(74).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeInSrtItem(index,value);		
       }
   }
   

	
	
	

		public static int getInSrtArrayFieldLength() {
			return IN_SRT_ARRAY_LENGTH;
		}

}
  
