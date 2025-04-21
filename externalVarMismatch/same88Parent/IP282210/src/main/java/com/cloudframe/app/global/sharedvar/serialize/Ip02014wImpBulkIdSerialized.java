package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014wImpBulkIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014wImpBulkIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014wImpBulkIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014W_IMP_BULK_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014wBulkFileProcCd;
            protected  int beginIp02014wBulkFileTypeCd;
	
	/**
	* Constructor for Ip02014wImpBulkIdSerialized
	**/
    public Ip02014wImpBulkIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014wImpBulkIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wImpBulkIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014wImpBulkIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip02014wImpBulkIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip02014wImpBulkIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014W_IMP_BULK_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014wBulkFileProcCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014wBulkFileTypeCd = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014wBulkFileProcCdCounter = -1;
     public boolean isIp02014wBulkFileProcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wBulkFileProcCdCounter != sharedCounter;
         localIp02014wBulkFileProcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_BULK_FILE_PROC_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014wBulkFileProcCd
	 */
   protected void serializeIp02014wBulkFileProcCd(char[] ip02014wBulkFileProcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wBulkFileProcCd,0,getStringValue(),beginIp02014wBulkFileProcCd,IP_02014W_BULK_FILE_PROC_CD_LEN);
       localIp02014wBulkFileProcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wBulkFileProcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wBulkFileProcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wBulkFileProcCd() {	 
   		return (substring(getStringValue(),beginIp02014wBulkFileProcCd,beginIp02014wBulkFileProcCd + IP_02014W_BULK_FILE_PROC_CD_LEN));
   	}
     int localIp02014wBulkFileTypeCdCounter = -1;
     public boolean isIp02014wBulkFileTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wBulkFileTypeCdCounter != sharedCounter;
         localIp02014wBulkFileTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_BULK_FILE_TYPE_CD_LEN = 3;
	/**
	 * 	serialize this Ip02014wBulkFileTypeCd
	 */
   protected void serializeIp02014wBulkFileTypeCd(char[] ip02014wBulkFileTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wBulkFileTypeCd,0,getStringValue(),beginIp02014wBulkFileTypeCd,IP_02014W_BULK_FILE_TYPE_CD_LEN);
       localIp02014wBulkFileTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wBulkFileTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014wBulkFileTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wBulkFileTypeCd() {	 
   		return (substring(getStringValue(),beginIp02014wBulkFileTypeCd,beginIp02014wBulkFileTypeCd + IP_02014W_BULK_FILE_TYPE_CD_LEN));
   	}




}
  
