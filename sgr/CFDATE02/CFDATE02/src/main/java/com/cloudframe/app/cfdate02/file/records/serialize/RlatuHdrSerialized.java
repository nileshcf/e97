package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlatuHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlatuHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlatuHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLATU_HDR_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlatuCustomerHeaderRec;
	
	/**
	* Constructor for RlatuHdrSerialized
	**/
    public RlatuHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlatuHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlatuHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlatuHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlatuHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLATU_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlatuCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlatuCustomerHeaderRecCounter = -1;
     public boolean isRlatuCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlatuCustomerHeaderRecCounter != sharedCounter;
         localRlatuCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLATU_CUSTOMER_HEADER_REC_LEN = 129;
	/**
	 * 	serialize this RlatuCustomerHeaderRec
	 */
   protected void serializeRlatuCustomerHeaderRec(char[] rlatuCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlatuCustomerHeaderRec,0,getStringValue(),beginRlatuCustomerHeaderRec,RLATU_CUSTOMER_HEADER_REC_LEN);
       localRlatuCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlatuCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 129 ,false, false);
   }
    /**
	 *	refreshRlatuCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlatuCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginRlatuCustomerHeaderRec,beginRlatuCustomerHeaderRec + RLATU_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
