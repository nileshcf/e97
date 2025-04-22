package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00321CurrEditInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00321CurrEditInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00321CurrEditInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00321_CURR_EDIT_INFO_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00321EditType;
            protected  int beginIp00321EditModule;
            protected  int beginIp00321EditModulePtr;
            protected  int beginIp00321ModuleLocationInd;
            protected  int beginIp00321BypEditIrddrvSrv;
	
	/**
	* Constructor for Ip00321CurrEditInfoSerialized
	**/
    public Ip00321CurrEditInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00321CurrEditInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321CurrEditInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00321CurrEditInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,176004); // serialize this field at offset 176004 by default 
    }
    
	/**
	* sets parent for this Ip00321CurrEditInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 176004 by default
    }    
	/**
	* initializes the field in Ip00321CurrEditInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00321_CURR_EDIT_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00321EditType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00321EditModule = getStartOffset() + 1;	// set offset for serialization
  
             beginIp00321EditModulePtr = getStartOffset() + 9;	// set offset for serialization
  
  
             beginIp00321ModuleLocationInd = getStartOffset() + 36;	// set offset for serialization
  
  
             beginIp00321BypEditIrddrvSrv = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00321EditTypeCounter = -1;
     public boolean isIp00321EditTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321EditTypeCounter != sharedCounter;
         localIp00321EditTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00321_EDIT_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip00321EditType
	 */
   protected void serializeIp00321EditType(char[] ip00321EditType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00321EditType,0,getStringValue(),beginIp00321EditType,IP_00321_EDIT_TYPE_LEN);
       localIp00321EditTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00321EditTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00321EditType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00321EditType() {	 
   		return (substring(getStringValue(),beginIp00321EditType,beginIp00321EditType + IP_00321_EDIT_TYPE_LEN));
   	}
     int localIp00321EditModuleCounter = -1;
     public boolean isIp00321EditModuleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321EditModuleCounter != sharedCounter;
         localIp00321EditModuleCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00321_EDIT_MODULE_LEN = 8;
	/**
	 * 	serialize this Ip00321EditModule
	 */
   protected void serializeIp00321EditModule(char[] ip00321EditModule) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00321EditModule,0,getStringValue(),beginIp00321EditModule,IP_00321_EDIT_MODULE_LEN);
       localIp00321EditModuleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00321EditModuleConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp00321EditModule is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00321EditModule() {	 
   		return (substring(getStringValue(),beginIp00321EditModule,beginIp00321EditModule + IP_00321_EDIT_MODULE_LEN));
   	}
     int localIp00321EditModulePtrCounter = -1;
     public boolean isIp00321EditModulePtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321EditModulePtrCounter != sharedCounter;
         localIp00321EditModulePtrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00321_EDIT_MODULE_PTR_LEN = 8;
	/**
	 * 	serialize this Ip00321EditModulePtr
	 */
   protected void serializeIp00321EditModulePtr(char[] ip00321EditModulePtr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00321EditModulePtr,0,getStringValue(),beginIp00321EditModulePtr,IP_00321_EDIT_MODULE_PTR_LEN);
       localIp00321EditModulePtrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00321EditModulePtrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp00321EditModulePtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00321EditModulePtr() {	 
   		return (substring(getStringValue(),beginIp00321EditModulePtr,beginIp00321EditModulePtr + IP_00321_EDIT_MODULE_PTR_LEN));
   	}
     int localIp00321ModuleLocationIndCounter = -1;
     public boolean isIp00321ModuleLocationIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ModuleLocationIndCounter != sharedCounter;
         localIp00321ModuleLocationIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00321_MODULE_LOCATION_IND_LEN = 1;
	/**
	 * 	serialize this Ip00321ModuleLocationInd
	 */
   protected void serializeIp00321ModuleLocationInd(char[] ip00321ModuleLocationInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00321ModuleLocationInd,0,getStringValue(),beginIp00321ModuleLocationInd,IP_00321_MODULE_LOCATION_IND_LEN);
       localIp00321ModuleLocationIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00321ModuleLocationIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00321ModuleLocationInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00321ModuleLocationInd() {	 
   		return (substring(getStringValue(),beginIp00321ModuleLocationInd,beginIp00321ModuleLocationInd + IP_00321_MODULE_LOCATION_IND_LEN));
   	}
     int localIp00321BypEditIrddrvSrvCounter = -1;
     public boolean isIp00321BypEditIrddrvSrvModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321BypEditIrddrvSrvCounter != sharedCounter;
         localIp00321BypEditIrddrvSrvCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00321_BYP_EDIT_IRDDRV_SRV_LEN = 1;
	/**
	 * 	serialize this Ip00321BypEditIrddrvSrv
	 */
   protected void serializeIp00321BypEditIrddrvSrv(char[] ip00321BypEditIrddrvSrv) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00321BypEditIrddrvSrv,0,getStringValue(),beginIp00321BypEditIrddrvSrv,IP_00321_BYP_EDIT_IRDDRV_SRV_LEN);
       localIp00321BypEditIrddrvSrvCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00321BypEditIrddrvSrvConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00321BypEditIrddrvSrv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00321BypEditIrddrvSrv() {	 
   		return (substring(getStringValue(),beginIp00321BypEditIrddrvSrv,beginIp00321BypEditIrddrvSrv + IP_00321_BYP_EDIT_IRDDRV_SRV_LEN));
   	}




}
  
