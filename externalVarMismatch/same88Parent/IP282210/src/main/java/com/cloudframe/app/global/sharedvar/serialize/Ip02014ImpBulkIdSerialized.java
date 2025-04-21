package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014ImpBulkIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014ImpBulkIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014ImpBulkIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014_IMP_BULK_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014BulkFileProcCd;
            protected  int beginIp02014BulkFileTypeCd;
	
	/**
	* Constructor for Ip02014ImpBulkIdSerialized
	**/
    public Ip02014ImpBulkIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014ImpBulkIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014ImpBulkIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014ImpBulkIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip02014ImpBulkIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip02014ImpBulkIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014_IMP_BULK_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014BulkFileProcCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014BulkFileTypeCd = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014BulkFileProcCdCounter = -1;
     public boolean isIp02014BulkFileProcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014BulkFileProcCdCounter != sharedCounter;
         localIp02014BulkFileProcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_BULK_FILE_PROC_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014BulkFileProcCd
	 */
   protected void serializeIp02014BulkFileProcCd(char[] ip02014BulkFileProcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014BulkFileProcCd,0,getStringValue(),beginIp02014BulkFileProcCd,IP_02014_BULK_FILE_PROC_CD_LEN);
       localIp02014BulkFileProcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014BulkFileProcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014BulkFileProcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014BulkFileProcCd() {	 
   		return (substring(getStringValue(),beginIp02014BulkFileProcCd,beginIp02014BulkFileProcCd + IP_02014_BULK_FILE_PROC_CD_LEN));
   	}
     int localIp02014BulkFileTypeCdCounter = -1;
     public boolean isIp02014BulkFileTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014BulkFileTypeCdCounter != sharedCounter;
         localIp02014BulkFileTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_BULK_FILE_TYPE_CD_LEN = 3;
	/**
	 * 	serialize this Ip02014BulkFileTypeCd
	 */
   protected void serializeIp02014BulkFileTypeCd(char[] ip02014BulkFileTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014BulkFileTypeCd,0,getStringValue(),beginIp02014BulkFileTypeCd,IP_02014_BULK_FILE_TYPE_CD_LEN);
       localIp02014BulkFileTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014BulkFileTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014BulkFileTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014BulkFileTypeCd() {	 
   		return (substring(getStringValue(),beginIp02014BulkFileTypeCd,beginIp02014BulkFileTypeCd + IP_02014_BULK_FILE_TYPE_CD_LEN));
   	}




}
  
