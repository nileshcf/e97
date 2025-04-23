package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup41Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup41Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup41Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_41_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1241S;
            protected  int beginIp65504P1241L;
            protected  int beginIp65504P1242S;
            protected  int beginIp65504P1242L;
            protected  int beginIp65504P1243S;
            protected  int beginIp65504P1243L;
            protected  int beginIp65504P1244S;
            protected  int beginIp65504P1244L;
            protected  int beginIp65504P1245S;
            protected  int beginIp65504P1245L;
            protected  int beginIp65504P1246S;
            protected  int beginIp65504P1246L;
            protected  int beginIp65504P1247S;
            protected  int beginIp65504P1247L;
            protected  int beginIp65504P1248S;
            protected  int beginIp65504P1248L;
            protected  int beginIp65504P1249S;
            protected  int beginIp65504P1249L;
            protected  int beginIp65504P1250S;
            protected  int beginIp65504P1250L;
            protected  int beginIp65504P1251S;
            protected  int beginIp65504P1251L;
            protected  int beginIp65504P1252S;
            protected  int beginIp65504P1252L;
            protected  int beginIp65504P1253S;
            protected  int beginIp65504P1253L;
            protected  int beginIp65504P1254S;
            protected  int beginIp65504P1254L;
            protected  int beginIp65504P1255S;
            protected  int beginIp65504P1255L;
            protected  int beginIp65504P1256S;
            protected  int beginIp65504P1256L;
            protected  int beginIp65504P1257S;
            protected  int beginIp65504P1257L;
            protected  int beginIp65504P1258S;
            protected  int beginIp65504P1258L;
            protected  int beginIp65504P1259S;
            protected  int beginIp65504P1259L;
            protected  int beginIp65504P1260S;
            protected  int beginIp65504P1260L;
            protected  int beginIp65504P1261S;
            protected  int beginIp65504P1261L;
            protected  int beginIp65504P1262S;
            protected  int beginIp65504P1262L;
            protected  int beginIp65504P1263S;
            protected  int beginIp65504P1263L;
            protected  int beginIp65504P1264S;
            protected  int beginIp65504P1264L;
            protected  int beginIp65504P1265S;
            protected  int beginIp65504P1265L;
            protected  int beginIp65504P1266S;
            protected  int beginIp65504P1266L;
            protected  int beginIp65504P1267S;
            protected  int beginIp65504P1267L;
            protected  int beginIp65504P1268S;
            protected  int beginIp65504P1268L;
            protected  int beginIp65504P1269S;
            protected  int beginIp65504P1269L;
            protected  int beginIp65504P1270S;
            protected  int beginIp65504P1270L;
            protected  int beginIp65504P1271S;
            protected  int beginIp65504P1271L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup41Serialized
	**/
    public Ip65504PdsNamesLargeGroup41Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup41Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup41Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup41Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9916); // serialize this field at offset 9916 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup41Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9916 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup41Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_41_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1241S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1241L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1242S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1242L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1243S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1243L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1244S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1244L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1245S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1245L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1246S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1246L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1247S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1247L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1248S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1248L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1249S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1249L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1250S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1250L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1251S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1251L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1252S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1252L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1253S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1253L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1254S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1254L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1255S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1255L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1256S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1256L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1257S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1257L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1258S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1258L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1259S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1259L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1260S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1260L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1261S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1261L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1262S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1262L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1263S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1263L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1264S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1264L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1265S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1265L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1266S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1266L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1267S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1267L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1268S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1268L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1269S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1269L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1270S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1270L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1271S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1271L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1241SCounter = -1;
         public boolean isIp65504P1241SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1241SCounter != sharedCounter;
            localIp65504P1241SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1241_S_LEN = 2;
  	/**
	 * serializeIp65504P1241S
	 */
	protected void serializeIp65504P1241S(short ip65504P1241S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1241S,IP_65504_P_1241_S_LEN)
                  ,beginIp65504P1241S
                  ,IP_65504_P_1241_S_LEN
                 );
            localIp65504P1241SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1241SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1241S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1241S() {	 
			return (getShort(beginIp65504P1241S));
   	}
         int localIp65504P1241LCounter = -1;
         public boolean isIp65504P1241LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1241LCounter != sharedCounter;
            localIp65504P1241LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1241_L_LEN = 2;
  	/**
	 * serializeIp65504P1241L
	 */
	protected void serializeIp65504P1241L(short ip65504P1241L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1241L,IP_65504_P_1241_L_LEN)
                  ,beginIp65504P1241L
                  ,IP_65504_P_1241_L_LEN
                 );
            localIp65504P1241LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1241LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1241L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1241L() {	 
			return (getShort(beginIp65504P1241L));
   	}
         int localIp65504P1242SCounter = -1;
         public boolean isIp65504P1242SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1242SCounter != sharedCounter;
            localIp65504P1242SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1242_S_LEN = 2;
  	/**
	 * serializeIp65504P1242S
	 */
	protected void serializeIp65504P1242S(short ip65504P1242S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1242S,IP_65504_P_1242_S_LEN)
                  ,beginIp65504P1242S
                  ,IP_65504_P_1242_S_LEN
                 );
            localIp65504P1242SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1242SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1242S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1242S() {	 
			return (getShort(beginIp65504P1242S));
   	}
         int localIp65504P1242LCounter = -1;
         public boolean isIp65504P1242LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1242LCounter != sharedCounter;
            localIp65504P1242LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1242_L_LEN = 2;
  	/**
	 * serializeIp65504P1242L
	 */
	protected void serializeIp65504P1242L(short ip65504P1242L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1242L,IP_65504_P_1242_L_LEN)
                  ,beginIp65504P1242L
                  ,IP_65504_P_1242_L_LEN
                 );
            localIp65504P1242LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1242LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1242L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1242L() {	 
			return (getShort(beginIp65504P1242L));
   	}
         int localIp65504P1243SCounter = -1;
         public boolean isIp65504P1243SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1243SCounter != sharedCounter;
            localIp65504P1243SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1243_S_LEN = 2;
  	/**
	 * serializeIp65504P1243S
	 */
	protected void serializeIp65504P1243S(short ip65504P1243S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1243S,IP_65504_P_1243_S_LEN)
                  ,beginIp65504P1243S
                  ,IP_65504_P_1243_S_LEN
                 );
            localIp65504P1243SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1243SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1243S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1243S() {	 
			return (getShort(beginIp65504P1243S));
   	}
         int localIp65504P1243LCounter = -1;
         public boolean isIp65504P1243LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1243LCounter != sharedCounter;
            localIp65504P1243LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1243_L_LEN = 2;
  	/**
	 * serializeIp65504P1243L
	 */
	protected void serializeIp65504P1243L(short ip65504P1243L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1243L,IP_65504_P_1243_L_LEN)
                  ,beginIp65504P1243L
                  ,IP_65504_P_1243_L_LEN
                 );
            localIp65504P1243LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1243LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1243L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1243L() {	 
			return (getShort(beginIp65504P1243L));
   	}
         int localIp65504P1244SCounter = -1;
         public boolean isIp65504P1244SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1244SCounter != sharedCounter;
            localIp65504P1244SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1244_S_LEN = 2;
  	/**
	 * serializeIp65504P1244S
	 */
	protected void serializeIp65504P1244S(short ip65504P1244S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1244S,IP_65504_P_1244_S_LEN)
                  ,beginIp65504P1244S
                  ,IP_65504_P_1244_S_LEN
                 );
            localIp65504P1244SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1244SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1244S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1244S() {	 
			return (getShort(beginIp65504P1244S));
   	}
         int localIp65504P1244LCounter = -1;
         public boolean isIp65504P1244LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1244LCounter != sharedCounter;
            localIp65504P1244LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1244_L_LEN = 2;
  	/**
	 * serializeIp65504P1244L
	 */
	protected void serializeIp65504P1244L(short ip65504P1244L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1244L,IP_65504_P_1244_L_LEN)
                  ,beginIp65504P1244L
                  ,IP_65504_P_1244_L_LEN
                 );
            localIp65504P1244LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1244LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1244L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1244L() {	 
			return (getShort(beginIp65504P1244L));
   	}
         int localIp65504P1245SCounter = -1;
         public boolean isIp65504P1245SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1245SCounter != sharedCounter;
            localIp65504P1245SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1245_S_LEN = 2;
  	/**
	 * serializeIp65504P1245S
	 */
	protected void serializeIp65504P1245S(short ip65504P1245S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1245S,IP_65504_P_1245_S_LEN)
                  ,beginIp65504P1245S
                  ,IP_65504_P_1245_S_LEN
                 );
            localIp65504P1245SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1245SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1245S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1245S() {	 
			return (getShort(beginIp65504P1245S));
   	}
         int localIp65504P1245LCounter = -1;
         public boolean isIp65504P1245LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1245LCounter != sharedCounter;
            localIp65504P1245LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1245_L_LEN = 2;
  	/**
	 * serializeIp65504P1245L
	 */
	protected void serializeIp65504P1245L(short ip65504P1245L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1245L,IP_65504_P_1245_L_LEN)
                  ,beginIp65504P1245L
                  ,IP_65504_P_1245_L_LEN
                 );
            localIp65504P1245LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1245LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1245L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1245L() {	 
			return (getShort(beginIp65504P1245L));
   	}
         int localIp65504P1246SCounter = -1;
         public boolean isIp65504P1246SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1246SCounter != sharedCounter;
            localIp65504P1246SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1246_S_LEN = 2;
  	/**
	 * serializeIp65504P1246S
	 */
	protected void serializeIp65504P1246S(short ip65504P1246S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1246S,IP_65504_P_1246_S_LEN)
                  ,beginIp65504P1246S
                  ,IP_65504_P_1246_S_LEN
                 );
            localIp65504P1246SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1246SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1246S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1246S() {	 
			return (getShort(beginIp65504P1246S));
   	}
         int localIp65504P1246LCounter = -1;
         public boolean isIp65504P1246LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1246LCounter != sharedCounter;
            localIp65504P1246LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1246_L_LEN = 2;
  	/**
	 * serializeIp65504P1246L
	 */
	protected void serializeIp65504P1246L(short ip65504P1246L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1246L,IP_65504_P_1246_L_LEN)
                  ,beginIp65504P1246L
                  ,IP_65504_P_1246_L_LEN
                 );
            localIp65504P1246LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1246LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1246L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1246L() {	 
			return (getShort(beginIp65504P1246L));
   	}
         int localIp65504P1247SCounter = -1;
         public boolean isIp65504P1247SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1247SCounter != sharedCounter;
            localIp65504P1247SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1247_S_LEN = 2;
  	/**
	 * serializeIp65504P1247S
	 */
	protected void serializeIp65504P1247S(short ip65504P1247S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1247S,IP_65504_P_1247_S_LEN)
                  ,beginIp65504P1247S
                  ,IP_65504_P_1247_S_LEN
                 );
            localIp65504P1247SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1247SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1247S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1247S() {	 
			return (getShort(beginIp65504P1247S));
   	}
         int localIp65504P1247LCounter = -1;
         public boolean isIp65504P1247LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1247LCounter != sharedCounter;
            localIp65504P1247LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1247_L_LEN = 2;
  	/**
	 * serializeIp65504P1247L
	 */
	protected void serializeIp65504P1247L(short ip65504P1247L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1247L,IP_65504_P_1247_L_LEN)
                  ,beginIp65504P1247L
                  ,IP_65504_P_1247_L_LEN
                 );
            localIp65504P1247LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1247LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1247L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1247L() {	 
			return (getShort(beginIp65504P1247L));
   	}
         int localIp65504P1248SCounter = -1;
         public boolean isIp65504P1248SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1248SCounter != sharedCounter;
            localIp65504P1248SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1248_S_LEN = 2;
  	/**
	 * serializeIp65504P1248S
	 */
	protected void serializeIp65504P1248S(short ip65504P1248S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1248S,IP_65504_P_1248_S_LEN)
                  ,beginIp65504P1248S
                  ,IP_65504_P_1248_S_LEN
                 );
            localIp65504P1248SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1248SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1248S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1248S() {	 
			return (getShort(beginIp65504P1248S));
   	}
         int localIp65504P1248LCounter = -1;
         public boolean isIp65504P1248LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1248LCounter != sharedCounter;
            localIp65504P1248LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1248_L_LEN = 2;
  	/**
	 * serializeIp65504P1248L
	 */
	protected void serializeIp65504P1248L(short ip65504P1248L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1248L,IP_65504_P_1248_L_LEN)
                  ,beginIp65504P1248L
                  ,IP_65504_P_1248_L_LEN
                 );
            localIp65504P1248LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1248LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1248L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1248L() {	 
			return (getShort(beginIp65504P1248L));
   	}
         int localIp65504P1249SCounter = -1;
         public boolean isIp65504P1249SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1249SCounter != sharedCounter;
            localIp65504P1249SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1249_S_LEN = 2;
  	/**
	 * serializeIp65504P1249S
	 */
	protected void serializeIp65504P1249S(short ip65504P1249S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1249S,IP_65504_P_1249_S_LEN)
                  ,beginIp65504P1249S
                  ,IP_65504_P_1249_S_LEN
                 );
            localIp65504P1249SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1249SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1249S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1249S() {	 
			return (getShort(beginIp65504P1249S));
   	}
         int localIp65504P1249LCounter = -1;
         public boolean isIp65504P1249LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1249LCounter != sharedCounter;
            localIp65504P1249LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1249_L_LEN = 2;
  	/**
	 * serializeIp65504P1249L
	 */
	protected void serializeIp65504P1249L(short ip65504P1249L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1249L,IP_65504_P_1249_L_LEN)
                  ,beginIp65504P1249L
                  ,IP_65504_P_1249_L_LEN
                 );
            localIp65504P1249LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1249LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1249L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1249L() {	 
			return (getShort(beginIp65504P1249L));
   	}
         int localIp65504P1250SCounter = -1;
         public boolean isIp65504P1250SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1250SCounter != sharedCounter;
            localIp65504P1250SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1250_S_LEN = 2;
  	/**
	 * serializeIp65504P1250S
	 */
	protected void serializeIp65504P1250S(short ip65504P1250S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1250S,IP_65504_P_1250_S_LEN)
                  ,beginIp65504P1250S
                  ,IP_65504_P_1250_S_LEN
                 );
            localIp65504P1250SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1250SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1250S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1250S() {	 
			return (getShort(beginIp65504P1250S));
   	}
         int localIp65504P1250LCounter = -1;
         public boolean isIp65504P1250LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1250LCounter != sharedCounter;
            localIp65504P1250LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1250_L_LEN = 2;
  	/**
	 * serializeIp65504P1250L
	 */
	protected void serializeIp65504P1250L(short ip65504P1250L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1250L,IP_65504_P_1250_L_LEN)
                  ,beginIp65504P1250L
                  ,IP_65504_P_1250_L_LEN
                 );
            localIp65504P1250LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1250LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1250L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1250L() {	 
			return (getShort(beginIp65504P1250L));
   	}
         int localIp65504P1251SCounter = -1;
         public boolean isIp65504P1251SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1251SCounter != sharedCounter;
            localIp65504P1251SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1251_S_LEN = 2;
  	/**
	 * serializeIp65504P1251S
	 */
	protected void serializeIp65504P1251S(short ip65504P1251S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1251S,IP_65504_P_1251_S_LEN)
                  ,beginIp65504P1251S
                  ,IP_65504_P_1251_S_LEN
                 );
            localIp65504P1251SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1251SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1251S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1251S() {	 
			return (getShort(beginIp65504P1251S));
   	}
         int localIp65504P1251LCounter = -1;
         public boolean isIp65504P1251LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1251LCounter != sharedCounter;
            localIp65504P1251LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1251_L_LEN = 2;
  	/**
	 * serializeIp65504P1251L
	 */
	protected void serializeIp65504P1251L(short ip65504P1251L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1251L,IP_65504_P_1251_L_LEN)
                  ,beginIp65504P1251L
                  ,IP_65504_P_1251_L_LEN
                 );
            localIp65504P1251LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1251LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1251L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1251L() {	 
			return (getShort(beginIp65504P1251L));
   	}
         int localIp65504P1252SCounter = -1;
         public boolean isIp65504P1252SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1252SCounter != sharedCounter;
            localIp65504P1252SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1252_S_LEN = 2;
  	/**
	 * serializeIp65504P1252S
	 */
	protected void serializeIp65504P1252S(short ip65504P1252S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1252S,IP_65504_P_1252_S_LEN)
                  ,beginIp65504P1252S
                  ,IP_65504_P_1252_S_LEN
                 );
            localIp65504P1252SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1252SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1252S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1252S() {	 
			return (getShort(beginIp65504P1252S));
   	}
         int localIp65504P1252LCounter = -1;
         public boolean isIp65504P1252LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1252LCounter != sharedCounter;
            localIp65504P1252LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1252_L_LEN = 2;
  	/**
	 * serializeIp65504P1252L
	 */
	protected void serializeIp65504P1252L(short ip65504P1252L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1252L,IP_65504_P_1252_L_LEN)
                  ,beginIp65504P1252L
                  ,IP_65504_P_1252_L_LEN
                 );
            localIp65504P1252LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1252LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1252L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1252L() {	 
			return (getShort(beginIp65504P1252L));
   	}
         int localIp65504P1253SCounter = -1;
         public boolean isIp65504P1253SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1253SCounter != sharedCounter;
            localIp65504P1253SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1253_S_LEN = 2;
  	/**
	 * serializeIp65504P1253S
	 */
	protected void serializeIp65504P1253S(short ip65504P1253S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1253S,IP_65504_P_1253_S_LEN)
                  ,beginIp65504P1253S
                  ,IP_65504_P_1253_S_LEN
                 );
            localIp65504P1253SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1253SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1253S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1253S() {	 
			return (getShort(beginIp65504P1253S));
   	}
         int localIp65504P1253LCounter = -1;
         public boolean isIp65504P1253LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1253LCounter != sharedCounter;
            localIp65504P1253LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1253_L_LEN = 2;
  	/**
	 * serializeIp65504P1253L
	 */
	protected void serializeIp65504P1253L(short ip65504P1253L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1253L,IP_65504_P_1253_L_LEN)
                  ,beginIp65504P1253L
                  ,IP_65504_P_1253_L_LEN
                 );
            localIp65504P1253LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1253LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1253L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1253L() {	 
			return (getShort(beginIp65504P1253L));
   	}
         int localIp65504P1254SCounter = -1;
         public boolean isIp65504P1254SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1254SCounter != sharedCounter;
            localIp65504P1254SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1254_S_LEN = 2;
  	/**
	 * serializeIp65504P1254S
	 */
	protected void serializeIp65504P1254S(short ip65504P1254S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1254S,IP_65504_P_1254_S_LEN)
                  ,beginIp65504P1254S
                  ,IP_65504_P_1254_S_LEN
                 );
            localIp65504P1254SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1254SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1254S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1254S() {	 
			return (getShort(beginIp65504P1254S));
   	}
         int localIp65504P1254LCounter = -1;
         public boolean isIp65504P1254LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1254LCounter != sharedCounter;
            localIp65504P1254LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1254_L_LEN = 2;
  	/**
	 * serializeIp65504P1254L
	 */
	protected void serializeIp65504P1254L(short ip65504P1254L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1254L,IP_65504_P_1254_L_LEN)
                  ,beginIp65504P1254L
                  ,IP_65504_P_1254_L_LEN
                 );
            localIp65504P1254LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1254LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1254L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1254L() {	 
			return (getShort(beginIp65504P1254L));
   	}
         int localIp65504P1255SCounter = -1;
         public boolean isIp65504P1255SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1255SCounter != sharedCounter;
            localIp65504P1255SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1255_S_LEN = 2;
  	/**
	 * serializeIp65504P1255S
	 */
	protected void serializeIp65504P1255S(short ip65504P1255S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1255S,IP_65504_P_1255_S_LEN)
                  ,beginIp65504P1255S
                  ,IP_65504_P_1255_S_LEN
                 );
            localIp65504P1255SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1255SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1255S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1255S() {	 
			return (getShort(beginIp65504P1255S));
   	}
         int localIp65504P1255LCounter = -1;
         public boolean isIp65504P1255LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1255LCounter != sharedCounter;
            localIp65504P1255LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1255_L_LEN = 2;
  	/**
	 * serializeIp65504P1255L
	 */
	protected void serializeIp65504P1255L(short ip65504P1255L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1255L,IP_65504_P_1255_L_LEN)
                  ,beginIp65504P1255L
                  ,IP_65504_P_1255_L_LEN
                 );
            localIp65504P1255LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1255LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1255L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1255L() {	 
			return (getShort(beginIp65504P1255L));
   	}
         int localIp65504P1256SCounter = -1;
         public boolean isIp65504P1256SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1256SCounter != sharedCounter;
            localIp65504P1256SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1256_S_LEN = 2;
  	/**
	 * serializeIp65504P1256S
	 */
	protected void serializeIp65504P1256S(short ip65504P1256S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1256S,IP_65504_P_1256_S_LEN)
                  ,beginIp65504P1256S
                  ,IP_65504_P_1256_S_LEN
                 );
            localIp65504P1256SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1256SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1256S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1256S() {	 
			return (getShort(beginIp65504P1256S));
   	}
         int localIp65504P1256LCounter = -1;
         public boolean isIp65504P1256LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1256LCounter != sharedCounter;
            localIp65504P1256LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1256_L_LEN = 2;
  	/**
	 * serializeIp65504P1256L
	 */
	protected void serializeIp65504P1256L(short ip65504P1256L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1256L,IP_65504_P_1256_L_LEN)
                  ,beginIp65504P1256L
                  ,IP_65504_P_1256_L_LEN
                 );
            localIp65504P1256LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1256LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1256L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1256L() {	 
			return (getShort(beginIp65504P1256L));
   	}
         int localIp65504P1257SCounter = -1;
         public boolean isIp65504P1257SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1257SCounter != sharedCounter;
            localIp65504P1257SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1257_S_LEN = 2;
  	/**
	 * serializeIp65504P1257S
	 */
	protected void serializeIp65504P1257S(short ip65504P1257S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1257S,IP_65504_P_1257_S_LEN)
                  ,beginIp65504P1257S
                  ,IP_65504_P_1257_S_LEN
                 );
            localIp65504P1257SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1257SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1257S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1257S() {	 
			return (getShort(beginIp65504P1257S));
   	}
         int localIp65504P1257LCounter = -1;
         public boolean isIp65504P1257LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1257LCounter != sharedCounter;
            localIp65504P1257LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1257_L_LEN = 2;
  	/**
	 * serializeIp65504P1257L
	 */
	protected void serializeIp65504P1257L(short ip65504P1257L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1257L,IP_65504_P_1257_L_LEN)
                  ,beginIp65504P1257L
                  ,IP_65504_P_1257_L_LEN
                 );
            localIp65504P1257LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1257LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1257L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1257L() {	 
			return (getShort(beginIp65504P1257L));
   	}
         int localIp65504P1258SCounter = -1;
         public boolean isIp65504P1258SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1258SCounter != sharedCounter;
            localIp65504P1258SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1258_S_LEN = 2;
  	/**
	 * serializeIp65504P1258S
	 */
	protected void serializeIp65504P1258S(short ip65504P1258S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1258S,IP_65504_P_1258_S_LEN)
                  ,beginIp65504P1258S
                  ,IP_65504_P_1258_S_LEN
                 );
            localIp65504P1258SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1258SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1258S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1258S() {	 
			return (getShort(beginIp65504P1258S));
   	}
         int localIp65504P1258LCounter = -1;
         public boolean isIp65504P1258LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1258LCounter != sharedCounter;
            localIp65504P1258LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1258_L_LEN = 2;
  	/**
	 * serializeIp65504P1258L
	 */
	protected void serializeIp65504P1258L(short ip65504P1258L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1258L,IP_65504_P_1258_L_LEN)
                  ,beginIp65504P1258L
                  ,IP_65504_P_1258_L_LEN
                 );
            localIp65504P1258LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1258LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1258L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1258L() {	 
			return (getShort(beginIp65504P1258L));
   	}
         int localIp65504P1259SCounter = -1;
         public boolean isIp65504P1259SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1259SCounter != sharedCounter;
            localIp65504P1259SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1259_S_LEN = 2;
  	/**
	 * serializeIp65504P1259S
	 */
	protected void serializeIp65504P1259S(short ip65504P1259S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1259S,IP_65504_P_1259_S_LEN)
                  ,beginIp65504P1259S
                  ,IP_65504_P_1259_S_LEN
                 );
            localIp65504P1259SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1259SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1259S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1259S() {	 
			return (getShort(beginIp65504P1259S));
   	}
         int localIp65504P1259LCounter = -1;
         public boolean isIp65504P1259LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1259LCounter != sharedCounter;
            localIp65504P1259LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1259_L_LEN = 2;
  	/**
	 * serializeIp65504P1259L
	 */
	protected void serializeIp65504P1259L(short ip65504P1259L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1259L,IP_65504_P_1259_L_LEN)
                  ,beginIp65504P1259L
                  ,IP_65504_P_1259_L_LEN
                 );
            localIp65504P1259LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1259LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1259L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1259L() {	 
			return (getShort(beginIp65504P1259L));
   	}
         int localIp65504P1260SCounter = -1;
         public boolean isIp65504P1260SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1260SCounter != sharedCounter;
            localIp65504P1260SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1260_S_LEN = 2;
  	/**
	 * serializeIp65504P1260S
	 */
	protected void serializeIp65504P1260S(short ip65504P1260S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1260S,IP_65504_P_1260_S_LEN)
                  ,beginIp65504P1260S
                  ,IP_65504_P_1260_S_LEN
                 );
            localIp65504P1260SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1260SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1260S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1260S() {	 
			return (getShort(beginIp65504P1260S));
   	}
         int localIp65504P1260LCounter = -1;
         public boolean isIp65504P1260LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1260LCounter != sharedCounter;
            localIp65504P1260LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1260_L_LEN = 2;
  	/**
	 * serializeIp65504P1260L
	 */
	protected void serializeIp65504P1260L(short ip65504P1260L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1260L,IP_65504_P_1260_L_LEN)
                  ,beginIp65504P1260L
                  ,IP_65504_P_1260_L_LEN
                 );
            localIp65504P1260LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1260LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1260L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1260L() {	 
			return (getShort(beginIp65504P1260L));
   	}
         int localIp65504P1261SCounter = -1;
         public boolean isIp65504P1261SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1261SCounter != sharedCounter;
            localIp65504P1261SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1261_S_LEN = 2;
  	/**
	 * serializeIp65504P1261S
	 */
	protected void serializeIp65504P1261S(short ip65504P1261S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1261S,IP_65504_P_1261_S_LEN)
                  ,beginIp65504P1261S
                  ,IP_65504_P_1261_S_LEN
                 );
            localIp65504P1261SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1261SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1261S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1261S() {	 
			return (getShort(beginIp65504P1261S));
   	}
         int localIp65504P1261LCounter = -1;
         public boolean isIp65504P1261LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1261LCounter != sharedCounter;
            localIp65504P1261LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1261_L_LEN = 2;
  	/**
	 * serializeIp65504P1261L
	 */
	protected void serializeIp65504P1261L(short ip65504P1261L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1261L,IP_65504_P_1261_L_LEN)
                  ,beginIp65504P1261L
                  ,IP_65504_P_1261_L_LEN
                 );
            localIp65504P1261LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1261LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1261L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1261L() {	 
			return (getShort(beginIp65504P1261L));
   	}
         int localIp65504P1262SCounter = -1;
         public boolean isIp65504P1262SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1262SCounter != sharedCounter;
            localIp65504P1262SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1262_S_LEN = 2;
  	/**
	 * serializeIp65504P1262S
	 */
	protected void serializeIp65504P1262S(short ip65504P1262S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1262S,IP_65504_P_1262_S_LEN)
                  ,beginIp65504P1262S
                  ,IP_65504_P_1262_S_LEN
                 );
            localIp65504P1262SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1262SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1262S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1262S() {	 
			return (getShort(beginIp65504P1262S));
   	}
         int localIp65504P1262LCounter = -1;
         public boolean isIp65504P1262LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1262LCounter != sharedCounter;
            localIp65504P1262LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1262_L_LEN = 2;
  	/**
	 * serializeIp65504P1262L
	 */
	protected void serializeIp65504P1262L(short ip65504P1262L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1262L,IP_65504_P_1262_L_LEN)
                  ,beginIp65504P1262L
                  ,IP_65504_P_1262_L_LEN
                 );
            localIp65504P1262LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1262LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1262L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1262L() {	 
			return (getShort(beginIp65504P1262L));
   	}
         int localIp65504P1263SCounter = -1;
         public boolean isIp65504P1263SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1263SCounter != sharedCounter;
            localIp65504P1263SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1263_S_LEN = 2;
  	/**
	 * serializeIp65504P1263S
	 */
	protected void serializeIp65504P1263S(short ip65504P1263S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1263S,IP_65504_P_1263_S_LEN)
                  ,beginIp65504P1263S
                  ,IP_65504_P_1263_S_LEN
                 );
            localIp65504P1263SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1263SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1263S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1263S() {	 
			return (getShort(beginIp65504P1263S));
   	}
         int localIp65504P1263LCounter = -1;
         public boolean isIp65504P1263LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1263LCounter != sharedCounter;
            localIp65504P1263LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1263_L_LEN = 2;
  	/**
	 * serializeIp65504P1263L
	 */
	protected void serializeIp65504P1263L(short ip65504P1263L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1263L,IP_65504_P_1263_L_LEN)
                  ,beginIp65504P1263L
                  ,IP_65504_P_1263_L_LEN
                 );
            localIp65504P1263LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1263LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1263L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1263L() {	 
			return (getShort(beginIp65504P1263L));
   	}
         int localIp65504P1264SCounter = -1;
         public boolean isIp65504P1264SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1264SCounter != sharedCounter;
            localIp65504P1264SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1264_S_LEN = 2;
  	/**
	 * serializeIp65504P1264S
	 */
	protected void serializeIp65504P1264S(short ip65504P1264S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1264S,IP_65504_P_1264_S_LEN)
                  ,beginIp65504P1264S
                  ,IP_65504_P_1264_S_LEN
                 );
            localIp65504P1264SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1264SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1264S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1264S() {	 
			return (getShort(beginIp65504P1264S));
   	}
         int localIp65504P1264LCounter = -1;
         public boolean isIp65504P1264LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1264LCounter != sharedCounter;
            localIp65504P1264LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1264_L_LEN = 2;
  	/**
	 * serializeIp65504P1264L
	 */
	protected void serializeIp65504P1264L(short ip65504P1264L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1264L,IP_65504_P_1264_L_LEN)
                  ,beginIp65504P1264L
                  ,IP_65504_P_1264_L_LEN
                 );
            localIp65504P1264LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1264LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1264L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1264L() {	 
			return (getShort(beginIp65504P1264L));
   	}
         int localIp65504P1265SCounter = -1;
         public boolean isIp65504P1265SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1265SCounter != sharedCounter;
            localIp65504P1265SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1265_S_LEN = 2;
  	/**
	 * serializeIp65504P1265S
	 */
	protected void serializeIp65504P1265S(short ip65504P1265S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1265S,IP_65504_P_1265_S_LEN)
                  ,beginIp65504P1265S
                  ,IP_65504_P_1265_S_LEN
                 );
            localIp65504P1265SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1265SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1265S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1265S() {	 
			return (getShort(beginIp65504P1265S));
   	}
         int localIp65504P1265LCounter = -1;
         public boolean isIp65504P1265LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1265LCounter != sharedCounter;
            localIp65504P1265LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1265_L_LEN = 2;
  	/**
	 * serializeIp65504P1265L
	 */
	protected void serializeIp65504P1265L(short ip65504P1265L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1265L,IP_65504_P_1265_L_LEN)
                  ,beginIp65504P1265L
                  ,IP_65504_P_1265_L_LEN
                 );
            localIp65504P1265LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1265LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1265L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1265L() {	 
			return (getShort(beginIp65504P1265L));
   	}
         int localIp65504P1266SCounter = -1;
         public boolean isIp65504P1266SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1266SCounter != sharedCounter;
            localIp65504P1266SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1266_S_LEN = 2;
  	/**
	 * serializeIp65504P1266S
	 */
	protected void serializeIp65504P1266S(short ip65504P1266S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1266S,IP_65504_P_1266_S_LEN)
                  ,beginIp65504P1266S
                  ,IP_65504_P_1266_S_LEN
                 );
            localIp65504P1266SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1266SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1266S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1266S() {	 
			return (getShort(beginIp65504P1266S));
   	}
         int localIp65504P1266LCounter = -1;
         public boolean isIp65504P1266LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1266LCounter != sharedCounter;
            localIp65504P1266LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1266_L_LEN = 2;
  	/**
	 * serializeIp65504P1266L
	 */
	protected void serializeIp65504P1266L(short ip65504P1266L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1266L,IP_65504_P_1266_L_LEN)
                  ,beginIp65504P1266L
                  ,IP_65504_P_1266_L_LEN
                 );
            localIp65504P1266LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1266LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1266L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1266L() {	 
			return (getShort(beginIp65504P1266L));
   	}
         int localIp65504P1267SCounter = -1;
         public boolean isIp65504P1267SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1267SCounter != sharedCounter;
            localIp65504P1267SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1267_S_LEN = 2;
  	/**
	 * serializeIp65504P1267S
	 */
	protected void serializeIp65504P1267S(short ip65504P1267S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1267S,IP_65504_P_1267_S_LEN)
                  ,beginIp65504P1267S
                  ,IP_65504_P_1267_S_LEN
                 );
            localIp65504P1267SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1267SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1267S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1267S() {	 
			return (getShort(beginIp65504P1267S));
   	}
         int localIp65504P1267LCounter = -1;
         public boolean isIp65504P1267LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1267LCounter != sharedCounter;
            localIp65504P1267LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1267_L_LEN = 2;
  	/**
	 * serializeIp65504P1267L
	 */
	protected void serializeIp65504P1267L(short ip65504P1267L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1267L,IP_65504_P_1267_L_LEN)
                  ,beginIp65504P1267L
                  ,IP_65504_P_1267_L_LEN
                 );
            localIp65504P1267LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1267LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1267L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1267L() {	 
			return (getShort(beginIp65504P1267L));
   	}
         int localIp65504P1268SCounter = -1;
         public boolean isIp65504P1268SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1268SCounter != sharedCounter;
            localIp65504P1268SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1268_S_LEN = 2;
  	/**
	 * serializeIp65504P1268S
	 */
	protected void serializeIp65504P1268S(short ip65504P1268S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1268S,IP_65504_P_1268_S_LEN)
                  ,beginIp65504P1268S
                  ,IP_65504_P_1268_S_LEN
                 );
            localIp65504P1268SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1268SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1268S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1268S() {	 
			return (getShort(beginIp65504P1268S));
   	}
         int localIp65504P1268LCounter = -1;
         public boolean isIp65504P1268LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1268LCounter != sharedCounter;
            localIp65504P1268LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1268_L_LEN = 2;
  	/**
	 * serializeIp65504P1268L
	 */
	protected void serializeIp65504P1268L(short ip65504P1268L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1268L,IP_65504_P_1268_L_LEN)
                  ,beginIp65504P1268L
                  ,IP_65504_P_1268_L_LEN
                 );
            localIp65504P1268LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1268LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1268L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1268L() {	 
			return (getShort(beginIp65504P1268L));
   	}
         int localIp65504P1269SCounter = -1;
         public boolean isIp65504P1269SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1269SCounter != sharedCounter;
            localIp65504P1269SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1269_S_LEN = 2;
  	/**
	 * serializeIp65504P1269S
	 */
	protected void serializeIp65504P1269S(short ip65504P1269S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1269S,IP_65504_P_1269_S_LEN)
                  ,beginIp65504P1269S
                  ,IP_65504_P_1269_S_LEN
                 );
            localIp65504P1269SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1269SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1269S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1269S() {	 
			return (getShort(beginIp65504P1269S));
   	}
         int localIp65504P1269LCounter = -1;
         public boolean isIp65504P1269LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1269LCounter != sharedCounter;
            localIp65504P1269LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1269_L_LEN = 2;
  	/**
	 * serializeIp65504P1269L
	 */
	protected void serializeIp65504P1269L(short ip65504P1269L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1269L,IP_65504_P_1269_L_LEN)
                  ,beginIp65504P1269L
                  ,IP_65504_P_1269_L_LEN
                 );
            localIp65504P1269LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1269LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1269L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1269L() {	 
			return (getShort(beginIp65504P1269L));
   	}
         int localIp65504P1270SCounter = -1;
         public boolean isIp65504P1270SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1270SCounter != sharedCounter;
            localIp65504P1270SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1270_S_LEN = 2;
  	/**
	 * serializeIp65504P1270S
	 */
	protected void serializeIp65504P1270S(short ip65504P1270S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1270S,IP_65504_P_1270_S_LEN)
                  ,beginIp65504P1270S
                  ,IP_65504_P_1270_S_LEN
                 );
            localIp65504P1270SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1270SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1270S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1270S() {	 
			return (getShort(beginIp65504P1270S));
   	}
         int localIp65504P1270LCounter = -1;
         public boolean isIp65504P1270LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1270LCounter != sharedCounter;
            localIp65504P1270LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1270_L_LEN = 2;
  	/**
	 * serializeIp65504P1270L
	 */
	protected void serializeIp65504P1270L(short ip65504P1270L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1270L,IP_65504_P_1270_L_LEN)
                  ,beginIp65504P1270L
                  ,IP_65504_P_1270_L_LEN
                 );
            localIp65504P1270LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1270LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1270L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1270L() {	 
			return (getShort(beginIp65504P1270L));
   	}
         int localIp65504P1271SCounter = -1;
         public boolean isIp65504P1271SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1271SCounter != sharedCounter;
            localIp65504P1271SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1271_S_LEN = 2;
  	/**
	 * serializeIp65504P1271S
	 */
	protected void serializeIp65504P1271S(short ip65504P1271S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1271S,IP_65504_P_1271_S_LEN)
                  ,beginIp65504P1271S
                  ,IP_65504_P_1271_S_LEN
                 );
            localIp65504P1271SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1271SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1271S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1271S() {	 
			return (getShort(beginIp65504P1271S));
   	}
         int localIp65504P1271LCounter = -1;
         public boolean isIp65504P1271LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1271LCounter != sharedCounter;
            localIp65504P1271LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1271_L_LEN = 2;
  	/**
	 * serializeIp65504P1271L
	 */
	protected void serializeIp65504P1271L(short ip65504P1271L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1271L,IP_65504_P_1271_L_LEN)
                  ,beginIp65504P1271L
                  ,IP_65504_P_1271_L_LEN
                 );
            localIp65504P1271LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1271LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1271L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1271L() {	 
			return (getShort(beginIp65504P1271L));
   	}




}
  
