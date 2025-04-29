package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeMapEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeMapEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeMapEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_MAP_ENTRY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504DeStart;
            protected  int beginIp65504DeLngth;
            protected  int beginIp65504DeFirstSubfld;
	
	/**
	* Constructor for Ip65504DeMapEntrySerialized
	**/
    public Ip65504DeMapEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeMapEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeMapEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeMapEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504DeMapEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504DeMapEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_MAP_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504DeStart = getStartOffset() + 0;	// set offset for serialization
  
             beginIp65504DeLngth = getStartOffset() + 2;	// set offset for serialization
  
             beginIp65504DeFirstSubfld = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp65504DeStartCounter = -1;
         public boolean isIp65504DeStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504DeStartCounter != sharedCounter;
            localIp65504DeStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_DE_START_LEN = 2;
  	/**
	 * serializeIp65504DeStart
	 */
	protected void serializeIp65504DeStart(short ip65504DeStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504DeStart,IP_65504_DE_START_LEN)
                  ,beginIp65504DeStart
                  ,IP_65504_DE_START_LEN
                 );
            localIp65504DeStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504DeStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504DeStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504DeStart() {	 
			return (getShort(beginIp65504DeStart));
   	}
         int localIp65504DeLngthCounter = -1;
         public boolean isIp65504DeLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504DeLngthCounter != sharedCounter;
            localIp65504DeLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_DE_LNGTH_LEN = 2;
  	/**
	 * serializeIp65504DeLngth
	 */
	protected void serializeIp65504DeLngth(short ip65504DeLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504DeLngth,IP_65504_DE_LNGTH_LEN)
                  ,beginIp65504DeLngth
                  ,IP_65504_DE_LNGTH_LEN
                 );
            localIp65504DeLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504DeLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504DeLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504DeLngth() {	 
			return (getShort(beginIp65504DeLngth));
   	}
         int localIp65504DeFirstSubfldCounter = -1;
         public boolean isIp65504DeFirstSubfldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504DeFirstSubfldCounter != sharedCounter;
            localIp65504DeFirstSubfldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_DE_FIRST_SUBFLD_LEN = 4;
  	/**
	 * serializeIp65504DeFirstSubfld
	 */
	protected void serializeIp65504DeFirstSubfld(int ip65504DeFirstSubfld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504DeFirstSubfld,IP_65504_DE_FIRST_SUBFLD_LEN)
                  ,beginIp65504DeFirstSubfld
                  ,IP_65504_DE_FIRST_SUBFLD_LEN
                 );
            localIp65504DeFirstSubfldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp65504DeFirstSubfldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp65504DeFirstSubfld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp65504DeFirstSubfld() {	 
			return (getInt(beginIp65504DeFirstSubfld));
   	}




}
  
