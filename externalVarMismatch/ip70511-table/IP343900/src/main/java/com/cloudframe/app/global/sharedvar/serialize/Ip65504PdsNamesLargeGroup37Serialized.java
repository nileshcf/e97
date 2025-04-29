package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup37Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup37Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup37Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_37_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1117S;
            protected  int beginIp65504P1117L;
            protected  int beginIp65504P1118S;
            protected  int beginIp65504P1118L;
            protected  int beginIp65504P1119S;
            protected  int beginIp65504P1119L;
            protected  int beginIp65504P1120S;
            protected  int beginIp65504P1120L;
            protected  int beginIp65504P1121S;
            protected  int beginIp65504P1121L;
            protected  int beginIp65504P1122S;
            protected  int beginIp65504P1122L;
            protected  int beginIp65504P1123S;
            protected  int beginIp65504P1123L;
            protected  int beginIp65504P1124S;
            protected  int beginIp65504P1124L;
            protected  int beginIp65504P1125S;
            protected  int beginIp65504P1125L;
            protected  int beginIp65504P1126S;
            protected  int beginIp65504P1126L;
            protected  int beginIp65504P1127S;
            protected  int beginIp65504P1127L;
            protected  int beginIp65504P1128S;
            protected  int beginIp65504P1128L;
            protected  int beginIp65504P1129S;
            protected  int beginIp65504P1129L;
            protected  int beginIp65504P1130S;
            protected  int beginIp65504P1130L;
            protected  int beginIp65504P1131S;
            protected  int beginIp65504P1131L;
            protected  int beginIp65504P1132S;
            protected  int beginIp65504P1132L;
            protected  int beginIp65504P1133S;
            protected  int beginIp65504P1133L;
            protected  int beginIp65504P1134S;
            protected  int beginIp65504P1134L;
            protected  int beginIp65504P1135S;
            protected  int beginIp65504P1135L;
            protected  int beginIp65504P1136S;
            protected  int beginIp65504P1136L;
            protected  int beginIp65504P1137S;
            protected  int beginIp65504P1137L;
            protected  int beginIp65504P1138S;
            protected  int beginIp65504P1138L;
            protected  int beginIp65504P1139S;
            protected  int beginIp65504P1139L;
            protected  int beginIp65504P1140S;
            protected  int beginIp65504P1140L;
            protected  int beginIp65504P1141S;
            protected  int beginIp65504P1141L;
            protected  int beginIp65504P1142S;
            protected  int beginIp65504P1142L;
            protected  int beginIp65504P1143S;
            protected  int beginIp65504P1143L;
            protected  int beginIp65504P1144S;
            protected  int beginIp65504P1144L;
            protected  int beginIp65504P1145S;
            protected  int beginIp65504P1145L;
            protected  int beginIp65504P1146S;
            protected  int beginIp65504P1146L;
            protected  int beginIp65504P1147S;
            protected  int beginIp65504P1147L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup37Serialized
	**/
    public Ip65504PdsNamesLargeGroup37Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup37Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup37Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup37Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8924); // serialize this field at offset 8924 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup37Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8924 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup37Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_37_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1117S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1117L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1118S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1118L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1119S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1119L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1120S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1120L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1121S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1121L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1122S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1122L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1123S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1123L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1124S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1124L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1125S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1125L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1126S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1126L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1127S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1127L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1128S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1128L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1129S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1129L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1130S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1130L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1131S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1131L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1132S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1132L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1133S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1133L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1134S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1134L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1135S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1135L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1136S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1136L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1137S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1137L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1138S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1138L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1139S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1139L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1140S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1140L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1141S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1141L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1142S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1142L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1143S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1143L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1144S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1144L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1145S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1145L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1146S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1146L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1147S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1147L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1117SCounter = -1;
         public boolean isIp65504P1117SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1117SCounter != sharedCounter;
            localIp65504P1117SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1117_S_LEN = 2;
  	/**
	 * serializeIp65504P1117S
	 */
	protected void serializeIp65504P1117S(short ip65504P1117S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1117S,IP_65504_P_1117_S_LEN)
                  ,beginIp65504P1117S
                  ,IP_65504_P_1117_S_LEN
                 );
            localIp65504P1117SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1117SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1117S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1117S() {	 
			return (getShort(beginIp65504P1117S));
   	}
         int localIp65504P1117LCounter = -1;
         public boolean isIp65504P1117LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1117LCounter != sharedCounter;
            localIp65504P1117LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1117_L_LEN = 2;
  	/**
	 * serializeIp65504P1117L
	 */
	protected void serializeIp65504P1117L(short ip65504P1117L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1117L,IP_65504_P_1117_L_LEN)
                  ,beginIp65504P1117L
                  ,IP_65504_P_1117_L_LEN
                 );
            localIp65504P1117LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1117LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1117L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1117L() {	 
			return (getShort(beginIp65504P1117L));
   	}
         int localIp65504P1118SCounter = -1;
         public boolean isIp65504P1118SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1118SCounter != sharedCounter;
            localIp65504P1118SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1118_S_LEN = 2;
  	/**
	 * serializeIp65504P1118S
	 */
	protected void serializeIp65504P1118S(short ip65504P1118S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1118S,IP_65504_P_1118_S_LEN)
                  ,beginIp65504P1118S
                  ,IP_65504_P_1118_S_LEN
                 );
            localIp65504P1118SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1118SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1118S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1118S() {	 
			return (getShort(beginIp65504P1118S));
   	}
         int localIp65504P1118LCounter = -1;
         public boolean isIp65504P1118LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1118LCounter != sharedCounter;
            localIp65504P1118LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1118_L_LEN = 2;
  	/**
	 * serializeIp65504P1118L
	 */
	protected void serializeIp65504P1118L(short ip65504P1118L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1118L,IP_65504_P_1118_L_LEN)
                  ,beginIp65504P1118L
                  ,IP_65504_P_1118_L_LEN
                 );
            localIp65504P1118LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1118LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1118L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1118L() {	 
			return (getShort(beginIp65504P1118L));
   	}
         int localIp65504P1119SCounter = -1;
         public boolean isIp65504P1119SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1119SCounter != sharedCounter;
            localIp65504P1119SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1119_S_LEN = 2;
  	/**
	 * serializeIp65504P1119S
	 */
	protected void serializeIp65504P1119S(short ip65504P1119S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1119S,IP_65504_P_1119_S_LEN)
                  ,beginIp65504P1119S
                  ,IP_65504_P_1119_S_LEN
                 );
            localIp65504P1119SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1119SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1119S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1119S() {	 
			return (getShort(beginIp65504P1119S));
   	}
         int localIp65504P1119LCounter = -1;
         public boolean isIp65504P1119LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1119LCounter != sharedCounter;
            localIp65504P1119LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1119_L_LEN = 2;
  	/**
	 * serializeIp65504P1119L
	 */
	protected void serializeIp65504P1119L(short ip65504P1119L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1119L,IP_65504_P_1119_L_LEN)
                  ,beginIp65504P1119L
                  ,IP_65504_P_1119_L_LEN
                 );
            localIp65504P1119LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1119LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1119L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1119L() {	 
			return (getShort(beginIp65504P1119L));
   	}
         int localIp65504P1120SCounter = -1;
         public boolean isIp65504P1120SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1120SCounter != sharedCounter;
            localIp65504P1120SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1120_S_LEN = 2;
  	/**
	 * serializeIp65504P1120S
	 */
	protected void serializeIp65504P1120S(short ip65504P1120S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1120S,IP_65504_P_1120_S_LEN)
                  ,beginIp65504P1120S
                  ,IP_65504_P_1120_S_LEN
                 );
            localIp65504P1120SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1120SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1120S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1120S() {	 
			return (getShort(beginIp65504P1120S));
   	}
         int localIp65504P1120LCounter = -1;
         public boolean isIp65504P1120LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1120LCounter != sharedCounter;
            localIp65504P1120LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1120_L_LEN = 2;
  	/**
	 * serializeIp65504P1120L
	 */
	protected void serializeIp65504P1120L(short ip65504P1120L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1120L,IP_65504_P_1120_L_LEN)
                  ,beginIp65504P1120L
                  ,IP_65504_P_1120_L_LEN
                 );
            localIp65504P1120LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1120LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1120L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1120L() {	 
			return (getShort(beginIp65504P1120L));
   	}
         int localIp65504P1121SCounter = -1;
         public boolean isIp65504P1121SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1121SCounter != sharedCounter;
            localIp65504P1121SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1121_S_LEN = 2;
  	/**
	 * serializeIp65504P1121S
	 */
	protected void serializeIp65504P1121S(short ip65504P1121S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1121S,IP_65504_P_1121_S_LEN)
                  ,beginIp65504P1121S
                  ,IP_65504_P_1121_S_LEN
                 );
            localIp65504P1121SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1121SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1121S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1121S() {	 
			return (getShort(beginIp65504P1121S));
   	}
         int localIp65504P1121LCounter = -1;
         public boolean isIp65504P1121LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1121LCounter != sharedCounter;
            localIp65504P1121LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1121_L_LEN = 2;
  	/**
	 * serializeIp65504P1121L
	 */
	protected void serializeIp65504P1121L(short ip65504P1121L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1121L,IP_65504_P_1121_L_LEN)
                  ,beginIp65504P1121L
                  ,IP_65504_P_1121_L_LEN
                 );
            localIp65504P1121LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1121LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1121L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1121L() {	 
			return (getShort(beginIp65504P1121L));
   	}
         int localIp65504P1122SCounter = -1;
         public boolean isIp65504P1122SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1122SCounter != sharedCounter;
            localIp65504P1122SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1122_S_LEN = 2;
  	/**
	 * serializeIp65504P1122S
	 */
	protected void serializeIp65504P1122S(short ip65504P1122S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1122S,IP_65504_P_1122_S_LEN)
                  ,beginIp65504P1122S
                  ,IP_65504_P_1122_S_LEN
                 );
            localIp65504P1122SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1122SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1122S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1122S() {	 
			return (getShort(beginIp65504P1122S));
   	}
         int localIp65504P1122LCounter = -1;
         public boolean isIp65504P1122LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1122LCounter != sharedCounter;
            localIp65504P1122LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1122_L_LEN = 2;
  	/**
	 * serializeIp65504P1122L
	 */
	protected void serializeIp65504P1122L(short ip65504P1122L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1122L,IP_65504_P_1122_L_LEN)
                  ,beginIp65504P1122L
                  ,IP_65504_P_1122_L_LEN
                 );
            localIp65504P1122LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1122LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1122L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1122L() {	 
			return (getShort(beginIp65504P1122L));
   	}
         int localIp65504P1123SCounter = -1;
         public boolean isIp65504P1123SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1123SCounter != sharedCounter;
            localIp65504P1123SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1123_S_LEN = 2;
  	/**
	 * serializeIp65504P1123S
	 */
	protected void serializeIp65504P1123S(short ip65504P1123S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1123S,IP_65504_P_1123_S_LEN)
                  ,beginIp65504P1123S
                  ,IP_65504_P_1123_S_LEN
                 );
            localIp65504P1123SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1123SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1123S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1123S() {	 
			return (getShort(beginIp65504P1123S));
   	}
         int localIp65504P1123LCounter = -1;
         public boolean isIp65504P1123LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1123LCounter != sharedCounter;
            localIp65504P1123LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1123_L_LEN = 2;
  	/**
	 * serializeIp65504P1123L
	 */
	protected void serializeIp65504P1123L(short ip65504P1123L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1123L,IP_65504_P_1123_L_LEN)
                  ,beginIp65504P1123L
                  ,IP_65504_P_1123_L_LEN
                 );
            localIp65504P1123LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1123LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1123L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1123L() {	 
			return (getShort(beginIp65504P1123L));
   	}
         int localIp65504P1124SCounter = -1;
         public boolean isIp65504P1124SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1124SCounter != sharedCounter;
            localIp65504P1124SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1124_S_LEN = 2;
  	/**
	 * serializeIp65504P1124S
	 */
	protected void serializeIp65504P1124S(short ip65504P1124S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1124S,IP_65504_P_1124_S_LEN)
                  ,beginIp65504P1124S
                  ,IP_65504_P_1124_S_LEN
                 );
            localIp65504P1124SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1124SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1124S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1124S() {	 
			return (getShort(beginIp65504P1124S));
   	}
         int localIp65504P1124LCounter = -1;
         public boolean isIp65504P1124LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1124LCounter != sharedCounter;
            localIp65504P1124LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1124_L_LEN = 2;
  	/**
	 * serializeIp65504P1124L
	 */
	protected void serializeIp65504P1124L(short ip65504P1124L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1124L,IP_65504_P_1124_L_LEN)
                  ,beginIp65504P1124L
                  ,IP_65504_P_1124_L_LEN
                 );
            localIp65504P1124LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1124LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1124L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1124L() {	 
			return (getShort(beginIp65504P1124L));
   	}
         int localIp65504P1125SCounter = -1;
         public boolean isIp65504P1125SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1125SCounter != sharedCounter;
            localIp65504P1125SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1125_S_LEN = 2;
  	/**
	 * serializeIp65504P1125S
	 */
	protected void serializeIp65504P1125S(short ip65504P1125S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1125S,IP_65504_P_1125_S_LEN)
                  ,beginIp65504P1125S
                  ,IP_65504_P_1125_S_LEN
                 );
            localIp65504P1125SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1125SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1125S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1125S() {	 
			return (getShort(beginIp65504P1125S));
   	}
         int localIp65504P1125LCounter = -1;
         public boolean isIp65504P1125LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1125LCounter != sharedCounter;
            localIp65504P1125LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1125_L_LEN = 2;
  	/**
	 * serializeIp65504P1125L
	 */
	protected void serializeIp65504P1125L(short ip65504P1125L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1125L,IP_65504_P_1125_L_LEN)
                  ,beginIp65504P1125L
                  ,IP_65504_P_1125_L_LEN
                 );
            localIp65504P1125LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1125LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1125L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1125L() {	 
			return (getShort(beginIp65504P1125L));
   	}
         int localIp65504P1126SCounter = -1;
         public boolean isIp65504P1126SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1126SCounter != sharedCounter;
            localIp65504P1126SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1126_S_LEN = 2;
  	/**
	 * serializeIp65504P1126S
	 */
	protected void serializeIp65504P1126S(short ip65504P1126S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1126S,IP_65504_P_1126_S_LEN)
                  ,beginIp65504P1126S
                  ,IP_65504_P_1126_S_LEN
                 );
            localIp65504P1126SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1126SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1126S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1126S() {	 
			return (getShort(beginIp65504P1126S));
   	}
         int localIp65504P1126LCounter = -1;
         public boolean isIp65504P1126LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1126LCounter != sharedCounter;
            localIp65504P1126LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1126_L_LEN = 2;
  	/**
	 * serializeIp65504P1126L
	 */
	protected void serializeIp65504P1126L(short ip65504P1126L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1126L,IP_65504_P_1126_L_LEN)
                  ,beginIp65504P1126L
                  ,IP_65504_P_1126_L_LEN
                 );
            localIp65504P1126LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1126LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1126L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1126L() {	 
			return (getShort(beginIp65504P1126L));
   	}
         int localIp65504P1127SCounter = -1;
         public boolean isIp65504P1127SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1127SCounter != sharedCounter;
            localIp65504P1127SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1127_S_LEN = 2;
  	/**
	 * serializeIp65504P1127S
	 */
	protected void serializeIp65504P1127S(short ip65504P1127S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1127S,IP_65504_P_1127_S_LEN)
                  ,beginIp65504P1127S
                  ,IP_65504_P_1127_S_LEN
                 );
            localIp65504P1127SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1127SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1127S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1127S() {	 
			return (getShort(beginIp65504P1127S));
   	}
         int localIp65504P1127LCounter = -1;
         public boolean isIp65504P1127LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1127LCounter != sharedCounter;
            localIp65504P1127LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1127_L_LEN = 2;
  	/**
	 * serializeIp65504P1127L
	 */
	protected void serializeIp65504P1127L(short ip65504P1127L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1127L,IP_65504_P_1127_L_LEN)
                  ,beginIp65504P1127L
                  ,IP_65504_P_1127_L_LEN
                 );
            localIp65504P1127LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1127LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1127L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1127L() {	 
			return (getShort(beginIp65504P1127L));
   	}
         int localIp65504P1128SCounter = -1;
         public boolean isIp65504P1128SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1128SCounter != sharedCounter;
            localIp65504P1128SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1128_S_LEN = 2;
  	/**
	 * serializeIp65504P1128S
	 */
	protected void serializeIp65504P1128S(short ip65504P1128S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1128S,IP_65504_P_1128_S_LEN)
                  ,beginIp65504P1128S
                  ,IP_65504_P_1128_S_LEN
                 );
            localIp65504P1128SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1128SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1128S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1128S() {	 
			return (getShort(beginIp65504P1128S));
   	}
         int localIp65504P1128LCounter = -1;
         public boolean isIp65504P1128LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1128LCounter != sharedCounter;
            localIp65504P1128LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1128_L_LEN = 2;
  	/**
	 * serializeIp65504P1128L
	 */
	protected void serializeIp65504P1128L(short ip65504P1128L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1128L,IP_65504_P_1128_L_LEN)
                  ,beginIp65504P1128L
                  ,IP_65504_P_1128_L_LEN
                 );
            localIp65504P1128LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1128LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1128L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1128L() {	 
			return (getShort(beginIp65504P1128L));
   	}
         int localIp65504P1129SCounter = -1;
         public boolean isIp65504P1129SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1129SCounter != sharedCounter;
            localIp65504P1129SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1129_S_LEN = 2;
  	/**
	 * serializeIp65504P1129S
	 */
	protected void serializeIp65504P1129S(short ip65504P1129S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1129S,IP_65504_P_1129_S_LEN)
                  ,beginIp65504P1129S
                  ,IP_65504_P_1129_S_LEN
                 );
            localIp65504P1129SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1129SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1129S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1129S() {	 
			return (getShort(beginIp65504P1129S));
   	}
         int localIp65504P1129LCounter = -1;
         public boolean isIp65504P1129LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1129LCounter != sharedCounter;
            localIp65504P1129LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1129_L_LEN = 2;
  	/**
	 * serializeIp65504P1129L
	 */
	protected void serializeIp65504P1129L(short ip65504P1129L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1129L,IP_65504_P_1129_L_LEN)
                  ,beginIp65504P1129L
                  ,IP_65504_P_1129_L_LEN
                 );
            localIp65504P1129LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1129LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1129L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1129L() {	 
			return (getShort(beginIp65504P1129L));
   	}
         int localIp65504P1130SCounter = -1;
         public boolean isIp65504P1130SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1130SCounter != sharedCounter;
            localIp65504P1130SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1130_S_LEN = 2;
  	/**
	 * serializeIp65504P1130S
	 */
	protected void serializeIp65504P1130S(short ip65504P1130S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1130S,IP_65504_P_1130_S_LEN)
                  ,beginIp65504P1130S
                  ,IP_65504_P_1130_S_LEN
                 );
            localIp65504P1130SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1130SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1130S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1130S() {	 
			return (getShort(beginIp65504P1130S));
   	}
         int localIp65504P1130LCounter = -1;
         public boolean isIp65504P1130LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1130LCounter != sharedCounter;
            localIp65504P1130LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1130_L_LEN = 2;
  	/**
	 * serializeIp65504P1130L
	 */
	protected void serializeIp65504P1130L(short ip65504P1130L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1130L,IP_65504_P_1130_L_LEN)
                  ,beginIp65504P1130L
                  ,IP_65504_P_1130_L_LEN
                 );
            localIp65504P1130LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1130LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1130L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1130L() {	 
			return (getShort(beginIp65504P1130L));
   	}
         int localIp65504P1131SCounter = -1;
         public boolean isIp65504P1131SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1131SCounter != sharedCounter;
            localIp65504P1131SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1131_S_LEN = 2;
  	/**
	 * serializeIp65504P1131S
	 */
	protected void serializeIp65504P1131S(short ip65504P1131S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1131S,IP_65504_P_1131_S_LEN)
                  ,beginIp65504P1131S
                  ,IP_65504_P_1131_S_LEN
                 );
            localIp65504P1131SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1131SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1131S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1131S() {	 
			return (getShort(beginIp65504P1131S));
   	}
         int localIp65504P1131LCounter = -1;
         public boolean isIp65504P1131LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1131LCounter != sharedCounter;
            localIp65504P1131LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1131_L_LEN = 2;
  	/**
	 * serializeIp65504P1131L
	 */
	protected void serializeIp65504P1131L(short ip65504P1131L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1131L,IP_65504_P_1131_L_LEN)
                  ,beginIp65504P1131L
                  ,IP_65504_P_1131_L_LEN
                 );
            localIp65504P1131LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1131LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1131L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1131L() {	 
			return (getShort(beginIp65504P1131L));
   	}
         int localIp65504P1132SCounter = -1;
         public boolean isIp65504P1132SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1132SCounter != sharedCounter;
            localIp65504P1132SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1132_S_LEN = 2;
  	/**
	 * serializeIp65504P1132S
	 */
	protected void serializeIp65504P1132S(short ip65504P1132S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1132S,IP_65504_P_1132_S_LEN)
                  ,beginIp65504P1132S
                  ,IP_65504_P_1132_S_LEN
                 );
            localIp65504P1132SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1132SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1132S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1132S() {	 
			return (getShort(beginIp65504P1132S));
   	}
         int localIp65504P1132LCounter = -1;
         public boolean isIp65504P1132LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1132LCounter != sharedCounter;
            localIp65504P1132LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1132_L_LEN = 2;
  	/**
	 * serializeIp65504P1132L
	 */
	protected void serializeIp65504P1132L(short ip65504P1132L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1132L,IP_65504_P_1132_L_LEN)
                  ,beginIp65504P1132L
                  ,IP_65504_P_1132_L_LEN
                 );
            localIp65504P1132LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1132LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1132L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1132L() {	 
			return (getShort(beginIp65504P1132L));
   	}
         int localIp65504P1133SCounter = -1;
         public boolean isIp65504P1133SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1133SCounter != sharedCounter;
            localIp65504P1133SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1133_S_LEN = 2;
  	/**
	 * serializeIp65504P1133S
	 */
	protected void serializeIp65504P1133S(short ip65504P1133S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1133S,IP_65504_P_1133_S_LEN)
                  ,beginIp65504P1133S
                  ,IP_65504_P_1133_S_LEN
                 );
            localIp65504P1133SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1133SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1133S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1133S() {	 
			return (getShort(beginIp65504P1133S));
   	}
         int localIp65504P1133LCounter = -1;
         public boolean isIp65504P1133LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1133LCounter != sharedCounter;
            localIp65504P1133LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1133_L_LEN = 2;
  	/**
	 * serializeIp65504P1133L
	 */
	protected void serializeIp65504P1133L(short ip65504P1133L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1133L,IP_65504_P_1133_L_LEN)
                  ,beginIp65504P1133L
                  ,IP_65504_P_1133_L_LEN
                 );
            localIp65504P1133LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1133LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1133L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1133L() {	 
			return (getShort(beginIp65504P1133L));
   	}
         int localIp65504P1134SCounter = -1;
         public boolean isIp65504P1134SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1134SCounter != sharedCounter;
            localIp65504P1134SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1134_S_LEN = 2;
  	/**
	 * serializeIp65504P1134S
	 */
	protected void serializeIp65504P1134S(short ip65504P1134S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1134S,IP_65504_P_1134_S_LEN)
                  ,beginIp65504P1134S
                  ,IP_65504_P_1134_S_LEN
                 );
            localIp65504P1134SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1134SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1134S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1134S() {	 
			return (getShort(beginIp65504P1134S));
   	}
         int localIp65504P1134LCounter = -1;
         public boolean isIp65504P1134LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1134LCounter != sharedCounter;
            localIp65504P1134LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1134_L_LEN = 2;
  	/**
	 * serializeIp65504P1134L
	 */
	protected void serializeIp65504P1134L(short ip65504P1134L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1134L,IP_65504_P_1134_L_LEN)
                  ,beginIp65504P1134L
                  ,IP_65504_P_1134_L_LEN
                 );
            localIp65504P1134LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1134LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1134L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1134L() {	 
			return (getShort(beginIp65504P1134L));
   	}
         int localIp65504P1135SCounter = -1;
         public boolean isIp65504P1135SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1135SCounter != sharedCounter;
            localIp65504P1135SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1135_S_LEN = 2;
  	/**
	 * serializeIp65504P1135S
	 */
	protected void serializeIp65504P1135S(short ip65504P1135S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1135S,IP_65504_P_1135_S_LEN)
                  ,beginIp65504P1135S
                  ,IP_65504_P_1135_S_LEN
                 );
            localIp65504P1135SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1135SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1135S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1135S() {	 
			return (getShort(beginIp65504P1135S));
   	}
         int localIp65504P1135LCounter = -1;
         public boolean isIp65504P1135LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1135LCounter != sharedCounter;
            localIp65504P1135LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1135_L_LEN = 2;
  	/**
	 * serializeIp65504P1135L
	 */
	protected void serializeIp65504P1135L(short ip65504P1135L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1135L,IP_65504_P_1135_L_LEN)
                  ,beginIp65504P1135L
                  ,IP_65504_P_1135_L_LEN
                 );
            localIp65504P1135LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1135LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1135L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1135L() {	 
			return (getShort(beginIp65504P1135L));
   	}
         int localIp65504P1136SCounter = -1;
         public boolean isIp65504P1136SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1136SCounter != sharedCounter;
            localIp65504P1136SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1136_S_LEN = 2;
  	/**
	 * serializeIp65504P1136S
	 */
	protected void serializeIp65504P1136S(short ip65504P1136S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1136S,IP_65504_P_1136_S_LEN)
                  ,beginIp65504P1136S
                  ,IP_65504_P_1136_S_LEN
                 );
            localIp65504P1136SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1136SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1136S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1136S() {	 
			return (getShort(beginIp65504P1136S));
   	}
         int localIp65504P1136LCounter = -1;
         public boolean isIp65504P1136LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1136LCounter != sharedCounter;
            localIp65504P1136LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1136_L_LEN = 2;
  	/**
	 * serializeIp65504P1136L
	 */
	protected void serializeIp65504P1136L(short ip65504P1136L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1136L,IP_65504_P_1136_L_LEN)
                  ,beginIp65504P1136L
                  ,IP_65504_P_1136_L_LEN
                 );
            localIp65504P1136LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1136LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1136L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1136L() {	 
			return (getShort(beginIp65504P1136L));
   	}
         int localIp65504P1137SCounter = -1;
         public boolean isIp65504P1137SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1137SCounter != sharedCounter;
            localIp65504P1137SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1137_S_LEN = 2;
  	/**
	 * serializeIp65504P1137S
	 */
	protected void serializeIp65504P1137S(short ip65504P1137S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1137S,IP_65504_P_1137_S_LEN)
                  ,beginIp65504P1137S
                  ,IP_65504_P_1137_S_LEN
                 );
            localIp65504P1137SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1137SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1137S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1137S() {	 
			return (getShort(beginIp65504P1137S));
   	}
         int localIp65504P1137LCounter = -1;
         public boolean isIp65504P1137LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1137LCounter != sharedCounter;
            localIp65504P1137LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1137_L_LEN = 2;
  	/**
	 * serializeIp65504P1137L
	 */
	protected void serializeIp65504P1137L(short ip65504P1137L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1137L,IP_65504_P_1137_L_LEN)
                  ,beginIp65504P1137L
                  ,IP_65504_P_1137_L_LEN
                 );
            localIp65504P1137LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1137LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1137L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1137L() {	 
			return (getShort(beginIp65504P1137L));
   	}
         int localIp65504P1138SCounter = -1;
         public boolean isIp65504P1138SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1138SCounter != sharedCounter;
            localIp65504P1138SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1138_S_LEN = 2;
  	/**
	 * serializeIp65504P1138S
	 */
	protected void serializeIp65504P1138S(short ip65504P1138S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1138S,IP_65504_P_1138_S_LEN)
                  ,beginIp65504P1138S
                  ,IP_65504_P_1138_S_LEN
                 );
            localIp65504P1138SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1138SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1138S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1138S() {	 
			return (getShort(beginIp65504P1138S));
   	}
         int localIp65504P1138LCounter = -1;
         public boolean isIp65504P1138LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1138LCounter != sharedCounter;
            localIp65504P1138LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1138_L_LEN = 2;
  	/**
	 * serializeIp65504P1138L
	 */
	protected void serializeIp65504P1138L(short ip65504P1138L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1138L,IP_65504_P_1138_L_LEN)
                  ,beginIp65504P1138L
                  ,IP_65504_P_1138_L_LEN
                 );
            localIp65504P1138LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1138LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1138L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1138L() {	 
			return (getShort(beginIp65504P1138L));
   	}
         int localIp65504P1139SCounter = -1;
         public boolean isIp65504P1139SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1139SCounter != sharedCounter;
            localIp65504P1139SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1139_S_LEN = 2;
  	/**
	 * serializeIp65504P1139S
	 */
	protected void serializeIp65504P1139S(short ip65504P1139S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1139S,IP_65504_P_1139_S_LEN)
                  ,beginIp65504P1139S
                  ,IP_65504_P_1139_S_LEN
                 );
            localIp65504P1139SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1139SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1139S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1139S() {	 
			return (getShort(beginIp65504P1139S));
   	}
         int localIp65504P1139LCounter = -1;
         public boolean isIp65504P1139LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1139LCounter != sharedCounter;
            localIp65504P1139LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1139_L_LEN = 2;
  	/**
	 * serializeIp65504P1139L
	 */
	protected void serializeIp65504P1139L(short ip65504P1139L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1139L,IP_65504_P_1139_L_LEN)
                  ,beginIp65504P1139L
                  ,IP_65504_P_1139_L_LEN
                 );
            localIp65504P1139LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1139LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1139L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1139L() {	 
			return (getShort(beginIp65504P1139L));
   	}
         int localIp65504P1140SCounter = -1;
         public boolean isIp65504P1140SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1140SCounter != sharedCounter;
            localIp65504P1140SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1140_S_LEN = 2;
  	/**
	 * serializeIp65504P1140S
	 */
	protected void serializeIp65504P1140S(short ip65504P1140S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1140S,IP_65504_P_1140_S_LEN)
                  ,beginIp65504P1140S
                  ,IP_65504_P_1140_S_LEN
                 );
            localIp65504P1140SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1140SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1140S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1140S() {	 
			return (getShort(beginIp65504P1140S));
   	}
         int localIp65504P1140LCounter = -1;
         public boolean isIp65504P1140LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1140LCounter != sharedCounter;
            localIp65504P1140LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1140_L_LEN = 2;
  	/**
	 * serializeIp65504P1140L
	 */
	protected void serializeIp65504P1140L(short ip65504P1140L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1140L,IP_65504_P_1140_L_LEN)
                  ,beginIp65504P1140L
                  ,IP_65504_P_1140_L_LEN
                 );
            localIp65504P1140LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1140LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1140L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1140L() {	 
			return (getShort(beginIp65504P1140L));
   	}
         int localIp65504P1141SCounter = -1;
         public boolean isIp65504P1141SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1141SCounter != sharedCounter;
            localIp65504P1141SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1141_S_LEN = 2;
  	/**
	 * serializeIp65504P1141S
	 */
	protected void serializeIp65504P1141S(short ip65504P1141S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1141S,IP_65504_P_1141_S_LEN)
                  ,beginIp65504P1141S
                  ,IP_65504_P_1141_S_LEN
                 );
            localIp65504P1141SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1141SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1141S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1141S() {	 
			return (getShort(beginIp65504P1141S));
   	}
         int localIp65504P1141LCounter = -1;
         public boolean isIp65504P1141LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1141LCounter != sharedCounter;
            localIp65504P1141LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1141_L_LEN = 2;
  	/**
	 * serializeIp65504P1141L
	 */
	protected void serializeIp65504P1141L(short ip65504P1141L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1141L,IP_65504_P_1141_L_LEN)
                  ,beginIp65504P1141L
                  ,IP_65504_P_1141_L_LEN
                 );
            localIp65504P1141LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1141LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1141L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1141L() {	 
			return (getShort(beginIp65504P1141L));
   	}
         int localIp65504P1142SCounter = -1;
         public boolean isIp65504P1142SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1142SCounter != sharedCounter;
            localIp65504P1142SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1142_S_LEN = 2;
  	/**
	 * serializeIp65504P1142S
	 */
	protected void serializeIp65504P1142S(short ip65504P1142S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1142S,IP_65504_P_1142_S_LEN)
                  ,beginIp65504P1142S
                  ,IP_65504_P_1142_S_LEN
                 );
            localIp65504P1142SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1142SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1142S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1142S() {	 
			return (getShort(beginIp65504P1142S));
   	}
         int localIp65504P1142LCounter = -1;
         public boolean isIp65504P1142LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1142LCounter != sharedCounter;
            localIp65504P1142LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1142_L_LEN = 2;
  	/**
	 * serializeIp65504P1142L
	 */
	protected void serializeIp65504P1142L(short ip65504P1142L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1142L,IP_65504_P_1142_L_LEN)
                  ,beginIp65504P1142L
                  ,IP_65504_P_1142_L_LEN
                 );
            localIp65504P1142LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1142LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1142L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1142L() {	 
			return (getShort(beginIp65504P1142L));
   	}
         int localIp65504P1143SCounter = -1;
         public boolean isIp65504P1143SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1143SCounter != sharedCounter;
            localIp65504P1143SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1143_S_LEN = 2;
  	/**
	 * serializeIp65504P1143S
	 */
	protected void serializeIp65504P1143S(short ip65504P1143S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1143S,IP_65504_P_1143_S_LEN)
                  ,beginIp65504P1143S
                  ,IP_65504_P_1143_S_LEN
                 );
            localIp65504P1143SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1143SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1143S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1143S() {	 
			return (getShort(beginIp65504P1143S));
   	}
         int localIp65504P1143LCounter = -1;
         public boolean isIp65504P1143LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1143LCounter != sharedCounter;
            localIp65504P1143LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1143_L_LEN = 2;
  	/**
	 * serializeIp65504P1143L
	 */
	protected void serializeIp65504P1143L(short ip65504P1143L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1143L,IP_65504_P_1143_L_LEN)
                  ,beginIp65504P1143L
                  ,IP_65504_P_1143_L_LEN
                 );
            localIp65504P1143LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1143LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1143L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1143L() {	 
			return (getShort(beginIp65504P1143L));
   	}
         int localIp65504P1144SCounter = -1;
         public boolean isIp65504P1144SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1144SCounter != sharedCounter;
            localIp65504P1144SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1144_S_LEN = 2;
  	/**
	 * serializeIp65504P1144S
	 */
	protected void serializeIp65504P1144S(short ip65504P1144S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1144S,IP_65504_P_1144_S_LEN)
                  ,beginIp65504P1144S
                  ,IP_65504_P_1144_S_LEN
                 );
            localIp65504P1144SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1144SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1144S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1144S() {	 
			return (getShort(beginIp65504P1144S));
   	}
         int localIp65504P1144LCounter = -1;
         public boolean isIp65504P1144LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1144LCounter != sharedCounter;
            localIp65504P1144LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1144_L_LEN = 2;
  	/**
	 * serializeIp65504P1144L
	 */
	protected void serializeIp65504P1144L(short ip65504P1144L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1144L,IP_65504_P_1144_L_LEN)
                  ,beginIp65504P1144L
                  ,IP_65504_P_1144_L_LEN
                 );
            localIp65504P1144LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1144LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1144L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1144L() {	 
			return (getShort(beginIp65504P1144L));
   	}
         int localIp65504P1145SCounter = -1;
         public boolean isIp65504P1145SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1145SCounter != sharedCounter;
            localIp65504P1145SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1145_S_LEN = 2;
  	/**
	 * serializeIp65504P1145S
	 */
	protected void serializeIp65504P1145S(short ip65504P1145S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1145S,IP_65504_P_1145_S_LEN)
                  ,beginIp65504P1145S
                  ,IP_65504_P_1145_S_LEN
                 );
            localIp65504P1145SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1145SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1145S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1145S() {	 
			return (getShort(beginIp65504P1145S));
   	}
         int localIp65504P1145LCounter = -1;
         public boolean isIp65504P1145LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1145LCounter != sharedCounter;
            localIp65504P1145LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1145_L_LEN = 2;
  	/**
	 * serializeIp65504P1145L
	 */
	protected void serializeIp65504P1145L(short ip65504P1145L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1145L,IP_65504_P_1145_L_LEN)
                  ,beginIp65504P1145L
                  ,IP_65504_P_1145_L_LEN
                 );
            localIp65504P1145LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1145LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1145L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1145L() {	 
			return (getShort(beginIp65504P1145L));
   	}
         int localIp65504P1146SCounter = -1;
         public boolean isIp65504P1146SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1146SCounter != sharedCounter;
            localIp65504P1146SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1146_S_LEN = 2;
  	/**
	 * serializeIp65504P1146S
	 */
	protected void serializeIp65504P1146S(short ip65504P1146S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1146S,IP_65504_P_1146_S_LEN)
                  ,beginIp65504P1146S
                  ,IP_65504_P_1146_S_LEN
                 );
            localIp65504P1146SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1146SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1146S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1146S() {	 
			return (getShort(beginIp65504P1146S));
   	}
         int localIp65504P1146LCounter = -1;
         public boolean isIp65504P1146LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1146LCounter != sharedCounter;
            localIp65504P1146LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1146_L_LEN = 2;
  	/**
	 * serializeIp65504P1146L
	 */
	protected void serializeIp65504P1146L(short ip65504P1146L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1146L,IP_65504_P_1146_L_LEN)
                  ,beginIp65504P1146L
                  ,IP_65504_P_1146_L_LEN
                 );
            localIp65504P1146LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1146LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1146L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1146L() {	 
			return (getShort(beginIp65504P1146L));
   	}
         int localIp65504P1147SCounter = -1;
         public boolean isIp65504P1147SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1147SCounter != sharedCounter;
            localIp65504P1147SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1147_S_LEN = 2;
  	/**
	 * serializeIp65504P1147S
	 */
	protected void serializeIp65504P1147S(short ip65504P1147S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1147S,IP_65504_P_1147_S_LEN)
                  ,beginIp65504P1147S
                  ,IP_65504_P_1147_S_LEN
                 );
            localIp65504P1147SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1147SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1147S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1147S() {	 
			return (getShort(beginIp65504P1147S));
   	}
         int localIp65504P1147LCounter = -1;
         public boolean isIp65504P1147LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1147LCounter != sharedCounter;
            localIp65504P1147LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1147_L_LEN = 2;
  	/**
	 * serializeIp65504P1147L
	 */
	protected void serializeIp65504P1147L(short ip65504P1147L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1147L,IP_65504_P_1147_L_LEN)
                  ,beginIp65504P1147L
                  ,IP_65504_P_1147_L_LEN
                 );
            localIp65504P1147LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1147LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1147L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1147L() {	 
			return (getShort(beginIp65504P1147L));
   	}




}
  
