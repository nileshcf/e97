package com.cloudframe.app.ip343900.dto.serialize;

/**
*  The class Ip28221RestartTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip28221RestartTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip28221RestartTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_28221_RESTART_TABLE_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp28221ApplSysId;
            protected  int beginIp28221Db2PrimBackupInd;
	
	/**
	* Constructor for Ip28221RestartTableSerialized
	**/
    public Ip28221RestartTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip28221RestartTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip28221RestartTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip28221RestartTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Ip28221RestartTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Ip28221RestartTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_28221_RESTART_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp28221ApplSysId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp28221Db2PrimBackupInd = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp28221ApplSysIdCounter = -1;
     public boolean isIp28221ApplSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp28221ApplSysIdCounter != sharedCounter;
         localIp28221ApplSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_28221_APPL_SYS_ID_LEN = 3;
	/**
	 * 	serialize this Ip28221ApplSysId
	 */
   protected void serializeIp28221ApplSysId(char[] ip28221ApplSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip28221ApplSysId,0,getStringValue(),beginIp28221ApplSysId,IP_28221_APPL_SYS_ID_LEN);
       localIp28221ApplSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp28221ApplSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp28221ApplSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp28221ApplSysId() {	 
   		return (substring(getStringValue(),beginIp28221ApplSysId,beginIp28221ApplSysId + IP_28221_APPL_SYS_ID_LEN));
   	}
     int localIp28221Db2PrimBackupIndCounter = -1;
     public boolean isIp28221Db2PrimBackupIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp28221Db2PrimBackupIndCounter != sharedCounter;
         localIp28221Db2PrimBackupIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_28221_DB_2_PRIM_BACKUP_IND_LEN = 1;
	/**
	 * 	serialize this Ip28221Db2PrimBackupInd
	 */
   protected void serializeIp28221Db2PrimBackupInd(char[] ip28221Db2PrimBackupInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip28221Db2PrimBackupInd,0,getStringValue(),beginIp28221Db2PrimBackupInd,IP_28221_DB_2_PRIM_BACKUP_IND_LEN);
       localIp28221Db2PrimBackupIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp28221Db2PrimBackupIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp28221Db2PrimBackupInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp28221Db2PrimBackupInd() {	 
   		return (substring(getStringValue(),beginIp28221Db2PrimBackupInd,beginIp28221Db2PrimBackupInd + IP_28221_DB_2_PRIM_BACKUP_IND_LEN));
   	}




}
  
