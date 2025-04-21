package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoCnvDteCcyymmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf31IsoCnvDteCcyymmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoCnvDteCcyymmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_CNV_DTE_CCYYMMDD_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf31IsoCnvDteCc;
            protected  int beginSf31IsoCnvDteYy;
            protected  int beginSf31IsoDe16CnvDteMmdd;
	
	/**
	* Constructor for Sf31IsoCnvDteCcyymmddSerialized
	**/
    public Sf31IsoCnvDteCcyymmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf31IsoCnvDteCcyymmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoCnvDteCcyymmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf31IsoCnvDteCcyymmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,561); // serialize this field at offset 561 by default 
    }
    
	/**
	* sets parent for this Sf31IsoCnvDteCcyymmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 561 by default
    }    
	/**
	* initializes the field in Sf31IsoCnvDteCcyymmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_CNV_DTE_CCYYMMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf31IsoCnvDteCc = getStartOffset() + 0;	// set offset for serialization
  
             beginSf31IsoCnvDteYy = getStartOffset() + 2;	// set offset for serialization
  
             beginSf31IsoDe16CnvDteMmdd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf31IsoCnvDteCcCounter = -1;
     public boolean isSf31IsoCnvDteCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoCnvDteCcCounter != sharedCounter;
         localSf31IsoCnvDteCcCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_CNV_DTE_CC_LEN = 2;
	/**
	 * 	serialize this Sf31IsoCnvDteCc
	 */
   protected void serializeSf31IsoCnvDteCc(char[] sf31IsoCnvDteCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoCnvDteCc,0,getStringValue(),beginSf31IsoCnvDteCc,SF_31_ISO_CNV_DTE_CC_LEN);
       localSf31IsoCnvDteCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoCnvDteCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoCnvDteCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoCnvDteCc() {	 
   		return (substring(getStringValue(),beginSf31IsoCnvDteCc,beginSf31IsoCnvDteCc + SF_31_ISO_CNV_DTE_CC_LEN));
   	}
     int localSf31IsoCnvDteYyCounter = -1;
     public boolean isSf31IsoCnvDteYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoCnvDteYyCounter != sharedCounter;
         localSf31IsoCnvDteYyCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_CNV_DTE_YY_LEN = 2;
	/**
	 * 	serialize this Sf31IsoCnvDteYy
	 */
   protected void serializeSf31IsoCnvDteYy(char[] sf31IsoCnvDteYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoCnvDteYy,0,getStringValue(),beginSf31IsoCnvDteYy,SF_31_ISO_CNV_DTE_YY_LEN);
       localSf31IsoCnvDteYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoCnvDteYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoCnvDteYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoCnvDteYy() {	 
   		return (substring(getStringValue(),beginSf31IsoCnvDteYy,beginSf31IsoCnvDteYy + SF_31_ISO_CNV_DTE_YY_LEN));
   	}
     int localSf31IsoDe16CnvDteMmddCounter = -1;
     public boolean isSf31IsoDe16CnvDteMmddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe16CnvDteMmddCounter != sharedCounter;
         localSf31IsoDe16CnvDteMmddCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_16_CNV_DTE_MMDD_LEN = 4;
	/**
	 * 	serialize this Sf31IsoDe16CnvDteMmdd
	 */
   protected void serializeSf31IsoDe16CnvDteMmdd(char[] sf31IsoDe16CnvDteMmdd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe16CnvDteMmdd,0,getStringValue(),beginSf31IsoDe16CnvDteMmdd,SF_31_ISO_DE_16_CNV_DTE_MMDD_LEN);
       localSf31IsoDe16CnvDteMmddCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe16CnvDteMmddConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe16CnvDteMmdd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe16CnvDteMmdd() {	 
   		return (substring(getStringValue(),beginSf31IsoDe16CnvDteMmdd,beginSf31IsoDe16CnvDteMmdd + SF_31_ISO_DE_16_CNV_DTE_MMDD_LEN));
   	}




}
  
