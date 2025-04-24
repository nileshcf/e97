package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup46Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup46Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup46Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_46_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1396S;
            protected  int beginIp65504P1396L;
            protected  int beginIp65504P1397S;
            protected  int beginIp65504P1397L;
            protected  int beginIp65504P1398S;
            protected  int beginIp65504P1398L;
            protected  int beginIp65504P1399S;
            protected  int beginIp65504P1399L;
            protected  int beginIp65504P1400S;
            protected  int beginIp65504P1400L;
            protected  int beginIp65504P1401S;
            protected  int beginIp65504P1401L;
            protected  int beginIp65504P1402S;
            protected  int beginIp65504P1402L;
            protected  int beginIp65504P1403S;
            protected  int beginIp65504P1403L;
            protected  int beginIp65504P1404S;
            protected  int beginIp65504P1404L;
            protected  int beginIp65504P1405S;
            protected  int beginIp65504P1405L;
            protected  int beginIp65504P1406S;
            protected  int beginIp65504P1406L;
            protected  int beginIp65504P1407S;
            protected  int beginIp65504P1407L;
            protected  int beginIp65504P1408S;
            protected  int beginIp65504P1408L;
            protected  int beginIp65504P1409S;
            protected  int beginIp65504P1409L;
            protected  int beginIp65504P1410S;
            protected  int beginIp65504P1410L;
            protected  int beginIp65504P1411S;
            protected  int beginIp65504P1411L;
            protected  int beginIp65504P1412S;
            protected  int beginIp65504P1412L;
            protected  int beginIp65504P1413S;
            protected  int beginIp65504P1413L;
            protected  int beginIp65504P1414S;
            protected  int beginIp65504P1414L;
            protected  int beginIp65504P1415S;
            protected  int beginIp65504P1415L;
            protected  int beginIp65504P1416S;
            protected  int beginIp65504P1416L;
            protected  int beginIp65504P1417S;
            protected  int beginIp65504P1417L;
            protected  int beginIp65504P1418S;
            protected  int beginIp65504P1418L;
            protected  int beginIp65504P1419S;
            protected  int beginIp65504P1419L;
            protected  int beginIp65504P1420S;
            protected  int beginIp65504P1420L;
            protected  int beginIp65504P1421S;
            protected  int beginIp65504P1421L;
            protected  int beginIp65504P1422S;
            protected  int beginIp65504P1422L;
            protected  int beginIp65504P1423S;
            protected  int beginIp65504P1423L;
            protected  int beginIp65504P1424S;
            protected  int beginIp65504P1424L;
            protected  int beginIp65504P1425S;
            protected  int beginIp65504P1425L;
            protected  int beginIp65504P1426S;
            protected  int beginIp65504P1426L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup46Serialized
	**/
    public Ip65504PdsNamesLargeGroup46Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup46Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup46Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup46Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11156); // serialize this field at offset 11156 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup46Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11156 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup46Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_46_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1396S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1396L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1397S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1397L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1398S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1398L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1399S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1399L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1400S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1400L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1401S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1401L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1402S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1402L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1403S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1403L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1404S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1404L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1405S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1405L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1406S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1406L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1407S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1407L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1408S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1408L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1409S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1409L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1410S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1410L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1411S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1411L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1412S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1412L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1413S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1413L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1414S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1414L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1415S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1415L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1416S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1416L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1417S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1417L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1418S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1418L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1419S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1419L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1420S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1420L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1421S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1421L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1422S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1422L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1423S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1423L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1424S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1424L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1425S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1425L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1426S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1426L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1396SCounter = -1;
         public boolean isIp65504P1396SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1396SCounter != sharedCounter;
            localIp65504P1396SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1396_S_LEN = 2;
  	/**
	 * serializeIp65504P1396S
	 */
	protected void serializeIp65504P1396S(short ip65504P1396S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1396S,IP_65504_P_1396_S_LEN)
                  ,beginIp65504P1396S
                  ,IP_65504_P_1396_S_LEN
                 );
            localIp65504P1396SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1396SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1396S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1396S() {	 
			return (getShort(beginIp65504P1396S));
   	}
         int localIp65504P1396LCounter = -1;
         public boolean isIp65504P1396LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1396LCounter != sharedCounter;
            localIp65504P1396LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1396_L_LEN = 2;
  	/**
	 * serializeIp65504P1396L
	 */
	protected void serializeIp65504P1396L(short ip65504P1396L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1396L,IP_65504_P_1396_L_LEN)
                  ,beginIp65504P1396L
                  ,IP_65504_P_1396_L_LEN
                 );
            localIp65504P1396LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1396LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1396L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1396L() {	 
			return (getShort(beginIp65504P1396L));
   	}
         int localIp65504P1397SCounter = -1;
         public boolean isIp65504P1397SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1397SCounter != sharedCounter;
            localIp65504P1397SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1397_S_LEN = 2;
  	/**
	 * serializeIp65504P1397S
	 */
	protected void serializeIp65504P1397S(short ip65504P1397S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1397S,IP_65504_P_1397_S_LEN)
                  ,beginIp65504P1397S
                  ,IP_65504_P_1397_S_LEN
                 );
            localIp65504P1397SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1397SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1397S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1397S() {	 
			return (getShort(beginIp65504P1397S));
   	}
         int localIp65504P1397LCounter = -1;
         public boolean isIp65504P1397LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1397LCounter != sharedCounter;
            localIp65504P1397LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1397_L_LEN = 2;
  	/**
	 * serializeIp65504P1397L
	 */
	protected void serializeIp65504P1397L(short ip65504P1397L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1397L,IP_65504_P_1397_L_LEN)
                  ,beginIp65504P1397L
                  ,IP_65504_P_1397_L_LEN
                 );
            localIp65504P1397LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1397LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1397L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1397L() {	 
			return (getShort(beginIp65504P1397L));
   	}
         int localIp65504P1398SCounter = -1;
         public boolean isIp65504P1398SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1398SCounter != sharedCounter;
            localIp65504P1398SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1398_S_LEN = 2;
  	/**
	 * serializeIp65504P1398S
	 */
	protected void serializeIp65504P1398S(short ip65504P1398S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1398S,IP_65504_P_1398_S_LEN)
                  ,beginIp65504P1398S
                  ,IP_65504_P_1398_S_LEN
                 );
            localIp65504P1398SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1398SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1398S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1398S() {	 
			return (getShort(beginIp65504P1398S));
   	}
         int localIp65504P1398LCounter = -1;
         public boolean isIp65504P1398LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1398LCounter != sharedCounter;
            localIp65504P1398LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1398_L_LEN = 2;
  	/**
	 * serializeIp65504P1398L
	 */
	protected void serializeIp65504P1398L(short ip65504P1398L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1398L,IP_65504_P_1398_L_LEN)
                  ,beginIp65504P1398L
                  ,IP_65504_P_1398_L_LEN
                 );
            localIp65504P1398LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1398LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1398L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1398L() {	 
			return (getShort(beginIp65504P1398L));
   	}
         int localIp65504P1399SCounter = -1;
         public boolean isIp65504P1399SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1399SCounter != sharedCounter;
            localIp65504P1399SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1399_S_LEN = 2;
  	/**
	 * serializeIp65504P1399S
	 */
	protected void serializeIp65504P1399S(short ip65504P1399S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1399S,IP_65504_P_1399_S_LEN)
                  ,beginIp65504P1399S
                  ,IP_65504_P_1399_S_LEN
                 );
            localIp65504P1399SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1399SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1399S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1399S() {	 
			return (getShort(beginIp65504P1399S));
   	}
         int localIp65504P1399LCounter = -1;
         public boolean isIp65504P1399LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1399LCounter != sharedCounter;
            localIp65504P1399LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1399_L_LEN = 2;
  	/**
	 * serializeIp65504P1399L
	 */
	protected void serializeIp65504P1399L(short ip65504P1399L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1399L,IP_65504_P_1399_L_LEN)
                  ,beginIp65504P1399L
                  ,IP_65504_P_1399_L_LEN
                 );
            localIp65504P1399LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1399LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1399L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1399L() {	 
			return (getShort(beginIp65504P1399L));
   	}
         int localIp65504P1400SCounter = -1;
         public boolean isIp65504P1400SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1400SCounter != sharedCounter;
            localIp65504P1400SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1400_S_LEN = 2;
  	/**
	 * serializeIp65504P1400S
	 */
	protected void serializeIp65504P1400S(short ip65504P1400S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1400S,IP_65504_P_1400_S_LEN)
                  ,beginIp65504P1400S
                  ,IP_65504_P_1400_S_LEN
                 );
            localIp65504P1400SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1400SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1400S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1400S() {	 
			return (getShort(beginIp65504P1400S));
   	}
         int localIp65504P1400LCounter = -1;
         public boolean isIp65504P1400LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1400LCounter != sharedCounter;
            localIp65504P1400LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1400_L_LEN = 2;
  	/**
	 * serializeIp65504P1400L
	 */
	protected void serializeIp65504P1400L(short ip65504P1400L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1400L,IP_65504_P_1400_L_LEN)
                  ,beginIp65504P1400L
                  ,IP_65504_P_1400_L_LEN
                 );
            localIp65504P1400LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1400LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1400L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1400L() {	 
			return (getShort(beginIp65504P1400L));
   	}
         int localIp65504P1401SCounter = -1;
         public boolean isIp65504P1401SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1401SCounter != sharedCounter;
            localIp65504P1401SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1401_S_LEN = 2;
  	/**
	 * serializeIp65504P1401S
	 */
	protected void serializeIp65504P1401S(short ip65504P1401S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1401S,IP_65504_P_1401_S_LEN)
                  ,beginIp65504P1401S
                  ,IP_65504_P_1401_S_LEN
                 );
            localIp65504P1401SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1401SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1401S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1401S() {	 
			return (getShort(beginIp65504P1401S));
   	}
         int localIp65504P1401LCounter = -1;
         public boolean isIp65504P1401LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1401LCounter != sharedCounter;
            localIp65504P1401LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1401_L_LEN = 2;
  	/**
	 * serializeIp65504P1401L
	 */
	protected void serializeIp65504P1401L(short ip65504P1401L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1401L,IP_65504_P_1401_L_LEN)
                  ,beginIp65504P1401L
                  ,IP_65504_P_1401_L_LEN
                 );
            localIp65504P1401LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1401LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1401L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1401L() {	 
			return (getShort(beginIp65504P1401L));
   	}
         int localIp65504P1402SCounter = -1;
         public boolean isIp65504P1402SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1402SCounter != sharedCounter;
            localIp65504P1402SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1402_S_LEN = 2;
  	/**
	 * serializeIp65504P1402S
	 */
	protected void serializeIp65504P1402S(short ip65504P1402S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1402S,IP_65504_P_1402_S_LEN)
                  ,beginIp65504P1402S
                  ,IP_65504_P_1402_S_LEN
                 );
            localIp65504P1402SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1402SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1402S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1402S() {	 
			return (getShort(beginIp65504P1402S));
   	}
         int localIp65504P1402LCounter = -1;
         public boolean isIp65504P1402LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1402LCounter != sharedCounter;
            localIp65504P1402LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1402_L_LEN = 2;
  	/**
	 * serializeIp65504P1402L
	 */
	protected void serializeIp65504P1402L(short ip65504P1402L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1402L,IP_65504_P_1402_L_LEN)
                  ,beginIp65504P1402L
                  ,IP_65504_P_1402_L_LEN
                 );
            localIp65504P1402LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1402LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1402L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1402L() {	 
			return (getShort(beginIp65504P1402L));
   	}
         int localIp65504P1403SCounter = -1;
         public boolean isIp65504P1403SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1403SCounter != sharedCounter;
            localIp65504P1403SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1403_S_LEN = 2;
  	/**
	 * serializeIp65504P1403S
	 */
	protected void serializeIp65504P1403S(short ip65504P1403S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1403S,IP_65504_P_1403_S_LEN)
                  ,beginIp65504P1403S
                  ,IP_65504_P_1403_S_LEN
                 );
            localIp65504P1403SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1403SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1403S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1403S() {	 
			return (getShort(beginIp65504P1403S));
   	}
         int localIp65504P1403LCounter = -1;
         public boolean isIp65504P1403LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1403LCounter != sharedCounter;
            localIp65504P1403LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1403_L_LEN = 2;
  	/**
	 * serializeIp65504P1403L
	 */
	protected void serializeIp65504P1403L(short ip65504P1403L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1403L,IP_65504_P_1403_L_LEN)
                  ,beginIp65504P1403L
                  ,IP_65504_P_1403_L_LEN
                 );
            localIp65504P1403LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1403LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1403L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1403L() {	 
			return (getShort(beginIp65504P1403L));
   	}
         int localIp65504P1404SCounter = -1;
         public boolean isIp65504P1404SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1404SCounter != sharedCounter;
            localIp65504P1404SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1404_S_LEN = 2;
  	/**
	 * serializeIp65504P1404S
	 */
	protected void serializeIp65504P1404S(short ip65504P1404S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1404S,IP_65504_P_1404_S_LEN)
                  ,beginIp65504P1404S
                  ,IP_65504_P_1404_S_LEN
                 );
            localIp65504P1404SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1404SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1404S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1404S() {	 
			return (getShort(beginIp65504P1404S));
   	}
         int localIp65504P1404LCounter = -1;
         public boolean isIp65504P1404LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1404LCounter != sharedCounter;
            localIp65504P1404LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1404_L_LEN = 2;
  	/**
	 * serializeIp65504P1404L
	 */
	protected void serializeIp65504P1404L(short ip65504P1404L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1404L,IP_65504_P_1404_L_LEN)
                  ,beginIp65504P1404L
                  ,IP_65504_P_1404_L_LEN
                 );
            localIp65504P1404LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1404LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1404L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1404L() {	 
			return (getShort(beginIp65504P1404L));
   	}
         int localIp65504P1405SCounter = -1;
         public boolean isIp65504P1405SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1405SCounter != sharedCounter;
            localIp65504P1405SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1405_S_LEN = 2;
  	/**
	 * serializeIp65504P1405S
	 */
	protected void serializeIp65504P1405S(short ip65504P1405S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1405S,IP_65504_P_1405_S_LEN)
                  ,beginIp65504P1405S
                  ,IP_65504_P_1405_S_LEN
                 );
            localIp65504P1405SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1405SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1405S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1405S() {	 
			return (getShort(beginIp65504P1405S));
   	}
         int localIp65504P1405LCounter = -1;
         public boolean isIp65504P1405LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1405LCounter != sharedCounter;
            localIp65504P1405LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1405_L_LEN = 2;
  	/**
	 * serializeIp65504P1405L
	 */
	protected void serializeIp65504P1405L(short ip65504P1405L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1405L,IP_65504_P_1405_L_LEN)
                  ,beginIp65504P1405L
                  ,IP_65504_P_1405_L_LEN
                 );
            localIp65504P1405LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1405LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1405L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1405L() {	 
			return (getShort(beginIp65504P1405L));
   	}
         int localIp65504P1406SCounter = -1;
         public boolean isIp65504P1406SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1406SCounter != sharedCounter;
            localIp65504P1406SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1406_S_LEN = 2;
  	/**
	 * serializeIp65504P1406S
	 */
	protected void serializeIp65504P1406S(short ip65504P1406S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1406S,IP_65504_P_1406_S_LEN)
                  ,beginIp65504P1406S
                  ,IP_65504_P_1406_S_LEN
                 );
            localIp65504P1406SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1406SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1406S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1406S() {	 
			return (getShort(beginIp65504P1406S));
   	}
         int localIp65504P1406LCounter = -1;
         public boolean isIp65504P1406LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1406LCounter != sharedCounter;
            localIp65504P1406LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1406_L_LEN = 2;
  	/**
	 * serializeIp65504P1406L
	 */
	protected void serializeIp65504P1406L(short ip65504P1406L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1406L,IP_65504_P_1406_L_LEN)
                  ,beginIp65504P1406L
                  ,IP_65504_P_1406_L_LEN
                 );
            localIp65504P1406LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1406LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1406L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1406L() {	 
			return (getShort(beginIp65504P1406L));
   	}
         int localIp65504P1407SCounter = -1;
         public boolean isIp65504P1407SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1407SCounter != sharedCounter;
            localIp65504P1407SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1407_S_LEN = 2;
  	/**
	 * serializeIp65504P1407S
	 */
	protected void serializeIp65504P1407S(short ip65504P1407S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1407S,IP_65504_P_1407_S_LEN)
                  ,beginIp65504P1407S
                  ,IP_65504_P_1407_S_LEN
                 );
            localIp65504P1407SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1407SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1407S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1407S() {	 
			return (getShort(beginIp65504P1407S));
   	}
         int localIp65504P1407LCounter = -1;
         public boolean isIp65504P1407LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1407LCounter != sharedCounter;
            localIp65504P1407LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1407_L_LEN = 2;
  	/**
	 * serializeIp65504P1407L
	 */
	protected void serializeIp65504P1407L(short ip65504P1407L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1407L,IP_65504_P_1407_L_LEN)
                  ,beginIp65504P1407L
                  ,IP_65504_P_1407_L_LEN
                 );
            localIp65504P1407LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1407LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1407L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1407L() {	 
			return (getShort(beginIp65504P1407L));
   	}
         int localIp65504P1408SCounter = -1;
         public boolean isIp65504P1408SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1408SCounter != sharedCounter;
            localIp65504P1408SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1408_S_LEN = 2;
  	/**
	 * serializeIp65504P1408S
	 */
	protected void serializeIp65504P1408S(short ip65504P1408S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1408S,IP_65504_P_1408_S_LEN)
                  ,beginIp65504P1408S
                  ,IP_65504_P_1408_S_LEN
                 );
            localIp65504P1408SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1408SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1408S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1408S() {	 
			return (getShort(beginIp65504P1408S));
   	}
         int localIp65504P1408LCounter = -1;
         public boolean isIp65504P1408LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1408LCounter != sharedCounter;
            localIp65504P1408LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1408_L_LEN = 2;
  	/**
	 * serializeIp65504P1408L
	 */
	protected void serializeIp65504P1408L(short ip65504P1408L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1408L,IP_65504_P_1408_L_LEN)
                  ,beginIp65504P1408L
                  ,IP_65504_P_1408_L_LEN
                 );
            localIp65504P1408LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1408LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1408L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1408L() {	 
			return (getShort(beginIp65504P1408L));
   	}
         int localIp65504P1409SCounter = -1;
         public boolean isIp65504P1409SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1409SCounter != sharedCounter;
            localIp65504P1409SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1409_S_LEN = 2;
  	/**
	 * serializeIp65504P1409S
	 */
	protected void serializeIp65504P1409S(short ip65504P1409S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1409S,IP_65504_P_1409_S_LEN)
                  ,beginIp65504P1409S
                  ,IP_65504_P_1409_S_LEN
                 );
            localIp65504P1409SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1409SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1409S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1409S() {	 
			return (getShort(beginIp65504P1409S));
   	}
         int localIp65504P1409LCounter = -1;
         public boolean isIp65504P1409LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1409LCounter != sharedCounter;
            localIp65504P1409LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1409_L_LEN = 2;
  	/**
	 * serializeIp65504P1409L
	 */
	protected void serializeIp65504P1409L(short ip65504P1409L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1409L,IP_65504_P_1409_L_LEN)
                  ,beginIp65504P1409L
                  ,IP_65504_P_1409_L_LEN
                 );
            localIp65504P1409LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1409LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1409L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1409L() {	 
			return (getShort(beginIp65504P1409L));
   	}
         int localIp65504P1410SCounter = -1;
         public boolean isIp65504P1410SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1410SCounter != sharedCounter;
            localIp65504P1410SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1410_S_LEN = 2;
  	/**
	 * serializeIp65504P1410S
	 */
	protected void serializeIp65504P1410S(short ip65504P1410S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1410S,IP_65504_P_1410_S_LEN)
                  ,beginIp65504P1410S
                  ,IP_65504_P_1410_S_LEN
                 );
            localIp65504P1410SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1410SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1410S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1410S() {	 
			return (getShort(beginIp65504P1410S));
   	}
         int localIp65504P1410LCounter = -1;
         public boolean isIp65504P1410LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1410LCounter != sharedCounter;
            localIp65504P1410LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1410_L_LEN = 2;
  	/**
	 * serializeIp65504P1410L
	 */
	protected void serializeIp65504P1410L(short ip65504P1410L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1410L,IP_65504_P_1410_L_LEN)
                  ,beginIp65504P1410L
                  ,IP_65504_P_1410_L_LEN
                 );
            localIp65504P1410LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1410LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1410L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1410L() {	 
			return (getShort(beginIp65504P1410L));
   	}
         int localIp65504P1411SCounter = -1;
         public boolean isIp65504P1411SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1411SCounter != sharedCounter;
            localIp65504P1411SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1411_S_LEN = 2;
  	/**
	 * serializeIp65504P1411S
	 */
	protected void serializeIp65504P1411S(short ip65504P1411S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1411S,IP_65504_P_1411_S_LEN)
                  ,beginIp65504P1411S
                  ,IP_65504_P_1411_S_LEN
                 );
            localIp65504P1411SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1411SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1411S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1411S() {	 
			return (getShort(beginIp65504P1411S));
   	}
         int localIp65504P1411LCounter = -1;
         public boolean isIp65504P1411LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1411LCounter != sharedCounter;
            localIp65504P1411LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1411_L_LEN = 2;
  	/**
	 * serializeIp65504P1411L
	 */
	protected void serializeIp65504P1411L(short ip65504P1411L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1411L,IP_65504_P_1411_L_LEN)
                  ,beginIp65504P1411L
                  ,IP_65504_P_1411_L_LEN
                 );
            localIp65504P1411LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1411LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1411L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1411L() {	 
			return (getShort(beginIp65504P1411L));
   	}
         int localIp65504P1412SCounter = -1;
         public boolean isIp65504P1412SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1412SCounter != sharedCounter;
            localIp65504P1412SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1412_S_LEN = 2;
  	/**
	 * serializeIp65504P1412S
	 */
	protected void serializeIp65504P1412S(short ip65504P1412S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1412S,IP_65504_P_1412_S_LEN)
                  ,beginIp65504P1412S
                  ,IP_65504_P_1412_S_LEN
                 );
            localIp65504P1412SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1412SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1412S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1412S() {	 
			return (getShort(beginIp65504P1412S));
   	}
         int localIp65504P1412LCounter = -1;
         public boolean isIp65504P1412LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1412LCounter != sharedCounter;
            localIp65504P1412LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1412_L_LEN = 2;
  	/**
	 * serializeIp65504P1412L
	 */
	protected void serializeIp65504P1412L(short ip65504P1412L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1412L,IP_65504_P_1412_L_LEN)
                  ,beginIp65504P1412L
                  ,IP_65504_P_1412_L_LEN
                 );
            localIp65504P1412LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1412LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1412L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1412L() {	 
			return (getShort(beginIp65504P1412L));
   	}
         int localIp65504P1413SCounter = -1;
         public boolean isIp65504P1413SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1413SCounter != sharedCounter;
            localIp65504P1413SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1413_S_LEN = 2;
  	/**
	 * serializeIp65504P1413S
	 */
	protected void serializeIp65504P1413S(short ip65504P1413S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1413S,IP_65504_P_1413_S_LEN)
                  ,beginIp65504P1413S
                  ,IP_65504_P_1413_S_LEN
                 );
            localIp65504P1413SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1413SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1413S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1413S() {	 
			return (getShort(beginIp65504P1413S));
   	}
         int localIp65504P1413LCounter = -1;
         public boolean isIp65504P1413LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1413LCounter != sharedCounter;
            localIp65504P1413LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1413_L_LEN = 2;
  	/**
	 * serializeIp65504P1413L
	 */
	protected void serializeIp65504P1413L(short ip65504P1413L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1413L,IP_65504_P_1413_L_LEN)
                  ,beginIp65504P1413L
                  ,IP_65504_P_1413_L_LEN
                 );
            localIp65504P1413LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1413LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1413L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1413L() {	 
			return (getShort(beginIp65504P1413L));
   	}
         int localIp65504P1414SCounter = -1;
         public boolean isIp65504P1414SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1414SCounter != sharedCounter;
            localIp65504P1414SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1414_S_LEN = 2;
  	/**
	 * serializeIp65504P1414S
	 */
	protected void serializeIp65504P1414S(short ip65504P1414S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1414S,IP_65504_P_1414_S_LEN)
                  ,beginIp65504P1414S
                  ,IP_65504_P_1414_S_LEN
                 );
            localIp65504P1414SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1414SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1414S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1414S() {	 
			return (getShort(beginIp65504P1414S));
   	}
         int localIp65504P1414LCounter = -1;
         public boolean isIp65504P1414LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1414LCounter != sharedCounter;
            localIp65504P1414LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1414_L_LEN = 2;
  	/**
	 * serializeIp65504P1414L
	 */
	protected void serializeIp65504P1414L(short ip65504P1414L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1414L,IP_65504_P_1414_L_LEN)
                  ,beginIp65504P1414L
                  ,IP_65504_P_1414_L_LEN
                 );
            localIp65504P1414LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1414LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1414L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1414L() {	 
			return (getShort(beginIp65504P1414L));
   	}
         int localIp65504P1415SCounter = -1;
         public boolean isIp65504P1415SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1415SCounter != sharedCounter;
            localIp65504P1415SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1415_S_LEN = 2;
  	/**
	 * serializeIp65504P1415S
	 */
	protected void serializeIp65504P1415S(short ip65504P1415S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1415S,IP_65504_P_1415_S_LEN)
                  ,beginIp65504P1415S
                  ,IP_65504_P_1415_S_LEN
                 );
            localIp65504P1415SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1415SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1415S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1415S() {	 
			return (getShort(beginIp65504P1415S));
   	}
         int localIp65504P1415LCounter = -1;
         public boolean isIp65504P1415LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1415LCounter != sharedCounter;
            localIp65504P1415LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1415_L_LEN = 2;
  	/**
	 * serializeIp65504P1415L
	 */
	protected void serializeIp65504P1415L(short ip65504P1415L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1415L,IP_65504_P_1415_L_LEN)
                  ,beginIp65504P1415L
                  ,IP_65504_P_1415_L_LEN
                 );
            localIp65504P1415LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1415LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1415L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1415L() {	 
			return (getShort(beginIp65504P1415L));
   	}
         int localIp65504P1416SCounter = -1;
         public boolean isIp65504P1416SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1416SCounter != sharedCounter;
            localIp65504P1416SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1416_S_LEN = 2;
  	/**
	 * serializeIp65504P1416S
	 */
	protected void serializeIp65504P1416S(short ip65504P1416S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1416S,IP_65504_P_1416_S_LEN)
                  ,beginIp65504P1416S
                  ,IP_65504_P_1416_S_LEN
                 );
            localIp65504P1416SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1416SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1416S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1416S() {	 
			return (getShort(beginIp65504P1416S));
   	}
         int localIp65504P1416LCounter = -1;
         public boolean isIp65504P1416LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1416LCounter != sharedCounter;
            localIp65504P1416LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1416_L_LEN = 2;
  	/**
	 * serializeIp65504P1416L
	 */
	protected void serializeIp65504P1416L(short ip65504P1416L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1416L,IP_65504_P_1416_L_LEN)
                  ,beginIp65504P1416L
                  ,IP_65504_P_1416_L_LEN
                 );
            localIp65504P1416LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1416LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1416L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1416L() {	 
			return (getShort(beginIp65504P1416L));
   	}
         int localIp65504P1417SCounter = -1;
         public boolean isIp65504P1417SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1417SCounter != sharedCounter;
            localIp65504P1417SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1417_S_LEN = 2;
  	/**
	 * serializeIp65504P1417S
	 */
	protected void serializeIp65504P1417S(short ip65504P1417S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1417S,IP_65504_P_1417_S_LEN)
                  ,beginIp65504P1417S
                  ,IP_65504_P_1417_S_LEN
                 );
            localIp65504P1417SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1417SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1417S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1417S() {	 
			return (getShort(beginIp65504P1417S));
   	}
         int localIp65504P1417LCounter = -1;
         public boolean isIp65504P1417LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1417LCounter != sharedCounter;
            localIp65504P1417LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1417_L_LEN = 2;
  	/**
	 * serializeIp65504P1417L
	 */
	protected void serializeIp65504P1417L(short ip65504P1417L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1417L,IP_65504_P_1417_L_LEN)
                  ,beginIp65504P1417L
                  ,IP_65504_P_1417_L_LEN
                 );
            localIp65504P1417LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1417LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1417L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1417L() {	 
			return (getShort(beginIp65504P1417L));
   	}
         int localIp65504P1418SCounter = -1;
         public boolean isIp65504P1418SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1418SCounter != sharedCounter;
            localIp65504P1418SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1418_S_LEN = 2;
  	/**
	 * serializeIp65504P1418S
	 */
	protected void serializeIp65504P1418S(short ip65504P1418S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1418S,IP_65504_P_1418_S_LEN)
                  ,beginIp65504P1418S
                  ,IP_65504_P_1418_S_LEN
                 );
            localIp65504P1418SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1418SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1418S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1418S() {	 
			return (getShort(beginIp65504P1418S));
   	}
         int localIp65504P1418LCounter = -1;
         public boolean isIp65504P1418LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1418LCounter != sharedCounter;
            localIp65504P1418LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1418_L_LEN = 2;
  	/**
	 * serializeIp65504P1418L
	 */
	protected void serializeIp65504P1418L(short ip65504P1418L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1418L,IP_65504_P_1418_L_LEN)
                  ,beginIp65504P1418L
                  ,IP_65504_P_1418_L_LEN
                 );
            localIp65504P1418LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1418LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1418L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1418L() {	 
			return (getShort(beginIp65504P1418L));
   	}
         int localIp65504P1419SCounter = -1;
         public boolean isIp65504P1419SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1419SCounter != sharedCounter;
            localIp65504P1419SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1419_S_LEN = 2;
  	/**
	 * serializeIp65504P1419S
	 */
	protected void serializeIp65504P1419S(short ip65504P1419S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1419S,IP_65504_P_1419_S_LEN)
                  ,beginIp65504P1419S
                  ,IP_65504_P_1419_S_LEN
                 );
            localIp65504P1419SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1419SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1419S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1419S() {	 
			return (getShort(beginIp65504P1419S));
   	}
         int localIp65504P1419LCounter = -1;
         public boolean isIp65504P1419LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1419LCounter != sharedCounter;
            localIp65504P1419LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1419_L_LEN = 2;
  	/**
	 * serializeIp65504P1419L
	 */
	protected void serializeIp65504P1419L(short ip65504P1419L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1419L,IP_65504_P_1419_L_LEN)
                  ,beginIp65504P1419L
                  ,IP_65504_P_1419_L_LEN
                 );
            localIp65504P1419LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1419LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1419L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1419L() {	 
			return (getShort(beginIp65504P1419L));
   	}
         int localIp65504P1420SCounter = -1;
         public boolean isIp65504P1420SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1420SCounter != sharedCounter;
            localIp65504P1420SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1420_S_LEN = 2;
  	/**
	 * serializeIp65504P1420S
	 */
	protected void serializeIp65504P1420S(short ip65504P1420S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1420S,IP_65504_P_1420_S_LEN)
                  ,beginIp65504P1420S
                  ,IP_65504_P_1420_S_LEN
                 );
            localIp65504P1420SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1420SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1420S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1420S() {	 
			return (getShort(beginIp65504P1420S));
   	}
         int localIp65504P1420LCounter = -1;
         public boolean isIp65504P1420LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1420LCounter != sharedCounter;
            localIp65504P1420LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1420_L_LEN = 2;
  	/**
	 * serializeIp65504P1420L
	 */
	protected void serializeIp65504P1420L(short ip65504P1420L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1420L,IP_65504_P_1420_L_LEN)
                  ,beginIp65504P1420L
                  ,IP_65504_P_1420_L_LEN
                 );
            localIp65504P1420LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1420LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1420L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1420L() {	 
			return (getShort(beginIp65504P1420L));
   	}
         int localIp65504P1421SCounter = -1;
         public boolean isIp65504P1421SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1421SCounter != sharedCounter;
            localIp65504P1421SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1421_S_LEN = 2;
  	/**
	 * serializeIp65504P1421S
	 */
	protected void serializeIp65504P1421S(short ip65504P1421S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1421S,IP_65504_P_1421_S_LEN)
                  ,beginIp65504P1421S
                  ,IP_65504_P_1421_S_LEN
                 );
            localIp65504P1421SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1421SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1421S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1421S() {	 
			return (getShort(beginIp65504P1421S));
   	}
         int localIp65504P1421LCounter = -1;
         public boolean isIp65504P1421LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1421LCounter != sharedCounter;
            localIp65504P1421LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1421_L_LEN = 2;
  	/**
	 * serializeIp65504P1421L
	 */
	protected void serializeIp65504P1421L(short ip65504P1421L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1421L,IP_65504_P_1421_L_LEN)
                  ,beginIp65504P1421L
                  ,IP_65504_P_1421_L_LEN
                 );
            localIp65504P1421LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1421LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1421L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1421L() {	 
			return (getShort(beginIp65504P1421L));
   	}
         int localIp65504P1422SCounter = -1;
         public boolean isIp65504P1422SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1422SCounter != sharedCounter;
            localIp65504P1422SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1422_S_LEN = 2;
  	/**
	 * serializeIp65504P1422S
	 */
	protected void serializeIp65504P1422S(short ip65504P1422S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1422S,IP_65504_P_1422_S_LEN)
                  ,beginIp65504P1422S
                  ,IP_65504_P_1422_S_LEN
                 );
            localIp65504P1422SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1422SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1422S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1422S() {	 
			return (getShort(beginIp65504P1422S));
   	}
         int localIp65504P1422LCounter = -1;
         public boolean isIp65504P1422LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1422LCounter != sharedCounter;
            localIp65504P1422LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1422_L_LEN = 2;
  	/**
	 * serializeIp65504P1422L
	 */
	protected void serializeIp65504P1422L(short ip65504P1422L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1422L,IP_65504_P_1422_L_LEN)
                  ,beginIp65504P1422L
                  ,IP_65504_P_1422_L_LEN
                 );
            localIp65504P1422LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1422LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1422L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1422L() {	 
			return (getShort(beginIp65504P1422L));
   	}
         int localIp65504P1423SCounter = -1;
         public boolean isIp65504P1423SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1423SCounter != sharedCounter;
            localIp65504P1423SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1423_S_LEN = 2;
  	/**
	 * serializeIp65504P1423S
	 */
	protected void serializeIp65504P1423S(short ip65504P1423S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1423S,IP_65504_P_1423_S_LEN)
                  ,beginIp65504P1423S
                  ,IP_65504_P_1423_S_LEN
                 );
            localIp65504P1423SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1423SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1423S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1423S() {	 
			return (getShort(beginIp65504P1423S));
   	}
         int localIp65504P1423LCounter = -1;
         public boolean isIp65504P1423LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1423LCounter != sharedCounter;
            localIp65504P1423LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1423_L_LEN = 2;
  	/**
	 * serializeIp65504P1423L
	 */
	protected void serializeIp65504P1423L(short ip65504P1423L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1423L,IP_65504_P_1423_L_LEN)
                  ,beginIp65504P1423L
                  ,IP_65504_P_1423_L_LEN
                 );
            localIp65504P1423LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1423LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1423L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1423L() {	 
			return (getShort(beginIp65504P1423L));
   	}
         int localIp65504P1424SCounter = -1;
         public boolean isIp65504P1424SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1424SCounter != sharedCounter;
            localIp65504P1424SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1424_S_LEN = 2;
  	/**
	 * serializeIp65504P1424S
	 */
	protected void serializeIp65504P1424S(short ip65504P1424S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1424S,IP_65504_P_1424_S_LEN)
                  ,beginIp65504P1424S
                  ,IP_65504_P_1424_S_LEN
                 );
            localIp65504P1424SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1424SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1424S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1424S() {	 
			return (getShort(beginIp65504P1424S));
   	}
         int localIp65504P1424LCounter = -1;
         public boolean isIp65504P1424LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1424LCounter != sharedCounter;
            localIp65504P1424LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1424_L_LEN = 2;
  	/**
	 * serializeIp65504P1424L
	 */
	protected void serializeIp65504P1424L(short ip65504P1424L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1424L,IP_65504_P_1424_L_LEN)
                  ,beginIp65504P1424L
                  ,IP_65504_P_1424_L_LEN
                 );
            localIp65504P1424LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1424LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1424L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1424L() {	 
			return (getShort(beginIp65504P1424L));
   	}
         int localIp65504P1425SCounter = -1;
         public boolean isIp65504P1425SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1425SCounter != sharedCounter;
            localIp65504P1425SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1425_S_LEN = 2;
  	/**
	 * serializeIp65504P1425S
	 */
	protected void serializeIp65504P1425S(short ip65504P1425S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1425S,IP_65504_P_1425_S_LEN)
                  ,beginIp65504P1425S
                  ,IP_65504_P_1425_S_LEN
                 );
            localIp65504P1425SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1425SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1425S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1425S() {	 
			return (getShort(beginIp65504P1425S));
   	}
         int localIp65504P1425LCounter = -1;
         public boolean isIp65504P1425LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1425LCounter != sharedCounter;
            localIp65504P1425LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1425_L_LEN = 2;
  	/**
	 * serializeIp65504P1425L
	 */
	protected void serializeIp65504P1425L(short ip65504P1425L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1425L,IP_65504_P_1425_L_LEN)
                  ,beginIp65504P1425L
                  ,IP_65504_P_1425_L_LEN
                 );
            localIp65504P1425LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1425LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1425L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1425L() {	 
			return (getShort(beginIp65504P1425L));
   	}
         int localIp65504P1426SCounter = -1;
         public boolean isIp65504P1426SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1426SCounter != sharedCounter;
            localIp65504P1426SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1426_S_LEN = 2;
  	/**
	 * serializeIp65504P1426S
	 */
	protected void serializeIp65504P1426S(short ip65504P1426S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1426S,IP_65504_P_1426_S_LEN)
                  ,beginIp65504P1426S
                  ,IP_65504_P_1426_S_LEN
                 );
            localIp65504P1426SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1426SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1426S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1426S() {	 
			return (getShort(beginIp65504P1426S));
   	}
         int localIp65504P1426LCounter = -1;
         public boolean isIp65504P1426LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1426LCounter != sharedCounter;
            localIp65504P1426LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1426_L_LEN = 2;
  	/**
	 * serializeIp65504P1426L
	 */
	protected void serializeIp65504P1426L(short ip65504P1426L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1426L,IP_65504_P_1426_L_LEN)
                  ,beginIp65504P1426L
                  ,IP_65504_P_1426_L_LEN
                 );
            localIp65504P1426LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1426LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1426L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1426L() {	 
			return (getShort(beginIp65504P1426L));
   	}




}
  
