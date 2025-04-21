package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsMapEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsMapEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsMapEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_MAP_ENTRY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504PdsStart;
            protected  int beginIp65504PdsLngth;
            protected  int beginIp65504PdsFirstSubfld;
	
	/**
	* Constructor for Ip65504PdsMapEntrySerialized
	**/
    public Ip65504PdsMapEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsMapEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsMapEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsMapEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsMapEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504PdsMapEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_MAP_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504PdsStart = getStartOffset() + 0;	// set offset for serialization
  
             beginIp65504PdsLngth = getStartOffset() + 2;	// set offset for serialization
  
             beginIp65504PdsFirstSubfld = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp65504PdsStartCounter = -1;
         public boolean isIp65504PdsStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504PdsStartCounter != sharedCounter;
            localIp65504PdsStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_PDS_START_LEN = 2;
  	/**
	 * serializeIp65504PdsStart
	 */
	protected void serializeIp65504PdsStart(short ip65504PdsStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504PdsStart,IP_65504_PDS_START_LEN)
                  ,beginIp65504PdsStart
                  ,IP_65504_PDS_START_LEN
                 );
            localIp65504PdsStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504PdsStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504PdsStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504PdsStart() {	 
			return (getShort(beginIp65504PdsStart));
   	}
         int localIp65504PdsLngthCounter = -1;
         public boolean isIp65504PdsLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504PdsLngthCounter != sharedCounter;
            localIp65504PdsLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_PDS_LNGTH_LEN = 2;
  	/**
	 * serializeIp65504PdsLngth
	 */
	protected void serializeIp65504PdsLngth(short ip65504PdsLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504PdsLngth,IP_65504_PDS_LNGTH_LEN)
                  ,beginIp65504PdsLngth
                  ,IP_65504_PDS_LNGTH_LEN
                 );
            localIp65504PdsLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504PdsLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504PdsLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504PdsLngth() {	 
			return (getShort(beginIp65504PdsLngth));
   	}
         int localIp65504PdsFirstSubfldCounter = -1;
         public boolean isIp65504PdsFirstSubfldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504PdsFirstSubfldCounter != sharedCounter;
            localIp65504PdsFirstSubfldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_PDS_FIRST_SUBFLD_LEN = 4;
  	/**
	 * serializeIp65504PdsFirstSubfld
	 */
	protected void serializeIp65504PdsFirstSubfld(int ip65504PdsFirstSubfld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504PdsFirstSubfld,IP_65504_PDS_FIRST_SUBFLD_LEN)
                  ,beginIp65504PdsFirstSubfld
                  ,IP_65504_PDS_FIRST_SUBFLD_LEN
                 );
            localIp65504PdsFirstSubfldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp65504PdsFirstSubfldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp65504PdsFirstSubfld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp65504PdsFirstSubfld() {	 
			return (getInt(beginIp65504PdsFirstSubfld));
   	}




}
  
