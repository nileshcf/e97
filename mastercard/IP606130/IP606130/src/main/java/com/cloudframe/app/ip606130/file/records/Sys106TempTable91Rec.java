package com.cloudframe.app.ip606130.file.records;

/**
*  The class Sys106TempTable91Rec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Sys106TempTable91Rec extends Sys106TempTable91RecSerialized {
   
      private List<char[]> filler3; 

	
	/**
	* Constructor for Sys106TempTable91Rec
	**/
    public Sys106TempTable91Rec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of filler3
	 *  Corresponding COBOL Variable is FILLER
	 *	@return filler3
	 */
	public List<char[]> getFiller3() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < FILLER_3_SIZE;index++) {
        	list.add( getFiller3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return filler3
	 */
	public char[] getFiller3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getFiller3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= FILLER_3_SIZE) {
             	index = FILLER_3_SIZE -1; // can't exceed max array size
             	logger.trace("filler3 - Array index exceeded max Size {}, resetting it to max allowed",FILLER_3_SIZE); 
	    }
   	      return getCharArray( (beginFiller3 + index*FILLER_3_LEN) , FILLER_3_LEN );
    }
    
    
   public int  filler3FieldLength() {
   	return FILLER_3_LEN;
   }
   
	

  
  	/**
	 *	Update Filler3 with the passed value at a given index
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setFiller3(int index,char[] value) {
   	setFiller3(index,value,true);
   }
   
   
   /**
	 *	Update Filler3 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setFiller3(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setFiller3(int,String,boolean), reset it to 0",index);
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
		serializeFiller3(index,value);		
       }
   }
   

	
	
	

		public static int getSys106TempTable91RecFieldLength() {
			return SYS_106_TEMP_TABLE_91_REC_LENGTH;
		}

}
  
