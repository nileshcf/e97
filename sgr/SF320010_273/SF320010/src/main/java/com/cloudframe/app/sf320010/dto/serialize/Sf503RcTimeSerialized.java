package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503RcTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503RcTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503RcTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_RC_TIME_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503RcTimeHh;
            protected  int beginSf503RcTimeMm;
            protected  int beginSf503RcTimeSs;
	
	/**
	* Constructor for Sf503RcTimeSerialized
	**/
    public Sf503RcTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503RcTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RcTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503RcTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,30); // serialize this field at offset 30 by default 
    }
    
	/**
	* sets parent for this Sf503RcTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 30 by default
    }    
	/**
	* initializes the field in Sf503RcTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_RC_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503RcTimeHh = getStartOffset() + 0;	// set offset for serialization
  
             beginSf503RcTimeMm = getStartOffset() + 2;	// set offset for serialization
  
             beginSf503RcTimeSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSf503RcTimeHhCounter = -1;
         public boolean isSf503RcTimeHhModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503RcTimeHhCounter != sharedCounter;
            localSf503RcTimeHhCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_RC_TIME_HH_LEN = 2;
  	/**
	 * serializeSf503RcTimeHh
	 */
	protected void serializeSf503RcTimeHh(int sf503RcTimeHh) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503RcTimeHh,SF_503_RC_TIME_HH_LEN)
                  ,beginSf503RcTimeHh
                  ,SF_503_RC_TIME_HH_LEN
                 );
            localSf503RcTimeHhCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503RcTimeHhMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503RcTimeHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503RcTimeHh() {	 
			return (getUnsignedShort(beginSf503RcTimeHh));
   	}
         int localSf503RcTimeMmCounter = -1;
         public boolean isSf503RcTimeMmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503RcTimeMmCounter != sharedCounter;
            localSf503RcTimeMmCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_RC_TIME_MM_LEN = 2;
  	/**
	 * serializeSf503RcTimeMm
	 */
	protected void serializeSf503RcTimeMm(int sf503RcTimeMm) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503RcTimeMm,SF_503_RC_TIME_MM_LEN)
                  ,beginSf503RcTimeMm
                  ,SF_503_RC_TIME_MM_LEN
                 );
            localSf503RcTimeMmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503RcTimeMmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503RcTimeMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503RcTimeMm() {	 
			return (getUnsignedShort(beginSf503RcTimeMm));
   	}
         int localSf503RcTimeSsCounter = -1;
         public boolean isSf503RcTimeSsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503RcTimeSsCounter != sharedCounter;
            localSf503RcTimeSsCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_RC_TIME_SS_LEN = 2;
  	/**
	 * serializeSf503RcTimeSs
	 */
	protected void serializeSf503RcTimeSs(int sf503RcTimeSs) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503RcTimeSs,SF_503_RC_TIME_SS_LEN)
                  ,beginSf503RcTimeSs
                  ,SF_503_RC_TIME_SS_LEN
                 );
            localSf503RcTimeSsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503RcTimeSsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503RcTimeSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503RcTimeSs() {	 
			return (getUnsignedShort(beginSf503RcTimeSs));
   	}




}
  
