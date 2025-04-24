package com.cloudframe.app.mcsort02.file.records;

/**
*  The class Sys004IpmParmMasterRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Sys004IpmParmMasterRecord extends Sys004IpmParmMasterRecordSerialized { 
   
      private List<char[]> filler1; 

	
	/**
	* Constructor for Sys004IpmParmMasterRecord
	**/
    public Sys004IpmParmMasterRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of filler1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return filler1
	 */
	public List<char[]> getFiller1() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < FILLER_1_SIZE;index++) {
        	list.add( getFiller1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return filler1
	 */
	public char[] getFiller1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getFiller1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= FILLER_1_SIZE) {
             	index = FILLER_1_SIZE -1; // can't exceed max array size
             	logger.trace("filler1 - Array index exceeded max Size {}, resetting it to max allowed",FILLER_1_SIZE); 
	    }
   	      return getCharArray( (beginFiller1 + index*FILLER_1_LEN) , FILLER_1_LEN );
    }
    
    
   public int  filler1FieldLength() {
   	return FILLER_1_LEN;
   }
   
	

  
  	/**
	 *	Update Filler1 with the passed value at a given index
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setFiller1(int index,char[] value) {
   	setFiller1(index,value,true);
   }
   
   
   /**
	 *	Update Filler1 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setFiller1(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setFiller1(int,String,boolean), reset it to 0",index);
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
		serializeFiller1(index,value);		
       }
   }
   

	
	
	

		public static int getSys004IpmParmMasterRecordFieldLength() {
			return SYS_004_IPM_PARM_MASTER_RECORD_LENGTH;
		}

}
  
