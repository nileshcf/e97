package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class OldcrLnShrGrpRemHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OldcrLnShrGrpRemHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OldcrLnShrGrpRemHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OLDCR_LN_SHR_GRP_REM_HDR_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOldcrCustomerHeaderRec;
	
	/**
	* Constructor for OldcrLnShrGrpRemHdrSerialized
	**/
    public OldcrLnShrGrpRemHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OldcrLnShrGrpRemHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OldcrLnShrGrpRemHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this OldcrLnShrGrpRemHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in OldcrLnShrGrpRemHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OLDCR_LN_SHR_GRP_REM_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOldcrCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOldcrCustomerHeaderRecCounter = -1;
     public boolean isOldcrCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldcrCustomerHeaderRecCounter != sharedCounter;
         localOldcrCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int OLDCR_CUSTOMER_HEADER_REC_LEN = 152;
	/**
	 * 	serialize this OldcrCustomerHeaderRec
	 */
   protected void serializeOldcrCustomerHeaderRec(char[] oldcrCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldcrCustomerHeaderRec,0,getStringValue(),beginOldcrCustomerHeaderRec,OLDCR_CUSTOMER_HEADER_REC_LEN);
       localOldcrCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldcrCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 152 ,false, false);
   }
    /**
	 *	refreshOldcrCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldcrCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginOldcrCustomerHeaderRec,beginOldcrCustomerHeaderRec + OLDCR_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
