package com.cloudframe.app.comput5.dto;

/**
*  The class WvExposureResultsTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class WvExposureResultsTable extends WvExposureResultsTableSerialized { 
   
			private List<WvAccounts> wvAccounts = new ArrayList<>();
    	

								private short wvAcctIndex;

								private int wvWeightIndex;

								private short wvMonthIndex;
	
	/**
	* Constructor for WvExposureResultsTable
	**/
    public WvExposureResultsTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WV_ACCOUNTS_SIZE;arrayIndex++) {
						wvAccounts.add(new WvAccounts(this, beginWvAccounts + 
						arrayIndex * WvAccounts.getWvAccountsFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of wvAccounts
	 *  Corresponding COBOL Variable is WV-ACCOUNTS
	 *	@return wvAccounts
	 */
   public List<WvAccounts> getWvAccounts() {
       return wvAccounts;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wvAccounts
	 */
	public WvAccounts getWvAccounts(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWvAccounts(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WV_ACCOUNTS_SIZE) {
             	index = WV_ACCOUNTS_SIZE -1; // can't exceed max array size
             	logger.trace("wvAccounts - Array index exceeded max Size {}, resetting it to max allowed",WV_ACCOUNTS_SIZE); 
	    }
		if (index >= wvAccounts.size()) {
       		for (int fillIndex =  wvAccounts.size() -1; fillIndex < index;fillIndex++) {
		       wvAccounts.add(null);
		    }
			wvAccounts.set(index,
			   	   	new WvAccounts(this,beginWvAccounts + index * WvAccounts.getWvAccountsFieldLength()) 
				                        ); 	
		} 
   	   WvAccounts value = wvAccounts.get(index);
   	   if (value == null) {
   	      wvAccounts.set(index,
			   	   	new WvAccounts(this,beginWvAccounts + index * WvAccounts.getWvAccountsFieldLength()) 
				                        ); 
		  value = wvAccounts.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WvAccounts at index with the passed value
	 *  Corresponding COBOL Variable is WV-ACCOUNTS
	 *  @param index
	 *	@param value
	 */
  public void setWvAccounts(int index,char[] value) {
   	getWvAccounts(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of wvAcctIndex
	 *	@return wvAcctIndex
	 */
	public short getWvAcctIndex() throws CFException {
        if (isWvAcctIndexModified()) { 
           wvAcctIndex = refreshWvAcctIndex();
        }
   		return wvAcctIndex;
	}
	
	/**
	 * 	Update WvAcctIndex with the passed value
	 *  Corresponding COBOL Variable is WV-ACCT-INDEX
	 *	@param number
	 */
	public void setWvAcctIndex(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wvAcctIndex = checkWvAcctIndexMaxLimit(number); 
		serializeWvAcctIndex(wvAcctIndex);
	}

	public void setWvAcctIndex(int number) {
	    number = checkWvAcctIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvAcctIndex((short)number);
	}
	public void setWvAcctIndex(long number) {
	    number = checkWvAcctIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvAcctIndex((short)number);
	}
	

	/**
	 *	Returns the value of wvWeightIndex
	 *	@return wvWeightIndex
	 */
	public int getWvWeightIndex() throws CFException {
        if (isWvWeightIndexModified()) { 
           wvWeightIndex = refreshWvWeightIndex();
        }
   		return wvWeightIndex;
	}
	
	/**
	 * 	Update WvWeightIndex with the passed value
	 *  Corresponding COBOL Variable is WV-WEIGHT-INDEX
	 *	@param number
	 */
	public void setWvWeightIndex(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wvWeightIndex = checkWvWeightIndexMaxLimit(number); 
		serializeWvWeightIndex(wvWeightIndex);
	}


	public void setWvWeightIndex(long number) {
	    number = checkWvWeightIndexMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWvWeightIndex((int)number);
	}
	
	/**
	 *	Returns the value of wvMonthIndex
	 *	@return wvMonthIndex
	 */
	public short getWvMonthIndex() throws CFException {
        if (isWvMonthIndexModified()) { 
           wvMonthIndex = refreshWvMonthIndex();
        }
   		return wvMonthIndex;
	}
	
	/**
	 * 	Update WvMonthIndex with the passed value
	 *  Corresponding COBOL Variable is WV-MONTH-INDEX
	 *	@param number
	 */
	public void setWvMonthIndex(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wvMonthIndex = checkWvMonthIndexMaxLimit(number); 
		serializeWvMonthIndex(wvMonthIndex);
	}

	public void setWvMonthIndex(int number) {
	    number = checkWvMonthIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvMonthIndex((short)number);
	}
	public void setWvMonthIndex(long number) {
	    number = checkWvMonthIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvMonthIndex((short)number);
	}
	


	
	
	

		public static int getWvExposureResultsTableFieldLength() {
			return WV_EXPOSURE_RESULTS_TABLE_LENGTH;
		}

}
  
