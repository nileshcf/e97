package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip38201McidynamParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip38201McidynamParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip38201McidynamParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_38201_MCIDYNAM_PARMS_LENGTH = 164;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp38201Function;
            protected  int beginIp38201Dd;
            protected  int beginIp38201Dsn;
            protected  int beginIp38201ReturnCode;
            protected  int beginIp38201Filler;
	
	/**
	* Constructor for Ip38201McidynamParmsSerialized
	**/
    public Ip38201McidynamParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip38201McidynamParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_38201_MCIDYNAM_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp38201Function = getStartOffset() + 0;	// set offset for serialization
  
             beginIp38201Dd = getStartOffset() + 1;	// set offset for serialization
  
             beginIp38201Dsn = getStartOffset() + 9;	// set offset for serialization
  
  
  
             beginIp38201ReturnCode = getStartOffset() + 135;	// set offset for serialization
  
             beginIp38201Filler = getStartOffset() + 139;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp38201FunctionCounter = -1;
     public boolean isIp38201FunctionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201FunctionCounter != sharedCounter;
         localIp38201FunctionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_FUNCTION_LEN = 1;
	/**
	 * 	serialize this Ip38201Function
	 */
   protected void serializeIp38201Function(char[] ip38201Function) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201Function,0,getStringValue(),beginIp38201Function,IP_38201_FUNCTION_LEN);
       localIp38201FunctionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201FunctionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201Function is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201Function() {	 
   		return (substring(getStringValue(),beginIp38201Function,beginIp38201Function + IP_38201_FUNCTION_LEN));
   	}
     int localIp38201DdCounter = -1;
     public boolean isIp38201DdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DdCounter != sharedCounter;
         localIp38201DdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DD_LEN = 8;
	/**
	 * 	serialize this Ip38201Dd
	 */
   protected void serializeIp38201Dd(char[] ip38201Dd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201Dd,0,getStringValue(),beginIp38201Dd,IP_38201_DD_LEN);
       localIp38201DdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp38201Dd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201Dd() {	 
   		return (substring(getStringValue(),beginIp38201Dd,beginIp38201Dd + IP_38201_DD_LEN));
   	}
     int localIp38201DsnCounter = -1;
     public boolean isIp38201DsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DsnCounter != sharedCounter;
         localIp38201DsnCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DSN_LEN = 44;
	/**
	 * 	serialize this Ip38201Dsn
	 */
   protected void serializeIp38201Dsn(char[] ip38201Dsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201Dsn,0,getStringValue(),beginIp38201Dsn,IP_38201_DSN_LEN);
       localIp38201DsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp38201Dsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201Dsn() {	 
   		return (substring(getStringValue(),beginIp38201Dsn,beginIp38201Dsn + IP_38201_DSN_LEN));
   	}
     int localIp38201ReturnCodeCounter = -1;
     public boolean isIp38201ReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201ReturnCodeCounter != sharedCounter;
         localIp38201ReturnCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_RETURN_CODE_LEN = 4;
	/**
	 * 	serialize this Ip38201ReturnCode
	 */
   protected void serializeIp38201ReturnCode(char[] ip38201ReturnCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201ReturnCode,0,getStringValue(),beginIp38201ReturnCode,IP_38201_RETURN_CODE_LEN);
       localIp38201ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201ReturnCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp38201ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201ReturnCode() {	 
   		return (substring(getStringValue(),beginIp38201ReturnCode,beginIp38201ReturnCode + IP_38201_RETURN_CODE_LEN));
   	}
     int localIp38201FillerCounter = -1;
     public boolean isIp38201FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201FillerCounter != sharedCounter;
         localIp38201FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_FILLER_LEN = 25;
	/**
	 * 	serialize this Ip38201Filler
	 */
   protected void serializeIp38201Filler(char[] ip38201Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201Filler,0,getStringValue(),beginIp38201Filler,IP_38201_FILLER_LEN);
       localIp38201FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp38201Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201Filler() {	 
   		return (substring(getStringValue(),beginIp38201Filler,beginIp38201Filler + IP_38201_FILLER_LEN));
   	}




}
  
