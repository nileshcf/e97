package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadExprYearSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPayloadExprYearSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadExprYearSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_EXPR_YEAR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPayloadExprCc;
            protected  int beginFnsPayloadExprYy;
	
	/**
	* Constructor for FnsPayloadExprYearSerialized
	**/
    public FnsPayloadExprYearSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPayloadExprYearSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadExprYearSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPayloadExprYearSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,89); // serialize this field at offset 89 by default 
    }
    
	/**
	* sets parent for this FnsPayloadExprYearSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 89 by default
    }    
	/**
	* initializes the field in FnsPayloadExprYearSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_EXPR_YEAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPayloadExprCc = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPayloadExprYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFnsPayloadExprCcCounter = -1;
     public boolean isFnsPayloadExprCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadExprCcCounter != sharedCounter;
         localFnsPayloadExprCcCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_EXPR_CC_LEN = 2;
	/**
	 * 	serialize this FnsPayloadExprCc
	 */
   protected void serializeFnsPayloadExprCc(char[] fnsPayloadExprCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadExprCc,0,getStringValue(),beginFnsPayloadExprCc,FNS_PAYLOAD_EXPR_CC_LEN);
       localFnsPayloadExprCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadExprCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPayloadExprCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadExprCc() {	 
   		return (substring(getStringValue(),beginFnsPayloadExprCc,beginFnsPayloadExprCc + FNS_PAYLOAD_EXPR_CC_LEN));
   	}
     int localFnsPayloadExprYyCounter = -1;
     public boolean isFnsPayloadExprYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadExprYyCounter != sharedCounter;
         localFnsPayloadExprYyCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_EXPR_YY_LEN = 2;
	/**
	 * 	serialize this FnsPayloadExprYy
	 */
   protected void serializeFnsPayloadExprYy(char[] fnsPayloadExprYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadExprYy,0,getStringValue(),beginFnsPayloadExprYy,FNS_PAYLOAD_EXPR_YY_LEN);
       localFnsPayloadExprYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadExprYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPayloadExprYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadExprYy() {	 
   		return (substring(getStringValue(),beginFnsPayloadExprYy,beginFnsPayloadExprYy + FNS_PAYLOAD_EXPR_YY_LEN));
   	}




}
  
