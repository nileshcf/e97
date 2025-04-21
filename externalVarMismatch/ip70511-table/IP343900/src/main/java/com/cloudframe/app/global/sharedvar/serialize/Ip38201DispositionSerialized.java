package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip38201DispositionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip38201DispositionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip38201DispositionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_38201_DISPOSITION_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp38201DispBeginParm;
            protected  int beginIp38201DispNormalParm;
            protected  int beginIp38201DispAbnormalParm;
	
	/**
	* Constructor for Ip38201DispositionSerialized
	**/
    public Ip38201DispositionSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip38201DispositionSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201DispositionSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip38201DispositionSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,53); // serialize this field at offset 53 by default 
    }
    
	/**
	* sets parent for this Ip38201DispositionSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 53 by default
    }    
	/**
	* initializes the field in Ip38201DispositionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_38201_DISPOSITION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp38201DispBeginParm = getStartOffset() + 0;	// set offset for serialization
  
             beginIp38201DispNormalParm = getStartOffset() + 1;	// set offset for serialization
  
             beginIp38201DispAbnormalParm = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp38201DispBeginParmCounter = -1;
     public boolean isIp38201DispBeginParmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DispBeginParmCounter != sharedCounter;
         localIp38201DispBeginParmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DISP_BEGIN_PARM_LEN = 1;
	/**
	 * 	serialize this Ip38201DispBeginParm
	 */
   protected void serializeIp38201DispBeginParm(char[] ip38201DispBeginParm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201DispBeginParm,0,getStringValue(),beginIp38201DispBeginParm,IP_38201_DISP_BEGIN_PARM_LEN);
       localIp38201DispBeginParmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DispBeginParmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201DispBeginParm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201DispBeginParm() {	 
   		return (substring(getStringValue(),beginIp38201DispBeginParm,beginIp38201DispBeginParm + IP_38201_DISP_BEGIN_PARM_LEN));
   	}
     int localIp38201DispNormalParmCounter = -1;
     public boolean isIp38201DispNormalParmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DispNormalParmCounter != sharedCounter;
         localIp38201DispNormalParmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DISP_NORMAL_PARM_LEN = 1;
	/**
	 * 	serialize this Ip38201DispNormalParm
	 */
   protected void serializeIp38201DispNormalParm(char[] ip38201DispNormalParm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201DispNormalParm,0,getStringValue(),beginIp38201DispNormalParm,IP_38201_DISP_NORMAL_PARM_LEN);
       localIp38201DispNormalParmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DispNormalParmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201DispNormalParm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201DispNormalParm() {	 
   		return (substring(getStringValue(),beginIp38201DispNormalParm,beginIp38201DispNormalParm + IP_38201_DISP_NORMAL_PARM_LEN));
   	}
     int localIp38201DispAbnormalParmCounter = -1;
     public boolean isIp38201DispAbnormalParmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DispAbnormalParmCounter != sharedCounter;
         localIp38201DispAbnormalParmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DISP_ABNORMAL_PARM_LEN = 1;
	/**
	 * 	serialize this Ip38201DispAbnormalParm
	 */
   protected void serializeIp38201DispAbnormalParm(char[] ip38201DispAbnormalParm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201DispAbnormalParm,0,getStringValue(),beginIp38201DispAbnormalParm,IP_38201_DISP_ABNORMAL_PARM_LEN);
       localIp38201DispAbnormalParmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DispAbnormalParmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201DispAbnormalParm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201DispAbnormalParm() {	 
   		return (substring(getStringValue(),beginIp38201DispAbnormalParm,beginIp38201DispAbnormalParm + IP_38201_DISP_ABNORMAL_PARM_LEN));
   	}




}
  
