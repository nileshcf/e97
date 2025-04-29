package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503PsTimeInSystemSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503PsTimeInSystemSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503PsTimeInSystemSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_PS_TIME_IN_SYSTEM_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503PsTimeInSystemHh;
            protected  int beginSf503PsTimeInSystemMm;
            protected  int beginSf503PsTimeInSystemSs;
	
	/**
	* Constructor for Sf503PsTimeInSystemSerialized
	**/
    public Sf503PsTimeInSystemSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503PsTimeInSystemSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsTimeInSystemSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503PsTimeInSystemSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,126); // serialize this field at offset 126 by default 
    }
    
	/**
	* sets parent for this Sf503PsTimeInSystemSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 126 by default
    }    
	/**
	* initializes the field in Sf503PsTimeInSystemSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_PS_TIME_IN_SYSTEM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503PsTimeInSystemHh = getStartOffset() + 0;	// set offset for serialization
  
             beginSf503PsTimeInSystemMm = getStartOffset() + 2;	// set offset for serialization
  
             beginSf503PsTimeInSystemSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSf503PsTimeInSystemHhCounter = -1;
         public boolean isSf503PsTimeInSystemHhModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503PsTimeInSystemHhCounter != sharedCounter;
            localSf503PsTimeInSystemHhCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_PS_TIME_IN_SYSTEM_HH_LEN = 2;
  	/**
	 * serializeSf503PsTimeInSystemHh
	 */
	protected void serializeSf503PsTimeInSystemHh(int sf503PsTimeInSystemHh) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503PsTimeInSystemHh,SF_503_PS_TIME_IN_SYSTEM_HH_LEN)
                  ,beginSf503PsTimeInSystemHh
                  ,SF_503_PS_TIME_IN_SYSTEM_HH_LEN
                 );
            localSf503PsTimeInSystemHhCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503PsTimeInSystemHhMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503PsTimeInSystemHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503PsTimeInSystemHh() {	 
			return (getUnsignedShort(beginSf503PsTimeInSystemHh));
   	}
         int localSf503PsTimeInSystemMmCounter = -1;
         public boolean isSf503PsTimeInSystemMmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503PsTimeInSystemMmCounter != sharedCounter;
            localSf503PsTimeInSystemMmCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_PS_TIME_IN_SYSTEM_MM_LEN = 2;
  	/**
	 * serializeSf503PsTimeInSystemMm
	 */
	protected void serializeSf503PsTimeInSystemMm(int sf503PsTimeInSystemMm) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503PsTimeInSystemMm,SF_503_PS_TIME_IN_SYSTEM_MM_LEN)
                  ,beginSf503PsTimeInSystemMm
                  ,SF_503_PS_TIME_IN_SYSTEM_MM_LEN
                 );
            localSf503PsTimeInSystemMmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503PsTimeInSystemMmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503PsTimeInSystemMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503PsTimeInSystemMm() {	 
			return (getUnsignedShort(beginSf503PsTimeInSystemMm));
   	}
         int localSf503PsTimeInSystemSsCounter = -1;
         public boolean isSf503PsTimeInSystemSsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503PsTimeInSystemSsCounter != sharedCounter;
            localSf503PsTimeInSystemSsCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_PS_TIME_IN_SYSTEM_SS_LEN = 2;
  	/**
	 * serializeSf503PsTimeInSystemSs
	 */
	protected void serializeSf503PsTimeInSystemSs(int sf503PsTimeInSystemSs) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503PsTimeInSystemSs,SF_503_PS_TIME_IN_SYSTEM_SS_LEN)
                  ,beginSf503PsTimeInSystemSs
                  ,SF_503_PS_TIME_IN_SYSTEM_SS_LEN
                 );
            localSf503PsTimeInSystemSsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503PsTimeInSystemSsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503PsTimeInSystemSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503PsTimeInSystemSs() {	 
			return (getUnsignedShort(beginSf503PsTimeInSystemSs));
   	}




}
  
