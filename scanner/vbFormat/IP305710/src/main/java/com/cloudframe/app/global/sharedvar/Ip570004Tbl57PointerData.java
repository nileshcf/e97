package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004Tbl57PointerData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip570004Tbl57PointerData extends Ip570004Tbl57PointerDataSerialized { 
   

								private int ip570004Tbl57RelRecNumSt;

								private int ip570004Tbl57RelRecNumEnd;

								private long ip570004Tbl57CabGpEntrySt;

								private long ip570004Tbl57CabGpEntryLt;
	
	/**
	* Constructor for Ip570004Tbl57PointerData
	**/
    public Ip570004Tbl57PointerData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip570004Tbl57PointerData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004Tbl57PointerData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip570004Tbl57RelRecNumSt
	 *	@return ip570004Tbl57RelRecNumSt
	 */
	public int getIp570004Tbl57RelRecNumSt() throws CFException {
        if (isIp570004Tbl57RelRecNumStModified()) { 
           ip570004Tbl57RelRecNumSt = refreshIp570004Tbl57RelRecNumSt();
        }
   		return ip570004Tbl57RelRecNumSt;
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumSt with the passed value
	 *  Corresponding COBOL Variable is IP570004-TBL57-REL-REC-NUM-ST
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumSt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip570004Tbl57RelRecNumSt = checkIp570004Tbl57RelRecNumStMaxLimit(number); 
		serializeIp570004Tbl57RelRecNumSt(ip570004Tbl57RelRecNumSt);
	}


	public void setIp570004Tbl57RelRecNumSt(long number) {
	    number = checkIp570004Tbl57RelRecNumStMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp570004Tbl57RelRecNumSt((int)number);
	}
	
	/**
	 *	Returns the value of ip570004Tbl57RelRecNumEnd
	 *	@return ip570004Tbl57RelRecNumEnd
	 */
	public int getIp570004Tbl57RelRecNumEnd() throws CFException {
        if (isIp570004Tbl57RelRecNumEndModified()) { 
           ip570004Tbl57RelRecNumEnd = refreshIp570004Tbl57RelRecNumEnd();
        }
   		return ip570004Tbl57RelRecNumEnd;
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumEnd with the passed value
	 *  Corresponding COBOL Variable is IP570004-TBL57-REL-REC-NUM-END
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumEnd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip570004Tbl57RelRecNumEnd = checkIp570004Tbl57RelRecNumEndMaxLimit(number); 
		serializeIp570004Tbl57RelRecNumEnd(ip570004Tbl57RelRecNumEnd);
	}


	public void setIp570004Tbl57RelRecNumEnd(long number) {
	    number = checkIp570004Tbl57RelRecNumEndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp570004Tbl57RelRecNumEnd((int)number);
	}
	
	/**
	 *	Returns the value of ip570004Tbl57CabGpEntrySt
	 *	@return ip570004Tbl57CabGpEntrySt
	 */
	public long getIp570004Tbl57CabGpEntrySt() throws CFException {
        if (isIp570004Tbl57CabGpEntryStModified()) { 
           ip570004Tbl57CabGpEntrySt = refreshIp570004Tbl57CabGpEntrySt();
        }
   		return ip570004Tbl57CabGpEntrySt;
	}
	
	/**
	 * 	Update Ip570004Tbl57CabGpEntrySt with the passed value
	 *  Corresponding COBOL Variable is IP570004-TBL57-CAB-GP-ENTRY-ST
	 *	@param number
	 */
	public void setIp570004Tbl57CabGpEntrySt(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip570004Tbl57CabGpEntrySt = checkIp570004Tbl57CabGpEntryStMaxLimit(number); 
		serializeIp570004Tbl57CabGpEntrySt(ip570004Tbl57CabGpEntrySt);
	}


	/**
	 *	Returns the value of ip570004Tbl57CabGpEntryLt
	 *	@return ip570004Tbl57CabGpEntryLt
	 */
	public long getIp570004Tbl57CabGpEntryLt() throws CFException {
        if (isIp570004Tbl57CabGpEntryLtModified()) { 
           ip570004Tbl57CabGpEntryLt = refreshIp570004Tbl57CabGpEntryLt();
        }
   		return ip570004Tbl57CabGpEntryLt;
	}
	
	/**
	 * 	Update Ip570004Tbl57CabGpEntryLt with the passed value
	 *  Corresponding COBOL Variable is IP570004-TBL57-CAB-GP-ENTRY-LT
	 *	@param number
	 */
	public void setIp570004Tbl57CabGpEntryLt(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip570004Tbl57CabGpEntryLt = checkIp570004Tbl57CabGpEntryLtMaxLimit(number); 
		serializeIp570004Tbl57CabGpEntryLt(ip570004Tbl57CabGpEntryLt);
	}



	
	
	
	/**
	 * 	initializes Ip570004Tbl57PointerData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp570004Tbl57RelRecNumSt(0);
                     setIp570004Tbl57RelRecNumEnd(0);
                     setIp570004Tbl57CabGpEntrySt(0);
                     setIp570004Tbl57CabGpEntryLt(0);
   }

		public static int getIp570004Tbl57PointerDataFieldLength() {
			return IP_570004_TBL_57_POINTER_DATA_LENGTH;
		}

}
  
