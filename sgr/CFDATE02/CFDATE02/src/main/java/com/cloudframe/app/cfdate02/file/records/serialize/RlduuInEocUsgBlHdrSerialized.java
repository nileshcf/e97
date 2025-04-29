package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlduuInEocUsgBlHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlduuInEocUsgBlHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlduuInEocUsgBlHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUU_IN_EOC_USG_BL_HDR_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlduuCustomerHeaderRec;
	
	/**
	* Constructor for RlduuInEocUsgBlHdrSerialized
	**/
    public RlduuInEocUsgBlHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlduuInEocUsgBlHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlduuInEocUsgBlHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlduuInEocUsgBlHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlduuInEocUsgBlHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUU_IN_EOC_USG_BL_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlduuCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlduuCustomerHeaderRecCounter = -1;
     public boolean isRlduuCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlduuCustomerHeaderRecCounter != sharedCounter;
         localRlduuCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUU_CUSTOMER_HEADER_REC_LEN = 989;
	/**
	 * 	serialize this RlduuCustomerHeaderRec
	 */
   protected void serializeRlduuCustomerHeaderRec(char[] rlduuCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlduuCustomerHeaderRec,0,getStringValue(),beginRlduuCustomerHeaderRec,RLDUU_CUSTOMER_HEADER_REC_LEN);
       localRlduuCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlduuCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 989 ,false, false);
   }
    /**
	 *	refreshRlduuCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlduuCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginRlduuCustomerHeaderRec,beginRlduuCustomerHeaderRec + RLDUU_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
