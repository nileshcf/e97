package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlgusInEocRefBlHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlgusInEocRefBlHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlgusInEocRefBlHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUS_IN_EOC_REF_BL_HDR_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlgusCustomerHeaderRec;
	
	/**
	* Constructor for FlgusInEocRefBlHdrSerialized
	**/
    public FlgusInEocRefBlHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FlgusInEocRefBlHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FlgusInEocRefBlHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FlgusInEocRefBlHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FlgusInEocRefBlHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUS_IN_EOC_REF_BL_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlgusCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlgusCustomerHeaderRecCounter = -1;
     public boolean isFlgusCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlgusCustomerHeaderRecCounter != sharedCounter;
         localFlgusCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUS_CUSTOMER_HEADER_REC_LEN = 141;
	/**
	 * 	serialize this FlgusCustomerHeaderRec
	 */
   protected void serializeFlgusCustomerHeaderRec(char[] flgusCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flgusCustomerHeaderRec,0,getStringValue(),beginFlgusCustomerHeaderRec,FLGUS_CUSTOMER_HEADER_REC_LEN);
       localFlgusCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlgusCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 141 ,false, false);
   }
    /**
	 *	refreshFlgusCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlgusCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginFlgusCustomerHeaderRec,beginFlgusCustomerHeaderRec + FLGUS_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
