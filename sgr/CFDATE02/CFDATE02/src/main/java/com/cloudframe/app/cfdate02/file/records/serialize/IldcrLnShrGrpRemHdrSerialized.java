package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldcrLnShrGrpRemHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldcrLnShrGrpRemHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldcrLnShrGrpRemHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCR_LN_SHR_GRP_REM_HDR_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIldcrCustomerHeaderRec;
	
	/**
	* Constructor for IldcrLnShrGrpRemHdrSerialized
	**/
    public IldcrLnShrGrpRemHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IldcrLnShrGrpRemHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldcrLnShrGrpRemHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IldcrLnShrGrpRemHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IldcrLnShrGrpRemHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IldcrLnShrGrpRemHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCR_LN_SHR_GRP_REM_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIldcrCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIldcrCustomerHeaderRecCounter = -1;
     public boolean isIldcrCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIldcrCustomerHeaderRecCounter != sharedCounter;
         localIldcrCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int ILDCR_CUSTOMER_HEADER_REC_LEN = 152;
	/**
	 * 	serialize this IldcrCustomerHeaderRec
	 */
   protected void serializeIldcrCustomerHeaderRec(char[] ildcrCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ildcrCustomerHeaderRec,0,getStringValue(),beginIldcrCustomerHeaderRec,ILDCR_CUSTOMER_HEADER_REC_LEN);
       localIldcrCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIldcrCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 152 ,false, false);
   }
    /**
	 *	refreshIldcrCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIldcrCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginIldcrCustomerHeaderRec,beginIldcrCustomerHeaderRec + ILDCR_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
