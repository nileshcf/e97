package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioRequestCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciseqioRequestCodes extends MciseqioRequestCodesSerialized { 
   

								private short mciseqioOpenIanyTtcd;

								private short mciseqioOpenIoneTtcd;

								private short mciseqioOpenOutput;

								private short mciseqioClose;

								private short mciseqioGetNext;

								private short mciseqioPutNext;

								private short mciseqioOpenInotTtcd;

								private short mciseqioForceEof;
	
	/**
	* Constructor for MciseqioRequestCodes
	**/
    public MciseqioRequestCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciseqioRequestCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioRequestCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioOpenIanyTtcd((short)0);
								setMciseqioOpenIoneTtcd((short)1);
								setMciseqioOpenOutput((short)2);
								setMciseqioClose((short)3);
								setMciseqioGetNext((short)4);
								setMciseqioPutNext((short)5);
								setMciseqioOpenInotTtcd((short)6);
								setMciseqioForceEof((short)7);
    } 

	/**
	 *	Returns the value of mciseqioOpenIanyTtcd
	 *	@return mciseqioOpenIanyTtcd
	 */
	public short getMciseqioOpenIanyTtcd() throws CFException {
        if (isMciseqioOpenIanyTtcdModified()) { 
           mciseqioOpenIanyTtcd = refreshMciseqioOpenIanyTtcd();
        }
   		return mciseqioOpenIanyTtcd;
	}
	
	/**
	 * 	Update MciseqioOpenIanyTtcd with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-OPEN-IANY-TTCD
	 *	@param number
	 */
	public void setMciseqioOpenIanyTtcd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioOpenIanyTtcd = checkMciseqioOpenIanyTtcdMaxLimit(number); 
		serializeMciseqioOpenIanyTtcd(mciseqioOpenIanyTtcd);
	}

	public void setMciseqioOpenIanyTtcd(int number) {
	    number = checkMciseqioOpenIanyTtcdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenIanyTtcd((short)number);
	}
	public void setMciseqioOpenIanyTtcd(long number) {
	    number = checkMciseqioOpenIanyTtcdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenIanyTtcd((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioOpenIoneTtcd
	 *	@return mciseqioOpenIoneTtcd
	 */
	public short getMciseqioOpenIoneTtcd() throws CFException {
        if (isMciseqioOpenIoneTtcdModified()) { 
           mciseqioOpenIoneTtcd = refreshMciseqioOpenIoneTtcd();
        }
   		return mciseqioOpenIoneTtcd;
	}
	
	/**
	 * 	Update MciseqioOpenIoneTtcd with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-OPEN-IONE-TTCD
	 *	@param number
	 */
	public void setMciseqioOpenIoneTtcd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioOpenIoneTtcd = checkMciseqioOpenIoneTtcdMaxLimit(number); 
		serializeMciseqioOpenIoneTtcd(mciseqioOpenIoneTtcd);
	}

	public void setMciseqioOpenIoneTtcd(int number) {
	    number = checkMciseqioOpenIoneTtcdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenIoneTtcd((short)number);
	}
	public void setMciseqioOpenIoneTtcd(long number) {
	    number = checkMciseqioOpenIoneTtcdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenIoneTtcd((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioOpenOutput
	 *	@return mciseqioOpenOutput
	 */
	public short getMciseqioOpenOutput() throws CFException {
        if (isMciseqioOpenOutputModified()) { 
           mciseqioOpenOutput = refreshMciseqioOpenOutput();
        }
   		return mciseqioOpenOutput;
	}
	
	/**
	 * 	Update MciseqioOpenOutput with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-OPEN-OUTPUT
	 *	@param number
	 */
	public void setMciseqioOpenOutput(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioOpenOutput = checkMciseqioOpenOutputMaxLimit(number); 
		serializeMciseqioOpenOutput(mciseqioOpenOutput);
	}

	public void setMciseqioOpenOutput(int number) {
	    number = checkMciseqioOpenOutputMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenOutput((short)number);
	}
	public void setMciseqioOpenOutput(long number) {
	    number = checkMciseqioOpenOutputMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenOutput((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioClose
	 *	@return mciseqioClose
	 */
	public short getMciseqioClose() throws CFException {
        if (isMciseqioCloseModified()) { 
           mciseqioClose = refreshMciseqioClose();
        }
   		return mciseqioClose;
	}
	
	/**
	 * 	Update MciseqioClose with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-CLOSE
	 *	@param number
	 */
	public void setMciseqioClose(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioClose = checkMciseqioCloseMaxLimit(number); 
		serializeMciseqioClose(mciseqioClose);
	}

	public void setMciseqioClose(int number) {
	    number = checkMciseqioCloseMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioClose((short)number);
	}
	public void setMciseqioClose(long number) {
	    number = checkMciseqioCloseMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioClose((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioGetNext
	 *	@return mciseqioGetNext
	 */
	public short getMciseqioGetNext() throws CFException {
        if (isMciseqioGetNextModified()) { 
           mciseqioGetNext = refreshMciseqioGetNext();
        }
   		return mciseqioGetNext;
	}
	
	/**
	 * 	Update MciseqioGetNext with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-GET-NEXT
	 *	@param number
	 */
	public void setMciseqioGetNext(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioGetNext = checkMciseqioGetNextMaxLimit(number); 
		serializeMciseqioGetNext(mciseqioGetNext);
	}

	public void setMciseqioGetNext(int number) {
	    number = checkMciseqioGetNextMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioGetNext((short)number);
	}
	public void setMciseqioGetNext(long number) {
	    number = checkMciseqioGetNextMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioGetNext((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioPutNext
	 *	@return mciseqioPutNext
	 */
	public short getMciseqioPutNext() throws CFException {
        if (isMciseqioPutNextModified()) { 
           mciseqioPutNext = refreshMciseqioPutNext();
        }
   		return mciseqioPutNext;
	}
	
	/**
	 * 	Update MciseqioPutNext with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-PUT-NEXT
	 *	@param number
	 */
	public void setMciseqioPutNext(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioPutNext = checkMciseqioPutNextMaxLimit(number); 
		serializeMciseqioPutNext(mciseqioPutNext);
	}

	public void setMciseqioPutNext(int number) {
	    number = checkMciseqioPutNextMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioPutNext((short)number);
	}
	public void setMciseqioPutNext(long number) {
	    number = checkMciseqioPutNextMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioPutNext((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioOpenInotTtcd
	 *	@return mciseqioOpenInotTtcd
	 */
	public short getMciseqioOpenInotTtcd() throws CFException {
        if (isMciseqioOpenInotTtcdModified()) { 
           mciseqioOpenInotTtcd = refreshMciseqioOpenInotTtcd();
        }
   		return mciseqioOpenInotTtcd;
	}
	
	/**
	 * 	Update MciseqioOpenInotTtcd with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-OPEN-INOT-TTCD
	 *	@param number
	 */
	public void setMciseqioOpenInotTtcd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioOpenInotTtcd = checkMciseqioOpenInotTtcdMaxLimit(number); 
		serializeMciseqioOpenInotTtcd(mciseqioOpenInotTtcd);
	}

	public void setMciseqioOpenInotTtcd(int number) {
	    number = checkMciseqioOpenInotTtcdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenInotTtcd((short)number);
	}
	public void setMciseqioOpenInotTtcd(long number) {
	    number = checkMciseqioOpenInotTtcdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioOpenInotTtcd((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioForceEof
	 *	@return mciseqioForceEof
	 */
	public short getMciseqioForceEof() throws CFException {
        if (isMciseqioForceEofModified()) { 
           mciseqioForceEof = refreshMciseqioForceEof();
        }
   		return mciseqioForceEof;
	}
	
	/**
	 * 	Update MciseqioForceEof with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-FORCE-EOF
	 *	@param number
	 */
	public void setMciseqioForceEof(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioForceEof = checkMciseqioForceEofMaxLimit(number); 
		serializeMciseqioForceEof(mciseqioForceEof);
	}

	public void setMciseqioForceEof(int number) {
	    number = checkMciseqioForceEofMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioForceEof((short)number);
	}
	public void setMciseqioForceEof(long number) {
	    number = checkMciseqioForceEofMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioForceEof((short)number);
	}
	


	
	
	

		public static int getMciseqioRequestCodesFieldLength() {
			return MCISEQIO_REQUEST_CODES_LENGTH;
		}

}
  
