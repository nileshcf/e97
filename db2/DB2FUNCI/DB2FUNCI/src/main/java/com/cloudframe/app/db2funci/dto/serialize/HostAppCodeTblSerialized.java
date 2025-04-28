package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class HostAppCodeTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HostAppCodeTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HostAppCodeTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOST_APP_CODE_TBL_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHostAppCode01;
            protected  int beginHostAppCode02;
            protected  int beginHostAppCode03;
            protected  int beginHostAppCode04;
            protected  int beginHostAppCode05;
            protected  int beginHostAppCode06;
            protected  int beginHostAppCode07;
	
	/**
	* Constructor for HostAppCodeTblSerialized
	**/
    public HostAppCodeTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HostAppCodeTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HostAppCodeTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HostAppCodeTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this HostAppCodeTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in HostAppCodeTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOST_APP_CODE_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHostAppCode01 = getStartOffset() + 0;	// set offset for serialization
  
             beginHostAppCode02 = getStartOffset() + 3;	// set offset for serialization
  
             beginHostAppCode03 = getStartOffset() + 6;	// set offset for serialization
  
             beginHostAppCode04 = getStartOffset() + 9;	// set offset for serialization
  
             beginHostAppCode05 = getStartOffset() + 12;	// set offset for serialization
  
             beginHostAppCode06 = getStartOffset() + 15;	// set offset for serialization
  
             beginHostAppCode07 = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHostAppCode01Counter = -1;
     public boolean isHostAppCode01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode01Counter != sharedCounter;
         localHostAppCode01Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_01_LEN = 3;
	/**
	 * 	serialize this HostAppCode01
	 */
   protected void serializeHostAppCode01(char[] hostAppCode01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode01,0,getStringValue(),beginHostAppCode01,HOST_APP_CODE_01_LEN);
       localHostAppCode01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode01Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode01() {	 
   		return (substring(getStringValue(),beginHostAppCode01,beginHostAppCode01 + HOST_APP_CODE_01_LEN));
   	}
     int localHostAppCode02Counter = -1;
     public boolean isHostAppCode02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode02Counter != sharedCounter;
         localHostAppCode02Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_02_LEN = 3;
	/**
	 * 	serialize this HostAppCode02
	 */
   protected void serializeHostAppCode02(char[] hostAppCode02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode02,0,getStringValue(),beginHostAppCode02,HOST_APP_CODE_02_LEN);
       localHostAppCode02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode02Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode02() {	 
   		return (substring(getStringValue(),beginHostAppCode02,beginHostAppCode02 + HOST_APP_CODE_02_LEN));
   	}
     int localHostAppCode03Counter = -1;
     public boolean isHostAppCode03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode03Counter != sharedCounter;
         localHostAppCode03Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_03_LEN = 3;
	/**
	 * 	serialize this HostAppCode03
	 */
   protected void serializeHostAppCode03(char[] hostAppCode03) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode03,0,getStringValue(),beginHostAppCode03,HOST_APP_CODE_03_LEN);
       localHostAppCode03Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode03Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode03 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode03() {	 
   		return (substring(getStringValue(),beginHostAppCode03,beginHostAppCode03 + HOST_APP_CODE_03_LEN));
   	}
     int localHostAppCode04Counter = -1;
     public boolean isHostAppCode04Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode04Counter != sharedCounter;
         localHostAppCode04Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_04_LEN = 3;
	/**
	 * 	serialize this HostAppCode04
	 */
   protected void serializeHostAppCode04(char[] hostAppCode04) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode04,0,getStringValue(),beginHostAppCode04,HOST_APP_CODE_04_LEN);
       localHostAppCode04Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode04Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode04 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode04() {	 
   		return (substring(getStringValue(),beginHostAppCode04,beginHostAppCode04 + HOST_APP_CODE_04_LEN));
   	}
     int localHostAppCode05Counter = -1;
     public boolean isHostAppCode05Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode05Counter != sharedCounter;
         localHostAppCode05Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_05_LEN = 3;
	/**
	 * 	serialize this HostAppCode05
	 */
   protected void serializeHostAppCode05(char[] hostAppCode05) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode05,0,getStringValue(),beginHostAppCode05,HOST_APP_CODE_05_LEN);
       localHostAppCode05Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode05Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode05 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode05() {	 
   		return (substring(getStringValue(),beginHostAppCode05,beginHostAppCode05 + HOST_APP_CODE_05_LEN));
   	}
     int localHostAppCode06Counter = -1;
     public boolean isHostAppCode06Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode06Counter != sharedCounter;
         localHostAppCode06Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_06_LEN = 3;
	/**
	 * 	serialize this HostAppCode06
	 */
   protected void serializeHostAppCode06(char[] hostAppCode06) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode06,0,getStringValue(),beginHostAppCode06,HOST_APP_CODE_06_LEN);
       localHostAppCode06Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode06Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode06 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode06() {	 
   		return (substring(getStringValue(),beginHostAppCode06,beginHostAppCode06 + HOST_APP_CODE_06_LEN));
   	}
     int localHostAppCode07Counter = -1;
     public boolean isHostAppCode07Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHostAppCode07Counter != sharedCounter;
         localHostAppCode07Counter = sharedCounter; return hasModified;
     }
	protected static final int HOST_APP_CODE_07_LEN = 3;
	/**
	 * 	serialize this HostAppCode07
	 */
   protected void serializeHostAppCode07(char[] hostAppCode07) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hostAppCode07,0,getStringValue(),beginHostAppCode07,HOST_APP_CODE_07_LEN);
       localHostAppCode07Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHostAppCode07Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHostAppCode07 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHostAppCode07() {	 
   		return (substring(getStringValue(),beginHostAppCode07,beginHostAppCode07 + HOST_APP_CODE_07_LEN));
   	}




}
  
