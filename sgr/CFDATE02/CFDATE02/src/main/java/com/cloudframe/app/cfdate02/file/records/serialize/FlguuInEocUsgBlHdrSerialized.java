package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlguuInEocUsgBlHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlguuInEocUsgBlHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlguuInEocUsgBlHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUU_IN_EOC_USG_BL_HDR_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlguuCustomerHeaderRec;
	
	/**
	* Constructor for FlguuInEocUsgBlHdrSerialized
	**/
    public FlguuInEocUsgBlHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FlguuInEocUsgBlHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FlguuInEocUsgBlHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FlguuInEocUsgBlHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FlguuInEocUsgBlHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUU_IN_EOC_USG_BL_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlguuCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlguuCustomerHeaderRecCounter = -1;
     public boolean isFlguuCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlguuCustomerHeaderRecCounter != sharedCounter;
         localFlguuCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUU_CUSTOMER_HEADER_REC_LEN = 989;
	/**
	 * 	serialize this FlguuCustomerHeaderRec
	 */
   protected void serializeFlguuCustomerHeaderRec(char[] flguuCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flguuCustomerHeaderRec,0,getStringValue(),beginFlguuCustomerHeaderRec,FLGUU_CUSTOMER_HEADER_REC_LEN);
       localFlguuCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlguuCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 989 ,false, false);
   }
    /**
	 *	refreshFlguuCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlguuCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginFlguuCustomerHeaderRec,beginFlguuCustomerHeaderRec + FLGUU_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
