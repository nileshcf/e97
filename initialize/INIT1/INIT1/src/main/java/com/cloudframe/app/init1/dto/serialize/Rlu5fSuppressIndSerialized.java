package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fSuppressIndSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fSuppressIndSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fSuppressIndSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_SUPPRESS_IND_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fSupSectInd;
	
	/**
	* Constructor for Rlu5fSuppressIndSerialized
	**/
    public Rlu5fSuppressIndSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fSuppressIndSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fSuppressIndSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fSuppressIndSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this Rlu5fSuppressIndSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in Rlu5fSuppressIndSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_SUPPRESS_IND_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fSupSectInd = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRlu5fSupSectIndCounter = -1;
     public boolean isRlu5fSupSectIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fSupSectIndCounter != sharedCounter;
         localRlu5fSupSectIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_SUP_SECT_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fSupSectInd
	 */
   protected void serializeRlu5fSupSectInd(char[] rlu5fSupSectInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fSupSectInd,0,getStringValue(),beginRlu5fSupSectInd,RLU_5F_SUP_SECT_IND_LEN);
       localRlu5fSupSectIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fSupSectIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fSupSectInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fSupSectInd() {	 
   		return (substring(getStringValue(),beginRlu5fSupSectInd,beginRlu5fSupSectInd + RLU_5F_SUP_SECT_IND_LEN));
   	}




}
  
