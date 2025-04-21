package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class OldclLnShrBcActvHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OldclLnShrBcActvHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OldclLnShrBcActvHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OLDCL_LN_SHR_BC_ACTV_HDR_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOldclCustomerHeaderRec;
	
	/**
	* Constructor for OldclLnShrBcActvHdrSerialized
	**/
    public OldclLnShrBcActvHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OldclLnShrBcActvHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OldclLnShrBcActvHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this OldclLnShrBcActvHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in OldclLnShrBcActvHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OLDCL_LN_SHR_BC_ACTV_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOldclCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOldclCustomerHeaderRecCounter = -1;
     public boolean isOldclCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldclCustomerHeaderRecCounter != sharedCounter;
         localOldclCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int OLDCL_CUSTOMER_HEADER_REC_LEN = 329;
	/**
	 * 	serialize this OldclCustomerHeaderRec
	 */
   protected void serializeOldclCustomerHeaderRec(char[] oldclCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldclCustomerHeaderRec,0,getStringValue(),beginOldclCustomerHeaderRec,OLDCL_CUSTOMER_HEADER_REC_LEN);
       localOldclCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldclCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 329 ,false, false);
   }
    /**
	 *	refreshOldclCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldclCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginOldclCustomerHeaderRec,beginOldclCustomerHeaderRec + OLDCL_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
