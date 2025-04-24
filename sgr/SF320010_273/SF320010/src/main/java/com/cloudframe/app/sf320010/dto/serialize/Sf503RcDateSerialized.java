package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503RcDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503RcDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503RcDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_RC_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503RcDateMm;
            protected  int beginSf503RcDateDd;
            protected  int beginSf503RcDateYy;
	
	/**
	* Constructor for Sf503RcDateSerialized
	**/
    public Sf503RcDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503RcDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RcDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503RcDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,36); // serialize this field at offset 36 by default 
    }
    
	/**
	* sets parent for this Sf503RcDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 36 by default
    }    
	/**
	* initializes the field in Sf503RcDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_RC_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503RcDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginSf503RcDateDd = getStartOffset() + 2;	// set offset for serialization
  
             beginSf503RcDateYy = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSf503RcDateMmCounter = -1;
         public boolean isSf503RcDateMmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503RcDateMmCounter != sharedCounter;
            localSf503RcDateMmCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_RC_DATE_MM_LEN = 2;
  	/**
	 * serializeSf503RcDateMm
	 */
	protected void serializeSf503RcDateMm(int sf503RcDateMm) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503RcDateMm,SF_503_RC_DATE_MM_LEN)
                  ,beginSf503RcDateMm
                  ,SF_503_RC_DATE_MM_LEN
                 );
            localSf503RcDateMmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503RcDateMmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503RcDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503RcDateMm() {	 
			return (getUnsignedShort(beginSf503RcDateMm));
   	}
         int localSf503RcDateDdCounter = -1;
         public boolean isSf503RcDateDdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503RcDateDdCounter != sharedCounter;
            localSf503RcDateDdCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_RC_DATE_DD_LEN = 2;
  	/**
	 * serializeSf503RcDateDd
	 */
	protected void serializeSf503RcDateDd(int sf503RcDateDd) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503RcDateDd,SF_503_RC_DATE_DD_LEN)
                  ,beginSf503RcDateDd
                  ,SF_503_RC_DATE_DD_LEN
                 );
            localSf503RcDateDdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503RcDateDdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503RcDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503RcDateDd() {	 
			return (getUnsignedShort(beginSf503RcDateDd));
   	}
         int localSf503RcDateYyCounter = -1;
         public boolean isSf503RcDateYyModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503RcDateYyCounter != sharedCounter;
            localSf503RcDateYyCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_RC_DATE_YY_LEN = 2;
  	/**
	 * serializeSf503RcDateYy
	 */
	protected void serializeSf503RcDateYy(int sf503RcDateYy) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503RcDateYy,SF_503_RC_DATE_YY_LEN)
                  ,beginSf503RcDateYy
                  ,SF_503_RC_DATE_YY_LEN
                 );
            localSf503RcDateYyCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503RcDateYyMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503RcDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503RcDateYy() {	 
			return (getUnsignedShort(beginSf503RcDateYy));
   	}




}
  
