package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class DclvmsdxrfkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclvmsdxrfkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclvmsdxrfkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLVMSDXRFK_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCrossReferenceCd;
            protected  int beginTypeXrefCd;
            protected  int beginSecurityAdpNbr01;
	
	/**
	* Constructor for DclvmsdxrfkSerialized
	**/
    public DclvmsdxrfkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclvmsdxrfkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLVMSDXRFK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCrossReferenceCd = getStartOffset() + 0;	// set offset for serialization
  
             beginTypeXrefCd = getStartOffset() + 12;	// set offset for serialization
  
             beginSecurityAdpNbr01 = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCrossReferenceCdCounter = -1;
     public boolean isCrossReferenceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrossReferenceCdCounter != sharedCounter;
         localCrossReferenceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CROSS_REFERENCE_CD_LEN = 12;
	/**
	 * 	serialize this CrossReferenceCd
	 */
   protected void serializeCrossReferenceCd(char[] crossReferenceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(crossReferenceCd,0,getStringValue(),beginCrossReferenceCd,CROSS_REFERENCE_CD_LEN);
       localCrossReferenceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCrossReferenceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCrossReferenceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCrossReferenceCd() {	 
   		return (substring(getStringValue(),beginCrossReferenceCd,beginCrossReferenceCd + CROSS_REFERENCE_CD_LEN));
   	}
     int localTypeXrefCdCounter = -1;
     public boolean isTypeXrefCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTypeXrefCdCounter != sharedCounter;
         localTypeXrefCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TYPE_XREF_CD_LEN = 2;
	/**
	 * 	serialize this TypeXrefCd
	 */
   protected void serializeTypeXrefCd(char[] typeXrefCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(typeXrefCd,0,getStringValue(),beginTypeXrefCd,TYPE_XREF_CD_LEN);
       localTypeXrefCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTypeXrefCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTypeXrefCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTypeXrefCd() {	 
   		return (substring(getStringValue(),beginTypeXrefCd,beginTypeXrefCd + TYPE_XREF_CD_LEN));
   	}
     int localSecurityAdpNbr01Counter = -1;
     public boolean isSecurityAdpNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityAdpNbr01Counter != sharedCounter;
         localSecurityAdpNbr01Counter = sharedCounter; return hasModified;
     }
	protected static final int SECURITY_ADP_NBR_01_LEN = 7;
	/**
	 * 	serialize this SecurityAdpNbr01
	 */
   protected void serializeSecurityAdpNbr01(char[] securityAdpNbr01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(securityAdpNbr01,0,getStringValue(),beginSecurityAdpNbr01,SECURITY_ADP_NBR_01_LEN);
       localSecurityAdpNbr01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecurityAdpNbr01Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshSecurityAdpNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecurityAdpNbr01() {	 
   		return (substring(getStringValue(),beginSecurityAdpNbr01,beginSecurityAdpNbr01 + SECURITY_ADP_NBR_01_LEN));
   	}




}
  
