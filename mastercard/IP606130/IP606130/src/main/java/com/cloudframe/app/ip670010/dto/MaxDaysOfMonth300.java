package com.cloudframe.app.ip670010.dto;

/**
*  The class MaxDaysOfMonth300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class MaxDaysOfMonth300 extends MaxDaysOfMonth300Serialized { 
   
      private List<char[]> daysOfAMonth300; 

	
	/**
	* Constructor for MaxDaysOfMonth300
	**/
    public MaxDaysOfMonth300() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MaxDaysOfMonth300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MaxDaysOfMonth300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of daysOfAMonth300
	 *  Corresponding COBOL Variable is 300-DAYS-OF-A-MONTH
	 *	@return daysOfAMonth300
	 */
	public List<char[]> getDaysOfAMonth300() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < DAYS_OF_AMONTH_300_SIZE;index++) {
        	list.add( getDaysOfAMonth300( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return daysOfAMonth300
	 */
	public char[] getDaysOfAMonth300(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDaysOfAMonth300(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DAYS_OF_AMONTH_300_SIZE) {
             	index = DAYS_OF_AMONTH_300_SIZE -1; // can't exceed max array size
             	logger.trace("daysOfAMonth300 - Array index exceeded max Size {}, resetting it to max allowed",DAYS_OF_AMONTH_300_SIZE); 
	    }
   	      return getCharArray( (beginDaysOfAMonth300 + index*DAYS_OF_AMONTH_300_LEN) , DAYS_OF_AMONTH_300_LEN );
    }
    
    
   public int  daysOfAMonth300FieldLength() {
   	return DAYS_OF_AMONTH_300_LEN;
   }
   
	

  
  	/**
	 *	Update DaysOfAMonth300 with the passed value at a given index
	 *  Corresponding COBOL Variable is 300-DAYS-OF-A-MONTH
	 *  @param index
	 *	@param value
	 */
  public void setDaysOfAMonth300(int index,char[] value) {
   	setDaysOfAMonth300(index,value,true);
   }
   
   
   /**
	 *	Update DaysOfAMonth300 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setDaysOfAMonth300(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDaysOfAMonth300(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeDaysOfAMonth300(index,value);		
       }
   }
   

	
	
	

		public static int getMaxDaysOfMonth300FieldLength() {
			return MAX_DAYS_OF_MONTH_300_LENGTH;
		}

}
  
