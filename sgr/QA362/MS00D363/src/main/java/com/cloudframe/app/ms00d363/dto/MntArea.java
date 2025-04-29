package com.cloudframe.app.ms00d363.dto;

/**
*  The class MntArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class MntArea extends MntAreaSerialized { 
   
      private List<char[]> mntMonth; 

	
	/**
	* Constructor for MntArea
	**/
    public MntArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MntArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MntArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of mntMonth
	 *  Corresponding COBOL Variable is MNT-MONTH
	 *	@return mntMonth
	 */
	public List<char[]> getMntMonth() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < MNT_MONTH_SIZE;index++) {
        	list.add( getMntMonth( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return mntMonth
	 */
	public char[] getMntMonth(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getMntMonth(), resetting it to 0",index);
		    index = 0;
        } else if (index >= MNT_MONTH_SIZE) {
             	index = MNT_MONTH_SIZE -1; // can't exceed max array size
             	logger.trace("mntMonth - Array index exceeded max Size {}, resetting it to max allowed",MNT_MONTH_SIZE); 
	    }
   	      return getCharArray( (beginMntMonth + index*MNT_MONTH_LEN) , MNT_MONTH_LEN );
    }
    
    
   public int  mntMonthFieldLength() {
   	return MNT_MONTH_LEN;
   }
   
	

  
  	/**
	 *	Update MntMonth with the passed value at a given index
	 *  Corresponding COBOL Variable is MNT-MONTH
	 *  @param index
	 *	@param value
	 */
  public void setMntMonth(int index,char[] value) {
   	setMntMonth(index,value,true);
   }
   
   
   /**
	 *	Update MntMonth with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setMntMonth(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setMntMonth(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 11)  {     
		       value = substring(value,0,11);
           }  else if (value.length < 11) {
		       value = pad(11, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(11).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeMntMonth(index,value);		
       }
   }
   

	
	
	

		public static int getMntAreaFieldLength() {
			return MNT_AREA_LENGTH;
		}

}
  
