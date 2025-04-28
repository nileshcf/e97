package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup39Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup39Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup39Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_39_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1179S;
            protected  int beginIp65504P1179L;
            protected  int beginIp65504P1180S;
            protected  int beginIp65504P1180L;
            protected  int beginIp65504P1181S;
            protected  int beginIp65504P1181L;
            protected  int beginIp65504P1182S;
            protected  int beginIp65504P1182L;
            protected  int beginIp65504P1183S;
            protected  int beginIp65504P1183L;
            protected  int beginIp65504P1184S;
            protected  int beginIp65504P1184L;
            protected  int beginIp65504P1185S;
            protected  int beginIp65504P1185L;
            protected  int beginIp65504P1186S;
            protected  int beginIp65504P1186L;
            protected  int beginIp65504P1187S;
            protected  int beginIp65504P1187L;
            protected  int beginIp65504P1188S;
            protected  int beginIp65504P1188L;
            protected  int beginIp65504P1189S;
            protected  int beginIp65504P1189L;
            protected  int beginIp65504P1190S;
            protected  int beginIp65504P1190L;
            protected  int beginIp65504P1191S;
            protected  int beginIp65504P1191L;
            protected  int beginIp65504P1192S;
            protected  int beginIp65504P1192L;
            protected  int beginIp65504P1193S;
            protected  int beginIp65504P1193L;
            protected  int beginIp65504P1194S;
            protected  int beginIp65504P1194L;
            protected  int beginIp65504P1195S;
            protected  int beginIp65504P1195L;
            protected  int beginIp65504P1196S;
            protected  int beginIp65504P1196L;
            protected  int beginIp65504P1197S;
            protected  int beginIp65504P1197L;
            protected  int beginIp65504P1198S;
            protected  int beginIp65504P1198L;
            protected  int beginIp65504P1199S;
            protected  int beginIp65504P1199L;
            protected  int beginIp65504P1200S;
            protected  int beginIp65504P1200L;
            protected  int beginIp65504P1201S;
            protected  int beginIp65504P1201L;
            protected  int beginIp65504P1202S;
            protected  int beginIp65504P1202L;
            protected  int beginIp65504P1203S;
            protected  int beginIp65504P1203L;
            protected  int beginIp65504P1204S;
            protected  int beginIp65504P1204L;
            protected  int beginIp65504P1205S;
            protected  int beginIp65504P1205L;
            protected  int beginIp65504P1206S;
            protected  int beginIp65504P1206L;
            protected  int beginIp65504P1207S;
            protected  int beginIp65504P1207L;
            protected  int beginIp65504P1208S;
            protected  int beginIp65504P1208L;
            protected  int beginIp65504P1209S;
            protected  int beginIp65504P1209L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup39Serialized
	**/
    public Ip65504PdsNamesLargeGroup39Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup39Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup39Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup39Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9420); // serialize this field at offset 9420 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup39Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9420 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup39Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_39_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1179S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1179L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1180S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1180L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1181S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1181L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1182S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1182L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1183S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1183L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1184S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1184L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1185S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1185L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1186S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1186L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1187S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1187L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1188S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1188L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1189S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1189L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1190S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1190L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1191S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1191L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1192S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1192L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1193S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1193L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1194S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1194L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1195S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1195L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1196S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1196L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1197S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1197L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1198S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1198L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1199S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1199L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1200S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1200L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1201S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1201L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1202S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1202L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1203S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1203L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1204S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1204L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1205S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1205L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1206S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1206L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1207S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1207L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1208S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1208L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1209S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1209L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1179SCounter = -1;
         public boolean isIp65504P1179SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1179SCounter != sharedCounter;
            localIp65504P1179SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1179_S_LEN = 2;
  	/**
	 * serializeIp65504P1179S
	 */
	protected void serializeIp65504P1179S(short ip65504P1179S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1179S,IP_65504_P_1179_S_LEN)
                  ,beginIp65504P1179S
                  ,IP_65504_P_1179_S_LEN
                 );
            localIp65504P1179SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1179SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1179S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1179S() {	 
			return (getShort(beginIp65504P1179S));
   	}
         int localIp65504P1179LCounter = -1;
         public boolean isIp65504P1179LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1179LCounter != sharedCounter;
            localIp65504P1179LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1179_L_LEN = 2;
  	/**
	 * serializeIp65504P1179L
	 */
	protected void serializeIp65504P1179L(short ip65504P1179L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1179L,IP_65504_P_1179_L_LEN)
                  ,beginIp65504P1179L
                  ,IP_65504_P_1179_L_LEN
                 );
            localIp65504P1179LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1179LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1179L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1179L() {	 
			return (getShort(beginIp65504P1179L));
   	}
         int localIp65504P1180SCounter = -1;
         public boolean isIp65504P1180SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1180SCounter != sharedCounter;
            localIp65504P1180SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1180_S_LEN = 2;
  	/**
	 * serializeIp65504P1180S
	 */
	protected void serializeIp65504P1180S(short ip65504P1180S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1180S,IP_65504_P_1180_S_LEN)
                  ,beginIp65504P1180S
                  ,IP_65504_P_1180_S_LEN
                 );
            localIp65504P1180SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1180SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1180S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1180S() {	 
			return (getShort(beginIp65504P1180S));
   	}
         int localIp65504P1180LCounter = -1;
         public boolean isIp65504P1180LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1180LCounter != sharedCounter;
            localIp65504P1180LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1180_L_LEN = 2;
  	/**
	 * serializeIp65504P1180L
	 */
	protected void serializeIp65504P1180L(short ip65504P1180L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1180L,IP_65504_P_1180_L_LEN)
                  ,beginIp65504P1180L
                  ,IP_65504_P_1180_L_LEN
                 );
            localIp65504P1180LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1180LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1180L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1180L() {	 
			return (getShort(beginIp65504P1180L));
   	}
         int localIp65504P1181SCounter = -1;
         public boolean isIp65504P1181SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1181SCounter != sharedCounter;
            localIp65504P1181SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1181_S_LEN = 2;
  	/**
	 * serializeIp65504P1181S
	 */
	protected void serializeIp65504P1181S(short ip65504P1181S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1181S,IP_65504_P_1181_S_LEN)
                  ,beginIp65504P1181S
                  ,IP_65504_P_1181_S_LEN
                 );
            localIp65504P1181SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1181SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1181S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1181S() {	 
			return (getShort(beginIp65504P1181S));
   	}
         int localIp65504P1181LCounter = -1;
         public boolean isIp65504P1181LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1181LCounter != sharedCounter;
            localIp65504P1181LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1181_L_LEN = 2;
  	/**
	 * serializeIp65504P1181L
	 */
	protected void serializeIp65504P1181L(short ip65504P1181L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1181L,IP_65504_P_1181_L_LEN)
                  ,beginIp65504P1181L
                  ,IP_65504_P_1181_L_LEN
                 );
            localIp65504P1181LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1181LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1181L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1181L() {	 
			return (getShort(beginIp65504P1181L));
   	}
         int localIp65504P1182SCounter = -1;
         public boolean isIp65504P1182SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1182SCounter != sharedCounter;
            localIp65504P1182SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1182_S_LEN = 2;
  	/**
	 * serializeIp65504P1182S
	 */
	protected void serializeIp65504P1182S(short ip65504P1182S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1182S,IP_65504_P_1182_S_LEN)
                  ,beginIp65504P1182S
                  ,IP_65504_P_1182_S_LEN
                 );
            localIp65504P1182SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1182SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1182S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1182S() {	 
			return (getShort(beginIp65504P1182S));
   	}
         int localIp65504P1182LCounter = -1;
         public boolean isIp65504P1182LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1182LCounter != sharedCounter;
            localIp65504P1182LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1182_L_LEN = 2;
  	/**
	 * serializeIp65504P1182L
	 */
	protected void serializeIp65504P1182L(short ip65504P1182L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1182L,IP_65504_P_1182_L_LEN)
                  ,beginIp65504P1182L
                  ,IP_65504_P_1182_L_LEN
                 );
            localIp65504P1182LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1182LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1182L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1182L() {	 
			return (getShort(beginIp65504P1182L));
   	}
         int localIp65504P1183SCounter = -1;
         public boolean isIp65504P1183SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1183SCounter != sharedCounter;
            localIp65504P1183SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1183_S_LEN = 2;
  	/**
	 * serializeIp65504P1183S
	 */
	protected void serializeIp65504P1183S(short ip65504P1183S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1183S,IP_65504_P_1183_S_LEN)
                  ,beginIp65504P1183S
                  ,IP_65504_P_1183_S_LEN
                 );
            localIp65504P1183SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1183SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1183S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1183S() {	 
			return (getShort(beginIp65504P1183S));
   	}
         int localIp65504P1183LCounter = -1;
         public boolean isIp65504P1183LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1183LCounter != sharedCounter;
            localIp65504P1183LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1183_L_LEN = 2;
  	/**
	 * serializeIp65504P1183L
	 */
	protected void serializeIp65504P1183L(short ip65504P1183L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1183L,IP_65504_P_1183_L_LEN)
                  ,beginIp65504P1183L
                  ,IP_65504_P_1183_L_LEN
                 );
            localIp65504P1183LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1183LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1183L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1183L() {	 
			return (getShort(beginIp65504P1183L));
   	}
         int localIp65504P1184SCounter = -1;
         public boolean isIp65504P1184SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1184SCounter != sharedCounter;
            localIp65504P1184SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1184_S_LEN = 2;
  	/**
	 * serializeIp65504P1184S
	 */
	protected void serializeIp65504P1184S(short ip65504P1184S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1184S,IP_65504_P_1184_S_LEN)
                  ,beginIp65504P1184S
                  ,IP_65504_P_1184_S_LEN
                 );
            localIp65504P1184SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1184SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1184S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1184S() {	 
			return (getShort(beginIp65504P1184S));
   	}
         int localIp65504P1184LCounter = -1;
         public boolean isIp65504P1184LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1184LCounter != sharedCounter;
            localIp65504P1184LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1184_L_LEN = 2;
  	/**
	 * serializeIp65504P1184L
	 */
	protected void serializeIp65504P1184L(short ip65504P1184L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1184L,IP_65504_P_1184_L_LEN)
                  ,beginIp65504P1184L
                  ,IP_65504_P_1184_L_LEN
                 );
            localIp65504P1184LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1184LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1184L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1184L() {	 
			return (getShort(beginIp65504P1184L));
   	}
         int localIp65504P1185SCounter = -1;
         public boolean isIp65504P1185SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1185SCounter != sharedCounter;
            localIp65504P1185SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1185_S_LEN = 2;
  	/**
	 * serializeIp65504P1185S
	 */
	protected void serializeIp65504P1185S(short ip65504P1185S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1185S,IP_65504_P_1185_S_LEN)
                  ,beginIp65504P1185S
                  ,IP_65504_P_1185_S_LEN
                 );
            localIp65504P1185SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1185SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1185S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1185S() {	 
			return (getShort(beginIp65504P1185S));
   	}
         int localIp65504P1185LCounter = -1;
         public boolean isIp65504P1185LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1185LCounter != sharedCounter;
            localIp65504P1185LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1185_L_LEN = 2;
  	/**
	 * serializeIp65504P1185L
	 */
	protected void serializeIp65504P1185L(short ip65504P1185L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1185L,IP_65504_P_1185_L_LEN)
                  ,beginIp65504P1185L
                  ,IP_65504_P_1185_L_LEN
                 );
            localIp65504P1185LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1185LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1185L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1185L() {	 
			return (getShort(beginIp65504P1185L));
   	}
         int localIp65504P1186SCounter = -1;
         public boolean isIp65504P1186SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1186SCounter != sharedCounter;
            localIp65504P1186SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1186_S_LEN = 2;
  	/**
	 * serializeIp65504P1186S
	 */
	protected void serializeIp65504P1186S(short ip65504P1186S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1186S,IP_65504_P_1186_S_LEN)
                  ,beginIp65504P1186S
                  ,IP_65504_P_1186_S_LEN
                 );
            localIp65504P1186SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1186SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1186S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1186S() {	 
			return (getShort(beginIp65504P1186S));
   	}
         int localIp65504P1186LCounter = -1;
         public boolean isIp65504P1186LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1186LCounter != sharedCounter;
            localIp65504P1186LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1186_L_LEN = 2;
  	/**
	 * serializeIp65504P1186L
	 */
	protected void serializeIp65504P1186L(short ip65504P1186L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1186L,IP_65504_P_1186_L_LEN)
                  ,beginIp65504P1186L
                  ,IP_65504_P_1186_L_LEN
                 );
            localIp65504P1186LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1186LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1186L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1186L() {	 
			return (getShort(beginIp65504P1186L));
   	}
         int localIp65504P1187SCounter = -1;
         public boolean isIp65504P1187SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1187SCounter != sharedCounter;
            localIp65504P1187SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1187_S_LEN = 2;
  	/**
	 * serializeIp65504P1187S
	 */
	protected void serializeIp65504P1187S(short ip65504P1187S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1187S,IP_65504_P_1187_S_LEN)
                  ,beginIp65504P1187S
                  ,IP_65504_P_1187_S_LEN
                 );
            localIp65504P1187SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1187SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1187S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1187S() {	 
			return (getShort(beginIp65504P1187S));
   	}
         int localIp65504P1187LCounter = -1;
         public boolean isIp65504P1187LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1187LCounter != sharedCounter;
            localIp65504P1187LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1187_L_LEN = 2;
  	/**
	 * serializeIp65504P1187L
	 */
	protected void serializeIp65504P1187L(short ip65504P1187L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1187L,IP_65504_P_1187_L_LEN)
                  ,beginIp65504P1187L
                  ,IP_65504_P_1187_L_LEN
                 );
            localIp65504P1187LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1187LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1187L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1187L() {	 
			return (getShort(beginIp65504P1187L));
   	}
         int localIp65504P1188SCounter = -1;
         public boolean isIp65504P1188SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1188SCounter != sharedCounter;
            localIp65504P1188SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1188_S_LEN = 2;
  	/**
	 * serializeIp65504P1188S
	 */
	protected void serializeIp65504P1188S(short ip65504P1188S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1188S,IP_65504_P_1188_S_LEN)
                  ,beginIp65504P1188S
                  ,IP_65504_P_1188_S_LEN
                 );
            localIp65504P1188SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1188SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1188S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1188S() {	 
			return (getShort(beginIp65504P1188S));
   	}
         int localIp65504P1188LCounter = -1;
         public boolean isIp65504P1188LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1188LCounter != sharedCounter;
            localIp65504P1188LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1188_L_LEN = 2;
  	/**
	 * serializeIp65504P1188L
	 */
	protected void serializeIp65504P1188L(short ip65504P1188L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1188L,IP_65504_P_1188_L_LEN)
                  ,beginIp65504P1188L
                  ,IP_65504_P_1188_L_LEN
                 );
            localIp65504P1188LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1188LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1188L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1188L() {	 
			return (getShort(beginIp65504P1188L));
   	}
         int localIp65504P1189SCounter = -1;
         public boolean isIp65504P1189SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1189SCounter != sharedCounter;
            localIp65504P1189SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1189_S_LEN = 2;
  	/**
	 * serializeIp65504P1189S
	 */
	protected void serializeIp65504P1189S(short ip65504P1189S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1189S,IP_65504_P_1189_S_LEN)
                  ,beginIp65504P1189S
                  ,IP_65504_P_1189_S_LEN
                 );
            localIp65504P1189SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1189SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1189S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1189S() {	 
			return (getShort(beginIp65504P1189S));
   	}
         int localIp65504P1189LCounter = -1;
         public boolean isIp65504P1189LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1189LCounter != sharedCounter;
            localIp65504P1189LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1189_L_LEN = 2;
  	/**
	 * serializeIp65504P1189L
	 */
	protected void serializeIp65504P1189L(short ip65504P1189L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1189L,IP_65504_P_1189_L_LEN)
                  ,beginIp65504P1189L
                  ,IP_65504_P_1189_L_LEN
                 );
            localIp65504P1189LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1189LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1189L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1189L() {	 
			return (getShort(beginIp65504P1189L));
   	}
         int localIp65504P1190SCounter = -1;
         public boolean isIp65504P1190SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1190SCounter != sharedCounter;
            localIp65504P1190SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1190_S_LEN = 2;
  	/**
	 * serializeIp65504P1190S
	 */
	protected void serializeIp65504P1190S(short ip65504P1190S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1190S,IP_65504_P_1190_S_LEN)
                  ,beginIp65504P1190S
                  ,IP_65504_P_1190_S_LEN
                 );
            localIp65504P1190SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1190SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1190S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1190S() {	 
			return (getShort(beginIp65504P1190S));
   	}
         int localIp65504P1190LCounter = -1;
         public boolean isIp65504P1190LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1190LCounter != sharedCounter;
            localIp65504P1190LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1190_L_LEN = 2;
  	/**
	 * serializeIp65504P1190L
	 */
	protected void serializeIp65504P1190L(short ip65504P1190L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1190L,IP_65504_P_1190_L_LEN)
                  ,beginIp65504P1190L
                  ,IP_65504_P_1190_L_LEN
                 );
            localIp65504P1190LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1190LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1190L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1190L() {	 
			return (getShort(beginIp65504P1190L));
   	}
         int localIp65504P1191SCounter = -1;
         public boolean isIp65504P1191SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1191SCounter != sharedCounter;
            localIp65504P1191SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1191_S_LEN = 2;
  	/**
	 * serializeIp65504P1191S
	 */
	protected void serializeIp65504P1191S(short ip65504P1191S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1191S,IP_65504_P_1191_S_LEN)
                  ,beginIp65504P1191S
                  ,IP_65504_P_1191_S_LEN
                 );
            localIp65504P1191SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1191SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1191S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1191S() {	 
			return (getShort(beginIp65504P1191S));
   	}
         int localIp65504P1191LCounter = -1;
         public boolean isIp65504P1191LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1191LCounter != sharedCounter;
            localIp65504P1191LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1191_L_LEN = 2;
  	/**
	 * serializeIp65504P1191L
	 */
	protected void serializeIp65504P1191L(short ip65504P1191L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1191L,IP_65504_P_1191_L_LEN)
                  ,beginIp65504P1191L
                  ,IP_65504_P_1191_L_LEN
                 );
            localIp65504P1191LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1191LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1191L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1191L() {	 
			return (getShort(beginIp65504P1191L));
   	}
         int localIp65504P1192SCounter = -1;
         public boolean isIp65504P1192SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1192SCounter != sharedCounter;
            localIp65504P1192SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1192_S_LEN = 2;
  	/**
	 * serializeIp65504P1192S
	 */
	protected void serializeIp65504P1192S(short ip65504P1192S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1192S,IP_65504_P_1192_S_LEN)
                  ,beginIp65504P1192S
                  ,IP_65504_P_1192_S_LEN
                 );
            localIp65504P1192SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1192SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1192S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1192S() {	 
			return (getShort(beginIp65504P1192S));
   	}
         int localIp65504P1192LCounter = -1;
         public boolean isIp65504P1192LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1192LCounter != sharedCounter;
            localIp65504P1192LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1192_L_LEN = 2;
  	/**
	 * serializeIp65504P1192L
	 */
	protected void serializeIp65504P1192L(short ip65504P1192L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1192L,IP_65504_P_1192_L_LEN)
                  ,beginIp65504P1192L
                  ,IP_65504_P_1192_L_LEN
                 );
            localIp65504P1192LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1192LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1192L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1192L() {	 
			return (getShort(beginIp65504P1192L));
   	}
         int localIp65504P1193SCounter = -1;
         public boolean isIp65504P1193SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1193SCounter != sharedCounter;
            localIp65504P1193SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1193_S_LEN = 2;
  	/**
	 * serializeIp65504P1193S
	 */
	protected void serializeIp65504P1193S(short ip65504P1193S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1193S,IP_65504_P_1193_S_LEN)
                  ,beginIp65504P1193S
                  ,IP_65504_P_1193_S_LEN
                 );
            localIp65504P1193SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1193SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1193S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1193S() {	 
			return (getShort(beginIp65504P1193S));
   	}
         int localIp65504P1193LCounter = -1;
         public boolean isIp65504P1193LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1193LCounter != sharedCounter;
            localIp65504P1193LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1193_L_LEN = 2;
  	/**
	 * serializeIp65504P1193L
	 */
	protected void serializeIp65504P1193L(short ip65504P1193L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1193L,IP_65504_P_1193_L_LEN)
                  ,beginIp65504P1193L
                  ,IP_65504_P_1193_L_LEN
                 );
            localIp65504P1193LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1193LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1193L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1193L() {	 
			return (getShort(beginIp65504P1193L));
   	}
         int localIp65504P1194SCounter = -1;
         public boolean isIp65504P1194SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1194SCounter != sharedCounter;
            localIp65504P1194SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1194_S_LEN = 2;
  	/**
	 * serializeIp65504P1194S
	 */
	protected void serializeIp65504P1194S(short ip65504P1194S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1194S,IP_65504_P_1194_S_LEN)
                  ,beginIp65504P1194S
                  ,IP_65504_P_1194_S_LEN
                 );
            localIp65504P1194SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1194SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1194S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1194S() {	 
			return (getShort(beginIp65504P1194S));
   	}
         int localIp65504P1194LCounter = -1;
         public boolean isIp65504P1194LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1194LCounter != sharedCounter;
            localIp65504P1194LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1194_L_LEN = 2;
  	/**
	 * serializeIp65504P1194L
	 */
	protected void serializeIp65504P1194L(short ip65504P1194L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1194L,IP_65504_P_1194_L_LEN)
                  ,beginIp65504P1194L
                  ,IP_65504_P_1194_L_LEN
                 );
            localIp65504P1194LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1194LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1194L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1194L() {	 
			return (getShort(beginIp65504P1194L));
   	}
         int localIp65504P1195SCounter = -1;
         public boolean isIp65504P1195SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1195SCounter != sharedCounter;
            localIp65504P1195SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1195_S_LEN = 2;
  	/**
	 * serializeIp65504P1195S
	 */
	protected void serializeIp65504P1195S(short ip65504P1195S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1195S,IP_65504_P_1195_S_LEN)
                  ,beginIp65504P1195S
                  ,IP_65504_P_1195_S_LEN
                 );
            localIp65504P1195SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1195SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1195S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1195S() {	 
			return (getShort(beginIp65504P1195S));
   	}
         int localIp65504P1195LCounter = -1;
         public boolean isIp65504P1195LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1195LCounter != sharedCounter;
            localIp65504P1195LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1195_L_LEN = 2;
  	/**
	 * serializeIp65504P1195L
	 */
	protected void serializeIp65504P1195L(short ip65504P1195L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1195L,IP_65504_P_1195_L_LEN)
                  ,beginIp65504P1195L
                  ,IP_65504_P_1195_L_LEN
                 );
            localIp65504P1195LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1195LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1195L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1195L() {	 
			return (getShort(beginIp65504P1195L));
   	}
         int localIp65504P1196SCounter = -1;
         public boolean isIp65504P1196SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1196SCounter != sharedCounter;
            localIp65504P1196SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1196_S_LEN = 2;
  	/**
	 * serializeIp65504P1196S
	 */
	protected void serializeIp65504P1196S(short ip65504P1196S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1196S,IP_65504_P_1196_S_LEN)
                  ,beginIp65504P1196S
                  ,IP_65504_P_1196_S_LEN
                 );
            localIp65504P1196SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1196SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1196S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1196S() {	 
			return (getShort(beginIp65504P1196S));
   	}
         int localIp65504P1196LCounter = -1;
         public boolean isIp65504P1196LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1196LCounter != sharedCounter;
            localIp65504P1196LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1196_L_LEN = 2;
  	/**
	 * serializeIp65504P1196L
	 */
	protected void serializeIp65504P1196L(short ip65504P1196L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1196L,IP_65504_P_1196_L_LEN)
                  ,beginIp65504P1196L
                  ,IP_65504_P_1196_L_LEN
                 );
            localIp65504P1196LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1196LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1196L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1196L() {	 
			return (getShort(beginIp65504P1196L));
   	}
         int localIp65504P1197SCounter = -1;
         public boolean isIp65504P1197SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1197SCounter != sharedCounter;
            localIp65504P1197SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1197_S_LEN = 2;
  	/**
	 * serializeIp65504P1197S
	 */
	protected void serializeIp65504P1197S(short ip65504P1197S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1197S,IP_65504_P_1197_S_LEN)
                  ,beginIp65504P1197S
                  ,IP_65504_P_1197_S_LEN
                 );
            localIp65504P1197SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1197SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1197S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1197S() {	 
			return (getShort(beginIp65504P1197S));
   	}
         int localIp65504P1197LCounter = -1;
         public boolean isIp65504P1197LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1197LCounter != sharedCounter;
            localIp65504P1197LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1197_L_LEN = 2;
  	/**
	 * serializeIp65504P1197L
	 */
	protected void serializeIp65504P1197L(short ip65504P1197L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1197L,IP_65504_P_1197_L_LEN)
                  ,beginIp65504P1197L
                  ,IP_65504_P_1197_L_LEN
                 );
            localIp65504P1197LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1197LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1197L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1197L() {	 
			return (getShort(beginIp65504P1197L));
   	}
         int localIp65504P1198SCounter = -1;
         public boolean isIp65504P1198SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1198SCounter != sharedCounter;
            localIp65504P1198SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1198_S_LEN = 2;
  	/**
	 * serializeIp65504P1198S
	 */
	protected void serializeIp65504P1198S(short ip65504P1198S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1198S,IP_65504_P_1198_S_LEN)
                  ,beginIp65504P1198S
                  ,IP_65504_P_1198_S_LEN
                 );
            localIp65504P1198SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1198SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1198S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1198S() {	 
			return (getShort(beginIp65504P1198S));
   	}
         int localIp65504P1198LCounter = -1;
         public boolean isIp65504P1198LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1198LCounter != sharedCounter;
            localIp65504P1198LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1198_L_LEN = 2;
  	/**
	 * serializeIp65504P1198L
	 */
	protected void serializeIp65504P1198L(short ip65504P1198L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1198L,IP_65504_P_1198_L_LEN)
                  ,beginIp65504P1198L
                  ,IP_65504_P_1198_L_LEN
                 );
            localIp65504P1198LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1198LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1198L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1198L() {	 
			return (getShort(beginIp65504P1198L));
   	}
         int localIp65504P1199SCounter = -1;
         public boolean isIp65504P1199SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1199SCounter != sharedCounter;
            localIp65504P1199SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1199_S_LEN = 2;
  	/**
	 * serializeIp65504P1199S
	 */
	protected void serializeIp65504P1199S(short ip65504P1199S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1199S,IP_65504_P_1199_S_LEN)
                  ,beginIp65504P1199S
                  ,IP_65504_P_1199_S_LEN
                 );
            localIp65504P1199SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1199SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1199S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1199S() {	 
			return (getShort(beginIp65504P1199S));
   	}
         int localIp65504P1199LCounter = -1;
         public boolean isIp65504P1199LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1199LCounter != sharedCounter;
            localIp65504P1199LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1199_L_LEN = 2;
  	/**
	 * serializeIp65504P1199L
	 */
	protected void serializeIp65504P1199L(short ip65504P1199L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1199L,IP_65504_P_1199_L_LEN)
                  ,beginIp65504P1199L
                  ,IP_65504_P_1199_L_LEN
                 );
            localIp65504P1199LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1199LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1199L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1199L() {	 
			return (getShort(beginIp65504P1199L));
   	}
         int localIp65504P1200SCounter = -1;
         public boolean isIp65504P1200SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1200SCounter != sharedCounter;
            localIp65504P1200SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1200_S_LEN = 2;
  	/**
	 * serializeIp65504P1200S
	 */
	protected void serializeIp65504P1200S(short ip65504P1200S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1200S,IP_65504_P_1200_S_LEN)
                  ,beginIp65504P1200S
                  ,IP_65504_P_1200_S_LEN
                 );
            localIp65504P1200SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1200SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1200S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1200S() {	 
			return (getShort(beginIp65504P1200S));
   	}
         int localIp65504P1200LCounter = -1;
         public boolean isIp65504P1200LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1200LCounter != sharedCounter;
            localIp65504P1200LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1200_L_LEN = 2;
  	/**
	 * serializeIp65504P1200L
	 */
	protected void serializeIp65504P1200L(short ip65504P1200L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1200L,IP_65504_P_1200_L_LEN)
                  ,beginIp65504P1200L
                  ,IP_65504_P_1200_L_LEN
                 );
            localIp65504P1200LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1200LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1200L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1200L() {	 
			return (getShort(beginIp65504P1200L));
   	}
         int localIp65504P1201SCounter = -1;
         public boolean isIp65504P1201SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1201SCounter != sharedCounter;
            localIp65504P1201SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1201_S_LEN = 2;
  	/**
	 * serializeIp65504P1201S
	 */
	protected void serializeIp65504P1201S(short ip65504P1201S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1201S,IP_65504_P_1201_S_LEN)
                  ,beginIp65504P1201S
                  ,IP_65504_P_1201_S_LEN
                 );
            localIp65504P1201SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1201SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1201S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1201S() {	 
			return (getShort(beginIp65504P1201S));
   	}
         int localIp65504P1201LCounter = -1;
         public boolean isIp65504P1201LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1201LCounter != sharedCounter;
            localIp65504P1201LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1201_L_LEN = 2;
  	/**
	 * serializeIp65504P1201L
	 */
	protected void serializeIp65504P1201L(short ip65504P1201L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1201L,IP_65504_P_1201_L_LEN)
                  ,beginIp65504P1201L
                  ,IP_65504_P_1201_L_LEN
                 );
            localIp65504P1201LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1201LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1201L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1201L() {	 
			return (getShort(beginIp65504P1201L));
   	}
         int localIp65504P1202SCounter = -1;
         public boolean isIp65504P1202SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1202SCounter != sharedCounter;
            localIp65504P1202SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1202_S_LEN = 2;
  	/**
	 * serializeIp65504P1202S
	 */
	protected void serializeIp65504P1202S(short ip65504P1202S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1202S,IP_65504_P_1202_S_LEN)
                  ,beginIp65504P1202S
                  ,IP_65504_P_1202_S_LEN
                 );
            localIp65504P1202SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1202SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1202S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1202S() {	 
			return (getShort(beginIp65504P1202S));
   	}
         int localIp65504P1202LCounter = -1;
         public boolean isIp65504P1202LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1202LCounter != sharedCounter;
            localIp65504P1202LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1202_L_LEN = 2;
  	/**
	 * serializeIp65504P1202L
	 */
	protected void serializeIp65504P1202L(short ip65504P1202L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1202L,IP_65504_P_1202_L_LEN)
                  ,beginIp65504P1202L
                  ,IP_65504_P_1202_L_LEN
                 );
            localIp65504P1202LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1202LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1202L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1202L() {	 
			return (getShort(beginIp65504P1202L));
   	}
         int localIp65504P1203SCounter = -1;
         public boolean isIp65504P1203SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1203SCounter != sharedCounter;
            localIp65504P1203SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1203_S_LEN = 2;
  	/**
	 * serializeIp65504P1203S
	 */
	protected void serializeIp65504P1203S(short ip65504P1203S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1203S,IP_65504_P_1203_S_LEN)
                  ,beginIp65504P1203S
                  ,IP_65504_P_1203_S_LEN
                 );
            localIp65504P1203SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1203SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1203S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1203S() {	 
			return (getShort(beginIp65504P1203S));
   	}
         int localIp65504P1203LCounter = -1;
         public boolean isIp65504P1203LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1203LCounter != sharedCounter;
            localIp65504P1203LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1203_L_LEN = 2;
  	/**
	 * serializeIp65504P1203L
	 */
	protected void serializeIp65504P1203L(short ip65504P1203L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1203L,IP_65504_P_1203_L_LEN)
                  ,beginIp65504P1203L
                  ,IP_65504_P_1203_L_LEN
                 );
            localIp65504P1203LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1203LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1203L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1203L() {	 
			return (getShort(beginIp65504P1203L));
   	}
         int localIp65504P1204SCounter = -1;
         public boolean isIp65504P1204SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1204SCounter != sharedCounter;
            localIp65504P1204SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1204_S_LEN = 2;
  	/**
	 * serializeIp65504P1204S
	 */
	protected void serializeIp65504P1204S(short ip65504P1204S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1204S,IP_65504_P_1204_S_LEN)
                  ,beginIp65504P1204S
                  ,IP_65504_P_1204_S_LEN
                 );
            localIp65504P1204SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1204SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1204S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1204S() {	 
			return (getShort(beginIp65504P1204S));
   	}
         int localIp65504P1204LCounter = -1;
         public boolean isIp65504P1204LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1204LCounter != sharedCounter;
            localIp65504P1204LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1204_L_LEN = 2;
  	/**
	 * serializeIp65504P1204L
	 */
	protected void serializeIp65504P1204L(short ip65504P1204L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1204L,IP_65504_P_1204_L_LEN)
                  ,beginIp65504P1204L
                  ,IP_65504_P_1204_L_LEN
                 );
            localIp65504P1204LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1204LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1204L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1204L() {	 
			return (getShort(beginIp65504P1204L));
   	}
         int localIp65504P1205SCounter = -1;
         public boolean isIp65504P1205SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1205SCounter != sharedCounter;
            localIp65504P1205SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1205_S_LEN = 2;
  	/**
	 * serializeIp65504P1205S
	 */
	protected void serializeIp65504P1205S(short ip65504P1205S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1205S,IP_65504_P_1205_S_LEN)
                  ,beginIp65504P1205S
                  ,IP_65504_P_1205_S_LEN
                 );
            localIp65504P1205SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1205SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1205S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1205S() {	 
			return (getShort(beginIp65504P1205S));
   	}
         int localIp65504P1205LCounter = -1;
         public boolean isIp65504P1205LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1205LCounter != sharedCounter;
            localIp65504P1205LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1205_L_LEN = 2;
  	/**
	 * serializeIp65504P1205L
	 */
	protected void serializeIp65504P1205L(short ip65504P1205L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1205L,IP_65504_P_1205_L_LEN)
                  ,beginIp65504P1205L
                  ,IP_65504_P_1205_L_LEN
                 );
            localIp65504P1205LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1205LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1205L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1205L() {	 
			return (getShort(beginIp65504P1205L));
   	}
         int localIp65504P1206SCounter = -1;
         public boolean isIp65504P1206SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1206SCounter != sharedCounter;
            localIp65504P1206SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1206_S_LEN = 2;
  	/**
	 * serializeIp65504P1206S
	 */
	protected void serializeIp65504P1206S(short ip65504P1206S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1206S,IP_65504_P_1206_S_LEN)
                  ,beginIp65504P1206S
                  ,IP_65504_P_1206_S_LEN
                 );
            localIp65504P1206SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1206SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1206S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1206S() {	 
			return (getShort(beginIp65504P1206S));
   	}
         int localIp65504P1206LCounter = -1;
         public boolean isIp65504P1206LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1206LCounter != sharedCounter;
            localIp65504P1206LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1206_L_LEN = 2;
  	/**
	 * serializeIp65504P1206L
	 */
	protected void serializeIp65504P1206L(short ip65504P1206L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1206L,IP_65504_P_1206_L_LEN)
                  ,beginIp65504P1206L
                  ,IP_65504_P_1206_L_LEN
                 );
            localIp65504P1206LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1206LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1206L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1206L() {	 
			return (getShort(beginIp65504P1206L));
   	}
         int localIp65504P1207SCounter = -1;
         public boolean isIp65504P1207SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1207SCounter != sharedCounter;
            localIp65504P1207SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1207_S_LEN = 2;
  	/**
	 * serializeIp65504P1207S
	 */
	protected void serializeIp65504P1207S(short ip65504P1207S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1207S,IP_65504_P_1207_S_LEN)
                  ,beginIp65504P1207S
                  ,IP_65504_P_1207_S_LEN
                 );
            localIp65504P1207SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1207SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1207S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1207S() {	 
			return (getShort(beginIp65504P1207S));
   	}
         int localIp65504P1207LCounter = -1;
         public boolean isIp65504P1207LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1207LCounter != sharedCounter;
            localIp65504P1207LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1207_L_LEN = 2;
  	/**
	 * serializeIp65504P1207L
	 */
	protected void serializeIp65504P1207L(short ip65504P1207L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1207L,IP_65504_P_1207_L_LEN)
                  ,beginIp65504P1207L
                  ,IP_65504_P_1207_L_LEN
                 );
            localIp65504P1207LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1207LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1207L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1207L() {	 
			return (getShort(beginIp65504P1207L));
   	}
         int localIp65504P1208SCounter = -1;
         public boolean isIp65504P1208SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1208SCounter != sharedCounter;
            localIp65504P1208SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1208_S_LEN = 2;
  	/**
	 * serializeIp65504P1208S
	 */
	protected void serializeIp65504P1208S(short ip65504P1208S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1208S,IP_65504_P_1208_S_LEN)
                  ,beginIp65504P1208S
                  ,IP_65504_P_1208_S_LEN
                 );
            localIp65504P1208SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1208SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1208S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1208S() {	 
			return (getShort(beginIp65504P1208S));
   	}
         int localIp65504P1208LCounter = -1;
         public boolean isIp65504P1208LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1208LCounter != sharedCounter;
            localIp65504P1208LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1208_L_LEN = 2;
  	/**
	 * serializeIp65504P1208L
	 */
	protected void serializeIp65504P1208L(short ip65504P1208L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1208L,IP_65504_P_1208_L_LEN)
                  ,beginIp65504P1208L
                  ,IP_65504_P_1208_L_LEN
                 );
            localIp65504P1208LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1208LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1208L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1208L() {	 
			return (getShort(beginIp65504P1208L));
   	}
         int localIp65504P1209SCounter = -1;
         public boolean isIp65504P1209SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1209SCounter != sharedCounter;
            localIp65504P1209SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1209_S_LEN = 2;
  	/**
	 * serializeIp65504P1209S
	 */
	protected void serializeIp65504P1209S(short ip65504P1209S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1209S,IP_65504_P_1209_S_LEN)
                  ,beginIp65504P1209S
                  ,IP_65504_P_1209_S_LEN
                 );
            localIp65504P1209SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1209SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1209S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1209S() {	 
			return (getShort(beginIp65504P1209S));
   	}
         int localIp65504P1209LCounter = -1;
         public boolean isIp65504P1209LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1209LCounter != sharedCounter;
            localIp65504P1209LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1209_L_LEN = 2;
  	/**
	 * serializeIp65504P1209L
	 */
	protected void serializeIp65504P1209L(short ip65504P1209L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1209L,IP_65504_P_1209_L_LEN)
                  ,beginIp65504P1209L
                  ,IP_65504_P_1209_L_LEN
                 );
            localIp65504P1209LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1209LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1209L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1209L() {	 
			return (getShort(beginIp65504P1209L));
   	}




}
  
