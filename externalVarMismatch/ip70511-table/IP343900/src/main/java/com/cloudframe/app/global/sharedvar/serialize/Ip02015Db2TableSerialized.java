package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02015Db2TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02015Db2TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02015Db2TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02015_DB_2_TABLE_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02015ApplSysId;
            protected  int beginIp02015PkgSetNam;
            protected  int beginIp02015SrvrNam;
	
	/**
	* Constructor for Ip02015Db2TableSerialized
	**/
    public Ip02015Db2TableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02015Db2TableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015Db2TableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02015Db2TableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,191); // serialize this field at offset 191 by default 
    }
    
	/**
	* sets parent for this Ip02015Db2TableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 191 by default
    }    
	/**
	* initializes the field in Ip02015Db2TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02015_DB_2_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02015ApplSysId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02015PkgSetNam = getStartOffset() + 3;	// set offset for serialization
  
             beginIp02015SrvrNam = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02015ApplSysIdCounter = -1;
     public boolean isIp02015ApplSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015ApplSysIdCounter != sharedCounter;
         localIp02015ApplSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_APPL_SYS_ID_LEN = 3;
	/**
	 * 	serialize this Ip02015ApplSysId
	 */
   protected void serializeIp02015ApplSysId(char[] ip02015ApplSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015ApplSysId,0,getStringValue(),beginIp02015ApplSysId,IP_02015_APPL_SYS_ID_LEN);
       localIp02015ApplSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015ApplSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02015ApplSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015ApplSysId() {	 
   		return (substring(getStringValue(),beginIp02015ApplSysId,beginIp02015ApplSysId + IP_02015_APPL_SYS_ID_LEN));
   	}
     int localIp02015PkgSetNamCounter = -1;
     public boolean isIp02015PkgSetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015PkgSetNamCounter != sharedCounter;
         localIp02015PkgSetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_PKG_SET_NAM_LEN = 18;
	/**
	 * 	serialize this Ip02015PkgSetNam
	 */
   protected void serializeIp02015PkgSetNam(char[] ip02015PkgSetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015PkgSetNam,0,getStringValue(),beginIp02015PkgSetNam,IP_02015_PKG_SET_NAM_LEN);
       localIp02015PkgSetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015PkgSetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp02015PkgSetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015PkgSetNam() {	 
   		return (substring(getStringValue(),beginIp02015PkgSetNam,beginIp02015PkgSetNam + IP_02015_PKG_SET_NAM_LEN));
   	}
     int localIp02015SrvrNamCounter = -1;
     public boolean isIp02015SrvrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015SrvrNamCounter != sharedCounter;
         localIp02015SrvrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_SRVR_NAM_LEN = 18;
	/**
	 * 	serialize this Ip02015SrvrNam
	 */
   protected void serializeIp02015SrvrNam(char[] ip02015SrvrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015SrvrNam,0,getStringValue(),beginIp02015SrvrNam,IP_02015_SRVR_NAM_LEN);
       localIp02015SrvrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015SrvrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp02015SrvrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015SrvrNam() {	 
   		return (substring(getStringValue(),beginIp02015SrvrNam,beginIp02015SrvrNam + IP_02015_SRVR_NAM_LEN));
   	}




}
  
