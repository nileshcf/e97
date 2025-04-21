package com.cloudframe.app.sf305120.dto;

/**
*  The class AdditionalRuc260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AdditionalRuc260 extends AdditionalRuc260Serialized { 
   

								private int logcElapsedTime260;

								private short logcSeg1Length260;

								private short logcSeg2Length260;

	
	/**
	* Constructor for AdditionalRuc260
	**/
    public AdditionalRuc260() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AdditionalRuc260. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AdditionalRuc260(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLogcElapsedTime260(0);
								setLogcSeg1Length260((short)0);
								setLogcSeg2Length260((short)0);
       replaceValue( // serialize and save the value
             pad(73," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 8
             ,73
             );
    } 

	/**
	 *	Returns the value of logcElapsedTime260
	 *	@return logcElapsedTime260
	 */
	public int getLogcElapsedTime260() throws CFException {
        if (isLogcElapsedTime260Modified()) { 
           logcElapsedTime260 = refreshLogcElapsedTime260();
        }
   		return logcElapsedTime260;
	}
	
	/**
	 * 	Update LogcElapsedTime260 with the passed value
	 *  Corresponding COBOL Variable is 260-LOGC-ELAPSED-TIME
	 *	@param number
	 */
	public void setLogcElapsedTime260(int number) {
	     // Truncate if the number is beyond +/- Max range
	    logcElapsedTime260 = checkLogcElapsedTime260MaxLimit(number); 
		serializeLogcElapsedTime260(logcElapsedTime260);
	}


	public void setLogcElapsedTime260(long number) {
	    number = checkLogcElapsedTime260MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLogcElapsedTime260((int)number);
	}
	
	/**
	 *	Returns the value of logcSeg1Length260
	 *	@return logcSeg1Length260
	 */
	public short getLogcSeg1Length260() throws CFException {
        if (isLogcSeg1Length260Modified()) { 
           logcSeg1Length260 = refreshLogcSeg1Length260();
        }
   		return logcSeg1Length260;
	}
	
	/**
	 * 	Update LogcSeg1Length260 with the passed value
	 *  Corresponding COBOL Variable is 260-LOGC-SEG1-LENGTH
	 *	@param number
	 */
	public void setLogcSeg1Length260(short number) {
	     // Truncate if the number is beyond +/- Max range
	    logcSeg1Length260 = checkLogcSeg1Length260MaxLimit(number); 
		serializeLogcSeg1Length260(logcSeg1Length260);
	}

	public void setLogcSeg1Length260(int number) {
	    number = checkLogcSeg1Length260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLogcSeg1Length260((short)number);
	}
	public void setLogcSeg1Length260(long number) {
	    number = checkLogcSeg1Length260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLogcSeg1Length260((short)number);
	}
	

	/**
	 *	Returns the value of logcSeg2Length260
	 *	@return logcSeg2Length260
	 */
	public short getLogcSeg2Length260() throws CFException {
        if (isLogcSeg2Length260Modified()) { 
           logcSeg2Length260 = refreshLogcSeg2Length260();
        }
   		return logcSeg2Length260;
	}
	
	/**
	 * 	Update LogcSeg2Length260 with the passed value
	 *  Corresponding COBOL Variable is 260-LOGC-SEG2-LENGTH
	 *	@param number
	 */
	public void setLogcSeg2Length260(short number) {
	     // Truncate if the number is beyond +/- Max range
	    logcSeg2Length260 = checkLogcSeg2Length260MaxLimit(number); 
		serializeLogcSeg2Length260(logcSeg2Length260);
	}

	public void setLogcSeg2Length260(int number) {
	    number = checkLogcSeg2Length260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLogcSeg2Length260((short)number);
	}
	public void setLogcSeg2Length260(long number) {
	    number = checkLogcSeg2Length260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLogcSeg2Length260((short)number);
	}
	


	
	
	

		public static int getAdditionalRuc260FieldLength() {
			return ADDITIONAL_RUC_260_LENGTH;
		}

}
  
