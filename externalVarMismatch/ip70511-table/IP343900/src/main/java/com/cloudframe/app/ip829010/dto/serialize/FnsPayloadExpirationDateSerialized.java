package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadExpirationDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPayloadExpirationDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadExpirationDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_EXPIRATION_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPayloadExprMonth;
	
	/**
	* Constructor for FnsPayloadExpirationDateSerialized
	**/
    public FnsPayloadExpirationDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPayloadExpirationDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadExpirationDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPayloadExpirationDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,87); // serialize this field at offset 87 by default 
    }
    
	/**
	* sets parent for this FnsPayloadExpirationDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 87 by default
    }    
	/**
	* initializes the field in FnsPayloadExpirationDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_EXPIRATION_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPayloadExprMonth = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFnsPayloadExprMonthCounter = -1;
     public boolean isFnsPayloadExprMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadExprMonthCounter != sharedCounter;
         localFnsPayloadExprMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_EXPR_MONTH_LEN = 2;
	/**
	 * 	serialize this FnsPayloadExprMonth
	 */
   protected void serializeFnsPayloadExprMonth(char[] fnsPayloadExprMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadExprMonth,0,getStringValue(),beginFnsPayloadExprMonth,FNS_PAYLOAD_EXPR_MONTH_LEN);
       localFnsPayloadExprMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadExprMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPayloadExprMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadExprMonth() {	 
   		return (substring(getStringValue(),beginFnsPayloadExprMonth,beginFnsPayloadExprMonth + FNS_PAYLOAD_EXPR_MONTH_LEN));
   	}




}
  
