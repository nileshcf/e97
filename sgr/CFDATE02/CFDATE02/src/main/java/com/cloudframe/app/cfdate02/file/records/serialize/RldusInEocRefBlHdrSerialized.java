package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RldusInEocRefBlHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RldusInEocRefBlHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RldusInEocRefBlHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUS_IN_EOC_REF_BL_HDR_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRldusCustomerHeaderRec;
	
	/**
	* Constructor for RldusInEocRefBlHdrSerialized
	**/
    public RldusInEocRefBlHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RldusInEocRefBlHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RldusInEocRefBlHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RldusInEocRefBlHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RldusInEocRefBlHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUS_IN_EOC_REF_BL_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRldusCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRldusCustomerHeaderRecCounter = -1;
     public boolean isRldusCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRldusCustomerHeaderRecCounter != sharedCounter;
         localRldusCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUS_CUSTOMER_HEADER_REC_LEN = 141;
	/**
	 * 	serialize this RldusCustomerHeaderRec
	 */
   protected void serializeRldusCustomerHeaderRec(char[] rldusCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rldusCustomerHeaderRec,0,getStringValue(),beginRldusCustomerHeaderRec,RLDUS_CUSTOMER_HEADER_REC_LEN);
       localRldusCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRldusCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 141 ,false, false);
   }
    /**
	 *	refreshRldusCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRldusCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginRldusCustomerHeaderRec,beginRldusCustomerHeaderRec + RLDUS_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
