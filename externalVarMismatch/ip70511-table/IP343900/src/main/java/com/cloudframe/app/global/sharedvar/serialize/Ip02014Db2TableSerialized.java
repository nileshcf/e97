package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014Db2TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014Db2TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014Db2TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014_DB_2_TABLE_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014ApplSysId;
            protected  int beginIp02014PPkgSetNam;
            protected  int beginIp02014PSrvrNam;
            protected  int beginIp02014BPkgSetNam;
            protected  int beginIp02014BSrvrNam;
	
	/**
	* Constructor for Ip02014Db2TableSerialized
	**/
    public Ip02014Db2TableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014Db2TableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014Db2TableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014Db2TableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,171); // serialize this field at offset 171 by default 
    }
    
	/**
	* sets parent for this Ip02014Db2TableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 171 by default
    }    
	/**
	* initializes the field in Ip02014Db2TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014_DB_2_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014ApplSysId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014PPkgSetNam = getStartOffset() + 3;	// set offset for serialization
  
             beginIp02014PSrvrNam = getStartOffset() + 21;	// set offset for serialization
  
             beginIp02014BPkgSetNam = getStartOffset() + 39;	// set offset for serialization
  
             beginIp02014BSrvrNam = getStartOffset() + 57;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014ApplSysIdCounter = -1;
     public boolean isIp02014ApplSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014ApplSysIdCounter != sharedCounter;
         localIp02014ApplSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_APPL_SYS_ID_LEN = 3;
	/**
	 * 	serialize this Ip02014ApplSysId
	 */
   protected void serializeIp02014ApplSysId(char[] ip02014ApplSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014ApplSysId,0,getStringValue(),beginIp02014ApplSysId,IP_02014_APPL_SYS_ID_LEN);
       localIp02014ApplSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014ApplSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014ApplSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014ApplSysId() {	 
   		return (substring(getStringValue(),beginIp02014ApplSysId,beginIp02014ApplSysId + IP_02014_APPL_SYS_ID_LEN));
   	}
     int localIp02014PPkgSetNamCounter = -1;
     public boolean isIp02014PPkgSetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014PPkgSetNamCounter != sharedCounter;
         localIp02014PPkgSetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_PPKG_SET_NAM_LEN = 18;
	/**
	 * 	serialize this Ip02014PPkgSetNam
	 */
   protected void serializeIp02014PPkgSetNam(char[] ip02014PPkgSetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014PPkgSetNam,0,getStringValue(),beginIp02014PPkgSetNam,IP_02014_PPKG_SET_NAM_LEN);
       localIp02014PPkgSetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014PPkgSetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp02014PPkgSetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014PPkgSetNam() {	 
   		return (substring(getStringValue(),beginIp02014PPkgSetNam,beginIp02014PPkgSetNam + IP_02014_PPKG_SET_NAM_LEN));
   	}
     int localIp02014PSrvrNamCounter = -1;
     public boolean isIp02014PSrvrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014PSrvrNamCounter != sharedCounter;
         localIp02014PSrvrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_PSRVR_NAM_LEN = 18;
	/**
	 * 	serialize this Ip02014PSrvrNam
	 */
   protected void serializeIp02014PSrvrNam(char[] ip02014PSrvrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014PSrvrNam,0,getStringValue(),beginIp02014PSrvrNam,IP_02014_PSRVR_NAM_LEN);
       localIp02014PSrvrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014PSrvrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp02014PSrvrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014PSrvrNam() {	 
   		return (substring(getStringValue(),beginIp02014PSrvrNam,beginIp02014PSrvrNam + IP_02014_PSRVR_NAM_LEN));
   	}
     int localIp02014BPkgSetNamCounter = -1;
     public boolean isIp02014BPkgSetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014BPkgSetNamCounter != sharedCounter;
         localIp02014BPkgSetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_BPKG_SET_NAM_LEN = 18;
	/**
	 * 	serialize this Ip02014BPkgSetNam
	 */
   protected void serializeIp02014BPkgSetNam(char[] ip02014BPkgSetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014BPkgSetNam,0,getStringValue(),beginIp02014BPkgSetNam,IP_02014_BPKG_SET_NAM_LEN);
       localIp02014BPkgSetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014BPkgSetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp02014BPkgSetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014BPkgSetNam() {	 
   		return (substring(getStringValue(),beginIp02014BPkgSetNam,beginIp02014BPkgSetNam + IP_02014_BPKG_SET_NAM_LEN));
   	}
     int localIp02014BSrvrNamCounter = -1;
     public boolean isIp02014BSrvrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014BSrvrNamCounter != sharedCounter;
         localIp02014BSrvrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_BSRVR_NAM_LEN = 18;
	/**
	 * 	serialize this Ip02014BSrvrNam
	 */
   protected void serializeIp02014BSrvrNam(char[] ip02014BSrvrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014BSrvrNam,0,getStringValue(),beginIp02014BSrvrNam,IP_02014_BSRVR_NAM_LEN);
       localIp02014BSrvrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014BSrvrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp02014BSrvrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014BSrvrNam() {	 
   		return (substring(getStringValue(),beginIp02014BSrvrNam,beginIp02014BSrvrNam + IP_02014_BSRVR_NAM_LEN));
   	}




}
  
