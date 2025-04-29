package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamLinkArea1100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class DynamLinkArea1100 extends DynamLinkArea1100Serialized {
   

								private int dynamLength1100;

								private int dynamSvc99Rc1100;

								private int dynamSvc99Err1100;

								private int dynamSvc99Inf1100;

								private long dynamPackWa1100;

								private int dynamEndWaAddr1100;

								private int dynamKeywdAddr1100;

								private int dynamStrtValue1100;

								private int dynamStrtVerb1100;

								private int dynamReqBlock1100;

								private int dynamDairFail1100;

								private int dynamIkjeff021100;

								private int dynamLastTu1100;

								private int dynamDairfailSa1100;


	
	/**
	* Constructor for DynamLinkArea1100
	**/
    public DynamLinkArea1100() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dynamLength1100
	 *	@return dynamLength1100
	 */
	public int getDynamLength1100() throws CFException {
        if (isDynamLength1100Modified()) { 
           dynamLength1100 = refreshDynamLength1100();
        }
   		return dynamLength1100;
	}
	
	/**
	 * 	Update DynamLength1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-LENGTH
	 *	@param number
	 */
	public void setDynamLength1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamLength1100 = checkDynamLength1100MaxLimit(number); 
		serializeDynamLength1100(dynamLength1100);
	}


	public void setDynamLength1100(long number) {
	    number = checkDynamLength1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamLength1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamSvc99Rc1100
	 *	@return dynamSvc99Rc1100
	 */
	public int getDynamSvc99Rc1100() throws CFException {
        if (isDynamSvc99Rc1100Modified()) { 
           dynamSvc99Rc1100 = refreshDynamSvc99Rc1100();
        }
   		return dynamSvc99Rc1100;
	}
	
	/**
	 * 	Update DynamSvc99Rc1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-SVC99-RC
	 *	@param number
	 */
	public void setDynamSvc99Rc1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamSvc99Rc1100 = checkDynamSvc99Rc1100MaxLimit(number); 
		serializeDynamSvc99Rc1100(dynamSvc99Rc1100);
	}


	public void setDynamSvc99Rc1100(long number) {
	    number = checkDynamSvc99Rc1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamSvc99Rc1100((int)number);
	}
	
	
	/**
	 *	Test condition 4 for isDynamAllocFailed881100()
	 *	@return  Returns true if isDynamAllocFailed881100() is 4
	 */
   public boolean isDynamAllocFailed881100() throws CFException {
      return (  getDynamSvc99Rc1100()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setDynamAllocFailed881100True() {  			
    	setDynamSvc99Rc1100( 4);
   	}
	/**
	 *	Returns the value of dynamSvc99Err1100
	 *	@return dynamSvc99Err1100
	 */
	public int getDynamSvc99Err1100() throws CFException {
        if (isDynamSvc99Err1100Modified()) { 
           dynamSvc99Err1100 = refreshDynamSvc99Err1100();
        }
   		return dynamSvc99Err1100;
	}
	
	/**
	 * 	Update DynamSvc99Err1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-SVC99-ERR
	 *	@param number
	 */
	public void setDynamSvc99Err1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamSvc99Err1100 = checkDynamSvc99Err1100MaxLimit(number); 
		serializeDynamSvc99Err1100(dynamSvc99Err1100);
	}


	public void setDynamSvc99Err1100(long number) {
	    number = checkDynamSvc99Err1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamSvc99Err1100((int)number);
	}
	
	
	/**
	 *	Test condition 528 for isDynamAllocInUse881100()
	 *	@return  Returns true if isDynamAllocInUse881100() is 528
	 */
   public boolean isDynamAllocInUse881100() throws CFException {
      return (  getDynamSvc99Err1100()  ==  528  );
   }


	/**
	*  set values 528
	*/
   	public void setDynamAllocInUse881100True() {  			
    	setDynamSvc99Err1100( 528);
   	}
	
	/**
	 *	Test condition 38668 for isDynamAllocError881100()
	 *	@return  Returns true if isDynamAllocError881100() is 38668
	 */
   public boolean isDynamAllocError881100() throws CFException {
      return (  getDynamSvc99Err1100()  ==  38668  );
   }


	/**
	*  set values 38668
	*/
   	public void setDynamAllocError881100True() {  			
    	setDynamSvc99Err1100( 38668);
   	}
	/**
	 *	Returns the value of dynamSvc99Inf1100
	 *	@return dynamSvc99Inf1100
	 */
	public int getDynamSvc99Inf1100() throws CFException {
        if (isDynamSvc99Inf1100Modified()) { 
           dynamSvc99Inf1100 = refreshDynamSvc99Inf1100();
        }
   		return dynamSvc99Inf1100;
	}
	
	/**
	 * 	Update DynamSvc99Inf1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-SVC99-INF
	 *	@param number
	 */
	public void setDynamSvc99Inf1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamSvc99Inf1100 = checkDynamSvc99Inf1100MaxLimit(number); 
		serializeDynamSvc99Inf1100(dynamSvc99Inf1100);
	}


	public void setDynamSvc99Inf1100(long number) {
	    number = checkDynamSvc99Inf1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamSvc99Inf1100((int)number);
	}
	
	public long getDynamPackWa1100() throws CFException {
        if (isDynamPackWa1100Modified()) { 
           dynamPackWa1100 = refreshDynamPackWa1100();
        }
   		return dynamPackWa1100;
	}
	
	/**
	 * 	Update DynamPackWa1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-PACK-WA
	 *	@param number
	 */
	public void setDynamPackWa1100(long number) {
			dynamPackWa1100 = checkDynamPackWa1100MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDynamPackWa1100(dynamPackWa1100);
	}


	/**
	 *	Returns the value of dynamEndWaAddr1100
	 *	@return dynamEndWaAddr1100
	 */
	public int getDynamEndWaAddr1100() throws CFException {
        if (isDynamEndWaAddr1100Modified()) { 
           dynamEndWaAddr1100 = refreshDynamEndWaAddr1100();
        }
   		return dynamEndWaAddr1100;
	}
	
	/**
	 * 	Update DynamEndWaAddr1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-END-WA-ADDR
	 *	@param number
	 */
	public void setDynamEndWaAddr1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamEndWaAddr1100 = checkDynamEndWaAddr1100MaxLimit(number); 
		serializeDynamEndWaAddr1100(dynamEndWaAddr1100);
	}


	public void setDynamEndWaAddr1100(long number) {
	    number = checkDynamEndWaAddr1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamEndWaAddr1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamKeywdAddr1100
	 *	@return dynamKeywdAddr1100
	 */
	public int getDynamKeywdAddr1100() throws CFException {
        if (isDynamKeywdAddr1100Modified()) { 
           dynamKeywdAddr1100 = refreshDynamKeywdAddr1100();
        }
   		return dynamKeywdAddr1100;
	}
	
	/**
	 * 	Update DynamKeywdAddr1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-KEYWD-ADDR
	 *	@param number
	 */
	public void setDynamKeywdAddr1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamKeywdAddr1100 = checkDynamKeywdAddr1100MaxLimit(number); 
		serializeDynamKeywdAddr1100(dynamKeywdAddr1100);
	}


	public void setDynamKeywdAddr1100(long number) {
	    number = checkDynamKeywdAddr1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamKeywdAddr1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamStrtValue1100
	 *	@return dynamStrtValue1100
	 */
	public int getDynamStrtValue1100() throws CFException {
        if (isDynamStrtValue1100Modified()) { 
           dynamStrtValue1100 = refreshDynamStrtValue1100();
        }
   		return dynamStrtValue1100;
	}
	
	/**
	 * 	Update DynamStrtValue1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-STRT-VALUE
	 *	@param number
	 */
	public void setDynamStrtValue1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamStrtValue1100 = checkDynamStrtValue1100MaxLimit(number); 
		serializeDynamStrtValue1100(dynamStrtValue1100);
	}


	public void setDynamStrtValue1100(long number) {
	    number = checkDynamStrtValue1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamStrtValue1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamStrtVerb1100
	 *	@return dynamStrtVerb1100
	 */
	public int getDynamStrtVerb1100() throws CFException {
        if (isDynamStrtVerb1100Modified()) { 
           dynamStrtVerb1100 = refreshDynamStrtVerb1100();
        }
   		return dynamStrtVerb1100;
	}
	
	/**
	 * 	Update DynamStrtVerb1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-STRT-VERB
	 *	@param number
	 */
	public void setDynamStrtVerb1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamStrtVerb1100 = checkDynamStrtVerb1100MaxLimit(number); 
		serializeDynamStrtVerb1100(dynamStrtVerb1100);
	}


	public void setDynamStrtVerb1100(long number) {
	    number = checkDynamStrtVerb1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamStrtVerb1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamReqBlock1100
	 *	@return dynamReqBlock1100
	 */
	public int getDynamReqBlock1100() throws CFException {
        if (isDynamReqBlock1100Modified()) { 
           dynamReqBlock1100 = refreshDynamReqBlock1100();
        }
   		return dynamReqBlock1100;
	}
	
	/**
	 * 	Update DynamReqBlock1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-REQ-BLOCK
	 *	@param number
	 */
	public void setDynamReqBlock1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamReqBlock1100 = checkDynamReqBlock1100MaxLimit(number); 
		serializeDynamReqBlock1100(dynamReqBlock1100);
	}


	public void setDynamReqBlock1100(long number) {
	    number = checkDynamReqBlock1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamReqBlock1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamDairFail1100
	 *	@return dynamDairFail1100
	 */
	public int getDynamDairFail1100() throws CFException {
        if (isDynamDairFail1100Modified()) { 
           dynamDairFail1100 = refreshDynamDairFail1100();
        }
   		return dynamDairFail1100;
	}
	
	/**
	 * 	Update DynamDairFail1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-DAIR-FAIL
	 *	@param number
	 */
	public void setDynamDairFail1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamDairFail1100 = checkDynamDairFail1100MaxLimit(number); 
		serializeDynamDairFail1100(dynamDairFail1100);
	}


	public void setDynamDairFail1100(long number) {
	    number = checkDynamDairFail1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamDairFail1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamIkjeff021100
	 *	@return dynamIkjeff021100
	 */
	public int getDynamIkjeff021100() throws CFException {
        if (isDynamIkjeff021100Modified()) { 
           dynamIkjeff021100 = refreshDynamIkjeff021100();
        }
   		return dynamIkjeff021100;
	}
	
	/**
	 * 	Update DynamIkjeff021100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-IKJEFF02
	 *	@param number
	 */
	public void setDynamIkjeff021100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamIkjeff021100 = checkDynamIkjeff021100MaxLimit(number); 
		serializeDynamIkjeff021100(dynamIkjeff021100);
	}


	public void setDynamIkjeff021100(long number) {
	    number = checkDynamIkjeff021100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamIkjeff021100((int)number);
	}
	
	/**
	 *	Returns the value of dynamLastTu1100
	 *	@return dynamLastTu1100
	 */
	public int getDynamLastTu1100() throws CFException {
        if (isDynamLastTu1100Modified()) { 
           dynamLastTu1100 = refreshDynamLastTu1100();
        }
   		return dynamLastTu1100;
	}
	
	/**
	 * 	Update DynamLastTu1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-LAST-TU
	 *	@param number
	 */
	public void setDynamLastTu1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamLastTu1100 = checkDynamLastTu1100MaxLimit(number); 
		serializeDynamLastTu1100(dynamLastTu1100);
	}


	public void setDynamLastTu1100(long number) {
	    number = checkDynamLastTu1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamLastTu1100((int)number);
	}
	
	/**
	 *	Returns the value of dynamDairfailSa1100
	 *	@return dynamDairfailSa1100
	 */
	public int getDynamDairfailSa1100() throws CFException {
        if (isDynamDairfailSa1100Modified()) { 
           dynamDairfailSa1100 = refreshDynamDairfailSa1100();
        }
   		return dynamDairfailSa1100;
	}
	
	/**
	 * 	Update DynamDairfailSa1100 with the passed value
	 *  Corresponding COBOL Variable is 1100-DYNAM-DAIRFAIL-SA
	 *	@param number
	 */
	public void setDynamDairfailSa1100(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamDairfailSa1100 = checkDynamDairfailSa1100MaxLimit(number); 
		serializeDynamDairfailSa1100(dynamDairfailSa1100);
	}


	public void setDynamDairfailSa1100(long number) {
	    number = checkDynamDairfailSa1100MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamDairfailSa1100((int)number);
	}
	

	
	
	

		public static int getDynamLinkArea1100FieldLength() {
			return DYNAM_LINK_AREA_1100_LENGTH;
		}

}
  
