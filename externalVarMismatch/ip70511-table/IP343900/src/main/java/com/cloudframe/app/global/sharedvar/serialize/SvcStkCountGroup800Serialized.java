package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class SvcStkCountGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SvcStkCountGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SvcStkCountGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SVC_STK_COUNT_GROUP_800_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSvcStkCount800;
	
	/**
	* Constructor for SvcStkCountGroup800Serialized
	**/
    public SvcStkCountGroup800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in SvcStkCountGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SVC_STK_COUNT_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSvcStkCount800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localSvcStkCount800Counter = -1;
        public boolean isSvcStkCount800Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSvcStkCount800Counter != sharedCounter;
           localSvcStkCount800Counter = sharedCounter; return hasModified; 
        }
	    public boolean svcStkCount800IsNumeric() {
	      return decimalIsNumeric(beginSvcStkCount800,SVC_STK_COUNT_800_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SVC_STK_COUNT_800_LEN = 5;
  	/**
	 * 	serializeSvcStkCount800
	 */
	protected void serializeSvcStkCount800(int svcStkCount800) {
		   putDecimal(beginSvcStkCount800,svcStkCount800,SVC_STK_COUNT_800_LEN,true);
   }
   

   protected int checkSvcStkCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSvcStkCount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSvcStkCount800() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSvcStkCount800,SVC_STK_COUNT_800_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("svcStkCount800", beginSvcStkCount800,SVC_STK_COUNT_800_LEN);
     }
   	}




}
  
