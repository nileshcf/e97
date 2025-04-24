package com.cloudframe.app.varlen.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Work extends WorkSerialized { 
   

								private short activeSvcProdCnt;

								private int displayLen;
      private List<char[]> revo3SvcProdArrayOut; 


								private short activeFeatCnt;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of activeSvcProdCnt
	 *	@return activeSvcProdCnt
	 */
	public short getActiveSvcProdCnt() throws CFException {
   		return activeSvcProdCnt;
	}
	
	/**
	 * 	Update ActiveSvcProdCnt with the passed value
	 *  Corresponding COBOL Variable is WS-ACTIVE-SVC-PROD-CNT
	 *	@param number
	 */
	public void setActiveSvcProdCnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    activeSvcProdCnt = checkActiveSvcProdCntMaxLimit(number); 
	}

	public void setActiveSvcProdCnt(int number) {
	    number = checkActiveSvcProdCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setActiveSvcProdCnt((short)number);
	}
	public void setActiveSvcProdCnt(long number) {
	    number = checkActiveSvcProdCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setActiveSvcProdCnt((short)number);
	}
	

	/**
	 *	Returns the value of displayLen
	 *	@return displayLen
	 */
	public int getDisplayLen() throws CFException {
   		return displayLen;
	}
	
	/**
	 * 	Update DisplayLen with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-LEN
	 *	@param number
	 */
	public void setDisplayLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    displayLen = checkDisplayLenMaxLimit(number); 
	}


	public void setDisplayLen(long number) {
	    number = checkDisplayLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDisplayLen((int)number);
	}
	
    /**
	 *	Returns the value of revo3SvcProdArrayOut
	 *  Corresponding COBOL Variable is REVO3-SVC-PROD-ARRAY-OUT
	 *	@return revo3SvcProdArrayOut
	 */
	public List<char[]> getRevo3SvcProdArrayOut() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < REVO_3_SVC_PROD_ARRAY_OUT_SIZE;index++) {
        	list.add( getRevo3SvcProdArrayOut( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return revo3SvcProdArrayOut
	 */
	public char[] getRevo3SvcProdArrayOut(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getRevo3SvcProdArrayOut(), resetting it to 0",index);
		    index = 0;
        } else if (index >= REVO_3_SVC_PROD_ARRAY_OUT_SIZE) {
             	index = REVO_3_SVC_PROD_ARRAY_OUT_SIZE -1; // can't exceed max array size
             	logger.trace("revo3SvcProdArrayOut - Array index exceeded max Size {}, resetting it to max allowed",REVO_3_SVC_PROD_ARRAY_OUT_SIZE); 
	    }
   	      return getCharArray( (beginRevo3SvcProdArrayOut + index*REVO_3_SVC_PROD_ARRAY_OUT_LEN) , REVO_3_SVC_PROD_ARRAY_OUT_LEN );
    }
    
    
   public int  revo3SvcProdArrayOutFieldLength() {
   	return REVO_3_SVC_PROD_ARRAY_OUT_LEN;
   }
   
	

  
  	/**
	 *	Update Revo3SvcProdArrayOut with the passed value at a given index
	 *  Corresponding COBOL Variable is REVO3-SVC-PROD-ARRAY-OUT
	 *  @param index
	 *	@param value
	 */
  public void setRevo3SvcProdArrayOut(int index,char[] value) {
   	setRevo3SvcProdArrayOut(index,value,true);
   }
   
   
   /**
	 *	Update Revo3SvcProdArrayOut with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setRevo3SvcProdArrayOut(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setRevo3SvcProdArrayOut(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 57)  {     
		       value = substring(value,0,57);
           }  else if (value.length < 57) {
		       value = pad(57, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(57).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeRevo3SvcProdArrayOut(index,value);		
       }
   }
   
	/**
	 *	Returns the value of activeFeatCnt
	 *	@return activeFeatCnt
	 */
	public short getActiveFeatCnt() throws CFException {
   		return activeFeatCnt;
	}
	
	/**
	 * 	Update ActiveFeatCnt with the passed value
	 *  Corresponding COBOL Variable is WS-ACTIVE-FEAT-CNT
	 *	@param number
	 */
	public void setActiveFeatCnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    activeFeatCnt = checkActiveFeatCntMaxLimit(number); 
	}

	public void setActiveFeatCnt(int number) {
	    number = checkActiveFeatCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setActiveFeatCnt((short)number);
	}
	public void setActiveFeatCnt(long number) {
	    number = checkActiveFeatCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setActiveFeatCnt((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
