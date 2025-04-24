package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02015ImpBulkIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02015ImpBulkIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02015ImpBulkIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02015_IMP_BULK_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02015BulkFileProcCd;
            protected  int beginIp02015BulkFileTypeCd;
	
	/**
	* Constructor for Ip02015ImpBulkIdSerialized
	**/
    public Ip02015ImpBulkIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02015ImpBulkIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015ImpBulkIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02015ImpBulkIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,33); // serialize this field at offset 33 by default 
    }
    
	/**
	* sets parent for this Ip02015ImpBulkIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 33 by default
    }    
	/**
	* initializes the field in Ip02015ImpBulkIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02015_IMP_BULK_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02015BulkFileProcCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02015BulkFileTypeCd = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02015BulkFileProcCdCounter = -1;
     public boolean isIp02015BulkFileProcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015BulkFileProcCdCounter != sharedCounter;
         localIp02015BulkFileProcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_BULK_FILE_PROC_CD_LEN = 1;
	/**
	 * 	serialize this Ip02015BulkFileProcCd
	 */
   protected void serializeIp02015BulkFileProcCd(char[] ip02015BulkFileProcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015BulkFileProcCd,0,getStringValue(),beginIp02015BulkFileProcCd,IP_02015_BULK_FILE_PROC_CD_LEN);
       localIp02015BulkFileProcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015BulkFileProcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015BulkFileProcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015BulkFileProcCd() {	 
   		return (substring(getStringValue(),beginIp02015BulkFileProcCd,beginIp02015BulkFileProcCd + IP_02015_BULK_FILE_PROC_CD_LEN));
   	}
     int localIp02015BulkFileTypeCdCounter = -1;
     public boolean isIp02015BulkFileTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015BulkFileTypeCdCounter != sharedCounter;
         localIp02015BulkFileTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_BULK_FILE_TYPE_CD_LEN = 3;
	/**
	 * 	serialize this Ip02015BulkFileTypeCd
	 */
   protected void serializeIp02015BulkFileTypeCd(char[] ip02015BulkFileTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015BulkFileTypeCd,0,getStringValue(),beginIp02015BulkFileTypeCd,IP_02015_BULK_FILE_TYPE_CD_LEN);
       localIp02015BulkFileTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015BulkFileTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02015BulkFileTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015BulkFileTypeCd() {	 
   		return (substring(getStringValue(),beginIp02015BulkFileTypeCd,beginIp02015BulkFileTypeCd + IP_02015_BULK_FILE_TYPE_CD_LEN));
   	}




}
  
