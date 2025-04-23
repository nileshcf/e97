package com.cloudframe.app.casecb00.dto;

/**
*  The class Availablecolors is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.casecb00.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Availablecolors extends AvailablecolorsSerialized { 
   
      private List<char[]> color; 

	
	/**
	* Constructor for Availablecolors
	**/
    public Availablecolors() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Availablecolors. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Availablecolors(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of color
	 *  Corresponding COBOL Variable is COLOR
	 *	@return color
	 */
	public List<char[]> getColor() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < COLOR_SIZE;index++) {
        	list.add( getColor( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return color
	 */
	public char[] getColor(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getColor(), resetting it to 0",index);
		    index = 0;
        } else if (index >= COLOR_SIZE) {
             	index = COLOR_SIZE -1; // can't exceed max array size
             	logger.trace("color - Array index exceeded max Size {}, resetting it to max allowed",COLOR_SIZE); 
	    }
   	      return getCharArray( (beginColor + index*COLOR_LEN) , COLOR_LEN );
    }
    
    
   public int  colorFieldLength() {
   	return COLOR_LEN;
   }
   
	

  
  	/**
	 *	Update Color with the passed value at a given index
	 *  Corresponding COBOL Variable is COLOR
	 *  @param index
	 *	@param value
	 */
  public void setColor(int index,char[] value) {
   	setColor(index,value,true);
   }
   
   
   /**
	 *	Update Color with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setColor(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setColor(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeColor(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Availablecolors
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < COLOR_SIZE;index++) {
             setColor(index, CONSTANTS.SPACE_10);
         }
   }

		public static int getAvailablecolorsFieldLength() {
			return AVAILABLECOLORS_LENGTH;
		}

}
  
