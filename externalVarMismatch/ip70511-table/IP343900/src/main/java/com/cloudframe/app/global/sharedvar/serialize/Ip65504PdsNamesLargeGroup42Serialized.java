package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup42Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup42Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup42Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_42_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1272S;
            protected  int beginIp65504P1272L;
            protected  int beginIp65504P1273S;
            protected  int beginIp65504P1273L;
            protected  int beginIp65504P1274S;
            protected  int beginIp65504P1274L;
            protected  int beginIp65504P1275S;
            protected  int beginIp65504P1275L;
            protected  int beginIp65504P1276S;
            protected  int beginIp65504P1276L;
            protected  int beginIp65504P1277S;
            protected  int beginIp65504P1277L;
            protected  int beginIp65504P1278S;
            protected  int beginIp65504P1278L;
            protected  int beginIp65504P1279S;
            protected  int beginIp65504P1279L;
            protected  int beginIp65504P1280S;
            protected  int beginIp65504P1280L;
            protected  int beginIp65504P1281S;
            protected  int beginIp65504P1281L;
            protected  int beginIp65504P1282S;
            protected  int beginIp65504P1282L;
            protected  int beginIp65504P1283S;
            protected  int beginIp65504P1283L;
            protected  int beginIp65504P1284S;
            protected  int beginIp65504P1284L;
            protected  int beginIp65504P1285S;
            protected  int beginIp65504P1285L;
            protected  int beginIp65504P1286S;
            protected  int beginIp65504P1286L;
            protected  int beginIp65504P1287S;
            protected  int beginIp65504P1287L;
            protected  int beginIp65504P1288S;
            protected  int beginIp65504P1288L;
            protected  int beginIp65504P1289S;
            protected  int beginIp65504P1289L;
            protected  int beginIp65504P1290S;
            protected  int beginIp65504P1290L;
            protected  int beginIp65504P1291S;
            protected  int beginIp65504P1291L;
            protected  int beginIp65504P1292S;
            protected  int beginIp65504P1292L;
            protected  int beginIp65504P1293S;
            protected  int beginIp65504P1293L;
            protected  int beginIp65504P1294S;
            protected  int beginIp65504P1294L;
            protected  int beginIp65504P1295S;
            protected  int beginIp65504P1295L;
            protected  int beginIp65504P1296S;
            protected  int beginIp65504P1296L;
            protected  int beginIp65504P1297S;
            protected  int beginIp65504P1297L;
            protected  int beginIp65504P1298S;
            protected  int beginIp65504P1298L;
            protected  int beginIp65504P1299S;
            protected  int beginIp65504P1299L;
            protected  int beginIp65504P1300S;
            protected  int beginIp65504P1300L;
            protected  int beginIp65504P1301S;
            protected  int beginIp65504P1301L;
            protected  int beginIp65504P1302S;
            protected  int beginIp65504P1302L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup42Serialized
	**/
    public Ip65504PdsNamesLargeGroup42Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup42Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup42Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup42Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10164); // serialize this field at offset 10164 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup42Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10164 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup42Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_42_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1272S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1272L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1273S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1273L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1274S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1274L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1275S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1275L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1276S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1276L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1277S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1277L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1278S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1278L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1279S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1279L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1280S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1280L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1281S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1281L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1282S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1282L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1283S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1283L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1284S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1284L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1285S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1285L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1286S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1286L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1287S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1287L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1288S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1288L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1289S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1289L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1290S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1290L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1291S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1291L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1292S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1292L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1293S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1293L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1294S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1294L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1295S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1295L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1296S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1296L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1297S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1297L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1298S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1298L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1299S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1299L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1300S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1300L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1301S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1301L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1302S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1302L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1272SCounter = -1;
         public boolean isIp65504P1272SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1272SCounter != sharedCounter;
            localIp65504P1272SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1272_S_LEN = 2;
  	/**
	 * serializeIp65504P1272S
	 */
	protected void serializeIp65504P1272S(short ip65504P1272S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1272S,IP_65504_P_1272_S_LEN)
                  ,beginIp65504P1272S
                  ,IP_65504_P_1272_S_LEN
                 );
            localIp65504P1272SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1272SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1272S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1272S() {	 
			return (getShort(beginIp65504P1272S));
   	}
         int localIp65504P1272LCounter = -1;
         public boolean isIp65504P1272LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1272LCounter != sharedCounter;
            localIp65504P1272LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1272_L_LEN = 2;
  	/**
	 * serializeIp65504P1272L
	 */
	protected void serializeIp65504P1272L(short ip65504P1272L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1272L,IP_65504_P_1272_L_LEN)
                  ,beginIp65504P1272L
                  ,IP_65504_P_1272_L_LEN
                 );
            localIp65504P1272LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1272LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1272L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1272L() {	 
			return (getShort(beginIp65504P1272L));
   	}
         int localIp65504P1273SCounter = -1;
         public boolean isIp65504P1273SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1273SCounter != sharedCounter;
            localIp65504P1273SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1273_S_LEN = 2;
  	/**
	 * serializeIp65504P1273S
	 */
	protected void serializeIp65504P1273S(short ip65504P1273S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1273S,IP_65504_P_1273_S_LEN)
                  ,beginIp65504P1273S
                  ,IP_65504_P_1273_S_LEN
                 );
            localIp65504P1273SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1273SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1273S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1273S() {	 
			return (getShort(beginIp65504P1273S));
   	}
         int localIp65504P1273LCounter = -1;
         public boolean isIp65504P1273LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1273LCounter != sharedCounter;
            localIp65504P1273LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1273_L_LEN = 2;
  	/**
	 * serializeIp65504P1273L
	 */
	protected void serializeIp65504P1273L(short ip65504P1273L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1273L,IP_65504_P_1273_L_LEN)
                  ,beginIp65504P1273L
                  ,IP_65504_P_1273_L_LEN
                 );
            localIp65504P1273LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1273LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1273L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1273L() {	 
			return (getShort(beginIp65504P1273L));
   	}
         int localIp65504P1274SCounter = -1;
         public boolean isIp65504P1274SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1274SCounter != sharedCounter;
            localIp65504P1274SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1274_S_LEN = 2;
  	/**
	 * serializeIp65504P1274S
	 */
	protected void serializeIp65504P1274S(short ip65504P1274S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1274S,IP_65504_P_1274_S_LEN)
                  ,beginIp65504P1274S
                  ,IP_65504_P_1274_S_LEN
                 );
            localIp65504P1274SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1274SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1274S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1274S() {	 
			return (getShort(beginIp65504P1274S));
   	}
         int localIp65504P1274LCounter = -1;
         public boolean isIp65504P1274LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1274LCounter != sharedCounter;
            localIp65504P1274LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1274_L_LEN = 2;
  	/**
	 * serializeIp65504P1274L
	 */
	protected void serializeIp65504P1274L(short ip65504P1274L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1274L,IP_65504_P_1274_L_LEN)
                  ,beginIp65504P1274L
                  ,IP_65504_P_1274_L_LEN
                 );
            localIp65504P1274LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1274LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1274L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1274L() {	 
			return (getShort(beginIp65504P1274L));
   	}
         int localIp65504P1275SCounter = -1;
         public boolean isIp65504P1275SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1275SCounter != sharedCounter;
            localIp65504P1275SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1275_S_LEN = 2;
  	/**
	 * serializeIp65504P1275S
	 */
	protected void serializeIp65504P1275S(short ip65504P1275S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1275S,IP_65504_P_1275_S_LEN)
                  ,beginIp65504P1275S
                  ,IP_65504_P_1275_S_LEN
                 );
            localIp65504P1275SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1275SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1275S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1275S() {	 
			return (getShort(beginIp65504P1275S));
   	}
         int localIp65504P1275LCounter = -1;
         public boolean isIp65504P1275LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1275LCounter != sharedCounter;
            localIp65504P1275LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1275_L_LEN = 2;
  	/**
	 * serializeIp65504P1275L
	 */
	protected void serializeIp65504P1275L(short ip65504P1275L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1275L,IP_65504_P_1275_L_LEN)
                  ,beginIp65504P1275L
                  ,IP_65504_P_1275_L_LEN
                 );
            localIp65504P1275LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1275LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1275L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1275L() {	 
			return (getShort(beginIp65504P1275L));
   	}
         int localIp65504P1276SCounter = -1;
         public boolean isIp65504P1276SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1276SCounter != sharedCounter;
            localIp65504P1276SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1276_S_LEN = 2;
  	/**
	 * serializeIp65504P1276S
	 */
	protected void serializeIp65504P1276S(short ip65504P1276S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1276S,IP_65504_P_1276_S_LEN)
                  ,beginIp65504P1276S
                  ,IP_65504_P_1276_S_LEN
                 );
            localIp65504P1276SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1276SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1276S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1276S() {	 
			return (getShort(beginIp65504P1276S));
   	}
         int localIp65504P1276LCounter = -1;
         public boolean isIp65504P1276LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1276LCounter != sharedCounter;
            localIp65504P1276LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1276_L_LEN = 2;
  	/**
	 * serializeIp65504P1276L
	 */
	protected void serializeIp65504P1276L(short ip65504P1276L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1276L,IP_65504_P_1276_L_LEN)
                  ,beginIp65504P1276L
                  ,IP_65504_P_1276_L_LEN
                 );
            localIp65504P1276LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1276LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1276L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1276L() {	 
			return (getShort(beginIp65504P1276L));
   	}
         int localIp65504P1277SCounter = -1;
         public boolean isIp65504P1277SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1277SCounter != sharedCounter;
            localIp65504P1277SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1277_S_LEN = 2;
  	/**
	 * serializeIp65504P1277S
	 */
	protected void serializeIp65504P1277S(short ip65504P1277S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1277S,IP_65504_P_1277_S_LEN)
                  ,beginIp65504P1277S
                  ,IP_65504_P_1277_S_LEN
                 );
            localIp65504P1277SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1277SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1277S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1277S() {	 
			return (getShort(beginIp65504P1277S));
   	}
         int localIp65504P1277LCounter = -1;
         public boolean isIp65504P1277LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1277LCounter != sharedCounter;
            localIp65504P1277LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1277_L_LEN = 2;
  	/**
	 * serializeIp65504P1277L
	 */
	protected void serializeIp65504P1277L(short ip65504P1277L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1277L,IP_65504_P_1277_L_LEN)
                  ,beginIp65504P1277L
                  ,IP_65504_P_1277_L_LEN
                 );
            localIp65504P1277LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1277LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1277L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1277L() {	 
			return (getShort(beginIp65504P1277L));
   	}
         int localIp65504P1278SCounter = -1;
         public boolean isIp65504P1278SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1278SCounter != sharedCounter;
            localIp65504P1278SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1278_S_LEN = 2;
  	/**
	 * serializeIp65504P1278S
	 */
	protected void serializeIp65504P1278S(short ip65504P1278S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1278S,IP_65504_P_1278_S_LEN)
                  ,beginIp65504P1278S
                  ,IP_65504_P_1278_S_LEN
                 );
            localIp65504P1278SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1278SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1278S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1278S() {	 
			return (getShort(beginIp65504P1278S));
   	}
         int localIp65504P1278LCounter = -1;
         public boolean isIp65504P1278LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1278LCounter != sharedCounter;
            localIp65504P1278LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1278_L_LEN = 2;
  	/**
	 * serializeIp65504P1278L
	 */
	protected void serializeIp65504P1278L(short ip65504P1278L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1278L,IP_65504_P_1278_L_LEN)
                  ,beginIp65504P1278L
                  ,IP_65504_P_1278_L_LEN
                 );
            localIp65504P1278LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1278LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1278L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1278L() {	 
			return (getShort(beginIp65504P1278L));
   	}
         int localIp65504P1279SCounter = -1;
         public boolean isIp65504P1279SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1279SCounter != sharedCounter;
            localIp65504P1279SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1279_S_LEN = 2;
  	/**
	 * serializeIp65504P1279S
	 */
	protected void serializeIp65504P1279S(short ip65504P1279S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1279S,IP_65504_P_1279_S_LEN)
                  ,beginIp65504P1279S
                  ,IP_65504_P_1279_S_LEN
                 );
            localIp65504P1279SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1279SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1279S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1279S() {	 
			return (getShort(beginIp65504P1279S));
   	}
         int localIp65504P1279LCounter = -1;
         public boolean isIp65504P1279LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1279LCounter != sharedCounter;
            localIp65504P1279LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1279_L_LEN = 2;
  	/**
	 * serializeIp65504P1279L
	 */
	protected void serializeIp65504P1279L(short ip65504P1279L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1279L,IP_65504_P_1279_L_LEN)
                  ,beginIp65504P1279L
                  ,IP_65504_P_1279_L_LEN
                 );
            localIp65504P1279LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1279LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1279L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1279L() {	 
			return (getShort(beginIp65504P1279L));
   	}
         int localIp65504P1280SCounter = -1;
         public boolean isIp65504P1280SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1280SCounter != sharedCounter;
            localIp65504P1280SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1280_S_LEN = 2;
  	/**
	 * serializeIp65504P1280S
	 */
	protected void serializeIp65504P1280S(short ip65504P1280S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1280S,IP_65504_P_1280_S_LEN)
                  ,beginIp65504P1280S
                  ,IP_65504_P_1280_S_LEN
                 );
            localIp65504P1280SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1280SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1280S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1280S() {	 
			return (getShort(beginIp65504P1280S));
   	}
         int localIp65504P1280LCounter = -1;
         public boolean isIp65504P1280LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1280LCounter != sharedCounter;
            localIp65504P1280LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1280_L_LEN = 2;
  	/**
	 * serializeIp65504P1280L
	 */
	protected void serializeIp65504P1280L(short ip65504P1280L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1280L,IP_65504_P_1280_L_LEN)
                  ,beginIp65504P1280L
                  ,IP_65504_P_1280_L_LEN
                 );
            localIp65504P1280LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1280LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1280L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1280L() {	 
			return (getShort(beginIp65504P1280L));
   	}
         int localIp65504P1281SCounter = -1;
         public boolean isIp65504P1281SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1281SCounter != sharedCounter;
            localIp65504P1281SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1281_S_LEN = 2;
  	/**
	 * serializeIp65504P1281S
	 */
	protected void serializeIp65504P1281S(short ip65504P1281S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1281S,IP_65504_P_1281_S_LEN)
                  ,beginIp65504P1281S
                  ,IP_65504_P_1281_S_LEN
                 );
            localIp65504P1281SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1281SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1281S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1281S() {	 
			return (getShort(beginIp65504P1281S));
   	}
         int localIp65504P1281LCounter = -1;
         public boolean isIp65504P1281LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1281LCounter != sharedCounter;
            localIp65504P1281LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1281_L_LEN = 2;
  	/**
	 * serializeIp65504P1281L
	 */
	protected void serializeIp65504P1281L(short ip65504P1281L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1281L,IP_65504_P_1281_L_LEN)
                  ,beginIp65504P1281L
                  ,IP_65504_P_1281_L_LEN
                 );
            localIp65504P1281LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1281LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1281L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1281L() {	 
			return (getShort(beginIp65504P1281L));
   	}
         int localIp65504P1282SCounter = -1;
         public boolean isIp65504P1282SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1282SCounter != sharedCounter;
            localIp65504P1282SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1282_S_LEN = 2;
  	/**
	 * serializeIp65504P1282S
	 */
	protected void serializeIp65504P1282S(short ip65504P1282S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1282S,IP_65504_P_1282_S_LEN)
                  ,beginIp65504P1282S
                  ,IP_65504_P_1282_S_LEN
                 );
            localIp65504P1282SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1282SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1282S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1282S() {	 
			return (getShort(beginIp65504P1282S));
   	}
         int localIp65504P1282LCounter = -1;
         public boolean isIp65504P1282LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1282LCounter != sharedCounter;
            localIp65504P1282LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1282_L_LEN = 2;
  	/**
	 * serializeIp65504P1282L
	 */
	protected void serializeIp65504P1282L(short ip65504P1282L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1282L,IP_65504_P_1282_L_LEN)
                  ,beginIp65504P1282L
                  ,IP_65504_P_1282_L_LEN
                 );
            localIp65504P1282LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1282LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1282L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1282L() {	 
			return (getShort(beginIp65504P1282L));
   	}
         int localIp65504P1283SCounter = -1;
         public boolean isIp65504P1283SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1283SCounter != sharedCounter;
            localIp65504P1283SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1283_S_LEN = 2;
  	/**
	 * serializeIp65504P1283S
	 */
	protected void serializeIp65504P1283S(short ip65504P1283S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1283S,IP_65504_P_1283_S_LEN)
                  ,beginIp65504P1283S
                  ,IP_65504_P_1283_S_LEN
                 );
            localIp65504P1283SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1283SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1283S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1283S() {	 
			return (getShort(beginIp65504P1283S));
   	}
         int localIp65504P1283LCounter = -1;
         public boolean isIp65504P1283LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1283LCounter != sharedCounter;
            localIp65504P1283LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1283_L_LEN = 2;
  	/**
	 * serializeIp65504P1283L
	 */
	protected void serializeIp65504P1283L(short ip65504P1283L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1283L,IP_65504_P_1283_L_LEN)
                  ,beginIp65504P1283L
                  ,IP_65504_P_1283_L_LEN
                 );
            localIp65504P1283LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1283LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1283L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1283L() {	 
			return (getShort(beginIp65504P1283L));
   	}
         int localIp65504P1284SCounter = -1;
         public boolean isIp65504P1284SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1284SCounter != sharedCounter;
            localIp65504P1284SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1284_S_LEN = 2;
  	/**
	 * serializeIp65504P1284S
	 */
	protected void serializeIp65504P1284S(short ip65504P1284S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1284S,IP_65504_P_1284_S_LEN)
                  ,beginIp65504P1284S
                  ,IP_65504_P_1284_S_LEN
                 );
            localIp65504P1284SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1284SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1284S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1284S() {	 
			return (getShort(beginIp65504P1284S));
   	}
         int localIp65504P1284LCounter = -1;
         public boolean isIp65504P1284LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1284LCounter != sharedCounter;
            localIp65504P1284LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1284_L_LEN = 2;
  	/**
	 * serializeIp65504P1284L
	 */
	protected void serializeIp65504P1284L(short ip65504P1284L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1284L,IP_65504_P_1284_L_LEN)
                  ,beginIp65504P1284L
                  ,IP_65504_P_1284_L_LEN
                 );
            localIp65504P1284LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1284LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1284L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1284L() {	 
			return (getShort(beginIp65504P1284L));
   	}
         int localIp65504P1285SCounter = -1;
         public boolean isIp65504P1285SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1285SCounter != sharedCounter;
            localIp65504P1285SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1285_S_LEN = 2;
  	/**
	 * serializeIp65504P1285S
	 */
	protected void serializeIp65504P1285S(short ip65504P1285S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1285S,IP_65504_P_1285_S_LEN)
                  ,beginIp65504P1285S
                  ,IP_65504_P_1285_S_LEN
                 );
            localIp65504P1285SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1285SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1285S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1285S() {	 
			return (getShort(beginIp65504P1285S));
   	}
         int localIp65504P1285LCounter = -1;
         public boolean isIp65504P1285LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1285LCounter != sharedCounter;
            localIp65504P1285LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1285_L_LEN = 2;
  	/**
	 * serializeIp65504P1285L
	 */
	protected void serializeIp65504P1285L(short ip65504P1285L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1285L,IP_65504_P_1285_L_LEN)
                  ,beginIp65504P1285L
                  ,IP_65504_P_1285_L_LEN
                 );
            localIp65504P1285LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1285LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1285L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1285L() {	 
			return (getShort(beginIp65504P1285L));
   	}
         int localIp65504P1286SCounter = -1;
         public boolean isIp65504P1286SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1286SCounter != sharedCounter;
            localIp65504P1286SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1286_S_LEN = 2;
  	/**
	 * serializeIp65504P1286S
	 */
	protected void serializeIp65504P1286S(short ip65504P1286S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1286S,IP_65504_P_1286_S_LEN)
                  ,beginIp65504P1286S
                  ,IP_65504_P_1286_S_LEN
                 );
            localIp65504P1286SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1286SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1286S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1286S() {	 
			return (getShort(beginIp65504P1286S));
   	}
         int localIp65504P1286LCounter = -1;
         public boolean isIp65504P1286LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1286LCounter != sharedCounter;
            localIp65504P1286LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1286_L_LEN = 2;
  	/**
	 * serializeIp65504P1286L
	 */
	protected void serializeIp65504P1286L(short ip65504P1286L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1286L,IP_65504_P_1286_L_LEN)
                  ,beginIp65504P1286L
                  ,IP_65504_P_1286_L_LEN
                 );
            localIp65504P1286LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1286LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1286L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1286L() {	 
			return (getShort(beginIp65504P1286L));
   	}
         int localIp65504P1287SCounter = -1;
         public boolean isIp65504P1287SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1287SCounter != sharedCounter;
            localIp65504P1287SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1287_S_LEN = 2;
  	/**
	 * serializeIp65504P1287S
	 */
	protected void serializeIp65504P1287S(short ip65504P1287S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1287S,IP_65504_P_1287_S_LEN)
                  ,beginIp65504P1287S
                  ,IP_65504_P_1287_S_LEN
                 );
            localIp65504P1287SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1287SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1287S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1287S() {	 
			return (getShort(beginIp65504P1287S));
   	}
         int localIp65504P1287LCounter = -1;
         public boolean isIp65504P1287LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1287LCounter != sharedCounter;
            localIp65504P1287LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1287_L_LEN = 2;
  	/**
	 * serializeIp65504P1287L
	 */
	protected void serializeIp65504P1287L(short ip65504P1287L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1287L,IP_65504_P_1287_L_LEN)
                  ,beginIp65504P1287L
                  ,IP_65504_P_1287_L_LEN
                 );
            localIp65504P1287LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1287LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1287L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1287L() {	 
			return (getShort(beginIp65504P1287L));
   	}
         int localIp65504P1288SCounter = -1;
         public boolean isIp65504P1288SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1288SCounter != sharedCounter;
            localIp65504P1288SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1288_S_LEN = 2;
  	/**
	 * serializeIp65504P1288S
	 */
	protected void serializeIp65504P1288S(short ip65504P1288S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1288S,IP_65504_P_1288_S_LEN)
                  ,beginIp65504P1288S
                  ,IP_65504_P_1288_S_LEN
                 );
            localIp65504P1288SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1288SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1288S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1288S() {	 
			return (getShort(beginIp65504P1288S));
   	}
         int localIp65504P1288LCounter = -1;
         public boolean isIp65504P1288LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1288LCounter != sharedCounter;
            localIp65504P1288LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1288_L_LEN = 2;
  	/**
	 * serializeIp65504P1288L
	 */
	protected void serializeIp65504P1288L(short ip65504P1288L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1288L,IP_65504_P_1288_L_LEN)
                  ,beginIp65504P1288L
                  ,IP_65504_P_1288_L_LEN
                 );
            localIp65504P1288LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1288LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1288L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1288L() {	 
			return (getShort(beginIp65504P1288L));
   	}
         int localIp65504P1289SCounter = -1;
         public boolean isIp65504P1289SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1289SCounter != sharedCounter;
            localIp65504P1289SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1289_S_LEN = 2;
  	/**
	 * serializeIp65504P1289S
	 */
	protected void serializeIp65504P1289S(short ip65504P1289S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1289S,IP_65504_P_1289_S_LEN)
                  ,beginIp65504P1289S
                  ,IP_65504_P_1289_S_LEN
                 );
            localIp65504P1289SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1289SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1289S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1289S() {	 
			return (getShort(beginIp65504P1289S));
   	}
         int localIp65504P1289LCounter = -1;
         public boolean isIp65504P1289LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1289LCounter != sharedCounter;
            localIp65504P1289LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1289_L_LEN = 2;
  	/**
	 * serializeIp65504P1289L
	 */
	protected void serializeIp65504P1289L(short ip65504P1289L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1289L,IP_65504_P_1289_L_LEN)
                  ,beginIp65504P1289L
                  ,IP_65504_P_1289_L_LEN
                 );
            localIp65504P1289LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1289LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1289L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1289L() {	 
			return (getShort(beginIp65504P1289L));
   	}
         int localIp65504P1290SCounter = -1;
         public boolean isIp65504P1290SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1290SCounter != sharedCounter;
            localIp65504P1290SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1290_S_LEN = 2;
  	/**
	 * serializeIp65504P1290S
	 */
	protected void serializeIp65504P1290S(short ip65504P1290S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1290S,IP_65504_P_1290_S_LEN)
                  ,beginIp65504P1290S
                  ,IP_65504_P_1290_S_LEN
                 );
            localIp65504P1290SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1290SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1290S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1290S() {	 
			return (getShort(beginIp65504P1290S));
   	}
         int localIp65504P1290LCounter = -1;
         public boolean isIp65504P1290LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1290LCounter != sharedCounter;
            localIp65504P1290LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1290_L_LEN = 2;
  	/**
	 * serializeIp65504P1290L
	 */
	protected void serializeIp65504P1290L(short ip65504P1290L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1290L,IP_65504_P_1290_L_LEN)
                  ,beginIp65504P1290L
                  ,IP_65504_P_1290_L_LEN
                 );
            localIp65504P1290LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1290LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1290L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1290L() {	 
			return (getShort(beginIp65504P1290L));
   	}
         int localIp65504P1291SCounter = -1;
         public boolean isIp65504P1291SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1291SCounter != sharedCounter;
            localIp65504P1291SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1291_S_LEN = 2;
  	/**
	 * serializeIp65504P1291S
	 */
	protected void serializeIp65504P1291S(short ip65504P1291S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1291S,IP_65504_P_1291_S_LEN)
                  ,beginIp65504P1291S
                  ,IP_65504_P_1291_S_LEN
                 );
            localIp65504P1291SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1291SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1291S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1291S() {	 
			return (getShort(beginIp65504P1291S));
   	}
         int localIp65504P1291LCounter = -1;
         public boolean isIp65504P1291LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1291LCounter != sharedCounter;
            localIp65504P1291LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1291_L_LEN = 2;
  	/**
	 * serializeIp65504P1291L
	 */
	protected void serializeIp65504P1291L(short ip65504P1291L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1291L,IP_65504_P_1291_L_LEN)
                  ,beginIp65504P1291L
                  ,IP_65504_P_1291_L_LEN
                 );
            localIp65504P1291LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1291LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1291L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1291L() {	 
			return (getShort(beginIp65504P1291L));
   	}
         int localIp65504P1292SCounter = -1;
         public boolean isIp65504P1292SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1292SCounter != sharedCounter;
            localIp65504P1292SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1292_S_LEN = 2;
  	/**
	 * serializeIp65504P1292S
	 */
	protected void serializeIp65504P1292S(short ip65504P1292S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1292S,IP_65504_P_1292_S_LEN)
                  ,beginIp65504P1292S
                  ,IP_65504_P_1292_S_LEN
                 );
            localIp65504P1292SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1292SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1292S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1292S() {	 
			return (getShort(beginIp65504P1292S));
   	}
         int localIp65504P1292LCounter = -1;
         public boolean isIp65504P1292LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1292LCounter != sharedCounter;
            localIp65504P1292LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1292_L_LEN = 2;
  	/**
	 * serializeIp65504P1292L
	 */
	protected void serializeIp65504P1292L(short ip65504P1292L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1292L,IP_65504_P_1292_L_LEN)
                  ,beginIp65504P1292L
                  ,IP_65504_P_1292_L_LEN
                 );
            localIp65504P1292LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1292LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1292L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1292L() {	 
			return (getShort(beginIp65504P1292L));
   	}
         int localIp65504P1293SCounter = -1;
         public boolean isIp65504P1293SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1293SCounter != sharedCounter;
            localIp65504P1293SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1293_S_LEN = 2;
  	/**
	 * serializeIp65504P1293S
	 */
	protected void serializeIp65504P1293S(short ip65504P1293S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1293S,IP_65504_P_1293_S_LEN)
                  ,beginIp65504P1293S
                  ,IP_65504_P_1293_S_LEN
                 );
            localIp65504P1293SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1293SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1293S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1293S() {	 
			return (getShort(beginIp65504P1293S));
   	}
         int localIp65504P1293LCounter = -1;
         public boolean isIp65504P1293LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1293LCounter != sharedCounter;
            localIp65504P1293LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1293_L_LEN = 2;
  	/**
	 * serializeIp65504P1293L
	 */
	protected void serializeIp65504P1293L(short ip65504P1293L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1293L,IP_65504_P_1293_L_LEN)
                  ,beginIp65504P1293L
                  ,IP_65504_P_1293_L_LEN
                 );
            localIp65504P1293LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1293LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1293L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1293L() {	 
			return (getShort(beginIp65504P1293L));
   	}
         int localIp65504P1294SCounter = -1;
         public boolean isIp65504P1294SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1294SCounter != sharedCounter;
            localIp65504P1294SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1294_S_LEN = 2;
  	/**
	 * serializeIp65504P1294S
	 */
	protected void serializeIp65504P1294S(short ip65504P1294S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1294S,IP_65504_P_1294_S_LEN)
                  ,beginIp65504P1294S
                  ,IP_65504_P_1294_S_LEN
                 );
            localIp65504P1294SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1294SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1294S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1294S() {	 
			return (getShort(beginIp65504P1294S));
   	}
         int localIp65504P1294LCounter = -1;
         public boolean isIp65504P1294LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1294LCounter != sharedCounter;
            localIp65504P1294LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1294_L_LEN = 2;
  	/**
	 * serializeIp65504P1294L
	 */
	protected void serializeIp65504P1294L(short ip65504P1294L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1294L,IP_65504_P_1294_L_LEN)
                  ,beginIp65504P1294L
                  ,IP_65504_P_1294_L_LEN
                 );
            localIp65504P1294LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1294LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1294L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1294L() {	 
			return (getShort(beginIp65504P1294L));
   	}
         int localIp65504P1295SCounter = -1;
         public boolean isIp65504P1295SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1295SCounter != sharedCounter;
            localIp65504P1295SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1295_S_LEN = 2;
  	/**
	 * serializeIp65504P1295S
	 */
	protected void serializeIp65504P1295S(short ip65504P1295S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1295S,IP_65504_P_1295_S_LEN)
                  ,beginIp65504P1295S
                  ,IP_65504_P_1295_S_LEN
                 );
            localIp65504P1295SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1295SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1295S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1295S() {	 
			return (getShort(beginIp65504P1295S));
   	}
         int localIp65504P1295LCounter = -1;
         public boolean isIp65504P1295LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1295LCounter != sharedCounter;
            localIp65504P1295LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1295_L_LEN = 2;
  	/**
	 * serializeIp65504P1295L
	 */
	protected void serializeIp65504P1295L(short ip65504P1295L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1295L,IP_65504_P_1295_L_LEN)
                  ,beginIp65504P1295L
                  ,IP_65504_P_1295_L_LEN
                 );
            localIp65504P1295LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1295LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1295L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1295L() {	 
			return (getShort(beginIp65504P1295L));
   	}
         int localIp65504P1296SCounter = -1;
         public boolean isIp65504P1296SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1296SCounter != sharedCounter;
            localIp65504P1296SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1296_S_LEN = 2;
  	/**
	 * serializeIp65504P1296S
	 */
	protected void serializeIp65504P1296S(short ip65504P1296S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1296S,IP_65504_P_1296_S_LEN)
                  ,beginIp65504P1296S
                  ,IP_65504_P_1296_S_LEN
                 );
            localIp65504P1296SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1296SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1296S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1296S() {	 
			return (getShort(beginIp65504P1296S));
   	}
         int localIp65504P1296LCounter = -1;
         public boolean isIp65504P1296LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1296LCounter != sharedCounter;
            localIp65504P1296LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1296_L_LEN = 2;
  	/**
	 * serializeIp65504P1296L
	 */
	protected void serializeIp65504P1296L(short ip65504P1296L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1296L,IP_65504_P_1296_L_LEN)
                  ,beginIp65504P1296L
                  ,IP_65504_P_1296_L_LEN
                 );
            localIp65504P1296LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1296LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1296L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1296L() {	 
			return (getShort(beginIp65504P1296L));
   	}
         int localIp65504P1297SCounter = -1;
         public boolean isIp65504P1297SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1297SCounter != sharedCounter;
            localIp65504P1297SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1297_S_LEN = 2;
  	/**
	 * serializeIp65504P1297S
	 */
	protected void serializeIp65504P1297S(short ip65504P1297S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1297S,IP_65504_P_1297_S_LEN)
                  ,beginIp65504P1297S
                  ,IP_65504_P_1297_S_LEN
                 );
            localIp65504P1297SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1297SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1297S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1297S() {	 
			return (getShort(beginIp65504P1297S));
   	}
         int localIp65504P1297LCounter = -1;
         public boolean isIp65504P1297LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1297LCounter != sharedCounter;
            localIp65504P1297LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1297_L_LEN = 2;
  	/**
	 * serializeIp65504P1297L
	 */
	protected void serializeIp65504P1297L(short ip65504P1297L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1297L,IP_65504_P_1297_L_LEN)
                  ,beginIp65504P1297L
                  ,IP_65504_P_1297_L_LEN
                 );
            localIp65504P1297LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1297LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1297L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1297L() {	 
			return (getShort(beginIp65504P1297L));
   	}
         int localIp65504P1298SCounter = -1;
         public boolean isIp65504P1298SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1298SCounter != sharedCounter;
            localIp65504P1298SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1298_S_LEN = 2;
  	/**
	 * serializeIp65504P1298S
	 */
	protected void serializeIp65504P1298S(short ip65504P1298S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1298S,IP_65504_P_1298_S_LEN)
                  ,beginIp65504P1298S
                  ,IP_65504_P_1298_S_LEN
                 );
            localIp65504P1298SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1298SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1298S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1298S() {	 
			return (getShort(beginIp65504P1298S));
   	}
         int localIp65504P1298LCounter = -1;
         public boolean isIp65504P1298LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1298LCounter != sharedCounter;
            localIp65504P1298LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1298_L_LEN = 2;
  	/**
	 * serializeIp65504P1298L
	 */
	protected void serializeIp65504P1298L(short ip65504P1298L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1298L,IP_65504_P_1298_L_LEN)
                  ,beginIp65504P1298L
                  ,IP_65504_P_1298_L_LEN
                 );
            localIp65504P1298LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1298LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1298L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1298L() {	 
			return (getShort(beginIp65504P1298L));
   	}
         int localIp65504P1299SCounter = -1;
         public boolean isIp65504P1299SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1299SCounter != sharedCounter;
            localIp65504P1299SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1299_S_LEN = 2;
  	/**
	 * serializeIp65504P1299S
	 */
	protected void serializeIp65504P1299S(short ip65504P1299S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1299S,IP_65504_P_1299_S_LEN)
                  ,beginIp65504P1299S
                  ,IP_65504_P_1299_S_LEN
                 );
            localIp65504P1299SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1299SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1299S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1299S() {	 
			return (getShort(beginIp65504P1299S));
   	}
         int localIp65504P1299LCounter = -1;
         public boolean isIp65504P1299LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1299LCounter != sharedCounter;
            localIp65504P1299LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1299_L_LEN = 2;
  	/**
	 * serializeIp65504P1299L
	 */
	protected void serializeIp65504P1299L(short ip65504P1299L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1299L,IP_65504_P_1299_L_LEN)
                  ,beginIp65504P1299L
                  ,IP_65504_P_1299_L_LEN
                 );
            localIp65504P1299LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1299LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1299L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1299L() {	 
			return (getShort(beginIp65504P1299L));
   	}
         int localIp65504P1300SCounter = -1;
         public boolean isIp65504P1300SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1300SCounter != sharedCounter;
            localIp65504P1300SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1300_S_LEN = 2;
  	/**
	 * serializeIp65504P1300S
	 */
	protected void serializeIp65504P1300S(short ip65504P1300S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1300S,IP_65504_P_1300_S_LEN)
                  ,beginIp65504P1300S
                  ,IP_65504_P_1300_S_LEN
                 );
            localIp65504P1300SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1300SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1300S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1300S() {	 
			return (getShort(beginIp65504P1300S));
   	}
         int localIp65504P1300LCounter = -1;
         public boolean isIp65504P1300LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1300LCounter != sharedCounter;
            localIp65504P1300LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1300_L_LEN = 2;
  	/**
	 * serializeIp65504P1300L
	 */
	protected void serializeIp65504P1300L(short ip65504P1300L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1300L,IP_65504_P_1300_L_LEN)
                  ,beginIp65504P1300L
                  ,IP_65504_P_1300_L_LEN
                 );
            localIp65504P1300LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1300LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1300L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1300L() {	 
			return (getShort(beginIp65504P1300L));
   	}
         int localIp65504P1301SCounter = -1;
         public boolean isIp65504P1301SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1301SCounter != sharedCounter;
            localIp65504P1301SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1301_S_LEN = 2;
  	/**
	 * serializeIp65504P1301S
	 */
	protected void serializeIp65504P1301S(short ip65504P1301S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1301S,IP_65504_P_1301_S_LEN)
                  ,beginIp65504P1301S
                  ,IP_65504_P_1301_S_LEN
                 );
            localIp65504P1301SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1301SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1301S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1301S() {	 
			return (getShort(beginIp65504P1301S));
   	}
         int localIp65504P1301LCounter = -1;
         public boolean isIp65504P1301LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1301LCounter != sharedCounter;
            localIp65504P1301LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1301_L_LEN = 2;
  	/**
	 * serializeIp65504P1301L
	 */
	protected void serializeIp65504P1301L(short ip65504P1301L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1301L,IP_65504_P_1301_L_LEN)
                  ,beginIp65504P1301L
                  ,IP_65504_P_1301_L_LEN
                 );
            localIp65504P1301LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1301LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1301L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1301L() {	 
			return (getShort(beginIp65504P1301L));
   	}
         int localIp65504P1302SCounter = -1;
         public boolean isIp65504P1302SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1302SCounter != sharedCounter;
            localIp65504P1302SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1302_S_LEN = 2;
  	/**
	 * serializeIp65504P1302S
	 */
	protected void serializeIp65504P1302S(short ip65504P1302S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1302S,IP_65504_P_1302_S_LEN)
                  ,beginIp65504P1302S
                  ,IP_65504_P_1302_S_LEN
                 );
            localIp65504P1302SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1302SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1302S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1302S() {	 
			return (getShort(beginIp65504P1302S));
   	}
         int localIp65504P1302LCounter = -1;
         public boolean isIp65504P1302LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1302LCounter != sharedCounter;
            localIp65504P1302LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1302_L_LEN = 2;
  	/**
	 * serializeIp65504P1302L
	 */
	protected void serializeIp65504P1302L(short ip65504P1302L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1302L,IP_65504_P_1302_L_LEN)
                  ,beginIp65504P1302L
                  ,IP_65504_P_1302_L_LEN
                 );
            localIp65504P1302LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1302LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1302L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1302L() {	 
			return (getShort(beginIp65504P1302L));
   	}




}
  
