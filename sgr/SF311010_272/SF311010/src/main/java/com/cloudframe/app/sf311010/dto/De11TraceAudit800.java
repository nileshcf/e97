package com.cloudframe.app.sf311010.dto;

/**
*  The class De11TraceAudit800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class De11TraceAudit800 extends De11TraceAudit800Serialized {
   


								private long traceAudit800;
	
	/**
	* Constructor for De11TraceAudit800
	**/
    public De11TraceAudit800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue(pad(2,"0","0",LEFT_PAD),getStartOffset() + 0,2);
    }


 

	/**
	 *	Returns the value of traceAudit800
	 *	@return traceAudit800
	 */
	public long getTraceAudit800() throws CFException {
       if (isTraceAudit800Modified()) { 
           traceAudit800 = refreshTraceAudit800();
        }
   		return traceAudit800;
	}
	

	
	   
	/**
	 * 	Update TraceAudit800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRACE-AUDIT
	 *	@param number
	 */
	public void setTraceAudit800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    traceAudit800 = checkTraceAudit800MaxLimit(number); 
		serializeTraceAudit800(traceAudit800);
	}
	

	/**
	 * 	Update TraceAudit800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTraceAudit800(char[] value) throws CFException {
		 traceAudit800 = serializeTraceAudit800(value);
	}
	/**
	 * 	Update TraceAudit800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTraceAudit800String(char[] value) throws CFException {
		 setTraceAudit800(value);
	}

	
	
	

		public static int getDe11TraceAudit800FieldLength() {
			return DE_11_TRACE_AUDIT_800_LENGTH;
		}

}
  
