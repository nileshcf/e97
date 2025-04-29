package com.cloudframe.app.ip088030.dto;

/**
*  The class IchgFeeRecords500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class IchgFeeRecords500 extends IchgFeeRecords500Serialized {
   

								private short ichgEntriesMax500;

								private short ichgEntriesCnt500;
			private List<IchgEntry500> ichgEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for IchgFeeRecords500
	**/
    public IchgFeeRecords500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < ICHG_ENTRY_500_SIZE;arrayIndex++) {
						ichgEntry500.add(new IchgEntry500(this, beginIchgEntry500 + 
						arrayIndex * IchgEntry500.getIchgEntry500FieldLength()));
				}
	   	/*  end of offset */
								setIchgEntriesMax500((short)9999);
    }


 

	/**
	 *	Returns the value of ichgEntriesMax500
	 *	@return ichgEntriesMax500
	 */
	public short getIchgEntriesMax500() throws CFException {
        if (isIchgEntriesMax500Modified()) { 
           ichgEntriesMax500 = refreshIchgEntriesMax500();
        }
   		return ichgEntriesMax500;
	}
	
	/**
	 * 	Update IchgEntriesMax500 with the passed value
	 *  Corresponding COBOL Variable is 500-ICHG-ENTRIES-MAX
	 *	@param number
	 */
	public void setIchgEntriesMax500(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ichgEntriesMax500 = checkIchgEntriesMax500MaxLimit(number); 
		serializeIchgEntriesMax500(ichgEntriesMax500);
	}

	public void setIchgEntriesMax500(int number) {
	    number = checkIchgEntriesMax500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIchgEntriesMax500((short)number);
	}
	public void setIchgEntriesMax500(long number) {
	    number = checkIchgEntriesMax500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIchgEntriesMax500((short)number);
	}
	

	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {
        if (isIchgEntriesCnt500Modified()) { 
           ichgEntriesCnt500 = refreshIchgEntriesCnt500();
        }
   		return ichgEntriesCnt500;
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *  Corresponding COBOL Variable is 500-ICHG-ENTRIES-CNT
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ichgEntriesCnt500 = checkIchgEntriesCnt500MaxLimit(number); 
		serializeIchgEntriesCnt500(ichgEntriesCnt500);
	}

	public void setIchgEntriesCnt500(int number) {
	    number = checkIchgEntriesCnt500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIchgEntriesCnt500((short)number);
	}
	public void setIchgEntriesCnt500(long number) {
	    number = checkIchgEntriesCnt500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIchgEntriesCnt500((short)number);
	}
	

	/**
	 *	Returns the  value of ichgEntry500
	 *  Corresponding COBOL Variable is 500-ICHG-ENTRY
	 *	@return ichgEntry500
	 */
   public List<IchgEntry500> getIchgEntry500() {
       return ichgEntry500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ichgEntry500
	 */
	public IchgEntry500 getIchgEntry500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIchgEntry500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= ICHG_ENTRY_500_SIZE) {
             	index = ICHG_ENTRY_500_SIZE -1; // can't exceed max array size
             	logger.trace("ichgEntry500 - Array index exceeded max Size {}, resetting it to max allowed",ICHG_ENTRY_500_SIZE); 
	    }
		if (index >= ichgEntry500.size()) {
       		for (int fillIndex =  ichgEntry500.size() -1; fillIndex < index;fillIndex++) {
		       ichgEntry500.add(null);
		    }
			ichgEntry500.set(index,
			   	   	new IchgEntry500(this,beginIchgEntry500 + index * IchgEntry500.getIchgEntry500FieldLength()) 
				                        ); 	
		} 
   	   IchgEntry500 value = ichgEntry500.get(index);
   	   if (value == null) {
   	      ichgEntry500.set(index,
			   	   	new IchgEntry500(this,beginIchgEntry500 + index * IchgEntry500.getIchgEntry500FieldLength()) 
				                        ); 
		  value = ichgEntry500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IchgEntry500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-ICHG-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIchgEntry500(int index,char[] value) {
   	getIchgEntry500(index).setString(value);
   }
   
	

	
	
	

		public static int getIchgFeeRecords500FieldLength() {
			return ICHG_FEE_RECORDS_500_LENGTH;
		}

}
  
