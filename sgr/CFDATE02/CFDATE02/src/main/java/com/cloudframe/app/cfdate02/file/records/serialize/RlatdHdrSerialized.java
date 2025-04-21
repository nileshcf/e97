package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlatdHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlatdHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlatdHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLATD_HDR_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlatdCustomerHeaderRec;
	
	/**
	* Constructor for RlatdHdrSerialized
	**/
    public RlatdHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlatdHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatdHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlatdHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlatdHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlatdHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLATD_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlatdCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlatdCustomerHeaderRecCounter = -1;
     public boolean isRlatdCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlatdCustomerHeaderRecCounter != sharedCounter;
         localRlatdCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLATD_CUSTOMER_HEADER_REC_LEN = 129;
	/**
	 * 	serialize this RlatdCustomerHeaderRec
	 */
   protected void serializeRlatdCustomerHeaderRec(char[] rlatdCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlatdCustomerHeaderRec,0,getStringValue(),beginRlatdCustomerHeaderRec,RLATD_CUSTOMER_HEADER_REC_LEN);
       localRlatdCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlatdCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 129 ,false, false);
   }
    /**
	 *	refreshRlatdCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlatdCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginRlatdCustomerHeaderRec,beginRlatdCustomerHeaderRec + RLATD_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
