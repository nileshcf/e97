package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De11TraceAudit800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De11TraceAudit800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De11TraceAudit800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_11_TRACE_AUDIT_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTraceAudit800;
	
	/**
	* Constructor for De11TraceAudit800Serialized
	**/
    public De11TraceAudit800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De11TraceAudit800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_11_TRACE_AUDIT_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTraceAudit800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTraceAudit800Counter = -1;
     public boolean isTraceAudit800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTraceAudit800Counter != sharedCounter;
         localTraceAudit800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of traceAudit800
	 *	@return traceAudit800
	 */
	public char[]  getTraceAudit800String() {
	     return getCharArray(beginTraceAudit800,TRACE_AUDIT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean traceAudit800IsNumeric() {
	    return isNumeric(beginTraceAudit800
	                    ,beginTraceAudit800 + TRACE_AUDIT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRACE_AUDIT_800_LEN = 6;
  	/**
	 * serializeTraceAudit800
	 */
	protected void serializeTraceAudit800(long traceAudit800) {
		 putNumber(beginTraceAudit800,traceAudit800,TRACE_AUDIT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTraceAudit800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTraceAudit800
	 */
   	protected  long serializeTraceAudit800(char[] value) {
	    long  traceAudit800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    traceAudit800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTraceAudit800
		       ,6
		      );
		 localTraceAudit800Counter = shareString.getSerializedField().getModifiedCounter();
		return  traceAudit800;
    }

   protected long checkTraceAudit800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTraceAudit800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTraceAudit800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTraceAudit800
			                 ,TRACE_AUDIT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("traceAudit800", beginTraceAudit800,TRACE_AUDIT_800_LEN);
    }
   	}




}
  
