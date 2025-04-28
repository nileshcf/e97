package com.cloudframe.app.mc081.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/


import com.cloudframe.app.mc081.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Work extends WorkSerialized {
   

						private char[] fbBigRec = Field.fillLowValue(134);

								private short vbsRecordLen;
      private List<char[]> vbsRecordArray1; 


						private char[] fbFileStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fbBigRec
	 *	@return fbBigRec
	 */
   public char[] getFbBigRec() throws CFException{
   		return fbBigRec;
   }

  
	/**
	*  set variable fbBigRec
	*  Corresponding COBOL Variable is FB-BIG-REC
	*  @param value
	**/
   public void setFbBigRec(char[] value) {
       value = checkFbBigRecConstraints(value);
       arraycopy(value,0,fbBigRec,0,value.length);
   } 
	public void setFbBigRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fbBigRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vbsRecordLen
	 *	@return vbsRecordLen
	 */
	public short getVbsRecordLen() throws CFException {
   		return vbsRecordLen;
	}
	
	/**
	 * 	Update VbsRecordLen with the passed value
	 *  Corresponding COBOL Variable is WS-VBS-RECORD-LEN
	 *	@param number
	 */
	public void setVbsRecordLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    vbsRecordLen = checkVbsRecordLenMaxLimit(number); 
	}

	public void setVbsRecordLen(int number) {
	    number = checkVbsRecordLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVbsRecordLen((short)number);
	}
	public void setVbsRecordLen(long number) {
	    number = checkVbsRecordLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVbsRecordLen((short)number);
	}
	

    /**
	 *	Returns the value of vbsRecordArray1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return vbsRecordArray1
	 */
	public List<char[]> getVbsRecordArray1() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < VBS_RECORD_ARRAY_1_SIZE;index++) {
        	list.add( getVbsRecordArray1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return vbsRecordArray1
	 */
	public char[] getVbsRecordArray1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getVbsRecordArray1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= VBS_RECORD_ARRAY_1_SIZE) {
             	index = VBS_RECORD_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("vbsRecordArray1 - Array index exceeded max Size {}, resetting it to max allowed",VBS_RECORD_ARRAY_1_SIZE); 
	    }
   	      return getCharArray( (beginVbsRecordArray1 + index*VBS_RECORD_ARRAY_1_LEN) , VBS_RECORD_ARRAY_1_LEN );
    }
    
    
   public int  vbsRecordArray1FieldLength() {
   	return VBS_RECORD_ARRAY_1_LEN;
   }
   
	

  
  	/**
	 *	Update VbsRecordArray1 with the passed value at a given index
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setVbsRecordArray1(int index,char[] value) {
   	setVbsRecordArray1(index,value,true);
   }
   
   
   /**
	 *	Update VbsRecordArray1 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setVbsRecordArray1(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setVbsRecordArray1(int,String,boolean), reset it to 0",index);
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
		serializeVbsRecordArray1(index,value);		
       }
   }
   
	/**
	 *	Returns the value of fbFileStatus
	 *	@return fbFileStatus
	 */
   public char[] getFbFileStatus() throws CFException{
   		return fbFileStatus;
   }

  
	/**
	*  set variable fbFileStatus
	*  Corresponding COBOL Variable is WS-FB-FILE-STATUS
	*  @param value
	**/
   public void setFbFileStatus(char[] value) {
       value = checkFbFileStatusConstraints(value);
       arraycopy(value,0,fbFileStatus,0,value.length);
   } 
	public void setFbFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fbFileStatus,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
