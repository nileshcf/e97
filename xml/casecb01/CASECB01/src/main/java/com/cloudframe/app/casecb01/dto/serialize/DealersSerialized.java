package com.cloudframe.app.casecb01.dto.serialize;

/**
*  The class DealersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DealersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DealersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DEALERS_LENGTH = 4948;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDealername;
           protected int beginLocations;
           protected static final int LOCATIONS_SIZE = 3;
            protected  int beginMakecounter;
           protected int beginManufacturers;
           protected static final int MANUFACTURERS_SIZE = 4;
	
	/**
	* Constructor for DealersSerialized
	**/
    public DealersSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DealersSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DealersSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DealersSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this DealersSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in DealersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DEALERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDealername = getStartOffset() + 0;	// set offset for serialization
  
	        beginLocations = getStartOffset() + 30; // set offset for serialization
  
             beginMakecounter = getStartOffset() + 126;	// set offset for serialization
  
	        beginManufacturers = getStartOffset() + 128; // set offset for serialization
  
	   /*  end of offset */
	}
     int localDealernameCounter = -1;
     public boolean isDealernameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDealernameCounter != sharedCounter;
         localDealernameCounter = sharedCounter; return hasModified;
     }
	protected static final int DEALERNAME_LEN = 30;
	/**
	 * 	serialize this Dealername
	 */
   protected void serializeDealername(char[] dealername) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dealername,0,getStringValue(),beginDealername,DEALERNAME_LEN);
       localDealernameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDealernameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshDealername is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDealername() {	 
   		return (substring(getStringValue(),beginDealername,beginDealername + DEALERNAME_LEN));
   	}
         int localMakecounterCounter = -1;
         public boolean isMakecounterModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMakecounterCounter != sharedCounter;
            localMakecounterCounter = sharedCounter; return hasModified; 
         }
   protected static final int MAKECOUNTER_LEN = 2;
  	/**
	 * serializeMakecounter
	 */
	protected void serializeMakecounter(short makecounter) {
           replaceValue( //  save the value as string
                   getBinaryString( makecounter,MAKECOUNTER_LEN)
                  ,beginMakecounter
                  ,MAKECOUNTER_LEN
                 );
            localMakecounterCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMakecounterMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMakecounter is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMakecounter() {	 
			return (getShort(beginMakecounter));
   	}

		public int locationsSize() {
			return LOCATIONS_SIZE;
		}
		public int manufacturersSize() {
			return MANUFACTURERS_SIZE;
		}



}
  
