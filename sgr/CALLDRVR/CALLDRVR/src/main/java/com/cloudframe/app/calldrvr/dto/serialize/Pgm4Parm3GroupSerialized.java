package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Pgm4Parm3GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Pgm4Parm3GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pgm4Parm3GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_4_PARM_3_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgm4Parm3;
	
	/**
	* Constructor for Pgm4Parm3GroupSerialized
	**/
    public Pgm4Parm3GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pgm4Parm3GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm3GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pgm4Parm3GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this Pgm4Parm3GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in Pgm4Parm3GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_4_PARM_3_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgm4Parm3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localPgm4Parm3Counter = -1;
        public boolean isPgm4Parm3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPgm4Parm3Counter != sharedCounter;
           localPgm4Parm3Counter = sharedCounter; return hasModified; 
        }
	    public boolean pgm4Parm3IsNumeric() {
	      return decimalIsNumeric(beginPgm4Parm3,PGM_4_PARM_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] pgm4Parm3String() {
            return getPackedString(beginPgm4Parm3,PGM_4_PARM_3_LEN);
         }
   protected static final int PGM_4_PARM_3_LEN = 3;
   protected static final int PGM_4_PARM_3_SCALE = 2;
  	/**
	 * 	serializePgm4Parm3
	 */
	protected void serializePgm4Parm3(BigDecimal pgm4Parm3) {
		   putDecimal(beginPgm4Parm3,pgm4Parm3,PGM_4_PARM_3_LEN,PGM_4_PARM_3_SCALE,true);
		 localPgm4Parm3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPgm4Parm3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshPgm4Parm3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPgm4Parm3() throws CFException {	
   	try { 
		 return (getDecimal(beginPgm4Parm3,PGM_4_PARM_3_LEN,PGM_4_PARM_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("pgm4Parm3", beginPgm4Parm3,PGM_4_PARM_3_LEN);
     }
   	}




}
  
