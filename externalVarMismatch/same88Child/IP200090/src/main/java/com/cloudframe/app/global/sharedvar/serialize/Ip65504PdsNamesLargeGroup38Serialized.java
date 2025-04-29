package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup38Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup38Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup38Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_38_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1148S;
            protected  int beginIp65504P1148L;
            protected  int beginIp65504P1149S;
            protected  int beginIp65504P1149L;
            protected  int beginIp65504P1150S;
            protected  int beginIp65504P1150L;
            protected  int beginIp65504P1151S;
            protected  int beginIp65504P1151L;
            protected  int beginIp65504P1152S;
            protected  int beginIp65504P1152L;
            protected  int beginIp65504P1153S;
            protected  int beginIp65504P1153L;
            protected  int beginIp65504P1154S;
            protected  int beginIp65504P1154L;
            protected  int beginIp65504P1155S;
            protected  int beginIp65504P1155L;
            protected  int beginIp65504P1156S;
            protected  int beginIp65504P1156L;
            protected  int beginIp65504P1157S;
            protected  int beginIp65504P1157L;
            protected  int beginIp65504P1158S;
            protected  int beginIp65504P1158L;
            protected  int beginIp65504P1159S;
            protected  int beginIp65504P1159L;
            protected  int beginIp65504P1160S;
            protected  int beginIp65504P1160L;
            protected  int beginIp65504P1161S;
            protected  int beginIp65504P1161L;
            protected  int beginIp65504P1162S;
            protected  int beginIp65504P1162L;
            protected  int beginIp65504P1163S;
            protected  int beginIp65504P1163L;
            protected  int beginIp65504P1164S;
            protected  int beginIp65504P1164L;
            protected  int beginIp65504P1165S;
            protected  int beginIp65504P1165L;
            protected  int beginIp65504P1166S;
            protected  int beginIp65504P1166L;
            protected  int beginIp65504P1167S;
            protected  int beginIp65504P1167L;
            protected  int beginIp65504P1168S;
            protected  int beginIp65504P1168L;
            protected  int beginIp65504P1169S;
            protected  int beginIp65504P1169L;
            protected  int beginIp65504P1170S;
            protected  int beginIp65504P1170L;
            protected  int beginIp65504P1171S;
            protected  int beginIp65504P1171L;
            protected  int beginIp65504P1172S;
            protected  int beginIp65504P1172L;
            protected  int beginIp65504P1173S;
            protected  int beginIp65504P1173L;
            protected  int beginIp65504P1174S;
            protected  int beginIp65504P1174L;
            protected  int beginIp65504P1175S;
            protected  int beginIp65504P1175L;
            protected  int beginIp65504P1176S;
            protected  int beginIp65504P1176L;
            protected  int beginIp65504P1177S;
            protected  int beginIp65504P1177L;
            protected  int beginIp65504P1178S;
            protected  int beginIp65504P1178L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup38Serialized
	**/
    public Ip65504PdsNamesLargeGroup38Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup38Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup38Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup38Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9172); // serialize this field at offset 9172 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup38Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9172 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup38Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_38_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1148S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1148L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1149S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1149L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1150S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1150L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1151S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1151L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1152S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1152L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1153S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1153L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1154S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1154L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1155S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1155L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1156S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1156L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1157S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1157L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1158S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1158L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1159S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1159L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1160S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1160L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1161S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1161L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1162S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1162L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1163S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1163L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1164S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1164L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1165S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1165L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1166S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1166L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1167S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1167L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1168S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1168L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1169S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1169L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1170S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1170L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1171S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1171L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1172S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1172L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1173S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1173L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1174S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1174L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1175S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1175L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1176S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1176L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1177S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1177L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1178S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1178L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1148SCounter = -1;
         public boolean isIp65504P1148SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1148SCounter != sharedCounter;
            localIp65504P1148SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1148_S_LEN = 2;
  	/**
	 * serializeIp65504P1148S
	 */
	protected void serializeIp65504P1148S(short ip65504P1148S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1148S,IP_65504_P_1148_S_LEN)
                  ,beginIp65504P1148S
                  ,IP_65504_P_1148_S_LEN
                 );
            localIp65504P1148SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1148SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1148S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1148S() {	 
			return (getShort(beginIp65504P1148S));
   	}
         int localIp65504P1148LCounter = -1;
         public boolean isIp65504P1148LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1148LCounter != sharedCounter;
            localIp65504P1148LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1148_L_LEN = 2;
  	/**
	 * serializeIp65504P1148L
	 */
	protected void serializeIp65504P1148L(short ip65504P1148L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1148L,IP_65504_P_1148_L_LEN)
                  ,beginIp65504P1148L
                  ,IP_65504_P_1148_L_LEN
                 );
            localIp65504P1148LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1148LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1148L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1148L() {	 
			return (getShort(beginIp65504P1148L));
   	}
         int localIp65504P1149SCounter = -1;
         public boolean isIp65504P1149SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1149SCounter != sharedCounter;
            localIp65504P1149SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1149_S_LEN = 2;
  	/**
	 * serializeIp65504P1149S
	 */
	protected void serializeIp65504P1149S(short ip65504P1149S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1149S,IP_65504_P_1149_S_LEN)
                  ,beginIp65504P1149S
                  ,IP_65504_P_1149_S_LEN
                 );
            localIp65504P1149SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1149SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1149S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1149S() {	 
			return (getShort(beginIp65504P1149S));
   	}
         int localIp65504P1149LCounter = -1;
         public boolean isIp65504P1149LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1149LCounter != sharedCounter;
            localIp65504P1149LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1149_L_LEN = 2;
  	/**
	 * serializeIp65504P1149L
	 */
	protected void serializeIp65504P1149L(short ip65504P1149L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1149L,IP_65504_P_1149_L_LEN)
                  ,beginIp65504P1149L
                  ,IP_65504_P_1149_L_LEN
                 );
            localIp65504P1149LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1149LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1149L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1149L() {	 
			return (getShort(beginIp65504P1149L));
   	}
         int localIp65504P1150SCounter = -1;
         public boolean isIp65504P1150SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1150SCounter != sharedCounter;
            localIp65504P1150SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1150_S_LEN = 2;
  	/**
	 * serializeIp65504P1150S
	 */
	protected void serializeIp65504P1150S(short ip65504P1150S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1150S,IP_65504_P_1150_S_LEN)
                  ,beginIp65504P1150S
                  ,IP_65504_P_1150_S_LEN
                 );
            localIp65504P1150SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1150SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1150S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1150S() {	 
			return (getShort(beginIp65504P1150S));
   	}
         int localIp65504P1150LCounter = -1;
         public boolean isIp65504P1150LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1150LCounter != sharedCounter;
            localIp65504P1150LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1150_L_LEN = 2;
  	/**
	 * serializeIp65504P1150L
	 */
	protected void serializeIp65504P1150L(short ip65504P1150L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1150L,IP_65504_P_1150_L_LEN)
                  ,beginIp65504P1150L
                  ,IP_65504_P_1150_L_LEN
                 );
            localIp65504P1150LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1150LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1150L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1150L() {	 
			return (getShort(beginIp65504P1150L));
   	}
         int localIp65504P1151SCounter = -1;
         public boolean isIp65504P1151SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1151SCounter != sharedCounter;
            localIp65504P1151SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1151_S_LEN = 2;
  	/**
	 * serializeIp65504P1151S
	 */
	protected void serializeIp65504P1151S(short ip65504P1151S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1151S,IP_65504_P_1151_S_LEN)
                  ,beginIp65504P1151S
                  ,IP_65504_P_1151_S_LEN
                 );
            localIp65504P1151SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1151SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1151S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1151S() {	 
			return (getShort(beginIp65504P1151S));
   	}
         int localIp65504P1151LCounter = -1;
         public boolean isIp65504P1151LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1151LCounter != sharedCounter;
            localIp65504P1151LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1151_L_LEN = 2;
  	/**
	 * serializeIp65504P1151L
	 */
	protected void serializeIp65504P1151L(short ip65504P1151L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1151L,IP_65504_P_1151_L_LEN)
                  ,beginIp65504P1151L
                  ,IP_65504_P_1151_L_LEN
                 );
            localIp65504P1151LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1151LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1151L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1151L() {	 
			return (getShort(beginIp65504P1151L));
   	}
         int localIp65504P1152SCounter = -1;
         public boolean isIp65504P1152SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1152SCounter != sharedCounter;
            localIp65504P1152SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1152_S_LEN = 2;
  	/**
	 * serializeIp65504P1152S
	 */
	protected void serializeIp65504P1152S(short ip65504P1152S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1152S,IP_65504_P_1152_S_LEN)
                  ,beginIp65504P1152S
                  ,IP_65504_P_1152_S_LEN
                 );
            localIp65504P1152SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1152SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1152S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1152S() {	 
			return (getShort(beginIp65504P1152S));
   	}
         int localIp65504P1152LCounter = -1;
         public boolean isIp65504P1152LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1152LCounter != sharedCounter;
            localIp65504P1152LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1152_L_LEN = 2;
  	/**
	 * serializeIp65504P1152L
	 */
	protected void serializeIp65504P1152L(short ip65504P1152L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1152L,IP_65504_P_1152_L_LEN)
                  ,beginIp65504P1152L
                  ,IP_65504_P_1152_L_LEN
                 );
            localIp65504P1152LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1152LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1152L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1152L() {	 
			return (getShort(beginIp65504P1152L));
   	}
         int localIp65504P1153SCounter = -1;
         public boolean isIp65504P1153SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1153SCounter != sharedCounter;
            localIp65504P1153SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1153_S_LEN = 2;
  	/**
	 * serializeIp65504P1153S
	 */
	protected void serializeIp65504P1153S(short ip65504P1153S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1153S,IP_65504_P_1153_S_LEN)
                  ,beginIp65504P1153S
                  ,IP_65504_P_1153_S_LEN
                 );
            localIp65504P1153SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1153SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1153S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1153S() {	 
			return (getShort(beginIp65504P1153S));
   	}
         int localIp65504P1153LCounter = -1;
         public boolean isIp65504P1153LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1153LCounter != sharedCounter;
            localIp65504P1153LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1153_L_LEN = 2;
  	/**
	 * serializeIp65504P1153L
	 */
	protected void serializeIp65504P1153L(short ip65504P1153L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1153L,IP_65504_P_1153_L_LEN)
                  ,beginIp65504P1153L
                  ,IP_65504_P_1153_L_LEN
                 );
            localIp65504P1153LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1153LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1153L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1153L() {	 
			return (getShort(beginIp65504P1153L));
   	}
         int localIp65504P1154SCounter = -1;
         public boolean isIp65504P1154SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1154SCounter != sharedCounter;
            localIp65504P1154SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1154_S_LEN = 2;
  	/**
	 * serializeIp65504P1154S
	 */
	protected void serializeIp65504P1154S(short ip65504P1154S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1154S,IP_65504_P_1154_S_LEN)
                  ,beginIp65504P1154S
                  ,IP_65504_P_1154_S_LEN
                 );
            localIp65504P1154SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1154SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1154S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1154S() {	 
			return (getShort(beginIp65504P1154S));
   	}
         int localIp65504P1154LCounter = -1;
         public boolean isIp65504P1154LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1154LCounter != sharedCounter;
            localIp65504P1154LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1154_L_LEN = 2;
  	/**
	 * serializeIp65504P1154L
	 */
	protected void serializeIp65504P1154L(short ip65504P1154L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1154L,IP_65504_P_1154_L_LEN)
                  ,beginIp65504P1154L
                  ,IP_65504_P_1154_L_LEN
                 );
            localIp65504P1154LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1154LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1154L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1154L() {	 
			return (getShort(beginIp65504P1154L));
   	}
         int localIp65504P1155SCounter = -1;
         public boolean isIp65504P1155SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1155SCounter != sharedCounter;
            localIp65504P1155SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1155_S_LEN = 2;
  	/**
	 * serializeIp65504P1155S
	 */
	protected void serializeIp65504P1155S(short ip65504P1155S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1155S,IP_65504_P_1155_S_LEN)
                  ,beginIp65504P1155S
                  ,IP_65504_P_1155_S_LEN
                 );
            localIp65504P1155SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1155SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1155S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1155S() {	 
			return (getShort(beginIp65504P1155S));
   	}
         int localIp65504P1155LCounter = -1;
         public boolean isIp65504P1155LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1155LCounter != sharedCounter;
            localIp65504P1155LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1155_L_LEN = 2;
  	/**
	 * serializeIp65504P1155L
	 */
	protected void serializeIp65504P1155L(short ip65504P1155L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1155L,IP_65504_P_1155_L_LEN)
                  ,beginIp65504P1155L
                  ,IP_65504_P_1155_L_LEN
                 );
            localIp65504P1155LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1155LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1155L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1155L() {	 
			return (getShort(beginIp65504P1155L));
   	}
         int localIp65504P1156SCounter = -1;
         public boolean isIp65504P1156SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1156SCounter != sharedCounter;
            localIp65504P1156SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1156_S_LEN = 2;
  	/**
	 * serializeIp65504P1156S
	 */
	protected void serializeIp65504P1156S(short ip65504P1156S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1156S,IP_65504_P_1156_S_LEN)
                  ,beginIp65504P1156S
                  ,IP_65504_P_1156_S_LEN
                 );
            localIp65504P1156SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1156SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1156S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1156S() {	 
			return (getShort(beginIp65504P1156S));
   	}
         int localIp65504P1156LCounter = -1;
         public boolean isIp65504P1156LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1156LCounter != sharedCounter;
            localIp65504P1156LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1156_L_LEN = 2;
  	/**
	 * serializeIp65504P1156L
	 */
	protected void serializeIp65504P1156L(short ip65504P1156L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1156L,IP_65504_P_1156_L_LEN)
                  ,beginIp65504P1156L
                  ,IP_65504_P_1156_L_LEN
                 );
            localIp65504P1156LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1156LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1156L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1156L() {	 
			return (getShort(beginIp65504P1156L));
   	}
         int localIp65504P1157SCounter = -1;
         public boolean isIp65504P1157SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1157SCounter != sharedCounter;
            localIp65504P1157SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1157_S_LEN = 2;
  	/**
	 * serializeIp65504P1157S
	 */
	protected void serializeIp65504P1157S(short ip65504P1157S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1157S,IP_65504_P_1157_S_LEN)
                  ,beginIp65504P1157S
                  ,IP_65504_P_1157_S_LEN
                 );
            localIp65504P1157SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1157SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1157S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1157S() {	 
			return (getShort(beginIp65504P1157S));
   	}
         int localIp65504P1157LCounter = -1;
         public boolean isIp65504P1157LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1157LCounter != sharedCounter;
            localIp65504P1157LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1157_L_LEN = 2;
  	/**
	 * serializeIp65504P1157L
	 */
	protected void serializeIp65504P1157L(short ip65504P1157L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1157L,IP_65504_P_1157_L_LEN)
                  ,beginIp65504P1157L
                  ,IP_65504_P_1157_L_LEN
                 );
            localIp65504P1157LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1157LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1157L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1157L() {	 
			return (getShort(beginIp65504P1157L));
   	}
         int localIp65504P1158SCounter = -1;
         public boolean isIp65504P1158SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1158SCounter != sharedCounter;
            localIp65504P1158SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1158_S_LEN = 2;
  	/**
	 * serializeIp65504P1158S
	 */
	protected void serializeIp65504P1158S(short ip65504P1158S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1158S,IP_65504_P_1158_S_LEN)
                  ,beginIp65504P1158S
                  ,IP_65504_P_1158_S_LEN
                 );
            localIp65504P1158SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1158SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1158S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1158S() {	 
			return (getShort(beginIp65504P1158S));
   	}
         int localIp65504P1158LCounter = -1;
         public boolean isIp65504P1158LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1158LCounter != sharedCounter;
            localIp65504P1158LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1158_L_LEN = 2;
  	/**
	 * serializeIp65504P1158L
	 */
	protected void serializeIp65504P1158L(short ip65504P1158L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1158L,IP_65504_P_1158_L_LEN)
                  ,beginIp65504P1158L
                  ,IP_65504_P_1158_L_LEN
                 );
            localIp65504P1158LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1158LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1158L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1158L() {	 
			return (getShort(beginIp65504P1158L));
   	}
         int localIp65504P1159SCounter = -1;
         public boolean isIp65504P1159SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1159SCounter != sharedCounter;
            localIp65504P1159SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1159_S_LEN = 2;
  	/**
	 * serializeIp65504P1159S
	 */
	protected void serializeIp65504P1159S(short ip65504P1159S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1159S,IP_65504_P_1159_S_LEN)
                  ,beginIp65504P1159S
                  ,IP_65504_P_1159_S_LEN
                 );
            localIp65504P1159SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1159SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1159S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1159S() {	 
			return (getShort(beginIp65504P1159S));
   	}
         int localIp65504P1159LCounter = -1;
         public boolean isIp65504P1159LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1159LCounter != sharedCounter;
            localIp65504P1159LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1159_L_LEN = 2;
  	/**
	 * serializeIp65504P1159L
	 */
	protected void serializeIp65504P1159L(short ip65504P1159L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1159L,IP_65504_P_1159_L_LEN)
                  ,beginIp65504P1159L
                  ,IP_65504_P_1159_L_LEN
                 );
            localIp65504P1159LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1159LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1159L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1159L() {	 
			return (getShort(beginIp65504P1159L));
   	}
         int localIp65504P1160SCounter = -1;
         public boolean isIp65504P1160SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1160SCounter != sharedCounter;
            localIp65504P1160SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1160_S_LEN = 2;
  	/**
	 * serializeIp65504P1160S
	 */
	protected void serializeIp65504P1160S(short ip65504P1160S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1160S,IP_65504_P_1160_S_LEN)
                  ,beginIp65504P1160S
                  ,IP_65504_P_1160_S_LEN
                 );
            localIp65504P1160SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1160SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1160S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1160S() {	 
			return (getShort(beginIp65504P1160S));
   	}
         int localIp65504P1160LCounter = -1;
         public boolean isIp65504P1160LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1160LCounter != sharedCounter;
            localIp65504P1160LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1160_L_LEN = 2;
  	/**
	 * serializeIp65504P1160L
	 */
	protected void serializeIp65504P1160L(short ip65504P1160L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1160L,IP_65504_P_1160_L_LEN)
                  ,beginIp65504P1160L
                  ,IP_65504_P_1160_L_LEN
                 );
            localIp65504P1160LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1160LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1160L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1160L() {	 
			return (getShort(beginIp65504P1160L));
   	}
         int localIp65504P1161SCounter = -1;
         public boolean isIp65504P1161SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1161SCounter != sharedCounter;
            localIp65504P1161SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1161_S_LEN = 2;
  	/**
	 * serializeIp65504P1161S
	 */
	protected void serializeIp65504P1161S(short ip65504P1161S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1161S,IP_65504_P_1161_S_LEN)
                  ,beginIp65504P1161S
                  ,IP_65504_P_1161_S_LEN
                 );
            localIp65504P1161SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1161SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1161S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1161S() {	 
			return (getShort(beginIp65504P1161S));
   	}
         int localIp65504P1161LCounter = -1;
         public boolean isIp65504P1161LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1161LCounter != sharedCounter;
            localIp65504P1161LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1161_L_LEN = 2;
  	/**
	 * serializeIp65504P1161L
	 */
	protected void serializeIp65504P1161L(short ip65504P1161L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1161L,IP_65504_P_1161_L_LEN)
                  ,beginIp65504P1161L
                  ,IP_65504_P_1161_L_LEN
                 );
            localIp65504P1161LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1161LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1161L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1161L() {	 
			return (getShort(beginIp65504P1161L));
   	}
         int localIp65504P1162SCounter = -1;
         public boolean isIp65504P1162SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1162SCounter != sharedCounter;
            localIp65504P1162SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1162_S_LEN = 2;
  	/**
	 * serializeIp65504P1162S
	 */
	protected void serializeIp65504P1162S(short ip65504P1162S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1162S,IP_65504_P_1162_S_LEN)
                  ,beginIp65504P1162S
                  ,IP_65504_P_1162_S_LEN
                 );
            localIp65504P1162SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1162SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1162S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1162S() {	 
			return (getShort(beginIp65504P1162S));
   	}
         int localIp65504P1162LCounter = -1;
         public boolean isIp65504P1162LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1162LCounter != sharedCounter;
            localIp65504P1162LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1162_L_LEN = 2;
  	/**
	 * serializeIp65504P1162L
	 */
	protected void serializeIp65504P1162L(short ip65504P1162L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1162L,IP_65504_P_1162_L_LEN)
                  ,beginIp65504P1162L
                  ,IP_65504_P_1162_L_LEN
                 );
            localIp65504P1162LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1162LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1162L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1162L() {	 
			return (getShort(beginIp65504P1162L));
   	}
         int localIp65504P1163SCounter = -1;
         public boolean isIp65504P1163SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1163SCounter != sharedCounter;
            localIp65504P1163SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1163_S_LEN = 2;
  	/**
	 * serializeIp65504P1163S
	 */
	protected void serializeIp65504P1163S(short ip65504P1163S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1163S,IP_65504_P_1163_S_LEN)
                  ,beginIp65504P1163S
                  ,IP_65504_P_1163_S_LEN
                 );
            localIp65504P1163SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1163SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1163S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1163S() {	 
			return (getShort(beginIp65504P1163S));
   	}
         int localIp65504P1163LCounter = -1;
         public boolean isIp65504P1163LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1163LCounter != sharedCounter;
            localIp65504P1163LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1163_L_LEN = 2;
  	/**
	 * serializeIp65504P1163L
	 */
	protected void serializeIp65504P1163L(short ip65504P1163L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1163L,IP_65504_P_1163_L_LEN)
                  ,beginIp65504P1163L
                  ,IP_65504_P_1163_L_LEN
                 );
            localIp65504P1163LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1163LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1163L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1163L() {	 
			return (getShort(beginIp65504P1163L));
   	}
         int localIp65504P1164SCounter = -1;
         public boolean isIp65504P1164SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1164SCounter != sharedCounter;
            localIp65504P1164SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1164_S_LEN = 2;
  	/**
	 * serializeIp65504P1164S
	 */
	protected void serializeIp65504P1164S(short ip65504P1164S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1164S,IP_65504_P_1164_S_LEN)
                  ,beginIp65504P1164S
                  ,IP_65504_P_1164_S_LEN
                 );
            localIp65504P1164SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1164SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1164S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1164S() {	 
			return (getShort(beginIp65504P1164S));
   	}
         int localIp65504P1164LCounter = -1;
         public boolean isIp65504P1164LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1164LCounter != sharedCounter;
            localIp65504P1164LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1164_L_LEN = 2;
  	/**
	 * serializeIp65504P1164L
	 */
	protected void serializeIp65504P1164L(short ip65504P1164L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1164L,IP_65504_P_1164_L_LEN)
                  ,beginIp65504P1164L
                  ,IP_65504_P_1164_L_LEN
                 );
            localIp65504P1164LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1164LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1164L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1164L() {	 
			return (getShort(beginIp65504P1164L));
   	}
         int localIp65504P1165SCounter = -1;
         public boolean isIp65504P1165SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1165SCounter != sharedCounter;
            localIp65504P1165SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1165_S_LEN = 2;
  	/**
	 * serializeIp65504P1165S
	 */
	protected void serializeIp65504P1165S(short ip65504P1165S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1165S,IP_65504_P_1165_S_LEN)
                  ,beginIp65504P1165S
                  ,IP_65504_P_1165_S_LEN
                 );
            localIp65504P1165SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1165SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1165S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1165S() {	 
			return (getShort(beginIp65504P1165S));
   	}
         int localIp65504P1165LCounter = -1;
         public boolean isIp65504P1165LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1165LCounter != sharedCounter;
            localIp65504P1165LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1165_L_LEN = 2;
  	/**
	 * serializeIp65504P1165L
	 */
	protected void serializeIp65504P1165L(short ip65504P1165L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1165L,IP_65504_P_1165_L_LEN)
                  ,beginIp65504P1165L
                  ,IP_65504_P_1165_L_LEN
                 );
            localIp65504P1165LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1165LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1165L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1165L() {	 
			return (getShort(beginIp65504P1165L));
   	}
         int localIp65504P1166SCounter = -1;
         public boolean isIp65504P1166SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1166SCounter != sharedCounter;
            localIp65504P1166SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1166_S_LEN = 2;
  	/**
	 * serializeIp65504P1166S
	 */
	protected void serializeIp65504P1166S(short ip65504P1166S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1166S,IP_65504_P_1166_S_LEN)
                  ,beginIp65504P1166S
                  ,IP_65504_P_1166_S_LEN
                 );
            localIp65504P1166SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1166SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1166S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1166S() {	 
			return (getShort(beginIp65504P1166S));
   	}
         int localIp65504P1166LCounter = -1;
         public boolean isIp65504P1166LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1166LCounter != sharedCounter;
            localIp65504P1166LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1166_L_LEN = 2;
  	/**
	 * serializeIp65504P1166L
	 */
	protected void serializeIp65504P1166L(short ip65504P1166L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1166L,IP_65504_P_1166_L_LEN)
                  ,beginIp65504P1166L
                  ,IP_65504_P_1166_L_LEN
                 );
            localIp65504P1166LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1166LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1166L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1166L() {	 
			return (getShort(beginIp65504P1166L));
   	}
         int localIp65504P1167SCounter = -1;
         public boolean isIp65504P1167SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1167SCounter != sharedCounter;
            localIp65504P1167SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1167_S_LEN = 2;
  	/**
	 * serializeIp65504P1167S
	 */
	protected void serializeIp65504P1167S(short ip65504P1167S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1167S,IP_65504_P_1167_S_LEN)
                  ,beginIp65504P1167S
                  ,IP_65504_P_1167_S_LEN
                 );
            localIp65504P1167SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1167SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1167S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1167S() {	 
			return (getShort(beginIp65504P1167S));
   	}
         int localIp65504P1167LCounter = -1;
         public boolean isIp65504P1167LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1167LCounter != sharedCounter;
            localIp65504P1167LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1167_L_LEN = 2;
  	/**
	 * serializeIp65504P1167L
	 */
	protected void serializeIp65504P1167L(short ip65504P1167L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1167L,IP_65504_P_1167_L_LEN)
                  ,beginIp65504P1167L
                  ,IP_65504_P_1167_L_LEN
                 );
            localIp65504P1167LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1167LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1167L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1167L() {	 
			return (getShort(beginIp65504P1167L));
   	}
         int localIp65504P1168SCounter = -1;
         public boolean isIp65504P1168SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1168SCounter != sharedCounter;
            localIp65504P1168SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1168_S_LEN = 2;
  	/**
	 * serializeIp65504P1168S
	 */
	protected void serializeIp65504P1168S(short ip65504P1168S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1168S,IP_65504_P_1168_S_LEN)
                  ,beginIp65504P1168S
                  ,IP_65504_P_1168_S_LEN
                 );
            localIp65504P1168SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1168SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1168S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1168S() {	 
			return (getShort(beginIp65504P1168S));
   	}
         int localIp65504P1168LCounter = -1;
         public boolean isIp65504P1168LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1168LCounter != sharedCounter;
            localIp65504P1168LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1168_L_LEN = 2;
  	/**
	 * serializeIp65504P1168L
	 */
	protected void serializeIp65504P1168L(short ip65504P1168L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1168L,IP_65504_P_1168_L_LEN)
                  ,beginIp65504P1168L
                  ,IP_65504_P_1168_L_LEN
                 );
            localIp65504P1168LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1168LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1168L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1168L() {	 
			return (getShort(beginIp65504P1168L));
   	}
         int localIp65504P1169SCounter = -1;
         public boolean isIp65504P1169SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1169SCounter != sharedCounter;
            localIp65504P1169SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1169_S_LEN = 2;
  	/**
	 * serializeIp65504P1169S
	 */
	protected void serializeIp65504P1169S(short ip65504P1169S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1169S,IP_65504_P_1169_S_LEN)
                  ,beginIp65504P1169S
                  ,IP_65504_P_1169_S_LEN
                 );
            localIp65504P1169SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1169SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1169S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1169S() {	 
			return (getShort(beginIp65504P1169S));
   	}
         int localIp65504P1169LCounter = -1;
         public boolean isIp65504P1169LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1169LCounter != sharedCounter;
            localIp65504P1169LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1169_L_LEN = 2;
  	/**
	 * serializeIp65504P1169L
	 */
	protected void serializeIp65504P1169L(short ip65504P1169L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1169L,IP_65504_P_1169_L_LEN)
                  ,beginIp65504P1169L
                  ,IP_65504_P_1169_L_LEN
                 );
            localIp65504P1169LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1169LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1169L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1169L() {	 
			return (getShort(beginIp65504P1169L));
   	}
         int localIp65504P1170SCounter = -1;
         public boolean isIp65504P1170SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1170SCounter != sharedCounter;
            localIp65504P1170SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1170_S_LEN = 2;
  	/**
	 * serializeIp65504P1170S
	 */
	protected void serializeIp65504P1170S(short ip65504P1170S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1170S,IP_65504_P_1170_S_LEN)
                  ,beginIp65504P1170S
                  ,IP_65504_P_1170_S_LEN
                 );
            localIp65504P1170SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1170SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1170S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1170S() {	 
			return (getShort(beginIp65504P1170S));
   	}
         int localIp65504P1170LCounter = -1;
         public boolean isIp65504P1170LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1170LCounter != sharedCounter;
            localIp65504P1170LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1170_L_LEN = 2;
  	/**
	 * serializeIp65504P1170L
	 */
	protected void serializeIp65504P1170L(short ip65504P1170L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1170L,IP_65504_P_1170_L_LEN)
                  ,beginIp65504P1170L
                  ,IP_65504_P_1170_L_LEN
                 );
            localIp65504P1170LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1170LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1170L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1170L() {	 
			return (getShort(beginIp65504P1170L));
   	}
         int localIp65504P1171SCounter = -1;
         public boolean isIp65504P1171SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1171SCounter != sharedCounter;
            localIp65504P1171SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1171_S_LEN = 2;
  	/**
	 * serializeIp65504P1171S
	 */
	protected void serializeIp65504P1171S(short ip65504P1171S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1171S,IP_65504_P_1171_S_LEN)
                  ,beginIp65504P1171S
                  ,IP_65504_P_1171_S_LEN
                 );
            localIp65504P1171SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1171SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1171S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1171S() {	 
			return (getShort(beginIp65504P1171S));
   	}
         int localIp65504P1171LCounter = -1;
         public boolean isIp65504P1171LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1171LCounter != sharedCounter;
            localIp65504P1171LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1171_L_LEN = 2;
  	/**
	 * serializeIp65504P1171L
	 */
	protected void serializeIp65504P1171L(short ip65504P1171L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1171L,IP_65504_P_1171_L_LEN)
                  ,beginIp65504P1171L
                  ,IP_65504_P_1171_L_LEN
                 );
            localIp65504P1171LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1171LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1171L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1171L() {	 
			return (getShort(beginIp65504P1171L));
   	}
         int localIp65504P1172SCounter = -1;
         public boolean isIp65504P1172SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1172SCounter != sharedCounter;
            localIp65504P1172SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1172_S_LEN = 2;
  	/**
	 * serializeIp65504P1172S
	 */
	protected void serializeIp65504P1172S(short ip65504P1172S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1172S,IP_65504_P_1172_S_LEN)
                  ,beginIp65504P1172S
                  ,IP_65504_P_1172_S_LEN
                 );
            localIp65504P1172SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1172SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1172S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1172S() {	 
			return (getShort(beginIp65504P1172S));
   	}
         int localIp65504P1172LCounter = -1;
         public boolean isIp65504P1172LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1172LCounter != sharedCounter;
            localIp65504P1172LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1172_L_LEN = 2;
  	/**
	 * serializeIp65504P1172L
	 */
	protected void serializeIp65504P1172L(short ip65504P1172L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1172L,IP_65504_P_1172_L_LEN)
                  ,beginIp65504P1172L
                  ,IP_65504_P_1172_L_LEN
                 );
            localIp65504P1172LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1172LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1172L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1172L() {	 
			return (getShort(beginIp65504P1172L));
   	}
         int localIp65504P1173SCounter = -1;
         public boolean isIp65504P1173SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1173SCounter != sharedCounter;
            localIp65504P1173SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1173_S_LEN = 2;
  	/**
	 * serializeIp65504P1173S
	 */
	protected void serializeIp65504P1173S(short ip65504P1173S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1173S,IP_65504_P_1173_S_LEN)
                  ,beginIp65504P1173S
                  ,IP_65504_P_1173_S_LEN
                 );
            localIp65504P1173SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1173SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1173S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1173S() {	 
			return (getShort(beginIp65504P1173S));
   	}
         int localIp65504P1173LCounter = -1;
         public boolean isIp65504P1173LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1173LCounter != sharedCounter;
            localIp65504P1173LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1173_L_LEN = 2;
  	/**
	 * serializeIp65504P1173L
	 */
	protected void serializeIp65504P1173L(short ip65504P1173L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1173L,IP_65504_P_1173_L_LEN)
                  ,beginIp65504P1173L
                  ,IP_65504_P_1173_L_LEN
                 );
            localIp65504P1173LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1173LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1173L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1173L() {	 
			return (getShort(beginIp65504P1173L));
   	}
         int localIp65504P1174SCounter = -1;
         public boolean isIp65504P1174SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1174SCounter != sharedCounter;
            localIp65504P1174SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1174_S_LEN = 2;
  	/**
	 * serializeIp65504P1174S
	 */
	protected void serializeIp65504P1174S(short ip65504P1174S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1174S,IP_65504_P_1174_S_LEN)
                  ,beginIp65504P1174S
                  ,IP_65504_P_1174_S_LEN
                 );
            localIp65504P1174SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1174SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1174S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1174S() {	 
			return (getShort(beginIp65504P1174S));
   	}
         int localIp65504P1174LCounter = -1;
         public boolean isIp65504P1174LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1174LCounter != sharedCounter;
            localIp65504P1174LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1174_L_LEN = 2;
  	/**
	 * serializeIp65504P1174L
	 */
	protected void serializeIp65504P1174L(short ip65504P1174L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1174L,IP_65504_P_1174_L_LEN)
                  ,beginIp65504P1174L
                  ,IP_65504_P_1174_L_LEN
                 );
            localIp65504P1174LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1174LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1174L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1174L() {	 
			return (getShort(beginIp65504P1174L));
   	}
         int localIp65504P1175SCounter = -1;
         public boolean isIp65504P1175SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1175SCounter != sharedCounter;
            localIp65504P1175SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1175_S_LEN = 2;
  	/**
	 * serializeIp65504P1175S
	 */
	protected void serializeIp65504P1175S(short ip65504P1175S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1175S,IP_65504_P_1175_S_LEN)
                  ,beginIp65504P1175S
                  ,IP_65504_P_1175_S_LEN
                 );
            localIp65504P1175SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1175SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1175S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1175S() {	 
			return (getShort(beginIp65504P1175S));
   	}
         int localIp65504P1175LCounter = -1;
         public boolean isIp65504P1175LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1175LCounter != sharedCounter;
            localIp65504P1175LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1175_L_LEN = 2;
  	/**
	 * serializeIp65504P1175L
	 */
	protected void serializeIp65504P1175L(short ip65504P1175L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1175L,IP_65504_P_1175_L_LEN)
                  ,beginIp65504P1175L
                  ,IP_65504_P_1175_L_LEN
                 );
            localIp65504P1175LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1175LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1175L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1175L() {	 
			return (getShort(beginIp65504P1175L));
   	}
         int localIp65504P1176SCounter = -1;
         public boolean isIp65504P1176SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1176SCounter != sharedCounter;
            localIp65504P1176SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1176_S_LEN = 2;
  	/**
	 * serializeIp65504P1176S
	 */
	protected void serializeIp65504P1176S(short ip65504P1176S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1176S,IP_65504_P_1176_S_LEN)
                  ,beginIp65504P1176S
                  ,IP_65504_P_1176_S_LEN
                 );
            localIp65504P1176SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1176SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1176S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1176S() {	 
			return (getShort(beginIp65504P1176S));
   	}
         int localIp65504P1176LCounter = -1;
         public boolean isIp65504P1176LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1176LCounter != sharedCounter;
            localIp65504P1176LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1176_L_LEN = 2;
  	/**
	 * serializeIp65504P1176L
	 */
	protected void serializeIp65504P1176L(short ip65504P1176L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1176L,IP_65504_P_1176_L_LEN)
                  ,beginIp65504P1176L
                  ,IP_65504_P_1176_L_LEN
                 );
            localIp65504P1176LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1176LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1176L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1176L() {	 
			return (getShort(beginIp65504P1176L));
   	}
         int localIp65504P1177SCounter = -1;
         public boolean isIp65504P1177SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1177SCounter != sharedCounter;
            localIp65504P1177SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1177_S_LEN = 2;
  	/**
	 * serializeIp65504P1177S
	 */
	protected void serializeIp65504P1177S(short ip65504P1177S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1177S,IP_65504_P_1177_S_LEN)
                  ,beginIp65504P1177S
                  ,IP_65504_P_1177_S_LEN
                 );
            localIp65504P1177SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1177SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1177S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1177S() {	 
			return (getShort(beginIp65504P1177S));
   	}
         int localIp65504P1177LCounter = -1;
         public boolean isIp65504P1177LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1177LCounter != sharedCounter;
            localIp65504P1177LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1177_L_LEN = 2;
  	/**
	 * serializeIp65504P1177L
	 */
	protected void serializeIp65504P1177L(short ip65504P1177L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1177L,IP_65504_P_1177_L_LEN)
                  ,beginIp65504P1177L
                  ,IP_65504_P_1177_L_LEN
                 );
            localIp65504P1177LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1177LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1177L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1177L() {	 
			return (getShort(beginIp65504P1177L));
   	}
         int localIp65504P1178SCounter = -1;
         public boolean isIp65504P1178SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1178SCounter != sharedCounter;
            localIp65504P1178SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1178_S_LEN = 2;
  	/**
	 * serializeIp65504P1178S
	 */
	protected void serializeIp65504P1178S(short ip65504P1178S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1178S,IP_65504_P_1178_S_LEN)
                  ,beginIp65504P1178S
                  ,IP_65504_P_1178_S_LEN
                 );
            localIp65504P1178SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1178SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1178S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1178S() {	 
			return (getShort(beginIp65504P1178S));
   	}
         int localIp65504P1178LCounter = -1;
         public boolean isIp65504P1178LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1178LCounter != sharedCounter;
            localIp65504P1178LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1178_L_LEN = 2;
  	/**
	 * serializeIp65504P1178L
	 */
	protected void serializeIp65504P1178L(short ip65504P1178L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1178L,IP_65504_P_1178_L_LEN)
                  ,beginIp65504P1178L
                  ,IP_65504_P_1178_L_LEN
                 );
            localIp65504P1178LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1178LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1178L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1178L() {	 
			return (getShort(beginIp65504P1178L));
   	}




}
  
