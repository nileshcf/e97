package com.cloudframe.app.ar640010.dto;

/**
*  The class RotorTable540 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class RotorTable540 extends RotorTable540Serialized {
   
      private List<char[]> rotorChar540; 

	
	/**
	* Constructor for RotorTable540
	**/
    public RotorTable540() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
							for (int arrayIndex = 0; arrayIndex < ROTOR_CHAR_540_SIZE;arrayIndex++) {
								setRotorChar540(arrayIndex,("ABCDEFGHIJKLMNOPQRSTUVWXYZ.").toCharArray());
							}
    }


 

    /**
	 *	Returns the value of rotorChar540
	 *  Corresponding COBOL Variable is 540-ROTOR-CHAR
	 *	@return rotorChar540
	 */
	public List<char[]> getRotorChar540() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < ROTOR_CHAR_540_SIZE;index++) {
        	list.add( getRotorChar540( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return rotorChar540
	 */
	public char[] getRotorChar540(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getRotorChar540(), resetting it to 0",index);
		    index = 0;
        } else if (index >= ROTOR_CHAR_540_SIZE) {
             	index = ROTOR_CHAR_540_SIZE -1; // can't exceed max array size
             	logger.trace("rotorChar540 - Array index exceeded max Size {}, resetting it to max allowed",ROTOR_CHAR_540_SIZE); 
	    }
   	      return getCharArray( (beginRotorChar540 + index*ROTOR_CHAR_540_LEN) , ROTOR_CHAR_540_LEN );
    }
    
    
   public int  rotorChar540FieldLength() {
   	return ROTOR_CHAR_540_LEN;
   }
   
	

  
  	/**
	 *	Update RotorChar540 with the passed value at a given index
	 *  Corresponding COBOL Variable is 540-ROTOR-CHAR
	 *  @param index
	 *	@param value
	 */
  public void setRotorChar540(int index,char[] value) {
   	setRotorChar540(index,value,true);
   }
   
   
   /**
	 *	Update RotorChar540 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setRotorChar540(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setRotorChar540(int,String,boolean), reset it to 0",index);
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
		serializeRotorChar540(index,value);		
       }
   }
   
	 char[] rotorEot8854088Value = ".".toCharArray();
	/**
	 *	Test condition "." for isRotorEot88540()
	 *	@return Returns true if isRotorEot88540() is "."
	 */
   public boolean isRotorEot88540(int index) throws CFException  {
      return (  compareChars( getRotorChar540(index) , rotorEot8854088Value)  == 0  );
   }
	/**
	*  set values "."
	*  @param index
	*/
   	public void setRotorEot88540True(int index) {
    	setRotorChar540(index , "rotorEot8854088Value".toCharArray()); 
   	}

	
	
	

		public static int getRotorTable540FieldLength() {
			return ROTOR_TABLE_540_LENGTH;
		}

}
  
