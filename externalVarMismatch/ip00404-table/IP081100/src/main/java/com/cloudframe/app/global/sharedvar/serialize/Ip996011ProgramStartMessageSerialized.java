package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip996011ProgramStartMessageSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip996011ProgramStartMessageSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip996011ProgramStartMessageSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_996011_PROGRAM_START_MESSAGE_LENGTH = 69;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp996011PgmId;
            protected  int beginIp996011Dash;
            protected  int beginIp996011PgmVersion;
            protected  int beginIp996011StartedText;
            protected  int beginIp996011CompiledText;
            protected  int beginIp996011WhenCompiled;
            protected  int beginIp996011WhenCompiledX;
	
	/**
	* Constructor for Ip996011ProgramStartMessageSerialized
	**/
    public Ip996011ProgramStartMessageSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip996011ProgramStartMessageSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_996011_PROGRAM_START_MESSAGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp996011PgmId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp996011Dash = getStartOffset() + 8;	// set offset for serialization
  
             beginIp996011PgmVersion = getStartOffset() + 9;	// set offset for serialization
  
             beginIp996011StartedText = getStartOffset() + 16;	// set offset for serialization
  
  
             beginIp996011CompiledText = getStartOffset() + 43;	// set offset for serialization
  
             beginIp996011WhenCompiled = getStartOffset() + 52;	// set offset for serialization
  
             beginIp996011WhenCompiledX = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp996011PgmIdCounter = -1;
     public boolean isIp996011PgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011PgmIdCounter != sharedCounter;
         localIp996011PgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_PGM_ID_LEN = 8;
	/**
	 * 	serialize this Ip996011PgmId
	 */
   protected void serializeIp996011PgmId(char[] ip996011PgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011PgmId,0,getStringValue(),beginIp996011PgmId,IP_996011_PGM_ID_LEN);
       localIp996011PgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011PgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp996011PgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011PgmId() {	 
   		return (substring(getStringValue(),beginIp996011PgmId,beginIp996011PgmId + IP_996011_PGM_ID_LEN));
   	}
     int localIp996011DashCounter = -1;
     public boolean isIp996011DashModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011DashCounter != sharedCounter;
         localIp996011DashCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_DASH_LEN = 1;
	/**
	 * 	serialize this Ip996011Dash
	 */
   protected void serializeIp996011Dash(char[] ip996011Dash) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011Dash,0,getStringValue(),beginIp996011Dash,IP_996011_DASH_LEN);
       localIp996011DashCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011DashConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp996011Dash is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011Dash() {	 
   		return (substring(getStringValue(),beginIp996011Dash,beginIp996011Dash + IP_996011_DASH_LEN));
   	}
     int localIp996011PgmVersionCounter = -1;
     public boolean isIp996011PgmVersionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011PgmVersionCounter != sharedCounter;
         localIp996011PgmVersionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_PGM_VERSION_LEN = 7;
	/**
	 * 	serialize this Ip996011PgmVersion
	 */
   protected void serializeIp996011PgmVersion(char[] ip996011PgmVersion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011PgmVersion,0,getStringValue(),beginIp996011PgmVersion,IP_996011_PGM_VERSION_LEN);
       localIp996011PgmVersionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011PgmVersionConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshIp996011PgmVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011PgmVersion() {	 
   		return (substring(getStringValue(),beginIp996011PgmVersion,beginIp996011PgmVersion + IP_996011_PGM_VERSION_LEN));
   	}
     int localIp996011StartedTextCounter = -1;
     public boolean isIp996011StartedTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartedTextCounter != sharedCounter;
         localIp996011StartedTextCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_STARTED_TEXT_LEN = 8;
	/**
	 * 	serialize this Ip996011StartedText
	 */
   protected void serializeIp996011StartedText(char[] ip996011StartedText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011StartedText,0,getStringValue(),beginIp996011StartedText,IP_996011_STARTED_TEXT_LEN);
       localIp996011StartedTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011StartedTextConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp996011StartedText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011StartedText() {	 
   		return (substring(getStringValue(),beginIp996011StartedText,beginIp996011StartedText + IP_996011_STARTED_TEXT_LEN));
   	}
     int localIp996011CompiledTextCounter = -1;
     public boolean isIp996011CompiledTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011CompiledTextCounter != sharedCounter;
         localIp996011CompiledTextCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_COMPILED_TEXT_LEN = 9;
	/**
	 * 	serialize this Ip996011CompiledText
	 */
   protected void serializeIp996011CompiledText(char[] ip996011CompiledText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011CompiledText,0,getStringValue(),beginIp996011CompiledText,IP_996011_COMPILED_TEXT_LEN);
       localIp996011CompiledTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011CompiledTextConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp996011CompiledText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011CompiledText() {	 
   		return (substring(getStringValue(),beginIp996011CompiledText,beginIp996011CompiledText + IP_996011_COMPILED_TEXT_LEN));
   	}
     int localIp996011WhenCompiledCounter = -1;
     public boolean isIp996011WhenCompiledModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011WhenCompiledCounter != sharedCounter;
         localIp996011WhenCompiledCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_WHEN_COMPILED_LEN = 17;
	/**
	 * 	serialize this Ip996011WhenCompiled
	 */
   protected void serializeIp996011WhenCompiled(char[] ip996011WhenCompiled) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011WhenCompiled,0,getStringValue(),beginIp996011WhenCompiled,IP_996011_WHEN_COMPILED_LEN);
       localIp996011WhenCompiledCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011WhenCompiledConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshIp996011WhenCompiled is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011WhenCompiled() {	 
   		return (substring(getStringValue(),beginIp996011WhenCompiled,beginIp996011WhenCompiled + IP_996011_WHEN_COMPILED_LEN));
   	}
     int localIp996011WhenCompiledXCounter = -1;
     public boolean isIp996011WhenCompiledXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011WhenCompiledXCounter != sharedCounter;
         localIp996011WhenCompiledXCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_WHEN_COMPILED_X_LEN = 17;
	/**
	 * 	serialize this Ip996011WhenCompiledX
	 */
   protected void serializeIp996011WhenCompiledX(char[] ip996011WhenCompiledX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011WhenCompiledX,0,getStringValue(),beginIp996011WhenCompiledX,IP_996011_WHEN_COMPILED_X_LEN);
       localIp996011WhenCompiledXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011WhenCompiledXConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshIp996011WhenCompiledX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011WhenCompiledX() {	 
   		return (substring(getStringValue(),beginIp996011WhenCompiledX,beginIp996011WhenCompiledX + IP_996011_WHEN_COMPILED_X_LEN));
   	}




}
  
