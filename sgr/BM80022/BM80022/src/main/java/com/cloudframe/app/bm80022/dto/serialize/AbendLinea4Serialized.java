package com.cloudframe.app.bm80022.dto.serialize;

/**
*  The class AbendLinea4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendLinea4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendLinea4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_LINEA_4_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller6;
            protected  int beginFiller7;
            protected  int beginAbendMensaje;
            protected  int beginFiller8;
	
	/**
	* Constructor for AbendLinea4Serialized
	**/
    public AbendLinea4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendLinea4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_LINEA_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFiller6 = getStartOffset() + 0;	// set offset for serialization
  
             beginFiller7 = getStartOffset() + 1;	// set offset for serialization
  
             beginAbendMensaje = getStartOffset() + 11;	// set offset for serialization
  
             beginFiller8 = getStartOffset() + 79;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFiller6Counter = -1;
     public boolean isFiller6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller6Counter != sharedCounter;
         localFiller6Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_6_LEN = 1;
	/**
	 * 	serialize this Filler6
	 */
   protected void serializeFiller6(char[] filler6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler6,0,getStringValue(),beginFiller6,FILLER_6_LEN);
       localFiller6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller6() {	 
   		return (substring(getStringValue(),beginFiller6,beginFiller6 + FILLER_6_LEN));
   	}
     int localFiller7Counter = -1;
     public boolean isFiller7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller7Counter != sharedCounter;
         localFiller7Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_7_LEN = 10;
	/**
	 * 	serialize this Filler7
	 */
   protected void serializeFiller7(char[] filler7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler7,0,getStringValue(),beginFiller7,FILLER_7_LEN);
       localFiller7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller7Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFiller7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller7() {	 
   		return (substring(getStringValue(),beginFiller7,beginFiller7 + FILLER_7_LEN));
   	}
     int localAbendMensajeCounter = -1;
     public boolean isAbendMensajeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendMensajeCounter != sharedCounter;
         localAbendMensajeCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_MENSAJE_LEN = 68;
	/**
	 * 	serialize this AbendMensaje
	 */
   protected void serializeAbendMensaje(char[] abendMensaje) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendMensaje,0,getStringValue(),beginAbendMensaje,ABEND_MENSAJE_LEN);
       localAbendMensajeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendMensajeConstraints(char[] value) {
   			return super.checkConstraints(value , 68 ,false, false);
   }
    /**
	 *	refreshAbendMensaje is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendMensaje() {	 
   		return (substring(getStringValue(),beginAbendMensaje,beginAbendMensaje + ABEND_MENSAJE_LEN));
   	}
     int localFiller8Counter = -1;
     public boolean isFiller8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller8Counter != sharedCounter;
         localFiller8Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_8_LEN = 1;
	/**
	 * 	serialize this Filler8
	 */
   protected void serializeFiller8(char[] filler8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler8,0,getStringValue(),beginFiller8,FILLER_8_LEN);
       localFiller8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller8Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller8() {	 
   		return (substring(getStringValue(),beginFiller8,beginFiller8 + FILLER_8_LEN));
   	}




}
  
