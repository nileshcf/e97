package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014lImpBulkIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014lImpBulkIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014lImpBulkIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014L_IMP_BULK_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014lBulkFileProcCd;
            protected  int beginIp02014lBulkFileTypeCd;
	
	/**
	* Constructor for Ip02014lImpBulkIdSerialized
	**/
    public Ip02014lImpBulkIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014lImpBulkIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lImpBulkIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014lImpBulkIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip02014lImpBulkIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip02014lImpBulkIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014L_IMP_BULK_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014lBulkFileProcCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014lBulkFileTypeCd = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014lBulkFileProcCdCounter = -1;
     public boolean isIp02014lBulkFileProcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lBulkFileProcCdCounter != sharedCounter;
         localIp02014lBulkFileProcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_BULK_FILE_PROC_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014lBulkFileProcCd
	 */
   protected void serializeIp02014lBulkFileProcCd(char[] ip02014lBulkFileProcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lBulkFileProcCd,0,getStringValue(),beginIp02014lBulkFileProcCd,IP_02014L_BULK_FILE_PROC_CD_LEN);
       localIp02014lBulkFileProcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lBulkFileProcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lBulkFileProcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lBulkFileProcCd() {	 
   		return (substring(getStringValue(),beginIp02014lBulkFileProcCd,beginIp02014lBulkFileProcCd + IP_02014L_BULK_FILE_PROC_CD_LEN));
   	}
     int localIp02014lBulkFileTypeCdCounter = -1;
     public boolean isIp02014lBulkFileTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lBulkFileTypeCdCounter != sharedCounter;
         localIp02014lBulkFileTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_BULK_FILE_TYPE_CD_LEN = 3;
	/**
	 * 	serialize this Ip02014lBulkFileTypeCd
	 */
   protected void serializeIp02014lBulkFileTypeCd(char[] ip02014lBulkFileTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lBulkFileTypeCd,0,getStringValue(),beginIp02014lBulkFileTypeCd,IP_02014L_BULK_FILE_TYPE_CD_LEN);
       localIp02014lBulkFileTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lBulkFileTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014lBulkFileTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lBulkFileTypeCd() {	 
   		return (substring(getStringValue(),beginIp02014lBulkFileTypeCd,beginIp02014lBulkFileTypeCd + IP_02014L_BULK_FILE_TYPE_CD_LEN));
   	}




}
  
